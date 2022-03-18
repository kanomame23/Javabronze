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

class Main {
    public static void main(String[] args) {
      // 条件式に直接trueをいれてください
      if (true) {
        System.out.println("条件式がtrueのため、出力されます");
      }
      
      // 条件式に直接falseをいれてください
      if (false) {
        System.out.println("条件式がfalseのため、出力されません");
      }
      
      int x = 5;
      // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
      if (x > 2) {
        System.out.println("xは2より大きい");
      }
      
      // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
      if (x > 8) {
        System.out..println("xは8より大きい");
      }
      
    }
  }

  //条件分岐の練習

  class Main {
    public static void main(String[] args) {
      int n = 0;
      
      switch (n) {
        case 1:
          System.out.println("大吉です");
          break;
        case 2:
          System.out.println("中吉です");
          break;
        // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
        default:
          System.out.println("凶です");
        
        
      }
    }
  }

    //switch文

    class Main {
      public static void main(String[] args) {
        // 変数numbersに、与えられた数字の配列を代入してください
        int[] numbers = {1, 4, 6, 9, 13, 16};
        
        int oddSum = 0;
        int evenSum = 0;
        
        // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
        for (int number : numbers) {
          if (number % 2 == 0) {
            evenSum += number;
          } else {
            oddSum += number;
          }
        }
    
        System.out.println("奇数の和は" + oddSum + "です");
        System.out.println("偶数の和は" + evenSum + "です");
      }
    }

    //拡張for文
    
    package sample;

      public class JavaSampleClass {

          public static void main(String[] args) {
            
            ClassA classA = new ClassA();
            classA.doMethod(0, 1);
          }

      }

        class ClassA {
          public void doMethod() {
            System.out.println("doMethod-A");
          }
          public void doMethod(int a) {
            System.out.println("doMethod-B");
          }
          public void doMethod(int a, int b) {
            System.out.println("引数int型データ2つ");
          }
        }

    //オーバーロードメソッドは、引数に渡すデータの型と数、順番により、どれが実行されるのかが決まる
    //mainメソッドの4行目で、int型のデータを2つ渡してdoMethodメソッドを呼び出している
        
    public class Account {
      private int balance;
    }
      public Account() {
        this.balance = 0;
      }

    //コンストラクタに関しての3つのルール
    //コンストラクタ名は、クラス名と同じでなければならない
    //戻り値型は記述できない
    //インスタンス生成時にしか使えない