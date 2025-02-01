public class javaCasting {
    public static void main(String[] args) {
    
    //------------------------------------------------------------------------------------------------------------------\\

    //En JAVA tenemos dos tipos de Casteo Widening Casting, Narrowing Casting

    /* Widenning Casting (Automatico)
        byte -> short -> char -> int -> long -> float -> double
    */ 

    /* Narrowing Casting (Manual)
        double -> float -> long -> int -> char -> short -> byte
    */

    //Ejemplos con Widening Casting (usado para pasar datos pequeños a grandes)

    int myInt = 4;
    double myDouble = myInt;

    System.out.println(myInt);
    System.out.println(myDouble); // Casting automatico: int a Double

    //Ejemplos con Narrowing Casting (Usado manualmente escribiendo el tipo de dato en parentesis)

    double myDouble1 = 3.56d;
    int myInt1 = (int)myDouble1; // Casting Manual: double a int

    System.out.println(myDouble1);
    System.out.println(myInt1);

    }
}