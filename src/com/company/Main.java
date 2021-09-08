package com.company;


public class Main {

    public static void main(String[] args) {
    //Think Java Exercise 4.4.
        boo();
        System.out.print("Svaret er = ");
        System.out.println(multadd(3,4,5));
    }

    //Opg. 1:
    public static double multadd(double a, double b, double c){
        //return (a * b + c);

        //Jeg får fejlen "java: missing return statement" når jeg compiler, da jeg ikke har gjort noget ved "return".
    }

    // Opg. 2:
    public static void boo(){
        System.out.println(("boo!") + 7);

        //"boo!" og 7 bliver sat sammen til et udtryk.
    }
}
