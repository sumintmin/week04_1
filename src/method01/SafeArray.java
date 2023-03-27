package method01;
// 서로 다른 패키지에 있는 경우 같은 이름 허용됨
public class SafeArray {
    int[] array;
    int length;

    public SafeArray(int size){ //인수를 가지는 생성자
        //배열 생성
        array = new int [size];
        length = size;
//        SafeArray sa =
//        for (int i = 0; i < 10; i++) {
//            sa.set(i,i);
//            sa.get(i);
        }
    int get(int index){
        if (index >= 0 && index < length)
            return array[index];
        else
            return -1;

//            sa.set(200,200);
//            sa.get(200);
//        /*int 배열을 size 만큼 생성*/;
        //new int[size];
//        System.out.println("SafeArray객체"+sa);


    }
    void set(int index, int e){
        if(index>=0 && index<length)
            array[index]= e;
    }

    @Override
    public String toString(){
        // 배열 정보를 출력
//        return getClass().getName().toString()+"@"+hashCode();
        return getClass().getName()+  ", length: " + length;
    }

    public static void main(String[] args) {
        System.out.println("________________________\n자바프로그래밍 실습 4주차 학번: 20201115");
        SafeArray sa = new SafeArray(10);
        for (int i = 0; i < 10; i++) {
            sa.set(i, i+1);

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("array [%d] = %d\n", i, sa.get(i));
        }

        sa.set(200,200);
        System.out.printf("array [200] = %d\n", sa.get(200));
        System.out.println("SafeArray 객체: "+sa);
        SafeArray sb = new SafeArray(20);
        System.out.println("SafeArray객체 : "+sb);
    }
//    int get(int index){
//
//    }
//    void set(int index, int e){
//
//    }




}
