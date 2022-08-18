package HomeWork1.Sheeps;

public abstract class abstractSheep {
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public abstractSheep(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
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
        return "weight: " + weight +
                "\nage: " + age +
                "\ngender: '" + gender + '\'' +
                "\nnickName: '" + nickName + '\'' +
                "\n====================================";
    }
}
