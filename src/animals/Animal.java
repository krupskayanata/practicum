package animals;

public class Animal {


    private String name;
    private int age;
    private double weight;
    private String color;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String years = null;
        int s = age / 100;
        if (s > 0) {
            years = getYearWord(age - 100 * s);
        } else {
            years = getYearWord(age);
        }

        return "Привет! Меня зовут " + name + ", мне " + age + years;
    }

    private String getYearWord(int age) {
        String yearWord = null;
        if (age > 10 && age < 19) {
            yearWord = " лет";
        } else if (2 <= (age % 10) && (age % 10) < 5) {
            yearWord = " года";
        } else if (age % 10 == 1) {
            yearWord = " год";
        } else {
            yearWord = " лет";
        }
        return yearWord;
    }

}









