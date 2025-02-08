package java_methods;

public class javamethod {
    public static void main(String[] args) {
        
        /* 
         Un metodo es un bloque de codigo que solo se ejecuta cuando es llamado, en los metodos puedes pasar datos
         mejor conocidos como parametros, los metodos se usan para ejecutar ciertas acciones, normalmente los conocemos como funciones,
         los metodos son utilizados para re-utilizar codigo
        */

        //LLamaremos al metodo creado el cual puede ser llamado multiples veces
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }

    static void myMethod(){ 
        System.out.println("Soy El metodo");
    }
    /* 
     - 'static' -> Significa que el metodo pertenece a la clase 'Main (javamethod)' y no representa un Objeto de la clase 'Main(javamethod)'
     - 'void' -> Significa que este metodo no retorna ningun valor, o no devuelve ningun valor
    */
}
