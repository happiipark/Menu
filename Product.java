package menu;

import java.util.Arrays;
import java.util.Scanner;

public class Product extends Menu{



    String oMenu; // order 클래스 메뉴
    String oExam; // order 클래스 설명
    double oPrice; // order 클래스 기격



    Scanner sc = new Scanner(System.in);
    int orderNumber;  // 메뉴 번호
    int chkNumber; // 확인 취소 번호



    public void detailMenu(int chooseNumber) throws Exception { // 상품 선택 번호가 인자로 들어옴
        switch (chooseNumber){ // 상품 선택 별로 구분 지어서  chooseNumber = 1 -> 버거 종류
            case 1:
                System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
                menu = new String[]{"ShackBurger","SmokeShack","Shroom Burger ","Cheeseburger","Hamburger"};
                price = new double[]{6.9, 8.9, 9.4, 6.9, 5.4};
                exam = new String[]{"토마토, 양상추, 쉑소스가 토핑된 치즈버거","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거","비프패티를 기반으로 야채가 들어간 기본버거"};
                for(int i = 0 ; i < menu.length; i++){
                    System.out.println((i+1)+ ". "+menu[i] + " | W " + price[i] + " | "+ exam[i]);
                }
                System.out.print("번호를 입력해주세요 : ");
                orderNumber = sc.nextInt();
                Screen.space();
                chooseMenu(orderNumber);


        }

    }

    public void chooseMenu(int orderNumber) throws Exception {
        System.out.println("\""+menu[orderNumber-1]+ " | W "+ price[orderNumber] + " | "+ exam[orderNumber]+ "\"");
        System.out.println("1. 확인       2.취소");
        System.out.print("위 메뉴를 장바구니에 추가하겠습니까? :");
        chkNumber = sc.nextInt();
        if(chkNumber == 1){
            System.out.println(menu[orderNumber-1]+ " 가 장바구니에 추가되었습니다.");
            oMenu = Arrays.toString(new String[]{menu[orderNumber - 1]});
            oExam = Arrays.toString(new String[]{exam[orderNumber]});
            oPrice = price[orderNumber];
            Order order = new Order();
            Screen.space();
            order.insertOrder(oMenu,oExam,oPrice);
            while(true){
                Screen screen = new Screen();
            }

        }else {
            System.out.print("주문이 취소되었습니다. 다시 주문해 주시기 바랍니다.");
            detailMenu(orderNumber);
        }




    }

}
