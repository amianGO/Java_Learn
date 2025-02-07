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

        //Tambien podemos concatenar Variables en una funcion Print() usando el signo +
        name = "Alex";
        String lastName1 = "Trujillo";
        System.out.println(name + lastName1);

        //Si usamos el signo + con numero obtendremos una Operacion Matematica
        System.out.println(3 + 3);

        //------------------------------------------------------------------------------------------------------------------\\

        //Java puede crear multiples variables sin necesidad de usar varias lineas de codigo siempre y cuando sean del mismo tipo
        int x = 1, y = 2, z = 3;
        System.out.println(x + y + z);

        //Tambien podemos asignarles un unico valor a las mismas
        x = y = z = 80;
        System.out.println(x + y + z);

    }
}