public class Main {
    public static void main(String[] args) {
        Author ivan = new Author("Иван","Иванов");

        Book book = new Book("Вавилон",ivan,1990);
        System.out.println("Название книги = " + book.getName());
        System.out.println("Год издания = " + book.getAge());
        book.setAge(1991);
        System.out.println("Год издания изменёное = " + book.getAge());

        Author author = new Author("Иван","Иванов");
        System.out.println("Имя автора = " + author.getNameAuthor());
        System.out.println("Фамилия автора = " + author.getSurnameAuthor());

        System.out.println();

        Author ilyas = new Author("Ильяс","Магомедаминов");

        Book book1 = new Book("Гора",ilyas,2005);
        System.out.println("Название книги = " + book1.getName());
        book1.setName("Горы");
        System.out.println("Доработанное название книги = " + book1.getName());
        System.out.println("Год издания = " + book1.getAge());

        Author author1 = new Author("Ильяс","Магомедаминов");
        System.out.println("Имя автора = " + author1.getNameAuthor());
        System.out.println("Фамилия автора = " + author1.getSurnameAuthor());

        System.out.println();

        Author Aleksandr = new Author("Александр","Сорокин");

        Book book2 = new Book("Гроза",Aleksandr,1989);
        System.out.println("Название книги = " + book2.getName());
        System.out.println("Год издания = " + book2.getAge());

        Author author2 = new Author("Александр","Сорокин");
        System.out.println("Имя автора = " + author2.getNameAuthor());
        author2.setnameAuthor("Даниил");
        System.out.println("Новая имя автор = " + author2.getNameAuthor());
        System.out.println("Фамилия автора = " + author2.getSurnameAuthor());
        author2.setsurnameAuthor("Орлов");
        System.out.println("Новая фамилия автора = " + author2.getSurnameAuthor());
    }
}