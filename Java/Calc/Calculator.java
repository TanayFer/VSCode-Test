public class Calculator {
    public static void main(String[] args) {
        System.out.println("------------Calculator------------");
        int A = 159;
        int B = 101;
        int Add = A+B;
        int Sub = A-B;
        int Mul = A*B;
        float Div = (float)A/B;
        System.out.println(A + "+" + B + "=" + Add);
        System.out.println(A + "-" + B + "=" + Sub);
        System.out.println(A + "*" + B + "=" + Mul);
        System.out.println(A + "/" + B + "=" + Div);
    }
}
