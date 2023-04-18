import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor,String surnameAuthor){
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor(){
        return this.surnameAuthor;
    }

    public void setnameAuthor(String nameAuthor){
        this.nameAuthor = nameAuthor;
    }
    public void setsurnameAuthor(String surnameAuthor){
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public String toString() {
        return nameAuthor + " " + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return Objects.equals(getNameAuthor(), author.getNameAuthor()) && Objects.equals(getSurnameAuthor(), author.getSurnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameAuthor(), getSurnameAuthor());
    }

}
