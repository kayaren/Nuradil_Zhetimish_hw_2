import java.util.Scanner;
import java.util.Random;

public class Main {
        public static void main(String[] args) {


            System.out.println(wolk(21, 40));
            System.out.println(wolk(13, 15));
            System.out.println(wolk(18, 36));
            System.out.println(wolk(45, 29));
            System.out.println(wolk(14, 29));
            System.out.println(wolk(generateRandomAge(),29));
            System.out.println(generateRandomAge());

    }
    public static String wolk(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp > 30)
        return ("можно идти гулять");

        else if(age<20 && temp>0&& temp>28)
            return ("можно идти гулять");


        else if (age>45 && temp>-10 && temp>25)
            return ("можно идти  гулять ");

        return ("оставайтесь дома");

    }

    public static int generateRandomAge(){
            int a = (int)(Math. random()*71);
            return a;
    }
}