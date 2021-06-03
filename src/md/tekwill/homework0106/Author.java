package md.tekwill.homework0106;

public class Author {
    String name;
    String email;
    char gender;

    public Author(String name) { this.name = name; }

    public Author() {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "[name=" +name+ ",email="+ email + ",gender=" + gender + "]";
    }

//    @Override
//    public boolean equals(){
//        return;
//    }

}
