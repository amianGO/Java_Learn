package java_clases;

public class javaAttributes {

    /* Como pudimos Observar, las Variables que ahora se colocan en una clase, son llamadas atributos*/
    String attribute1 = "Atributo 1";
    String attribute2 = "Atributo 2";
    final String attribute3 = "Atributo 3";
    public static void main(String[] args) {
        //Anteriormente Vimos que podemos acceder a los atributos de una clase mediante un Punto (.)
        javaAttributes newObject = new javaAttributes();
        System.out.println("Estamos Imprimiendo el: " + newObject.attribute1);
        System.out.println("Estamos Imprimiendo el: " + newObject.attribute2);

        //Como modificamos los atributos?
        newObject.attribute1 = "Atributo 1 Modificado";
        newObject.attribute2 = "Atributo 2 Modificado";
        //Asi sobre escribimos o actualizamos un valor 
        System.out.println("Estamos Imprimiendo el: " + newObject.attribute1);
        System.out.println("Estamos Imprimiendo el: " + newObject.attribute2);

        //En caso de no querer que se actualice un valor, debemos declarar las variables como 'final' en este caso el atributo 3
        System.out.println("Estamos Imprimiendo el: " + newObject.attribute3 + " Y no puede ser cambiado.");
    }
    
}