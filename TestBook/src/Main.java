import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;


public class Main {

    public static User login() {

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("请输入姓名：");
            String name = scanner.nextLine();

            System.out.println("请输入你的身份：1：管理员  0：普通用户");
            int choice = scanner.nextInt();
            if (choice == 1) {
                return new AdminUser(name);
            } else if (choice == 0) {
                return new NormalUser(name);
            } else {
                System.out.println("输入数字错误，请重新输入");
                continue;
            }
        }while(true);

    }


    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
