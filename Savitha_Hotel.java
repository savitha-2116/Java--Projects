import java.util.*;
public class Savitha_Hotel {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to Savitha_Hotel!");
        System.out.println("Enter the Count of how many items the people took? ");
        int ut=s.nextInt();
        s.nextLine();
        String[] pn=new String[ut];
        int[] r=new int[ut];
        System.out.println("Enter the Product Name");
        for(int i=0; i<ut; i++){
            pn[i]=s.nextLine();
        }
        System.out.println("Products Rate");
        int total=0;
        for(int i=0; i<ut; i++){
            System.out.print("Enter the product"+ " "+ i +":");
            r[i]=s.nextInt();
            total+=r[i];
        }
        System.out.println("BILL SUMMARY");
        for(int i=0; i<ut; i++){
            System.out.println(pn[i]+" "+"-"+r[i]);
        }
        if(total>=1000){
            total-=200;
            System.out.println("Discount Applied");
            System.out.println("updated total Bill is:"+total);
        }
        else{
            System.out.println("The total Bill is:"+total);
        }
    }
}
