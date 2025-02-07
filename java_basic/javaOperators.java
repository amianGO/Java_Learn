public class javaOperators {
    public static void main(String[] args) {
        
        /* En java existen diversos tipos de operadores con los cuales podremos interactuar para ejecutar  diversas operacioones ya sean
        Matematicas, Logica etc
        */

        //Ejemplo con el Operador '+'
        int sum1 = 100 + 5;
        int sum2 = sum1 + 100;
        int sum3 = sum1 + sum2;

        /* Java divide los Operadores en los siguientes grupos
         - Operadores Aritmeticos
         - Operadores de Asignacion
         - Operadores de Comparacion
         - Operadores Logicos
         - Operadores Bitwise
        */

        /* Operadores Aritmeticos
         - '+' Suma
         - '-' Resta
         - '*' Multiplicacion
         - '/' Division
         - '%' Modulo
         - '++' Incremento
         - '--' Decremento
        *///Ejemplo
        int x = 2;
        int y = 4;
        
        
        System.out.println("Suma: " + (x + y)); //Suma
        System.out.println("Resta: " + (x - y)); //Resta
        System.out.println("Multiplicacion: " + (x * y));
        System.out.println("Division: " + (x / y));//Division
        System.out.println("Modulo: " + (x % y)); //Modulo
        System.out.println("Incremento: " + (x++) + " " + (y++));//Incremento
        System.out.println("Decremento: " + (x--) + " " + (y));//Decremento
        
        /* Operadores de Asignacion (Usado para asignarle valor a las variables) 
         - '=' Asignacion de valor
         - '+=' Añadir un valor y asignarlo directamente
         - '-=' Restar un valor y asignarlo directamente
         - '*=' Multiplicar un valor y asignarlo directamente
         - '/='
         - '%='
         - '&='
         - '|='
         - '^='
         - '>>='
         - '<<='
        *///Ejemplo
        System.out.println("\nOperadores de Asignacion: ");
        System.out.println("+= " + (x += y));
        System.out.println("-= " + (x -= y));
        System.out.println("*= " + (x *= y));
        System.out.println("/= " + (x /= y));
        System.out.println("%= " + (x %= y));
        System.out.println("&= " + (x &= y));
        System.out.println("|= " + (x |= y));
        System.out.println("^= " + (x ^= y));
        System.out.println(">>= " + (x >>= y));
        System.out.println("<<= " + (x <<= y));

        /* Operadores de Comparacion
         - '==' Igual a
         - '!=' Diferente de
         - '>' Mayor que
         - '<' Menor que
         - '>=' Mayor o igual
         - '<=' Menor o igual
        *///Ejemplo
        
        System.out.println("\nOperadores de Comparacion: ");
        //Devuelve Valores Booleanos
        System.out.println("== " + (x == y));
        System.out.println("!= " + (x != y));
        System.out.println("> " + (x > y));
        System.out.println("< " + (x < y));
        System.out.println(">= " + (x >= y));
        System.out.println("<= "+ (x <= y));

        /* Operadores Logicos
        - '&&' Operador "and"
        - '||' Operador "Or"
        - '!' Operador "NO"
        *///Ejemplo

        System.out.println("\nOperadores Logicos: ");
        //Devulve valores Booleanos
        System.out.println("&& " + (x == 2 && y == 4 ));
        System.out.println("|| " + (x == 3 || y == 4));
        System.out.println("! " + (x != y));
    }
}
