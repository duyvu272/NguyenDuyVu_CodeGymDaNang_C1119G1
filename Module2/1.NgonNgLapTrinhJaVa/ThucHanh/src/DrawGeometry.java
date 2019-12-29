import java.util.Scanner;
public class DrawGeometry {
    public void drawTrigle(){
        for(int i = 6;i>0;i--){
            for (int j = i;j<6;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void drawRectangle(){
        for (int i = 0;i<3;i++){
            System.out.println("*********");
        }
    }
    public void drawSquare(){
        for (int i = 0;i<5;i++){
            System.out.println("*******");
        }
    }


    public static void main(String[] args) {
        DrawGeometry d = new DrawGeometry();
        boolean check = false;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Menu" + "\n1.Rectangle" + "\n2.Triangle" + "\n3.Square"+"\n4.Exit");
            int i = sc.nextInt();
            switch(i){
                case 1 :
                    d.drawRectangle();
                    break;
                case 2:
                    d.drawTrigle();
                    break;
                case 3:
                    d.drawSquare();
                    break;
                case 4:
                    check = true;
                    break;
                default:
                    System.out.println("number invalid");
            }
        }while (!check);
    }
}
