package java_methods;

public class methodsParameters {

    /* 
     En los metodos, los parametros se pasan como las variables..son especificados despues del nombre del metodo
     dentro de los parentesis, puedes añadir tantos como quieras, solo los debes separar por comas
    *///Ejemplo



    //Unico Parametro
    static void myMethod(String name){ //Aqui declaramos un parametro de Tipo String
        System.out.println(name + " Apellido");
    }

    
    //Multiples Parametros
    static void myMethod1(String name, int age){
        System.out.println(name + " Tiene " + age + " Años");
    }

    //Con sentencia if else
    static void verifyAge(int age){
        if (age < 18) {
            System.out.println("Acceso denegado, Solo mayores de edad");
        } else {
            System.out.println("Acceso concedido, Bienvenido");
        }
    }

    //Con Retorno de valores
    /* 
     Con los metodos anteriores usamos 'void' para que no necesite devolver ningun valor podemos remplazar este, por un tipo
     de dato primitivo y usar la palabra reservada 'return' dentro del metodo para devolver valores
    *///Ejemplo

    static int myMethod(int x){
        return x + 5; //Suma 5 al parametro 
    }

    static int myTwoMethods(int x, int y){
        return x + y;//Sumamos los 2 parametro
    }


    public static void main(String[] args) {

        //Ahora ejecutemos unico Parametro
        myMethod("Maria"); //Aqui agregamos los argumentos en el metodo puesto que este ya no puede ir vacio
        myMethod("Sofia");
        myMethod("Laura");

        /* 
         Cuando un valor es ingresado en la creacion del metodo se conoce como parametro 'name', al momento de 
         ingresar el dato llamando el metodo se conoce como 'Argumento'
        */

        //------------------------------------------------------------------------------------------------------------------\\

        //Multiples parametros
        myMethod1("Carlos", 20);
        myMethod1("Maria", 29);
        myMethod1("Laura", 18);

        //------------------------------------------------------------------------------------------------------------------\\

        //Comunmente los metodos son usados en sentencias de if-else
        verifyAge(18);

        //------------------------------------------------------------------------------------------------------------------\\
        
        //Retorno de Valores
        System.out.println(myMethod(10)); //Responde al Metodo (10 + 5)

        System.out.println(myTwoMethods(3, 4)); //Suma los argumentos ya que el metodo nos indica que los parametros son (x + y)

        //Tambien podemos guardar el resultado en una variable
        int result = myTwoMethods(3, 4);
        System.out.println("El resultado de el Metodo 'myTwoMethods es: " + result);
    }    
}