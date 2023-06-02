package menu;

import java.util.ArrayList;

public class Menu {

    static String[] menu; // 이름 필드
    static String[] exam; // 설명 필드

    static double[] price;


    public void pMenu(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        menu = new String[]{"Burgers","Forzen Custard","Drinks","Beer"};
        exam = new String[]{"앵거스 비프 통살을 다져만든 버거","매장에서 신선하게 만드는 아이스크림","매장에서 직접 만드는 음료","뉴욕 브루클린 브루어리에서 양조한 맥주"};
        for (int i = 0; i < menu.length; i ++){
            System.out.println((i+1) + ". "+ menu[i]+ " | " + exam[i]);
        }
        oMenu();
    }


    public void oMenu() {
        System.out.println("[ ORDER MENU ]");
        menu = new String[]{"Order", "Cancel"};
        exam = new String[]{"장바구니를 확인 후 주문합니다.", "진행중인 주문을 취소합니다."};
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+5) + ". "+ menu[i]+ " | " + exam[i]);
        }
    }

}
