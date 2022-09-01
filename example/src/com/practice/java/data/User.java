package example.src.com.practice.java.data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User{
    private String name;
    private int age;
    private char gender;
    private LocalDate birthday;
    private List<String> permissions;

    public User(){}

    public User(String name, int age, char gender, LocalDate birthday, List<String> permissions){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getPermissions() {
        return permissions;
    }
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "User{"+
                "name='"+ name +"', "+
                "age='"+ age + "', "+
                "gender='"+ gender + "', "+
                "birthday='"+ birthday.format(formatter) +"', "+
                "permissions="+ permissions +
                '}';
    }
}