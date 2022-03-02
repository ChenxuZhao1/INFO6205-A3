package edu.neu.coe.info6205.util;

import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.HelperFactory;
import edu.neu.coe.info6205.sort.SortWithHelper;
import edu.neu.coe.info6205.sort.elementary.InsertionSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class A2Test {

    public static void main(String[] args) {
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        Timer timer3 = new Timer();
        Timer timer4 = new Timer();
        Timer timer5 = new Timer();

        Timer timer6 = new Timer();
        Timer timer7 = new Timer();
        Timer timer8 = new Timer();
        Timer timer9 = new Timer();
        Timer timer10 = new Timer();

        Timer timer11 = new Timer();
        Timer timer12 = new Timer();
        Timer timer13 = new Timer();
        Timer timer14 = new Timer();
        Timer timer15 = new Timer();

        Timer timer16 = new Timer();
        Timer timer17 = new Timer();
        Timer timer18 = new Timer();
        Timer timer19 = new Timer();
        Timer timer20 = new Timer();

        int n1 = 50;
        int n2 = 100;
        int n3 = 200;
        int n4 = 400;
        int n5 = 800;
        final List<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        Integer[] xs = list1.toArray(new Integer[0]);
        final Config config = ConfigTest.setupConfig("true", "0", "1", "", "");
        Helper<Integer> helper = HelperFactory.create("InsertionSort", list1.size(), config);
        helper.init(list1.size());
        SortWithHelper<Integer> sorter = new InsertionSort<Integer>(helper);
        sorter.preProcess(xs);
        final double mean1 = timer1.repeat(n1,
                () -> xs,
                t->{
                    sorter.sort(xs,0,10);
                    return null;
                },null,null);
        final double mean2 = timer2.repeat(n2,
                () -> xs,
                t->{
                    sorter.sort(xs,0,10);
                    return null;
                },null,null);
        final double mean3 = timer3.repeat(n3,
                () -> xs,
                t->{
                    sorter.sort(xs,0,10);
                    return null;
                },null,null);
        final double mean4 = timer4.repeat(n4,
                () -> xs,
                t->{
                    sorter.sort(xs,0,10);
                    return null;
                },null,null);
        final double mean5 = timer5.repeat(n5,
                () -> xs,
                t->{
                    sorter.sort(xs,0,10);
                    return null;
                },null,null);
        System.out.println("Ordered:");
        System.out.println(mean1);
        System.out.println(mean2);
        System.out.println(mean3);
        System.out.println(mean4);
        System.out.println(mean5);



        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(11);
        list2.add(10);
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.add(5);
        list2.add(4);
        list2.add(3);
        list2.add(2);
        list2.add(1);
        Integer[] xs2 = list2.toArray(new Integer[0]);
        final Config config2 = ConfigTest.setupConfig("true", "0", "1", "", "");
        Helper<Integer> helper2 = HelperFactory.create("InsertionSort", list2.size(), config);
        helper2.init(list2.size());
        SortWithHelper<Integer> sorter2 = new InsertionSort<Integer>(helper);
        sorter.preProcess(xs2);
        final double mean6 = timer6.repeat(n1,
                () -> xs2,
                t->{
                    sorter.sort(xs2,0,10);
                    return null;
                },null,null);
        final double mean7 = timer7.repeat(n2,
                () -> xs2,
                t->{
                    sorter.sort(xs2,0,10);
                    return null;
                },null,null);
        final double mean8 = timer8.repeat(n3,
                () -> xs2,
                t->{
                    sorter.sort(xs2,0,10);
                    return null;
                },null,null);
        final double mean9 = timer9.repeat(n4,
                () -> xs2,
                t->{
                    sorter.sort(xs2,0,10);
                    return null;
                },null,null);
        final double mean10 = timer10.repeat(n5,
                () -> xs2,
                t->{
                    sorter.sort(xs2,0,10);
                    return null;
                },null,null);
        System.out.println("Reverse-Ordered:");
        System.out.println(mean6);
        System.out.println(mean7);
        System.out.println(mean8);
        System.out.println(mean9);
        System.out.println(mean10);



        List<Integer> list3 = new LinkedList<Integer>();
        list3.add(2);
        list3.add(4);
        list3.add(1);
        list3.add(10);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list3.add(3);
        list3.add(8);
        list3.add(11);
        list3.add(9);
        Integer[] xs3 = list3.toArray(new Integer[0]);
        final Config config3 = ConfigTest.setupConfig("true", "0", "1", "", "");
        Helper<Integer> helper3 = HelperFactory.create("InsertionSort", list3.size(), config);
        helper3.init(list3.size());
        SortWithHelper<Integer> sorter3 = new InsertionSort<Integer>(helper);
        sorter.preProcess(xs3);
        final double mean11 = timer11.repeat(n1,
                () -> xs3,
                t->{
                    sorter.sort(xs3,0,10);
                    return null;
                },null,null);
        final double mean12 = timer12.repeat(n2,
                () -> xs3,
                t->{
                    sorter.sort(xs3,0,10);
                    return null;
                },null,null);
        final double mean13 = timer13.repeat(n3,
                () -> xs3,
                t->{
                    sorter.sort(xs3,0,10);
                    return null;
                },null,null);
        final double mean14 = timer14.repeat(n4,
                () -> xs3,
                t->{
                    sorter.sort(xs3,0,10);
                    return null;
                },null,null);
        final double mean15 = timer15.repeat(n5,
                () -> xs3,
                t->{
                    sorter.sort(xs3,0,10);
                    return null;
                },null,null);
        System.out.println("Random:");
        System.out.println(mean11);
        System.out.println(mean12);
        System.out.println(mean13);
        System.out.println(mean14);
        System.out.println(mean15);



        List<Integer> list4 = new LinkedList<Integer>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(11);
        list4.add(8);
        list4.add(6);
        list4.add(7);
        list4.add(10);
        list4.add(9);
        Integer[] xs4 = list4.toArray(new Integer[0]);
        final Config config4 = ConfigTest.setupConfig("true", "0", "1", "", "");
        Helper<Integer> helper4 = HelperFactory.create("InsertionSort", list4.size(), config);
        helper4.init(list4.size());
        SortWithHelper<Integer> sorter4 = new InsertionSort<Integer>(helper);
        sorter.preProcess(xs4);
        final double mean16 = timer16.repeat(n1,
                () -> xs4,
                t->{
                    sorter.sort(xs4,0,10);
                    return null;
                },null,null);
        final double mean17 = timer17.repeat(n2,
                () -> xs4,
                t->{
                    sorter.sort(xs4,0,10);
                    return null;
                },null,null);
        final double mean18 = timer18.repeat(n3,
                () -> xs4,
                t->{
                    sorter.sort(xs4,0,10);
                    return null;
                },null,null);
        final double mean19 = timer19.repeat(n4,
                () -> xs4,
                t->{
                    sorter.sort(xs4,0,10);
                    return null;
                },null,null);
        final double mean20 = timer20.repeat(n5,
                () -> xs4,
                t->{
                    sorter.sort(xs4,0,10);
                    return null;
                },null,null);
        System.out.println("Partially-Ordered:");
        System.out.println(mean16);
        System.out.println(mean17);
        System.out.println(mean18);
        System.out.println(mean19);
        System.out.println(mean20);
    }
}
