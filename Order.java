package menu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;




public class Order {


   static double price;

   static int count = 0; // 장바구니 주문 수량

    int chkNumber; // 1.주문 2.메뉴판 번호  / 1.확인 2.취소

   static int waitNumber = 0; // 대기 번호

   static  ArrayList<String> products = new ArrayList<String>();

   Scanner sc = new Scanner(System.in);


    public void selectOrder() throws Exception {
//        System.out.println("Order 클래스 생성자 입장");
//        System.out.println(products.size());
        if(count == 0){  // 주문 정보가 없을 경우
            System.out.println("주문하신 메뉴가 없습니다. 주문 해주세요.");
            Screen screen = new Screen();
        } else{  // 주문 정보가 있을경우
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println();
            System.out.println(" [ Orders ] ");
            //            System.out.println(products.size());
//            System.out.println(products.get(0)+ " | W " + products.get(1) + " | " + products.get(2));
            for(int i = 0; i < products.size(); i= i + 3){
                System.out.println(products.get(i)+ " | W " + products.get(i+1) + " | " + products.get(i+2));

            }
            System.out.println(" [ Total ]");
            System.out.println(" W " + this.price );
            System.out.println();
            System.out.print("1. 주문      2.메뉴판          : ");
            chkNumber = sc.nextInt();
            orderMsg(chkNumber);

        }



////        for(int i = 0 ; i < menu.length; i++){
////            System.out.println((i+1)+ ". "+menu[i] + " | W " + price[i] + " | "+ exam[i]);
////        }
//
    }
//
    public void insertOrder(String menu, String exam, double price){
        System.out.println("장바구니 추가");
        count++;
        this.products.add(menu);
        this.products.add(String.valueOf(price));
        this.products.add(exam);

        this.price = this.price + price;

//        while(true){
//            System.out.println();
//
//        }

    }

    public void orderMsg(int chkNumber) throws Exception{
        if(chkNumber == 1){
            try {
                this.waitNumber++;
                System.out.println("주문이 완료되었습니다!");
                System.out.println();
                System.out.println("대기번호는 [ " + waitNumber + " ] 번 입니다.");
                System.out.println("3초후 메뉴판으로 돌아갑니다.");
                this.products.clear();
                this.price = 0.0;
                Thread.sleep(3000);

            } catch (Exception e){

            }
            finally {
                Screen screen = new Screen();
            }

        }else{
            Screen screen = new Screen();
        }

    }

    public void cancel(int chooseNumber) throws Exception {
        System.out.println("진행하던 주문을 취소하시겠습니까");
        System.out.print("1. 확인      2.취소          : ");
        chkNumber = sc.nextInt();
        if (chkNumber == 1) {
            this.products.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            this.price = 0.0;
            Screen screen = new Screen();
        }else{
            Screen screen = new Screen();
        }

    }
}
