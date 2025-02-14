package java_clases;

public class javaConstructor {
    /* Un Constructor en java, es un Metodo Especial que nos permite Inicializar Objetos, Este es llamado cuando se crea un
       Objeto de una clase
     *///Ejemplo:

     String name; //Brindemosle un atributo a nuestra clase

     public javaConstructor(){ //Creamos un Constructor Vacio (Sin parametros)
        name = "Constructor";  //Le damos un Valor inicial a nuestra variable
     }
     //------------------------------------------------------------------------------------------------------------------\\

     /* Constructor con Parametros */

     int number; //Creemos otro Atributo

     public javaConstructor(int valor){ //Creamos un Constructor con un Parametro
        number = valor; //Le asignamos a nuestro atributo el argumento
        //Para un mejor orden podemos utilizar la palabra clave 'this.' (this.number)
     }

     public static void main(String[] args) {
        //Imprimamos nuestro Primer objeto con nuestro primer Constructor
        javaConstructor obj1 = new javaConstructor(); //Esto llama al constructor de la clase (Si, la creacion de un objeto)
        System.out.println(obj1.name);

        //Imprimamos nuestro Segundo Objeto con nuestro segundo Constructor con Parametro
        javaConstructor obj2 = new javaConstructor(10);
        System.out.println(obj2.number);
     }
}
