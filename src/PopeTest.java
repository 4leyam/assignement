import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PopeTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again = "";
        int choice = 0 , security = 0;
        do {



            System.out.println("In this program we are going to deal with two module numbers sum and sorting and Object Manipulation\n" +
                    "******************Number sorting and addition***************\n" +
                    "1-Sum of n Numbers\n" +
                    "2-Asc number sorting\n" +
                    "******************Object Manipulation***********************\n" +
                    "3-load module 2\n \n" +
                    "Make your choice");
            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        sumofNNumber();
                        break;
                    case 2:
                        ascSorting();
                        break;
                    case 3:
                        handleGeoModule();
                        break;
                    default:
                        System.out.println("your choice is not correct please make a correct choice.");
                        break;

                }
                security ++;
                System.out.println("Do you want to continue? yes or no (y/n)");
                again = sc.nextLine();
                if(again.equalsIgnoreCase("No") || again.equalsIgnoreCase("N")) break;
            } catch (Exception e) {
                System.err.println("custom Exception handling: "+e.getMessage());
            }

        } while (security < 50);
        if(security>=50) {System.out.println("too much test iteration");}

    }
    public static void handleGeoModule() throws Exception{
        System.out.println("In this module we are going to calculate volumes and areas of Rectangles, Box and circles\n" +
                "1-Area\n" +
                "2-Volume\n");
        Scanner sc = new Scanner(System.in);
        int operationChoic = Integer.parseInt(sc.nextLine());
        switch (operationChoic) {
            case 1:
                System.out.println("which area do you want to process?\n" +
                        "1-Circle\n" +
                        "2-Rectangle");
                int shapeChoice = Integer.parseInt(sc.nextLine());
                switch (shapeChoice) {
                    case 1:
                        System.out.println("please provide your circle radius");
                        new Circle(Integer.parseInt(sc.nextLine())).area();
                        break;
                    case 2:
                        System.out.println("Enter respectively width and height");
                        new Rectangle(Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())).area();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            case 2:
                System.out.println("Enter respectively width , height , and depth");
                new Box(Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine()) , Integer.parseInt(sc.nextLine())).volume();
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }


    }

    private static void sumofNNumber() {
        double sum = 0d;
        ArrayList<Double> inputs = safeInputing();
        for (double tmp:inputs) {
            sum += tmp;
        }
        System.out.println("the sum of the numbers: "+inputs.toString()+" is "+sum);

    }

    private static void ascSorting() {
        ArrayList<Double> inputs = safeInputing();
        Double[] rawInputs = inputs.toArray(new Double[]{});
        double min  , tmp;
        int minIndex ;
        for (int i = 0 ; i < rawInputs.length ; i++) {
            min = rawInputs[i];
            minIndex = i;
            for(int j = i ; j< rawInputs.length ; j++) {
                if(min >= rawInputs[j]) {
                    min = rawInputs[j];
                    minIndex = j;
                }
            }
            tmp = rawInputs[i];
            rawInputs[i] = min;
            rawInputs[minIndex] = tmp;
        }
        System.out.println(Arrays.asList(rawInputs).toString());
        Arrays.sort(rawInputs);
        System.err.println("alternative: "+Arrays.asList(rawInputs).toString());
    }

    private static ArrayList<Double> safeInputing() {
        ArrayList<Double> numbers = new ArrayList<>();
        String input = null;
        boolean exit = false;
        double d = 0d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your numbers and then enter a letter or exit to perform the sum ");
        do {
            try {
                input = sc.nextLine();
                d = Double.parseDouble(input);
            } catch (Exception e) {
                exit = true;
                System.err.println("Custom Exception handling: "+e.getMessage());
            }
            if(!exit) {
                numbers.add(d);
            } else {
                break;
            }
        } while (true);
        return numbers;
    }

}
