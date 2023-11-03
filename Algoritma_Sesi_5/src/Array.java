public class Array {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = 2;
        int c = 3;

        for(int i = 0; i <6; i++);{
            System.out.println(c + " ");
            a=b;
            b=c;
            if(i < 1) {
                c=1;
            }else {
                c= a + b;
            }
        }
    }
}
