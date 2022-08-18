package HomeWork1.Cows;

public abstract class abstractCow {
    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public abstractCow(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return
                "weight: " + weight +
                "\nage: " + age +
                "\ngender: '" + gender + '\'' +
                "\nnickName: '" + nickName + '\'' +
                "\n====================================";
    }
}
