package com.company;

public class Student {
    String name;
    int idNumber;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setIdNumber(int idNumber) {
//        this.idNumber = idNumber;
//    }
//
//    public int getIdNumber() {
//        return idNumber;
//    }
//
     public Student(String name, int idNumber){
         this.name = name ;
         this.idNumber = idNumber;
     }

    public void showStudent(){
        System.out.println("Students name: " + name + ". " + "ID Number: " + idNumber);
    }

}
