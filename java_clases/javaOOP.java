package java_clases;

public class javaOOP {
        
        /* Conocido como Programacion orientada a Objetos (Object-Oriented Programming)
         Es la creacion de Objetos que Contengan Datos y Metodos

         Tiene Grandes ventajas como: 
         - Es reapido y facil de ejecutar
         - provee una estructura limpia para los programas
         - Ayuda a crear aplicaciones completas sin necesidad de escribir tanto codigo

        */

        //------------------------------------------------------------------------------------------------------------------\\
        /* Que son las clases y los Objetos
         la clase y los objetos son los aspectos principales de la programacion orientada a objetos
         Ejemplo:
         - Clase: CARS{
            Objects: 
            - BMW
            - Mazda
            - Ferrari
         }

         - Clase: Fruta {
            Objects: 
            - Banana
            - Manzana
            - Fresa
         }

         Podemos observar como la clase es una plantilla para los objetos
         cuando creamos un objeto, a este se le adhieren los metodos y variables de su clase

        */
    //------------------------------------------------------------------------------------------------------------------\\

    //Como veran hemos estado Utilizando una clase durante todo nuestro recorrido por Java, Utilizando la palabra reservada class
    //Como ya estamos en una clase creemos un atributo
    public String name = "Pablo";

    //------------------------------------------------------------------------------------------------------------------\\

    /* Como creamos un Objeto?
     En java un objeto es creado desde una clase, ya hemos creado la clase javaOOP, ahora la podemos usar para crear un objeto
     */
    public static void main(String[] args) {
        /*Para crear un objeto de tipo javaOOP, necesitamos seguir la siguiente estructura
            -> Nombre de la clase
            -> Nombre del Objeto
            -> Usamos la Palabra reservada 'New'
        *///Ejemplo:
        javaOOP object = new javaOOP();
        System.out.println(object.name);
        //Podemos crear tantos Objetos como queramos
        javaOOP object2 = new javaOOP();
        System.out.println(object2.name);
    }
    //------------------------------------------------------------------------------------------------------------------\\

    //Podemos crear un objeto de una clase y acceder a este desde otra clase(Una clase que contenga los atributos o metodos y otra que contenga el Main o principal)
    //Creemos 2 clases en un paquete llamado (Resolviendo Dudas:Main - Fruit)

}
