import java.io.*;
class Sample{

    public static void main(String arg[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String s;
        float f;
        i=Integer.parseInt(obj.readLine());
        s=obj.readLine();
        f=Float.parseFloat(obj.readLine());
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
    }
}