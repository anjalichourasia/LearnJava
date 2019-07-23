import java.io.*;
class Count{
    public static void main(String args[])throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int i,d=0,l=0,u=0,sp=0,space=0;
        char c;
        System.out.println("Enter a string");
        String s=obj.readLine(); 
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c>='0' && c<='9')
            d++;
            else if(c>='A' && c<='Z')
            u++;
            else if(c>='a' && c<='z')
            l++;
            else if(c==' ')
            space++;
            else
            sp++;
        }
        System.out.println("digit="+d+"\nUppercase="+u+"\nLowerCase="+l+"\nSpace="+space+"\nspecialcharacter"+sp);

    }
}