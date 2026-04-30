package ai0430;

public class Fortest {
    public static void main(String[] args) {
        String[] subjectArr = {"자바프로그래밍언어", "데이터베이스", "융합UI실습", "인공지능개론"};
        for (int i = 1; i < 101; i++){
            if(i % 10 == 0){
                System.out.println(i + "\n");
            }
            else{
                System.out.printf("%d ", i);
            }
        }
    }
}
