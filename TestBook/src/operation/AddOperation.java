package operation;

import book.Book;
import book.BookList;
import user.User;

import java.util.Scanner;


public class AddOperation implements IOpeartion{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书！！");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名");
        String name= scanner.nextLine();
        System.out.println("请输入作者");
        String author=scanner.nextLine();
        System.out.println("请输入类型");
        String type=scanner.nextLine();
        System.out.println("请输入价格");
        int price=scanner.nextInt();
        Book book=new Book(name,author,price,type);
        int cur=bookList.getUsedSize();
        bookList.setBooks(cur,book);
        bookList.setUsedSize(cur+1);
    }
}
