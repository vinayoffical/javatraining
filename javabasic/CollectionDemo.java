package javabasic;

import java.util.*;

public class CollectionDemo {
    public static void main(String...a){
        List<Integer> integers=new ArrayList<>();// not a best pratice
        integers.add(1);
        integers.add(3);
        integers.add(2);
        Collections.sort(integers,Comparator.reverseOrder());
        printListContent(integers);
        List<City> cities=new ArrayList<>();//
        cities.add(new City(2,"Bhopal"));
        cities.add(new City(1,"Indore"));
        cities.add(new City(3,"Ujjain"));
        //Collections.sort(cities,new CityNameComparator());
        Collections.sort(cities,(city1,city2)-> city1.getName().compareTo(city2.getName()));
        printListContent(cities);
    }
    static void printListContent(List list){
        for (Object a:list){
            System.out.println(a);
        }
    }
}
