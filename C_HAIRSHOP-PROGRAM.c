#include <stdio.h>


int main(){
   
   
   int cut_M = 0;
   int cut_W = 0; 
   int dye = 0;
   int dye_R = 0;
   int perm = 0;
   int perm_Set = 0;
   int magic = 0;
   int magic_V =0;
   int iron = 0;
   int magic_R =0;
   int magic_S = 0;
   int clinic = 0;
   int clinic_P = 0;
   int dry_R = 0;
   int dry_M = 0;
   
   int iNum;
   int total=0;
   
   char iChar;
   
   for(;;){
      
      printf("해당하는 숫자를 입력해주세요 ! (종료는 숫자 0을 입력...)\n");
      printf("\n1.남성 커트\n2.여성 커트\n3.염색\n4.뿌리염색\n5.일반펌\n6.셋팅펌\n7.매직(시세이도)\n8.뿌리 매직\n9.볼륨매직\n10.아이롱 펌\n11.매직셋팅\n12.크리닉\n13.염색, 펌 시술시 크리닉\n14.롤 드라이\n15.매직 드라이\n---> ");
      scanf("%d", &iNum);
       
      if(iNum == 1){
         cut_M+=12000;
         total +=12000;
      }
      else if(iNum == 2){
         cut_W +=13000;
         total +=13000;
      }
      else if(iNum == 3){
         dye += 50000;
         total += 50000;
      }
      else if(iNum == 4){
         dye_R += 35000;
         total += 35000;
      }
      else if(iNum == 5){
         perm += 40000;
         total += 40000;
      }
      else if(iNum == 6){
         perm_Set += 80000;
         total += 80000;
      }
      else if(iNum == 7){
         magic += 70000;
         total += 70000;
      }
      else if(iNum == 8){
         magic_R += 50000;
         total += 50000;
      }
      else if(iNum == 9){
         magic_V += 80000;
         total += 80000;
      }
      else if(iNum == 10){
         iron += 80000;
         total += 80000;
      }
      else if(iNum == 11){
         magic_S += 130000;
         total += 130000;
      }
      else if(iNum == 12){
         clinic += 50000;
         total += 50000;
      }
      else if (iNum == 13){
         clinic_P += 30000;
         total += 30000;
      }
      else if(iNum == 14){
         dry_R += 13000;
         total += 13000;
      }
      else if(iNum == 15){
         dry_M += 15000;
         total += 15000;
      }
      
   
      
      
      
   if(iNum == 0){
      break;
   }
   
   
   system("cls");
   printf("남성 커트 수입금 : %d 원 \n", cut_M);
   printf("여성 커트 수입금 : %d 원\n", cut_W);
   printf("염색 수입금 : %d 원 \n", dye);
   printf("뿌리 염색 수입금 : %d 원 \n", dye_R);
   printf("일반 펌 수입금: %d 원 \n", perm);
   printf("셋팅 펌 수입금: %d 원 \n", perm_Set); 
   printf("매직 수입금: %d 원 \n", magic);
   printf("뿌리 매직 수입금: %d 원 \n", magic_R);
   printf("볼륨 매직 수입금: %d 원 \n", magic_V);
   printf("아이롱 펌 수입금: %d 원 \n", iron);
   printf("매직 셋팅 수입금: %d 원 \n", magic_S);
   printf("크리닉 수입금: %d 원 \n", clinic+clinic_P);
   printf("롤 드라이 수입금: %d 원 \n", dry_R);
   printf("매직 드라이 수입금: %d 원 \n", dry_M);
   printf("\n\n ########################\n");
   printf(" # 총 수입금 : %d 원# \n", total);
   printf(" ########################\n\n");
   
   }
   
   
   system("cls");
   printf("남성 커트 수입금 : %d 원 \n", cut_M);
   printf("여성 커트 수입금 : %d 원\n", cut_W);
   printf("염색 수입금 : %d 원 \n", dye);
   printf("뿌리 염색 수입금 : %d 원 \n", dye_R);
   printf("일반 펌 수입금: %d 원 \n", perm);
   printf("셋팅 펌 수입금: %d 원 \n", perm_Set); 
   printf("매직 수입금: %d 원 \n", magic);
   printf("뿌리 매직 수입금: %d 원 \n", magic_R);
   printf("볼륨 매직 수입금: %d 원 \n", magic_V);
   printf("아이롱 펌 수입금: %d 원 \n", iron);
   printf("매직 셋팅 수입금: %d 원 \n", magic_S);
   printf("크리닉 수입금: %d 원 \n", clinic+clinic_P);
   printf("롤 드라이 수입금: %d 원 \n", dry_R);
   printf("매직 드라이 수입금: %d 원 \n", dry_M);
   printf("\n\n ########################\n");
   printf(" # 총 수입금 : %d 원# \n", total);
   printf(" ########################\n\n");
      
   FILE* FO=fopen("미용실 실적현황.txt","a+");
   fprintf(FO,"\n남성 커트 수입금 : %d 원 \n", cut_M);
   fprintf(FO,"여성 커트 수입금 : %d 원\n", cut_W);
   fprintf(FO,"염색 수입금 : %d 원 \n", dye);
   fprintf(FO,"뿌리 염색 수입금 : %d 원 \n", dye_R);
   fprintf(FO,"일반 펌 수입금: %d 원 \n", perm);
   fprintf(FO,"셋팅 펌 수입금: %d 원 \n", perm_Set);
   fprintf(FO,"매직 수입금: %d 원 \n", magic);
   fprintf(FO,"뿌리 매직 수입금: %d 원 \n", magic_R);
   fprintf(FO,"볼륨 매직 수입금: %d 원 \n", magic_V);
   fprintf(FO,"아이롱 펌 수입금: %d 원 \n", iron);
   fprintf(FO,"매직 셋팅 수입금: %d 원 \n", magic_S);
   fprintf(FO,"크리닉 수입금: %d 원 \n", clinic+clinic_P);
   fprintf(FO,"롤 드라이 수입금: %d 원 \n", dry_R);
   fprintf(FO,"매직 드라이 수입금: %d 원 \n", dry_M);
   fprintf(FO,"=================================\n");
   fprintf(FO,"총 수입금 : %d 원 \n", total);
   fprintf(FO,"↑↑↑↑↑↑↑↑↑↑");
   fclose(FO);

   scanf("%c", &iChar);
   scanf("%c", &iChar);
   
   return 0;
}