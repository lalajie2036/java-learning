package com.lalajie.java.week5;

/**
 * @ClassName TestPushException
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/2
 **/
public class TestPushException {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                Book.builder().ISBN("1231231231231").bookName("Java暴力破解").price(99).build(),
        Book.builder().ISBN("123123123123A").bookName("Java从入门到精通").price(99).build(),
        Book.builder().ISBN("1231231231231").bookName("Java学习笔记").price(199).build(),
        Book.builder().ISBN("1231231231231").bookName("Java案例开发").price(99).build()};
        BookService bs = new BookServiceImpl();
        for (Book book : books) {
            try {
                boolean b = bs.checkPush(book);
                if (b) {
                    System.out.println(book.getBookName() + "成功上架！");
                }
            } catch (PriceException | BookNameException | ISBNException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
