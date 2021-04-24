package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;


public class ReturnOperation implements IOpeartion{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！！！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                bookList.getBook(i).setFlg(false);
                System.out.println("归还成功");
                return;
            }else {
                System.out.println("没有这本书");
            }
        }

    }
}
