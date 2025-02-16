package java_clases;

public class javaModifiers {
    /* Ahora que estamos familiarizados con la palabra reservada 'public', usandola en todos nuestro proceso
     * la palabra reservada 'public' es un modificador de acceso, el cual, nos permite definir el acceso a los 
     * niveles de las clases, atributos, metodos y constructores
     * Estos Modificadores de acceso se dividen en dos grupos
     
     * -> Access Modifiers - Controla los niveles de acceso
     * -> Non-Acces Modifiers - Provee otras funcionalidades pero no controla los niveles de acceso
     */

    //------------------------------------------------------------------------------------------------------------------\\
    
    //Acces Modifiers

    /* Para las clases: 

     * Public -> La clase es accesible desde cualquier otra clase
     * default -> La clase solo es accesible por clases que se encuentren dentro del mismo paquete
     
     * Para Atributos, Metodos y Constructores:
     
     * Public -> el codigo es accesible para todas las clases
     * private -> el codigo es accesible solo para la clase declarada
     * protected -> El codigo solo es accesible en el mismo paquete y sus subclases
     */

     //Non-Acces Modifiers

     /* Para las clases:

     * final -> la clase no puede ser heredada por otras clases
     * abstract -> La clase no puede ser usada para crear objetos
     
     * Para atributos, metodos y constructores
     
     * final -> Atributos o metodos no pueden ser sobre-escritos o modificados
     * static -> atributos o metodos solo pertenecen a la clase, en lugar de a un objeto
     * abstract -> Solo se puede usar en clases abstractas y solo puede ser utilizado en metodos, el metodo no tiene cuerpo 
       y ha de ser herdado
     * transient -> Atributos y metodos se omiten tras serializar el objeto que los contiene
     * sychronized -> Solo se puede obtener los metodos mediante un subproceso a la vez
     * volatile -> El valor de un atributo no se almacena en el cache localmente, se lee desde el main o la memoria principal
     */

     //Algunos Ejemplos

     //Si no quieres que se cambie el valor de una variable, podemos declararla con la palabra clave 'final'
     final int birthday = 1981;

     //Metodos Estaticos y Publicos
     static void methodStatic(){
        System.out.println("Los metodos estaticos no necesitan de un Objeto para ser llamados");
     }

     public void methodPublic(){
        System.out.println("Los metodos publicos necesitan de un objeto para ser llamados");
     }

     public static void main(String[] args) {

        //Creemos un Objeto de la clase principal
        javaModifiers javaModifiers = new javaModifiers();

        //Intentemos cambiar la variable
        //javaModifiers.birthday = 2000; -> Saltara un Error debido a que ya no se le puede asignar un valor
        System.out.println(javaModifiers.birthday);

        javaModifiers methodsModifiers = new javaModifiers();
        //Metodos
        methodStatic(); //Llamamos al metodo Estatico sin la necesidad de un Objeto de la clase
        methodsModifiers.methodPublic(); 
     }

     //En el paquete resolviendo Dudas Observemos el archivo "abstractModifier"

     
}
