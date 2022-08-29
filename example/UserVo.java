package example;
import java.time.LocalDate;

class UserVo{
    private String name;
    private int age;
    private char gender;
    private LocalDate birthday;

    public UserVo(){}

    public UserVo(String name, int age, char gender, LocalDate birthday){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
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
}