package com;

import customSort.SortByID;
import customSort.SortByName;
import customSort.SortedByPercentage;
import student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {
    static ArrayList<Student> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("resources//studentData.CSV");
        PrintWriter pw = new PrintWriter(fileWriter);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setId(1);
        s2.setId(50);
        s3.setId(2);
        s4.setId(40);
        s5.setId(19);


        s1.setFirstName("anas");
        s2.setFirstName("mohd");
        s3.setFirstName("ansari");
        s4.setFirstName("deep");
        s5.setFirstName("keshav");

        s1.setLastName("an");
        s2.setLastName("ana");
        s3.setLastName("anna");
        s4.setLastName("sharma");
        s5.setLastName("bg");

        s1.setMobileNo("34567867");
        s2.setMobileNo("8765432");
        s3.setMobileNo("0987667867");
        s4.setMobileNo("569234567");
        s5.setMobileNo("8656788");

        s1.setPercentage(70.89f);
        s2.setPercentage(80.89f);
        s3.setPercentage(99.99f);
        s4.setPercentage(40.90f);
        s5.setPercentage(30.50f);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        for (Student st : arr) {
            pw.println(st.toString());
        }
        pw.close();


        //read from student data file;
        //readFromFile();


        //write all data to studentData1.CSV that readed from StudentData
        FileWriter fileWriter1 = new FileWriter("resources//studentData1.CSV");
        PrintWriter pw1 = new PrintWriter(fileWriter1);

        for (Student st : arr) {
            pw1.println(st.toString());
        }
        pw1.close();
        fileWriter1.close();

        //sort data by id
        sortedById();

        //sort data by name
        sortedByName();

        //sort data by percentage
        sortedByPercentage();

    }

    public static void sortedById() throws IOException {
        Collections.sort(arr, new SortByID());
        PrintWriter printWriter = new PrintWriter(new FileWriter("resources//sortById.CSV"));

        for (Student stu : arr) {
            printWriter.println(stu.toString());
        }
        printWriter.close();

    }

    public static void sortedByName() throws IOException {
        Collections.sort(arr, new SortByName());
        PrintWriter pr = new PrintWriter(new FileWriter("resources//sortByName.CSV"));

        for (Student stu : arr) {
            pr.println(stu.toString());
        }
        pr.close();

    }

    public static void sortedByPercentage() throws IOException {
        Collections.sort(arr, new SortedByPercentage());
        PrintWriter pr = new PrintWriter(new FileWriter("resources//sortByPercentage.CSV"));

        for (Student stu : arr) {
            pr.println(stu.toString());
        }
        pr.close();
    }

    public static void readFromFile() throws IOException {
        FileReader fileReader = new FileReader("resources//studentData.CSV");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<Student> stu = new ArrayList<>();
        int i = 0;
        String lineRead;
        while ((lineRead = bufferedReader.readLine())!= null) {

            stu.add(new Student());
            String[] split = lineRead.split(",");
            stu.get(i).setId(Integer.parseInt(split[0]));
            stu.get(i).setFirstName(split[1]);
            stu.get(i).setLastName(split[2]);
            stu.get(i).setMobileNo(split[3]);
            stu.get(i).setAddress(split[4]);
            stu.get(i).setState(split[5]);
            stu.get(i).setZipcode(split[6]);
            stu.get(i).setPercentage(Float.parseFloat(split[7].substring(0, split[7].length() - 1)));
            i++;
        }
        arr.addAll(stu);
        bufferedReader.close();
        fileReader.close();
    }
}
