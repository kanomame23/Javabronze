public class test {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // 1から10までの1+Nの積を算出する
        while (i <= 10 ) {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}
