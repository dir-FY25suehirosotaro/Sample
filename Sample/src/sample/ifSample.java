package sample;

public class ifSample {

    public static void main(String[] args) {
        var score = 80;
        
        if (score==100) {
            System.out.println("満点");
        } else if (score>=80) {
            System.out.println("優秀");
        } else if (score>=60) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

    }

}
