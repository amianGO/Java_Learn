public class javaBucles {
    public static void main(String[] args) {

         //Condicion Switch (Selecciona uno de varios bloques de codigo para ser ejecutado)
        /* Syntax 

         switch (Condicion) {
            case x: 
                (Bloque de codigo)
                break:
            case y:
                (Bloque de Codigo)
                break:
            default:
                (Bloque de Codigo)
         }

        *///Ejemplo

        int monthNum = 1;

        switch (monthNum) {
            case 1:
                System.out.println("Estamos en el mes de Enero");
                break;
            case 2:
                System.out.println("Estamos en el mes de Febrero");
                break;
            case 3:
                System.out.println("Estamos en el mes de Marzo");
                break;
            case 4:
                System.out.println("Estamos en el mes de Abril");
            case 5:
                System.out.println("Estamos en el mes de Mayo");
            case 6:
                System.out.println("Estamos en el mes de Junio");   
            case 7:
                System.out.println("Estamos en el mes de Julio");
            case 8:
                System.out.println("Estamos en el mes de Agosto");
            case 9:
                System.out.println("Estamos en el mes de Septiembre");
            case 10:
                System.out.println("Estamos en el mes de Octubre");
            case 11:
                System.out.println("Estamos en el mes de Noviembre");
            case 12:
                System.out.println("Estamos en el mes de Diciembre");
            default:
                System.out.println("No esta dentro de la opcion");
                break;
        }

        //------------------------------------------------------------------------------------------------------------------\\
        
        //Ciclo o Bucle While (Sirve para crear un Bucle mientras la condicion sea verdadera)

        /* Syntax

            while (Condicion){
                (Bloque de Codigo)            
            }

        *///Ejemplo

        int numWhile = 0;
        while (numWhile < 5) { //Mientras esto sea verdadero ejecutara el bloque de codigo
            System.out.println(numWhile);
            numWhile++;
        }

        //------------------------------------------------------------------------------------------------------------------\\

        //Ciclo o Bucle Do-while (Es una Variante de la condicion 'While')

        /* Syntax

            do {
                (Bloque de Codigo)
            }
            while(Condicion)

        *///Ejemplo

        int numDoWhile = 0;
        do {

            System.out.println(numDoWhile);
            numDoWhile++;

        } while (numDoWhile != 5);  //Mientras esto sea verdadero se ejecutara el bloque de codigo de arriba

        //Podemos tener un Condicional dentro de un Ciclo o bucle Condicional

        int tingoTango = 0;
        while (tingoTango <= 3) {
            if (tingoTango < 3) {
                System.out.println("Tingo");
            }else {
                System.out.println("Tango!");
            }

            tingoTango++;
        }

        //------------------------------------------------------------------------------------------------------------------\\

        // Ciclo For (Usado cuando sabemos excatamente la cantidad de veces que necesitamos hacer un loop)

        /* Syntax

            for (estado 1, estado 2, estado 3){
                (Bloque de Codigo)
            }

            estado 1 : Es ejecutado antes del bloque de codigo
            estado 2: define la condicion para ejecutar el bloque de codigo
            estado 3: se ejecuta todo el tiempo despues de que el bloque de codigo ha sido ejecutado

        *///Ejemplo
        /* 
         estado 1: declaramos la variable antes de que empiece el ciclo
         estado 2: definimos la condicion para correr el ciclo (si es menor que 5)
         estado 3: incrementamos el valor de 'i' cada vez que el bloque de codigo es ejecutado en el ciclo
        */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //------------------------------------------------------------------------------------------------------------------\\

        //Ciclos Anidados

        //Es posible insertar Ciclos dentro de otros ciclos a lo cual es llamado ciclos anidados

        for (int i = 0; i <= 2; i++) {
            System.out.println("Ciclo Externo: " + i); //Esto es Ejecutado 2 veces

            for (int j = 0; j <=3; j++) {
                System.out.println("Ciclo Interno: " + j); //Esto es Ejecutado 6 veces (2 * 3) ya que el bucle externo se ejecuta 2 veces
            }
        }

        //------------------------------------------------------------------------------------------------------------------\\

        //Ciclo For-Each

        /* Syntax
        
            for(type nombreVariable: nombreArray){
                (Bloque de Codigo)
            }

        *///Ejemplo

        String[] cars = {"BMW","Mazda","KIA","Toyota"}; //A esto se le denomina Array y hablaremos de ello mas Adelante en 'JavaArray'
        
        for (String i : cars) { //Se define el Tipo, Se nombra una variable y se busca en el array 'caras'
            System.out.println(i); // Se imprime cada elemento del Array
        }
    }
}
