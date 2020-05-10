import java.util.Scanner;
public class Code2 {
    public static boolean inRect(int x,int y,int rectx1, int recty1,int rectx2,int recty2){
        if((x>=rectx1&&x<=rectx2)&&(y>=recty1&&y<=recty2))
            return true;
        else
            return false;
    }
    public static void showCollision(int nx1, int ny1, int nx2, int ny2){
        final int X1=100, X2=200,Y1=100,Y2=200;
        if(inRect(nx1,ny1,X1,Y1,X2,Y2)==true||inRect(nx2,ny2,X1,Y1,X2,Y2)==true){
            // x1,y1 or x2,y2가 직사각형 안에 있을 때
            System.out.println("(100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
        }
        else{
            // x1,y1 and x2,y2가 직사각형 안에 없을 때
            System.out.println("(100,100), (200,200)의 두 점으로 이루어진 직사각형과 충돌하지 않습니다.");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            showCollision(x1,y1,x2,y2);
        }
    }
}
