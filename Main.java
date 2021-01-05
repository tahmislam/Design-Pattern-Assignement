public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a village");

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Triangle  triangle1 = new Triangle();
        curve  curve1 = new curve();
        Cylinder cylinder = new Cylinder();
        
        Water water = new Water();
        leaf leaf1 = new leaf();
        Fish fish1 = new Fish();
        Chicken chicken = new Chicken();

        ComponentsVillage lake = new ComponentsVillage("Lake");
        //Lake has water , curvy waves and also fishes swimming in it
        lake.add_shape(water);
        lake.add_shape(curve1);
        lake.add_shape(fish1);

        //create tree
        ComponentsVillage tree = new ComponentsVillage("tree");
        tree.add_shape(leaf1);        
        tree.add_shape(rectangle2);

        //create house
        ComponentsVillage house = new ComponentsVillage("house");
        house.add_shape(rectangle1);
        house.add_shape(triangle1);
        house.add_shape(rectangle2);
        house.add_shape(triangle1);

        //create farm
        ComponentsVillage farm = new ComponentsVillage("farm");
        farm.add_shape(cylinder);
        farm.add_shape(rectangle1);
        farm.add_shape(chicken);

        //create well
        ComponentsVillage well = new ComponentsVillage("well");
        well.add_shape(cylinder);
        well.add_shape(water);


    }
}
