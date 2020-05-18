//@eshutkarsharma
// 0035	Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int person_age_1, person_age_2, person_age_3;
        int max, min;

        System.out.print("Enter the age of person 1 : ");
        person_age_1 = sc.nextInt();

        System.out.print("Enter the age of person 2 : ");
        person_age_2 = sc.nextInt();

        System.out.print("Enter the age of person 3 : ");
        person_age_3 = sc.nextInt();

        if (person_age_1 > person_age_2 && person_age_1 > person_age_3)
            max = person_age_1;
        else if (person_age_2 > person_age_3)
            max = person_age_2;
        else
            max = person_age_3;

        if (person_age_1 < person_age_2 && person_age_1 < person_age_3)
            min = person_age_1;
        else if (person_age_2 < person_age_3)
            min = person_age_2;
        else
            min = person_age_3;

        if (min == max)
            System.out.println("All person have equal age");
        else {
            if (max == person_age_1)
                System.out.println("Person 1 have max age");
            if (max == person_age_2)
                System.out.println("Person 2 have max age");
            if (max == person_age_3)
                System.out.println("Person 3 have max age");

            if (min == person_age_1)
                System.out.println("Person 1 have min age");
            if (min == person_age_2)
                System.out.println("Person 2 have min age");
            if (min == person_age_3)
                System.out.println("Person 3 have min age");
        }
    }
}