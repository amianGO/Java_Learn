package java_clases;

public class javaClassMethod {

    /* En el Capitulo de JavaMethods hemos aprendido como crear un metodo, donde vemos que un metodo es declarado
     En la clase para realizar ciertas acciones
     *///Ejemplo
     static void myMethod(){
        System.out.println("Hola Soy el metodo 'myMethod");
     }
     //------------------------------------------------------------------------------------------------------------------\\

     /* Method Static y Public
      -> Static: Es utilizado cuando no necesitamos crear un Objeto, es decir que lo podemos llamar sin necesidad de crear un objeto
      -> Public: Es utilizado cuando necesitamos crear un Objeto, es decir que solo se puede acceder a el con un objeto
     *///Ejemplo:

     //Metodo Estatico
     static void methodStatic(){
        System.out.println("Hola soy un Metodo Estatico");
     }

     //Metodo Publico
     public void methodPublic(){
        System.out.println("Hola soy un Metodo Publico");
     }

     //Metodo Ejemplo de acceso
     public void walletSize(double wallet){
        System.out.println("El Tamaño de tu Billetera es: " + wallet);
     }

     public static void main(String[] args) {
        myMethod(); //Asi llamamos un metodo

        //Como acceder al metodo Static
        methodStatic();

        //Como acceder al metodo publico
        javaClassMethod Objeto = new javaClassMethod(); //Primero creamos un Objeto del tipo de la clase
        Objeto.methodPublic();//Luego llamamos el Metodo creado
    
        //------------------------------------------------------------------------------------------------------------------\\

        /*Como Pudimos Observar para ingresar al metodo desde un Objeto utilizamos el Punto '.' */
        
        Objeto.walletSize(4.555);

        //Al igual que en ejemplos de metodos y acceso a objetos anterioroes, podemos hacer esto en archivos separados
     }

    
}
