import java.util.Scanner;

public class BisectionMethod {

    public static void main(String[] args) {

        int a , b , c , d ;
        double lb = 0d , ub = 0d , medium , tmp;
        double xlb = 0d , xub = 0d;

        Scanner sc = new Scanner(System.in);
        System.out.println("********************** Bisection Method for degree 3 equation: **********************");
        System.out.println("enter a , b , c ,d");
        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();
        System.out.println("c:");
        c = sc.nextInt();
        System.out.println("d:");
        d = sc.nextInt();
        System.out.println("finding lowerbound and upper bound......");

        int i = -10;

        do {

            tmp = a*Math.pow(i , 3)+b*Math.pow(i , 2)+c*Math.pow(i , 1)+d;
            if(tmp < 0) lb = tmp;
            else if(tmp > 0) ub = tmp;
            i++;
            if(ub > 0 && lb < 0) break;

        } while (true);
        //upper bound and lower bound found next step:
        tmp = 0;
        lb = 1;
        System.out.println("the upper bound is: "+ub+" and the lower bound is: "+lb);
        do {

            xlb = a*Math.pow(lb , 3)+b*Math.pow(lb , 2)+c*Math.pow(lb , 1)+d;
            xub = a*Math.pow(ub , 3)+b*Math.pow(ub , 2)+c*Math.pow(ub , 1)+d;

            medium = (xlb + xub)/2d;

            tmp = a*Math.pow(medium , 3)+b*Math.pow(medium , 2)+c*Math.pow(medium , 1)+d;
            //medium found
            if(tmp > 0) {

                ub = medium;

            } else {
                lb = medium;
            }
        } while (tmp != 0);

        System.out.println("the solution is: "+medium);



    }

}
