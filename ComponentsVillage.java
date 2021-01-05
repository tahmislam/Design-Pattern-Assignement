import java.util.ArrayList;

public class ComponentsVillage {
    public String name;
    public ArrayList<Shape>shapes_list = new ArrayList<Shape>();

    public ComponentsVillage(String s){
        this.name = s;
        System.out.println(this.name +" is added.");
    }

    public void add_shape(Shape s){
        this.shapes_list.add(s);
    }
}

