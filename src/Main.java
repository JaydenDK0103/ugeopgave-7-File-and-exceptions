import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Opgave 2a og 2b
        /*


        Drink drink=new Drink(5);
        Drink d=new Drink(-5);

        try{
            drink.setPrice(-5.0);
        }catch (IllegalArgumentException e){
            System.out.println("Ugyldig pris "+e.getMessage());

        }
        drink.addItem("Gin");
        drink.addItem("Vodka");


        try{
            drink.getItem(drink.items,-1);
        }catch (IllegalArgumentException e){
            System.out.println("Ugyldig index "+e.getMessage());
        }

         */
        /*
        Opgave3 opgave3=new Opgave3();


        try {
            ArrayList<String> lines = opgave3.readLines("Data/data");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }

         */
        Opgave4 espresso=new Opgave4("Espresso","En kraftfuld og koncentreret kaffe",25.0);
        Opgave4 latte=new Opgave4("Latte","Espresso med dampet mælk",45.0);
        Opgave4 cola=new Opgave4("Cola","Kold og brusende",30.0);
        Opgave4 menu=new Opgave4("Menu","Vores Menu",0.0);

        menu.addData(espresso);
        menu.addData(latte);
        menu.addData(cola);
        menu.data.add("Vand,Stille kildevand,gratis");
        menu.displayMenu();










    }


}