package HomeWork1.Horses;

public abstract class abstractHorse {
    private int weight;
    private int age;
    private String color;
    private String gender;
    private String nickName;

    public abstractHorse(int weight, int age, String color, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return
                "weight: " + weight +
                "\nage: " + age +
                "\ncolor: '" + color + '\'' +
                "\ngender: '" + gender + '\'' +
                "\nnickName: '" + nickName + '\'' +
                "\n====================================";
    }
}
