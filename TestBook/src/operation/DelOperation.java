package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;


public class DelOperation implements IOpeartion{

    public void work(BookList bookList) {
        System.out.println("删除图书！");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = scanner.nextLine();
        int pos=-1;
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);

            if(book.getName().equals(name)) {
               pos=i;
               break;
            }
        }
        if(pos==-1){
            System.out.println("没有这本书");
            return;
        }
        int cursize=bookList.getUsedSize();
        int size=cursize-1;
        for (int i = pos; i <size ; i++) {
            bookList.setBooks(i,bookList.getBook(i+1));
        }
        bookList.setBooks(cursize-1,null);
        bookList.setUsedSize(cursize-1);

        }

}
