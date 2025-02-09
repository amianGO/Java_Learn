package java_methods;

public class javaScope {
    public static void main(String[] args) {
        /*
         En java, las variables son accecibles para la region en las que fueron creadas, a esto se le llama scope
        *///Ejemplo

        //Para este bloque de codigo, no es accesible esta variable
        System.out.println();//Intenta Colocar la variable

        String name = "Jackson";

        //Para este bloque de codigo, si es accesible la variables
        System.out.println(name);
    }
}
