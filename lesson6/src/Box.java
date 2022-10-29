public class Box<T> {                             //generic tipis klasi
    private T field;

    public Box(T field){
        this.field=field;
    }
    public T getField(){
        return field;
    }
}
