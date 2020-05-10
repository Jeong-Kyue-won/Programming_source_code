import java.util.Scanner;
public class Code1{
    public static void countNum(int i){
        int count_50000, count_10000, count_1000, count_100, count_50, count_10, count_1;
        count_50000=i/50000;
        count_10000 =i%50000/10000;
        count_1000 =i%50000%10000/1000;
        count_100 =i%50000%10000%1000/100;
        count_50 =i%50000%10000%1000%100/50;
        count_10 =i%50000%10000%1000%100%50/10;
        count_1 =i%50000%10000%1000%100%50%10/1;
        System.out.println("오만원권 "+count_50000+"매");
        System.out.println("만원권 "+ count_10000 +"매");
        System.out.println("천원권 "+ count_1000 +"매");
        System.out.println("백원 "+ count_100 +"개");
        System.out.println("오십원 "+ count_50 +"개");
        System.out.println("십원 "+ count_10 +"개");
        System.out.println("일원 "+ count_1 +"개");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("금액을 입력하시오>>");
            int n = sc.nextInt();
            countNum(n);
        }
    }
}
