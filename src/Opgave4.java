import java.util.ArrayList;
//Opgave 4 og 5
public class Opgave4 {
    ArrayList<String> data = new ArrayList<>();
    String name;
    String description;
    double price;

    public Opgave4(String name, String description, double price){
        this.name=name;
        this.description=description;
        this.price=price;
    }
    public void addData(Opgave4 item){
        this.data.add(item.toString());
    }
    @Override
    public String toString() {
        return name + "," + description + "," + price;
    }

    public void displayMenu(){
        double total = 0;
        for (String s : data) {
            String[] values = s.split(",");
            String name = values[0].trim();
            String description = values[1].trim();
            try {
                double price = Double.parseDouble(values[2].trim());
                total += price;
                System.out.println(name + " - " + description + " (" + price + " kr)");
            } catch (NumberFormatException e) {
                System.out.println(name + " - kunne ikke læse pris: " + values[2].trim());
            }
        }
        System.out.println("Samlet pris: " + total + " kr");
    }





}
