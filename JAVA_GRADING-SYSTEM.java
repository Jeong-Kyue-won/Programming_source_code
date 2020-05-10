/*
과제 6
본 과제는 학생들의 성적 관리를 위한 프로그램이다.
프로그램 실행 시 프로그램 개발의 목적으로 3명의 이름, 4개의 평가 항목, 그리고 각 학생의 평가 항목 점수 12개가 자동 입력된다.
프로그램은 메뉴 기반의 프로그램으로 다음의 메뉴들 중 사용자는 그 중 하나를 선택하고 프로그램은 선택된 기능을 실행하는 방식으로 구동된다.

1.	전체 학생의 성적을 화면에 출력하기
2.	학생 추가하기
3.	평가 항목 추가하기
4.	학생 성적 조회하기
0.	종료하기

1은 모든 학생에 대해 입력된 항목의 성적을 보여주고,
2는 학생 이름을 추가하고 학생 이름 추가 후 모든 평가 항목에 대해 점수를 입력하도록 한다.
3은 평가 항목을 새로 추가하며 이때 모든 학생들에 대해 평가 항목 점수를 입력한다.
4는 학생 이름을 입력하면 해당 학생의 성적만을 조회한다.

프로그램 구현은 업로드한 java 파일을 사용하여 진행하며 세부 기능은 업로드한 class 파일의 실행 시 동일하게 구현하도록 한다.
최소 5명 이상의 학생들과 6개의 평가 항목을 입력한 결과를 보이도록 한다.

프로그램 구현 시 클래스 이름과 파일 명은 자신이름을 사용하도록 합시다.
이는 과제 제출 시 실행해봄으로 학생들의 구현의 정확성 여부를 확인하려 함입니다.
*/

import java.util.Scanner;

public class 정규원 {

    static final int STUDENT_NUMBER = 10; // 위치 중요. Main일 경우는 static 생략
    static final int ITEM_NUMBER = 10;

    public static void main(String[] args) {

        String[] students = new String[STUDENT_NUMBER];                          //학생 이름 저장을 위한 String 배열
        String[] items = new String[ITEM_NUMBER];                                //과목 이름 저장을 위한 String 배열
        int[][] records = new int[STUDENT_NUMBER][ITEM_NUMBER];                  //학생수*과목수
        int noStudents = 3, noItems = 4;                                         //기본 입력 데이터 값의 개수 저장을 위한 int 변수
        String name = null;                                                      //추가할 학생 이름을 저장하기위한 String 변수
        String item = null;                                                      //추가할 과목 이름을 저장하기위한 String 변수

        initializeData(students, items, records);  // for testing

        Scanner sc = new Scanner(System.in);
        int choice = selectChoice(sc);

        while (choice != 0){
            switch(choice){
                case 1:
                    printData(students, items, records, noStudents, noItems);
                    break;
                case 2:
                    System.out.print("추가할 학생 이름:");
                    name = sc.next();//sc.nextLine();
                    addStudent(name, students, items, records, noStudents, noItems, sc);
                    noStudents++;
                    break;
                case 3:
                    System.out.print("추가할 평가 항목 이름:");
                    item = sc.next(); //sc.nextLine();
                    addItem(item, students, items, records, noStudents, noItems, sc);
                    noItems++;
                    break;
                case 4:
                    System.out.print("검색할 학생 이름:");
                    name = sc.next(); //sc.nextLine();
                    System.out.print("검색할 항목 이름:");
                    item = sc.next(); //sc.nextLine();
                    search(name,item,students,items,records,noStudents,noItems);// search method 호출
                    break;
                default:
                    System.out.println("1~4 사이의 정수로 입력해주세요.");
            }
            choice = selectChoice(sc);
        }
        sc.close();
    }

    public static int selectChoice(Scanner sc){
        System.out.println("\nJAVA 성적 관리 프로그램입니다.");
        System.out.println("1: 전체 학생의 성적을 화면에 출력하기.");
        System.out.println("2: 학생 추가하기.");
        System.out.println("3: 평가 항목 추가하기.");
        System.out.println("4: 학생 성적 조회하기.");
        System.out.println("0: 종료하기");
        System.out.print("번호를 입력하세요>> ");

        int n = Integer.parseInt(sc.next());
        System.out.println();

        return n;
    }

    public static void initializeData(String[] s, String[] c, int[][] r){
        String strSt = "김재연 고예림 곽다은";
        String strCo = "Hw1 Hw2 Quiz1 Exam1";
        String strRec = "20 25 10 85 18 24 10 790 21 20 12 100";
        Scanner inputSt = new Scanner(strSt);
        Scanner inputCo = new Scanner(strCo);
        Scanner inputRec = new Scanner(strRec);
        int cntS=0, cntC=0;

        for(cntS=0;inputSt.hasNext();cntS++)
            s[cntS]=inputSt.next();

        for(cntC=0;inputCo.hasNext();cntC++)
            c[cntC]=inputCo.next();

        for(int i=0;i<cntS;i++)
            for(int j=0;j<cntC;j++)
                r[i][j]=Integer.parseInt(inputRec.next());

        inputSt.close();
        inputCo.close();
        inputRec.close();
    }

    public static void printData(String[] s, String[] c, int[][] r, int nSt, int nCo){

        System.out.println("\n수강 과목 성적은 다음과 같습니다.");
        System.out.print("      "); // 6 spaces

        for (int j = 0; j < nCo; j++) // 나중에 추가
            System.out.printf("%7s", c[j]);
        System.out.println();

        // 모든 학생의 과목 성적들을 보이기
        for (int i = 0; i < nSt; i++) {
            System.out.printf("%s", s[i]);
            for (int j = 0; j < nCo; j++)  // 비정방형 배열의 경우도 가능
                System.out.printf("%7d", r[i][j]);
            System.out.println();
        }
    }

    public static void addStudent(String sname, String[] st, String[] it, int[][] r, int nSt, int nIt, Scanner sc){

        if(nSt<10)
            st[nSt] = sname;
        else
            System.out.println("***OverFlow!***");
        System.out.println("각 과목에 해당되는 점수를 입력해주세요.");

        for(int i=0;i<nIt;i++) {
            System.out.print(it[i] + "=");
            r[nSt][i] = sc.nextInt();
        }
    }

    public static void addItem(String iname, String[] st, String[] it, int[][] r, int nSt, int nIt, Scanner sc){

        if(nIt<10)
            it[nIt] = iname;
        else
            System.out.println("***OverFlow!***");

        for(int i=0;i<nSt;i++) {
            System.out.println(iname+" 과목에 해당하는 "+st[i]+" 학생의 점수를 입력해주세요.");
            r[i][nIt] = sc.nextInt();
        }
    }

    public static void search(String stu,String sub,String[] st,String[] it,int[][] r,int nSt,int nIt){

        int nS=0,nI=0,cnt=0;
        boolean a=false, b=false;

        for(int i=0;i<nSt;i++) {
            if (stu.equals(st[i])) {
                nS = i;
                a = true;
                cnt++;
            }
            else if(cnt==nSt)
                System.out.println(stu+" 학생은 입력되지 않은 데이터입니다.");
        }
        for(int i=0;i<nIt;i++) {
            if (sub.equals(it[i])) {
                nI = i;
                b= true;
                cnt++;
            }
            else if(cnt==nIt)
                System.out.println(sub+" 과목은 입력되지 않은 데이터입니다.");
        }

        if(a&&b)
            System.out.println(st[nS]+" 학생의 "+it[nI]+" 점수는 "+ r[nS][nI]+" 입니다.");
        else
            System.out.println("ERROR!");
    }

}