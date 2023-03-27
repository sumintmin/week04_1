package method02;
//package method01;
// 서로 다른 패키지에 있는 경우 같은 이름 허용됨
class SafeArray2 {
    int[] array;
    int length;

    public SafeArray2(int size){ //인수를 가지는 생성자
        //배열 생성
        array = new int [size];
        length = size;

    }
    int get(int index){
        if (index >= 0 && index < length)
            return array[index];
        else {
            return - 1;
        }
    }
    void set(int index, int e){
        if(index>=0 && index<length)
            array[index]= e;
    }

    @Override
    public String toString(){
        // 배열 정보를 출력
//        return getClass().getName().toString()+"@"+hashCode();
        return getClass().getName()+ ", length: " + length;
    }
}

public class SafeArrayTest2 {
    public static void main(String[] args) {
        System.out.println("________________________\n자바프로그래밍 실습 4주차 학번: 20201115");
        SafeArray2 sa = new SafeArray2(10);
        for (int i = 0; i < 10; i++) {
            sa.set(i, i+1);

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("array [%d] = %d\n", i, sa.get(i));
        }

        sa.set(200,200);
        System.out.printf("array [200 = %d\n", sa.get(200));
        System.out.println("SafeArray 객체: "+sa);
        method01.SafeArray sb = new method01.SafeArray(20);
        System.out.println("SafeArray 객체 : "+sb);
    }
}
