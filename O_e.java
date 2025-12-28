import java.util.*;
class O_e{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] el={"What is Java //? \n A) Single line comment \n B) Multiline comment"};
        int len=el.length;
        char[] a={'A'};
        char[] sa=new char[len];
        for(int i=0; i<len; i++){
            System.out.println(el[i]);
            sa[i]=s.next().charAt(0);
            if(Character.toUpperCase(sa[i])==Character.toUpperCase(a[i])){
                System.out.println("Answer is correct");
            }
        }
    }
}