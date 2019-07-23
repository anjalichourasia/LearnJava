import java.io.*;
class palindrom{
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String s= obj.readLine();
            int l,i,c=0,j;
            l=s.length()-1;
            // for(i=0,j=l;i<=l/2;i++,j--){
            //     if(s.charAt(i) == s.charAt(j)){
            //         c++;
            //         if(c==(l/2)){
            //             System.out.println("palindrom");
            //             break;
            //     }}
            //     else{
            //         System.out.println("Not a palindrom");
            //         break;
            //     }
            // }
            // both r correct
            for(i=0,j=l;i<=l/2;i++,j--){
                if(s.charAt(i)!=s.charAt(j)){
                    c=1;
                    System.out.println("Not a Palindrom");
                    break;
                }
            }
            if(c==0)
            System.out.println("Palindrom");
    }
}