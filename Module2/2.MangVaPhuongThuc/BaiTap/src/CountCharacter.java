import javax.xml.namespace.QName;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Nguyen Duy Vu";
        int count= 0;
        System.out.println("input character to find : ");
        String s = sc.next();

        for(int i =0;i<name.length();i++){
            if(s.equalsIgnoreCase(String.valueOf(name.charAt(i)))){
                count++;
            }

        }
        if(count>0){
            System.out.printf("%s Has %d in String ",s,count);
        }else
            System.out.printf("%s does not exist in String",s);
    }

}
