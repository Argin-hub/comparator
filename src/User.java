public class User  implements Comparable <User> {//добавляем возможность сравнивать объекты User

    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
//реализуем метод compareTo интерфейса Comparable
    public int compareTo(User o) {


      int  result = this.age.compareTo(o.age);
        //используем метод compareTo из класса String для сравнения имен
        if (result == 0) {  result = this.name.compareTo(o.name);}
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }


}