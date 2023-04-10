import java.util.Scanner;

/**
 * @author fazliberkordek  06 Nisan 2023a
 */
//This code find the year which users enteres is leftover or not.


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take year as int from user:
        int year;
        System.out.print("Enter the year:");
        year = input.nextInt();
        //General rule: Left over years mod4 == 0.
        if(year%4==0){
            System.out.println(year+" is left over by the general rule");
            //Second rule: Year must be times of 100 and if the year is row of 400 then it is a left over year.
            if (year/100 > 0 && year%400 == 0 ){
                System.out.println(year+ " is Left over year by the rule 2");
            }
        }else {
            System.out.println(year + " is NOT left over year");
        }
    }
}