import java.util.Scanner;
public class second
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String evType= new String();
        String result= new String();
        int ParSize;
        System.out.println("Enter the event type ");
        evType=in.nextLine();
        System.out.println("Enter the party size ");
        ParSize=in.nextInt();
        result = "The event type is "+evType+" and the party size is "+ParSize;
        result=result+". The meal suggestion is ";
        if(evType.equals("casual"))
            result=result+"sandwiches";
        else if(evType.equals("semi-formal"))
            result=result+"fried chicken";
        else if(evType.equals("formal"))
            result=result+"chicken parmesan";
        result=result+". The preparation suggestion is ";
        if(ParSize==1)
            result=result+"in the microwave";
        else if(ParSize>=2&&ParSize<=12)
            result=result+"in your kitchen";
        if(ParSize>12)
            result=result+"by a caterer";
        System.out.println(result);

    }
}
