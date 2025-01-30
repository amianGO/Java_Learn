public class javaDataTypes {
    public static void main(String[] args) {
        //los tipos de datos en java estan divididos en 2 grupos, Primitivos y No primitivos
        
        /*PRIMITIVOS
            - byte -> Almacena numeros enteros de -128 to 127
            - short -> Almacena numeros enteros de -32,768 to 32,767
            - int -> Almacena numeros enteros de -2,147,483,648 to 2,147,483,647
            - long -> Almacena numeros enteros de -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            - float -> Almacena numeros fraccionarios desde 6 a 7 digitos decimales
            - double -> Almacena numeros fraccionarios desde 15 a 16 digitos decimales
            - boolean -> Almacena Valores de verdadero o Falso (true / false)
            - char -> Almacena un solo Caracter/letra o un valor de ASCII
         */

         /* NO-PRIMITIVOS
            - String
            - Array
            - Classes
         */

         //------------------------------------------------------------------------------------------------------------------\\

        //Los tipos de Datos Primitivos estan divididos en 2 grupos Integer Types, Floating point Types

        /* INTEGER TYPES
            - byte
            - short
            - int
            - long
        */

        /* Floating Poitn Types
            - float
            - double
        */

        byte myNum1 = 127; //Almacena numeros enteros de -128 to 127
        System.out.println(myNum1);

        short myNum2 = 32767; //Almacena numeros enteros de -32,768 to 32,767
        System.out.println(myNum2);

        int myNum3 = 100000; //Almacena numeros enteros de -2,147,483,648 to 2,147,483,647
        System.out.println(myNum3);

        long myNum4 = 123456789L; //Almacena numeros enteros de -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (Recuerda que termina con L)
        System.out.println(myNum4);

        float myNumf = 6.77f; //Almacena numeros fraccionarios desde 6 a 7 digitos decimales (Recuerda que termina con f)
        System.out.println(myNumf);

        double myNumd = 29.89d; //Almacena numeros fraccionarios desde 15 a 16 digitos decimales
        System.out.println(myNumd);

        //Lo Tipos Booleanos Almacena Valores de verdadero o Falso (true / false - YES / NO - ON / OFF)
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        //Caracteres Almacena un solo Caracter/letra o un valor de ASCII
        char letter = 'A';
        System.out.println(letter);

        char letter2 = 65; //valor de ASCII
        System.out.println(letter2);

        //------------------------------------------------------------------------------------------------------------------\\
    }
}
