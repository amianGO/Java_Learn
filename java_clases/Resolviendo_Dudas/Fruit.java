package java_clases.Resolviendo_Dudas;

public class Fruit {
    private String name;
    private long size;

    //Creamos Un constructor vacio (Lo veremos mas adelante)
    public Fruit(){

    }
    //Creamos un Constructor con Parametros
    public Fruit(String name, long size){
        this.name = name;
        this.size = size;
    }

    //Creamos getters  y Setters(Lo necesitaremos por ahora)
    public String getName(){
        return name;
    }

    public Long getSize(){
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSize(long size) {
        this.size = size;
    }

    
}
