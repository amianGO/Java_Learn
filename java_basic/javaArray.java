public class javaArray {
    public static void main(String[] args) {
        
        //Los Arrays son utlizados para guardar multiples valores en una sola variable, para declararla se usan '[]'

        String[] cars; //Esta declarado como un 'Array' de valores de tipo 'String'

        String[] colors = {"Red","Yellow","Green","Gray","Blue","purple"}; //Asi le podemos definir valores a nuestro Array

        //Tambien podemos crear un 'Array' de enteros
        int[] numbers = {1,2,3,4,5,6};

        //------------------------------------------------------------------------------------------------------------------\\

        //Como acceder a los elementos de un 'Array'
        //Recuerda que en programacion empezamos a contar desde 0
        System.out.println(colors[0] +"\n"); // Asi accedemos al elemento de la primera Posicion


        //Como Cambiar el Valor de un elemento de un 'Array'
        colors[0] = "White";
        System.out.println(colors[0] +"\n");


        numbers[0] = 16;
        System.out.println(numbers[0] +"\n");


        //------------------------------------------------------------------------------------------------------------------\\
        
        //Podemos contar cuantos elementos hay en nuestro 'Array' usando la propiedad 'lenght'

        System.out.println("Colores en nuestro Array: " + colors.length);
        System.out.println("Numeros en nuestro Array: " + numbers.length +"\n");


        //------------------------------------------------------------------------------------------------------------------\\

        //  Ciclos y Arrays

        //Podemos mostrar los elementos de un 'Array' mediante un Ciclo utilizando la propiedad 'length'
        System.out.println("Mostrando Elementos con Bucle For");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        //Como lo vimos antes, tambien podemos usar 'for-each' para simplificar codigo
        System.out.println("\nMostrando Elementos con For-Each");
        for (String i : colors) {
            System.out.println(i);
        }

        //------------------------------------------------------------------------------------------------------------------\\

        /* Arrays Multidimensionales
        Esto significa Arrays dentro de otra Array

        *///Ejemplo

        int[][] dimensionalArray = {{1,2,3,4,5,6} , {1,2,3,4}}; //Tenemos un Array que contiene dos Arrays (el primero con mas numeros que el segundo)

        //Como acceder a sus elementos es facil, decidimos la Posicion del Array al que queremos acceder y luego el elemento de este
        System.out.println("\nCuarta posicion del Segundo Aarray: "+ dimensionalArray[1][3]); //'[1]' es la Posicion del segundo Array, '[3]' es el elemento que contiene ese Arra
        
        //Como cambiar sus elementos
        dimensionalArray[1][3] = 5;
        System.out.println("\nCuarta Posicion Actualizada del Segundo Array: " + dimensionalArray[1][3]); //Ya no tendra un Valor de 4... lo tendra de 5

        //------------------------------------------------------------------------------------------------------------------\\

        System.out.println("\nEjemplo Con Bucle For");
        //Podemos Mostrar lo Elementos de un multidimensional con 2 ciclos por ejemplo
        for (int i = 0; i < dimensionalArray.length; i++) { //Con este Bucle Accedemos a la Posicion de los Array

            for (int j = 0; j < dimensionalArray[i].length; j++) { //Con este Bucle Accedemos a los Elementos de cada Array
                System.out.println(dimensionalArray[i][j]);
            }
        }

        System.out.println("\nEjemplo con For-Each");
        //Podemos Mostrarlo Igualmente con un 'For-Each'
        for (int[] array : dimensionalArray) {

            for (int element : array) {
                System.out.println(element);
            }
            
        }

    }
    
}
