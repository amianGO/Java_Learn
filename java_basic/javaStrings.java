public class javaStrings {
    public static void main(String[] args) {
        /*Como ya vimos en Aprendizajes Anteriores las variables de Tipo String funcionan
        para guardar texto, este mismo Contiene Diferentes metodos propios 
        *///Ejemplo

        String sayHello = "Hello World";
        System.out.println(sayHello);

        //Metodo Length
        System.out.println("La Frase: " + sayHello + ", Su Longitud: "+ sayHello.length());
        //Recuerda que en Programacion El conteo inicia desde 0

        //Metodo toUpperCase y toLowerCase

        //UpperCase funciona para Hace que una cadena de texto torne a mayusculas
        System.out.println("Texto con toUpperCase: " + sayHello.toUpperCase());

        //toLowerCase funciona para hacer que una cadena de texto torne a minusculas
        System.out.println("Texto con toLowerCase: " + sayHello.toLowerCase());

         //------------------------------------------------------------------------------------------------------------------\\

         /*Como encotrar un caracter en una cadena de texto con el metodo indexOf
            Este metodo retornar la primera posicion donde se encuentra la cadena buscada

         *///Ejemplo

         System.out.println(sayHello.indexOf("H"));
         System.out.println(sayHello.indexOf("W"));

        //------------------------------------------------------------------------------------------------------------------\\
        
        //String Concatenation

        /*
         Podemos utilizar el operador '+' para concatenar variables, pero, tambien
         podemos usar el metodo concat() para unir Strings
        *///Ejemplo
        String concatenatedString = "from java";

        System.out.println(sayHello.concat(concatenatedString));

        //------------------------------------------------------------------------------------------------------------------\\

        /* Caracteres Especiales
         - '\'' Comilla Unica
         - '\"' Comillas dobles
         - '\\' BackSlash
         - '\n' Nueva Linea
         - '\r' Salto de Linea
         - '\t' Tabulacion
         - '\b' BackSpace 
        *///Ejemplo

        System.out.println("Hola \'Mundo\'");
        System.out.println("Hola \"Mundo\" desde Java");
        System.out.println("Hola \\ Mundo");

        System.out.println("\n" + sayHello + "\n");
        System.out.println("Hola Mundo desde\rjava");
        System.out.println("Hola\tMundo");
        



    }
}
