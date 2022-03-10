package sample;
public class Javabronze {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
        }
        System.out.println(i);
    }
}

//結果は5になる

public static void main(String[] args) {
			
    int i = 1;
    int j = 2;
    while (i < 10) {
        i = j * i;
    }
    System.out.println("i=" + i + ", j=" + j);
}

//i=16, j=2

package sample;

public class JavaSampleClass {

		public static void main(String[] args) {
			
			int i = 1;
			int j = 10;
			while (i < j) {
				System.out.println("LOOP");
				i *= 2;
				j /= 2;
			}
		}

}

//結果はLOOPが2回表示される

