
public class Book {
    private String title;
    private int age;
    
    public Book(String title, int age){
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }
    
    public String toString(){
        return this.getTitle() + " (recommended for " + this.getAge() + " year-olds or older)" ;
    }
    
}
