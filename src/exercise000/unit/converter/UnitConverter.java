package exercise000.unit.converter;

import java.util.Scanner;

public class UnitConverter {

    private double inputValue;
    private double outputValue;
    private int userConversionChoice;
    private int userInputValueUnitChoice;
    private int userOutputValueUnitChoice;
    private Scanner scanner = new Scanner(System.in);

    public UnitConverter() {

        //choose
        System.out.println("Hello, please select the unit of conversion.\n1- Length\n2- Time");
        userConversionChoice = scanner.nextInt();

        //choose input unit
        System.out.println("Please select the base unit:\n1- milimeters\n2- centimeters\n3- meters\n4- kilometers");
        userInputValueUnitChoice = scanner.nextInt();

        //choose output unit
        System.out.println("Please select the conversion unit:\n1- milimeters\n2- centimeters\n3- meters\n4- kilometers");
        userOutputValueUnitChoice = scanner.nextInt();

        // choose the value to convert
        System.out.println("Please select the value to convert: ");
        inputValue = scanner.nextInt();

        selectUnit();
    }

    public void selectUnit(){

        //choose conversion based on user input
        if (userConversionChoice == 1){
            lengthConversion();
        } else if (userConversionChoice == 2){
            timeConversion();
        } else {
            System.out.println("Please enter a valid number next time:).");
        }

    }

    public void lengthConversion(){

        if (userInputValueUnitChoice == 1){
            //milimeters to milimeters - input & output is the same
            if (userOutputValueUnitChoice == 1){
                outputValue =  inputValue;

                //milimeters to centimeters
            } else if (userOutputValueUnitChoice == 2){
                outputValue = inputValue * 0.1;

                //milimeters to meters
            } else if (userOutputValueUnitChoice == 3){
                outputValue = inputValue * 0.01;

                //milimeters to kilometers
            } else if (userOutputValueUnitChoice == 4){
                outputValue = inputValue * 0.001;

            } else {
                System.out.println("Please enter a valid number in range of 1 to 4.");
            }

        } else if (userInputValueUnitChoice == 2){
            //cantimeters to milimeters -
            if (userOutputValueUnitChoice == 1){
                outputValue = inputValue * 10;

                //centimeters to centimeters - input
            } else if (userOutputValueUnitChoice == 2){
                outputValue =  inputValue;

                //centimeters to meters
            } else if (userOutputValueUnitChoice == 3){
                outputValue = inputValue * 0.01;

                //centimeters to kilometers
            } else if (userOutputValueUnitChoice == 4){
                outputValue = inputValue * 0.00001;

            } else {
                System.out.println("Please enter a valid number in range of 1 to 4.");
            }

        } else if (userInputValueUnitChoice == 3){
            //meters to milimeters -
            if (userOutputValueUnitChoice == 1){
                outputValue = inputValue * 1000;

                //meters to centimeters - input
            } else if (userOutputValueUnitChoice == 2){
                outputValue = inputValue * 100;

                //meters to meters
            } else if (userOutputValueUnitChoice == 3){
                outputValue =  inputValue;

                //meters to kilometers
            } else if (userOutputValueUnitChoice == 4){
                outputValue = inputValue * 0.001;

            } else {
                System.out.println("Please enter a valid number in range of 1 to 4.");
            }

        } else if (userInputValueUnitChoice == 4){
            //kilometers to milimeters -
            if (userOutputValueUnitChoice == 1){
                outputValue = inputValue * 1000000;

                //kilometers to centimeters - input
            } else if (userOutputValueUnitChoice == 2){
                outputValue = inputValue * 100000;

                //kilometers to meters
            } else if (userOutputValueUnitChoice == 3){
                outputValue = inputValue * 1000;

                //kilometers to kilometers
            } else if (userOutputValueUnitChoice == 4){
                outputValue =  inputValue;

            } else {
                System.out.println("Please enter a valid number in range of 1 to 4.");
            }

        } else {
            System.out.println("Please enter a valid number in range of 1 to 4.");
        }
        System.out.println("Value after conversion is: " + outputValue);
    }


    public void timeConversion(){
        System.out.println("time");

    }
}
