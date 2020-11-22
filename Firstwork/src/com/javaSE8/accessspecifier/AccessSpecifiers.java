package com.javaSE8.accessspecifier;

public class AccessSpecifiers {

    //TYPES OF VARIABLES LISTED BELOW
    // variables
    // instances variables - Generating each memory allocation of respective object creation
    // class variables - single memory allocation for entire class
    // local variables - works only inside the methods

    //dataType variableName --> Declaration
    int instanceVariable;
    String name;
    double number = 100.0d;


    //class variables
    //static - doesn't require a object creation to call a method.
    static String classVariable = "initialized";
    static double classNumber = 99.9d;


    AccessSpecifiers() {
        classNumber = 85.25d;
    }

    AccessSpecifiers(String name, double number, int intVar) {
        this.name = name;
        this.number = number;
        this.instanceVariable = intVar;
        classNumber = 1.0d;
    }

    public static void main(String[] args) {
        System.out.println("AccessSpecifiers");
        AccessSpecifiers accessSpecifiers1 = null; // initialization
//         accessSpecifiers1.doubleIt(123); // NPE - NullPointerException
        System.out.println(accessSpecifiers1);
        AccessSpecifiers accessSpecifiers2 = new AccessSpecifiers(); // instantiation
        System.out.println(accessSpecifiers2);
        System.out.println(accessSpecifiers2.number);
        accessSpecifiers2.doubleIt(123);

        // instantiation + initialization
        AccessSpecifiers accessSpecifiers3 = new AccessSpecifiers("init", 2.356d, 9856);
        System.out.println(accessSpecifiers3);
        System.out.println(accessSpecifiers3.number);
        accessSpecifiers3.doubleIt(123);

        System.out.println("end--");
        accessSpecifiers2.doubleIt(123);
        accessSpecifiers3.doubleIt(123);

        AccessSpecifiers accessSpecifiers4 = new AccessSpecifiers(); // instantiation
        AccessSpecifiers accessSpecifiers5 = new AccessSpecifiers(); // instantiation
        AccessSpecifiers accessSpecifiers6 = new AccessSpecifiers(); // instantiation
        AccessSpecifiers accessSpecifiers7 = new AccessSpecifiers(); // instantiation


    }

    void doubleIt(int val) {
        int i = 2; // local variable
        System.out.println(i * val);
        System.out.println(i * this.number);
        System.out.println(classVariable);
        System.out.println(classNumber * 2);
    }

    @Override
    public String toString() {
        return "AccessSpecifiers{" +
                "instanceVariable=" + instanceVariable +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", classVariable=" + classVariable +
                '}';
    }
}