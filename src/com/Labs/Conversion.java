package com.Labs;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temp temp = new Temp();
        Weight weight = new Weight();
        Height height = new Height();
        String unit;
        double amount;
        String answer;
        int choice;

        do {
            System.out.println("What would you like to convert? Enter the corresponding number;" +
                            "\n\t1. Temperature " +
                            "\n\t2. Weight" +
                            "\n\t3. Height");
            choice = scanner.nextInt();
            scanner.nextLine();//
            switch (choice) {
                case 1://////TEMPERATURE/////////
                    System.out.println("What would you like to convert? Enter the corresponding unit;" +
                            "\n\t1. Fahrenheit " +
                            "\n\t2. Celsius" +
                            "\n\t3. Kelvin");
                    unit = scanner.nextLine();

                    if(unit.equalsIgnoreCase("Fahrenheit") || unit.equalsIgnoreCase("Celsius") || unit.equalsIgnoreCase("Kelvin")) {

                        System.out.println("What amount of this unit would you like to convert?");
                        amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (unit.equalsIgnoreCase("Fahrenheit")) {
                            temp.convertFahrenheit(amount);
                            System.out.println(amount + " " + unit + " = " + temp.getCelsius() + " Celsius && " + temp.getKelvin() + " Kelvin.");
                        } else if (unit.equalsIgnoreCase("Celsius")) {
                            temp.convertCelsius(amount);
                            System.out.println(amount + " " + unit + " = " + temp.getFahrenheit() + " Fahrenheit && " + temp.getKelvin() + " Kelvin.");
                        } else if (unit.equalsIgnoreCase("Kelvin")) {
                            temp.convertKelvin(amount);
                            System.out.println(amount + " " + unit + " = " + temp.getFahrenheit() + " Fahrenheit && " + temp.getCelsius() + " Celsius.");
                        }
                    }
                    else{
                        System.out.println("Incorrect unit. Please check spelling.");
                    }
                break;

                case 2:///////WEIGHT//////////
                    System.out.println("What would you like to convert? Enter the corresponding unit;" +
                            "\n\t1. KGs" +
                            "\n\t2. Pounds");
                    unit = scanner.nextLine();

                    if(unit.equalsIgnoreCase("KGs") || unit.equalsIgnoreCase("Pounds")) {

                        System.out.println("What amount of this unit would you like to convert?");
                        amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (unit.equalsIgnoreCase("KGs")) {
                            weight.convertKgs(amount);
                            System.out.println(amount + " " + unit + " = " + weight.getPounds() + " Pounds.");
                        } else if (unit.equalsIgnoreCase("Pounds")) {
                            weight.convertPounds(amount);
                            System.out.println(amount + " " + unit + " = " + weight.getKgs() + " KGS.");
                        }
                    }
                    else {
                        System.out.println("Incorrect unit. Please check spelling.");
                    }
                break;

                case 3:///////HEIGHT///////

                    System.out.println("What would you like to convert? Enter the corresponding unit;" +
                            "\n\t1. cms" +
                            "\n\t2. inches");

                    unit = scanner.nextLine();
                    if(unit.equalsIgnoreCase("cms") || unit.equalsIgnoreCase("inches")){

                        System.out.println("What amount of this unit would you like to convert?");
                        amount = scanner.nextDouble();
                        scanner.nextLine();

                        if (unit.equalsIgnoreCase("cms")) {
                            height.convertCm(amount);
                            System.out.println(amount + " " + unit + " = " + height.getInches() + " inches.");
                        }
                        else if (unit.equalsIgnoreCase("inches")) {
                            height.convertInches(amount);
                            System.out.println(amount + " " + unit + " = " + height.getCm() + " cms.");
                        }
                    }
                    else {
                        System.out.println("Incorrect unit. Please check spelling.");
                    }
                break;

                default:
                    System.out.println("Incorrect selection. Try again.");
                break;

            }

            System.out.println("Do you want to convert more? Y/N");
            //scanner.nextLine();
            answer = scanner.nextLine();
        }while("y".equalsIgnoreCase(answer));

    }


}