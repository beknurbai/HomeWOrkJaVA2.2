package com.company;

public class Main {

    public static void main(String[] args) {

createObject("Samsung").print();
createObject("Iphone").print();
createObject("Huawei").print();



         }
public static Printable createObject(String className){
        Printable print=null;
        switch (className){
            case "Samsung":
                print=new Samsung(15000,"A50",3000,"Android");
                break;
            case "Iphone":
                print=new Iphone(75000,"X",75,"new Camera Model");
                break;
            case "Huawei":
                print=new Huawei(30000,"Mate 20","Android",3);
                break;






        }return print;


}





    }

