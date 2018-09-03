package exercise000.unit.converter;

import java.util.Scanner;

public class UnitConverter {
    //milimetry,centymetry,metry, kilometry

    private int inputValue;
    private int outputValue;
    private Scanner scanner = new Scanner(System.in);

    public UnitConverter() {
        selectUnit();
    }

    public void selectUnit(){
        System.out.println("Hello, please select the unit of conversion.\n 1- Length\n2- Time");
        int userChoice = scanner.nextInt();

        //choose conversion based on user input
        if (userChoice == 1){
            lengthConversion();
        } else if (userChoice == 2){
            timeConversion();
        } else {
            System.out.println("Please enter a valid number next time:).");
        }

    }

    public int lengthConversion(){
        System.out.println("Please select the base unit:\n1- milimeters\n2-centimeters\n3- meters\n4- kilometers");
        int userChoice = scanner.nextInt();

        //choose the base


        return outputValue;
    }

    public int timeConversion(){
        System.out.println("time");
        return outputValue;
    }

}
