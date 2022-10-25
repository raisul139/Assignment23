import java.util.Scanner;

public class Runner {
    public static void main(String[]args)
    {
        Clock MyClock=new Clock();
        System.out.println("My Time:"+MyClock.getTime());

        Scanner input=new Scanner(System.in);

        System.out.println("How many hours Ahead is your timezone");

        int timezone= input.nextInt();
            WorldClock worldClock=new WorldClock(timezone);

        System.out.println("MY time +"+ timezone+":"+worldClock.getTime());
    }
}
