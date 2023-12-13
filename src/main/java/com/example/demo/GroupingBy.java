package com.example.demo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupingBy {
    public static void main(String[] args) {
        record  Department (int id, String name){}
        record Person (int id, String name, double salary, Department department){}

        List<Person> persons = List.of(
                new Person(1, "Alex", 100d, new Department(1, "HR")),
                new Person(2, "Brian", 200d, new Department(1, "HR")),
                new Person(3, "Charles", 900d, new Department(2, "Finance")),
                new Person(4, "David", 200d, new Department(2, "Finance")),
                new Person(5, "Edward", 200d, new Department(2, "Finance")),
                new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
                new Person(7, "George", 900d, new Department(3, "ADMIN")));

        persons.stream().collect(groupingBy(Person::department, mapping(Person::name, toList())))

                .forEach((k,v)->{


                        System.out.println(k+" "+v);});

        persons.stream().collect(groupingBy(Person::department, counting())).forEach((k,v)->
                System.out.println(k+" "+v));

        int a =0;
        int b=100;
        Date d = new Date();
       long g = d.getTime();
       int res =0;
       //while (res>a && res<b){
           res= (int) (g%(b-a));
      // }


        System.out.println(res+a);
    }
}
