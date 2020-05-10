import java.util.Scanner;

public class Code0 {

    public static int[] inputData(Scanner scan){
        int i=0,cnt=0;
        int[] arr = new int[100];
         while(true) {
           System.out.print("점수를 입력하세요(-1을 입력하면 입력종료): ");
           arr[i] = scan.nextInt();
               if (arr[i] == -1)
                    break;
                   i++;
                 cnt++;
              }
    int[] arr2= new int[cnt];
        for(i=0;i<cnt;i++)
            arr2[i]=arr[i];
    return arr2;
    }
    public static void sort(int[] arr){
        int tmp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                   tmp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=tmp;
                }
            }
        }
    }

    public static void showData(int[] arr2){
        System.out.println();
        System.out.print("점수: ");
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+" ");
    }
    public static void showAverage(int[] arr3){
        int sum=0;
        double avg=0.0;
        for(int i=0;i<arr3.length;i++){
            sum += arr3[i];
        }
        avg= (double)sum/arr3.length;
        System.out.println("\n평균: "+avg);
    }
    public static void findMax(int[] arr4){
        int max=arr4[0];
        for(int i=1;i<arr4.length;i++){
            if(arr4[i]>max)
                max=arr4[i];
        }
        System.out.print("최고 점수: "+max);
    }
    public static void findMin(int[] arr5){
        int min=arr5[0];
        for(int i=1;i<arr5.length;i++){
            if(arr5[i]<min)
                min=arr5[i];
        }
        System.out.println("  최저 점수: "+min);

    }

    public static void findRanking(Scanner scan,int[] arr6){
        System.out.println();
        int cnt;
        while(true){
            System.out.print("등수를 알고 싶은 점수를 입력하세요(-1을 입력하면 종료): ");
            int data=scan.nextInt();
            cnt=0;
            if(data==-1)
                break;
            for(int i=0;i<arr6.length;i++) {
                cnt++;
                if (data == arr6[i]) {
                    System.out.println("찾는 정수는 " + (i + 1) + "등 입니다.");
                    break;
                }
                if(cnt==arr6.length)
                    System.out.println("찾는 정수는 존재하지 않습니다.");
                else continue;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val;
        val = inputData(sc);
        sort(val);
        showData(val);
        showAverage(val);
        findMax(val);
        findMin(val);
        findRanking(sc,val);
        sc.close();
    }
}
