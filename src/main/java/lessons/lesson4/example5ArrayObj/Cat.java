package lessons.lesson4.example5ArrayObj;

public class Cat {
    String name;
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void meow(){
        System.out.println("MEOW!!!" + this.name);
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
