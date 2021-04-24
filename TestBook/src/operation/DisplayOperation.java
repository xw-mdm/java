package operation;

import book.BookList;

public class DisplayOperation implements IOpeartion{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！！！");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
            //bookList[]
        }
    }
}
