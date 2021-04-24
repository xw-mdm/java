package user;

import book.BookList;
import operation.IOpeartion;


public abstract class User {
    public String name;

    //1、准备一个接口数组 存储每个对象
    public IOpeartion[] iOpeartions;


    public User(String name) {
        this.name = name;
    }



    public abstract int menu();

    //3、
    public void doOperation(int choice, BookList bookList) {
        this.iOpeartions[choice].work(bookList);
    }

}
