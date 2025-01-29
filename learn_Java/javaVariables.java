public class javaVariables {
    public static void main(String[] args) {
        //Tenemos diferentes tipos de Variables por Ejemplo:
        /* 
         * String - Guarda Texto o Cadenas de texto como "Hola" todo dentro de comillas dobles
         * Int - Contiene solo numero enteros, sin coma o punto decimal por ejemplo 123 o -343
         * float - Contiene numero decimales por ejemplo 29.99 o 45.66
         * char - Contiene un solo caracter normalmente dentro de comillas simples 'a' o 'c'
         * boolean - Contiene valores de dos estados los cuales son: true o false
         */

         //Declaracion de una Variable

         //Tipo Nombre = Valor

         //Ejemplo
         String email = "examples@gmail.com";
         System.out.println(email); // Podemos Imprimir el dato que contiene una variable con Print()

         //Podemos crear variables sin definir y definirlas mas adelante
         String name;
         name = "Damian";
         System.out.println(name);

         //Tambien podemos cambiar el valor de una variable (Como su nombre lo indica)
         name = "Josh";
         System.out.println(name);

         //las Final variables son variables que no se pueden cambiar una vez ya definidas
        final String lastName = "Marin";
        // lastName = "Duque"; No se puede cambiar 
        System.out.println(lastName);

        //Declaremos Variables
        String day;
        String month = "January";
        String event;

        int year;
        int age;
        int phone;

        float card;
        float progress = 4.9f;

        double money = 4.333;

        char word = 'a';

        boolean isOn = false;
        boolean isOff = true;

    }
}