package learn_Java;

public class output{
    public static void main(String[] args) {
        
        //Imprimir en una Linea de la consola
        System.out.println("Esta es la forma mas basica para imprimir por Consola");

        //Podemos colocar este metodo tantas veces como deseemos
        System.out.println("Hola Mundo");
        System.out.println("Esto es un Print");
        System.out.println("dedicado a una unica linea");

        //el metodo Print() sin ln no genera una linea espaceadora debajo de si misma
        System.out.print("Hola Mundo");
        System.out.print(" Este es un Print() sin salto de linea");
        System.out.println();

        //Podemos usar Println() para imprimir numeros por Consola sin necesidad e usar las Comillas
        System.out.println(3);
        System.out.println(343);
        System.out.println(282829002);

        //Tambien Podemos Ejecutar Operaciones Matematicas mediante un Println()
        System.out.println(3 + 3);
        System.out.println(2 * 3);
        System.out.println(3 / 3);
        System.out.println(2 % 2);
    }
}
