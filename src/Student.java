public class Student {
    private String name; //
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int inputScore) {
        if (inputScore >= 0 && inputScore <= 100) {
            this.score = inputScore;
        } else {
            System.out.println("分數需在0~100之間");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Alice");
        s1.setScore(90);
        System.out.println(s1.getName() + " Score: " + s1.getScore());
    }
}