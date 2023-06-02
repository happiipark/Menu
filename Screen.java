package menu;

import java.util.Scanner;



public class Screen {
    Order order = new Order();
    public Screen() throws Exception {

        Menu menu = new Menu();
        Product dMenu = new Product();
        menu.pMenu();
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력해주세요 : ");
        int chooseNum = sc.nextInt(); //  상품 선택 번호
        space();
        switch (chooseNum) {
            case 1:
            case 2:
            case 3:
            case 4:
                dMenu.detailMenu(chooseNum);
                break;
            case 5:
                order.selectOrder();
                break;
            case 6:
                order.cancel(chooseNum);

        }
    }





    public static void space(){    //  콘솔창 깔끔하게
        System.out.println();
        System.out.println();
        System.out.println();
    }


}
