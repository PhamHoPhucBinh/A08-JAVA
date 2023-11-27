package Test;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
// Constructors, getters, setters...

    @Override
    public int compareTo(Person otherPerson) {
        // So sánh theo tuổi
        return Integer.compare(this.age, otherPerson.age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Binh",25);
        Person person2 = new Person("Quang",25);
        int result = person1.compareTo(person2);
        if (result < 0){
            System.out.println("1 nhỏ hơn 2 ");
        }else if(result>0){
            System.out.println("2 nhỏ hơn 1");
        }else {
            System.out.println("= nhau");
        }
    }
}


