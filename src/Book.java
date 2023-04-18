import java.util.Objects;

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

    @Override
    public String toString() {
        return  name + " " + age + " " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getAge() == book.getAge() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getAuthor());
    }

}
