import java.util.*;
public class Railway {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        ArrayList<Integer> sa=new ArrayList<>();
        sa.add(1);
        sa.add(2);
        sa.add(3);
        sa.add(4);
        sa.add(5);
        sa.add(6);
        sa.add(7);
        sa.add(8);
        sa.add(9);
        sa.add(10);
        while(true){
            System.out.println("choose: book ticket / cancel ticket / show seat availability / exit");
            String uc=s.nextLine();
            if(uc.equalsIgnoreCase("book ticket")){
                System.out.println("Enter the seat number:");
                int sn=s.nextInt();
                s.nextLine();
                if(sa.contains(sn)){
                    System.out.println("seat in availabilty");
                    sa.remove(Integer.valueOf(sn));
                    System.out.println("seat booked successfully");
                }
                else{
                    System.out.println("this seat is already booked");
                }
                
            }
            else if(uc.equalsIgnoreCase("cancel ticket")){
                System.out.println("Enter the seat no. you want to cancel");
                int csn=s.nextInt();
                s.nextLine();
                sa.add(csn);
            }
            else if(uc.equalsIgnoreCase("show seat availability")){
                for(int i=0; i<sa.size(); i++){
                    System.out.println("seat no."+" "+sa.get(i));
                }
            }
            else if(uc.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
