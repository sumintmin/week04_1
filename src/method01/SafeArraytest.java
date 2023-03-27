package method01;

public class SafeArraytest {
    public static void main(String[] args) {
        System.out.println("************\n자바프로그래밍 실습 4주차 학번: 20201115");
        SafeArray sa = new SafeArray(10);
        for (int i = 0; i < 10; i++) {
            sa.set(i, i+1);

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("array [%d] = %d\n", i, sa.get(i));
        }

        sa.set(200,200);
        System.out.printf("array [200 = %d\n", sa.get(200));
        System.out.println("SafeArray 객체: "+sa);
        SafeArray sb = new SafeArray(20);
        System.out.println("SafeArray객체 : "+sb);
    }
}
