package java_methods;

public class javaRecursion {
    public static void main(String[] args) {

        /* Recursion es una tecnica que utilizan los metodos para llamarse asi mismo y resolver problemas complicados*/
        //Ejemplo
        int result = sum(8);
        System.out.println(result);

        //Ejemplo Halting Condition
        int resulHalting = sum(0, 8);
        System.out.println(resulHalting);

    }

    public static int sum(int num){
        if (num > 0) {
            return num + sum(num -1);
        } else {
            return 0;
        }
    }
    /* Explicacion 
     Piensa en que la funcion esta siendo llamada 8 veces
     la primera vez que se le llama hace lo siguiente:
     8 + 7
     despues
     8 + 7 + 6
     8 + 7 + 6 + 5
     8 + 7 + 6 + 5 + 4 
     8 + 7 + 6 + 5 + 4 + 3
     8 + 7 + 6 + 5 + 4 + 3 + 2
     8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
     8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

     Cuando llega a 0 la funcion no se vuelve a llamar y se detiene
    */
    //------------------------------------------------------------------------------------------------------------------\\

    /* Halting Condition
     Como los bulces pueden someterse al problema de un bucle infinito, recursion tambien puede someterse a este mismo problema
     que seria cuando este no deja de llamarse, toda recursion tiene algo llamada 'Halting Condition' que es cuando esta deja
     de llamarmse a si misma
    *///Ejemplo

    public static int sum(int start, int end){
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
