package com.example.demo.forkJoin.excelUtil;

import cn.afterturn.easypoi.cache.ExcelCache;
import cn.afterturn.easypoi.util.PoiCellUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.StringUtil;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExcelUtil {
    /*
    非数字的处理方式
     */
    private static final String DECIMAL_FORMAT = "0";

    private static ThreadLocal<DecimalFormat> DECIMAL_FORMAT_THREAD_LOCAL
            = ThreadLocal.withInitial(()->new DecimalFormat(DECIMAL_FORMAT));

    /**
     * 获取日解析的类
     * @return
     */
    public static DecimalFormat getDecimalFormat(){

        return DECIMAL_FORMAT_THREAD_LOCAL.get();
    }

    public static Workbook getWorkBook(InputStream inputStream) throws Exception {
        Workbook workbook = null;
        if(!(inputStream.markSupported())){
            inputStream = new PushbackInputStream(inputStream,8);
        }
        try {
            workbook = WorkbookFactory.create(inputStream);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return workbook;
    }

    public static Map<Integer,String> getHeadMap(Workbook workbook, int sheetIndex, int rowIndex){
        Map<Integer,String> headMap = null;
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        Row row = sheet.getRow(rowIndex);
        Iterator<Cell> headCells = row.cellIterator();
        if(headCells == null){
            return null;
        }
        headMap = new HashMap<>();

        return null;
    }

    public static String getKeyValue(Cell cell){
        try{
            String value = PoiCellUtil.getCellValue(cell);
            //数值类型：整数，小数，日期
            if(cell !=null && cell.getCellType() == CellType.NUMERIC){
                return ExcelUtil.getDecimalFormat().format(cell.getNumericCellValue());
            }
            return StringUtils.isBlank(value)?null:value.trim();
        }catch (Exception ex){
            return null;
        }
    }


    public static String getMoney(Cell cell) {
        String value = PoiCellUtil.getCellValue(cell);
        if (cell != null && cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        }
        return StringUtils.isBlank(value) ? null : value.trim();
    }
}
