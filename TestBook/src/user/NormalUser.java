package user;

import operation.*;

import java.util.Scanner;


public class NormalUser extends User{



    public NormalUser(String name) {
        super(name);
        //2、准备操作对象
        this.iOpeartions = new IOpeartion[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    @Override
    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========="+ "hello " + this.name +" 欢迎！==============");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=====================================================");
        int choice = scanner.nextInt();
        return choice;
    }
}
