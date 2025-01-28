package copyConstructor;

public class Exam {
    private int exam_id;
    private int score;
    private ReattemptExam reattemptExam;

    public Exam() {
    }

    public Exam(int exam_id, int score) {
        this.exam_id = exam_id;
        this.score = score;
        this.reattemptExam = new ReattemptExam(1);
    }

    public Exam(Exam other){
        this.exam_id = other.exam_id;
        this.score = other.score;
        //        just copying the references : shallow
//        this.reattemptExam = other.reattemptExam;
        this.reattemptExam = new ReattemptExam(other.reattemptExam);
    }
}
