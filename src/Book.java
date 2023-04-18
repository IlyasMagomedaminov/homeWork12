public class Book {
    private String name;
    private int age;
    private Author author;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
