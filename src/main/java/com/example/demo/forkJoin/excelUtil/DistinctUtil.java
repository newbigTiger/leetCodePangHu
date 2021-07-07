package com.example.demo.forkJoin.excelUtil;

import com.example.demo.forkJoin.pojo.Student;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctUtil {

    public static <T>Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor){
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = DistinctUtil.distinctByKey(Student::getStu_no);
        System.out.println(studentPredicate);
    }

}
