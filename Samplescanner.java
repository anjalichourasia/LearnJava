import java.util.*;
class Samplescanner{
    public static void main(String arg[]){
        Scanner obj = new Scanner(System.in);
        int i;
        float f;
        String s;
        char c;
        i=obj.nextInt();
        f=obj.nextFloat();
        // c=(char)obj.read();
        s=obj.nextLine();
        System.out.println(i+" "+f+" "+" "+s);

    }
}