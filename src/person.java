class Person {
    private String name;
    private int age;
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
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sourabi");
        person.setAge(19);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}