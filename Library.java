import java.util.*;
public class Library {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<String> b=new ArrayList<>();
        while(true){
            System.out.println("what do you want to do in the Library?");
            System.out.println("add books / need book / return book / show available books / exit");
            String uc=s.nextLine();
            if(uc.equalsIgnoreCase("add books")){
                System.out.println("Enter the no of book to include:");
                int nb=s.nextInt();
                System.out.println("enter the books name ");
                for(int i=0; i<=nb; i++){
                    b.add(s.nextLine());
                }
            }
            else if(uc.equalsIgnoreCase("need book")){
                System.out.println("Enter how many books you need?");
                int nbun=s.nextInt();
                System.out.println("Enter the book name");
                for(int i=0; i<=nbun; i++){
                    String bn=s.nextLine();
                    b.remove(bn);
                }
            } 
            else if(uc.equalsIgnoreCase("return book")){
                System.out.println("Enter the no of book to return:");
                int nrb=s.nextInt();
                s.nextLine();
                System.out.println("Enter book name to return");
                for(int i=0; i<nrb; i++){
                    b.add(s.nextLine());
                }
            }
            else if(uc.equalsIgnoreCase("exit")){
                break;
            }
            else if(uc.equalsIgnoreCase("show available books")){
                for(int i=0; i<b.size(); i++){
                    System.out.println(i+1 +" "+b.get(i));
                }
            }
        }
    }
}
