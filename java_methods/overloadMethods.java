package java_methods;

public class overloadMethods {

    /*
        En Java existe algo llamado Metodos sobrecargados o 'Overload' esto nos quiere decir que podemos
        tener metodos con el mismo nombre pero de diferentes parametros
    *///Ejemplo

    //Creemos 2 metodo de diferentes nombres para ver como serian los metodos normales

    static int myMethodInt(int x, int y){
        return x + y;
    }

    static double myMethodDouble(double x, double y){
        return x + y;
    }
    //------------------------------------------------------------------------------------------------------------------\\
    //Los metodos anteriores tienen diferente Nombre para ser reconocidos, ahora creemos 2 metodos con el mismo nombre pero con parametros distintos

    static int methodGeneral(int x, int y){
        return x + y;
    }

    static double methodGeneral(double x, double y){
        return x + y;
    }
    //------------------------------------------------------------------------------------------------------------------\\
    public static void main(String[] args) {
        
        //Ejecutemos los metodos normales
        int method1 = myMethodInt(4, 4);
        double method2 = myMethodDouble(3.5, 3.5);
        System.out.println("Resultado del Primer metodo: " +method1);
        System.out.println("\nResultado del Segundo metodo: " + method2);
        //------------------------------------------------------------------------------------------------------------------\\
        //Ejecutemos los metodos con el mismo nombre

        System.out.println("\nMetodo sobrecargado de tipo entero: " + methodGeneral(1, 6));
        System.out.println("\nMetodo sobrecargado de tipo double: " + methodGeneral(4.5, 7.6));
    }
}
