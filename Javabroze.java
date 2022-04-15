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

    class Main {
      public static void main(String[] args) {
        printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
        printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
      }
    
      public static void printData(String name, int age, double height, double weight) {
        System.out.println("私の名前は" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "mです");
        System.out.println("体重は" + weight + "kgです");
        
        // 変数bmiに、bmiメソッドを用いてBMIを代入してください
        double bmi = bmi(height, weight);
        
        // 変数bmiを用いて、「BMIは◯◯です」と出力してください
        System.out.println("BMIは" + bmi + "です");
        
      }
    
      public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
      }
      
      public static String fullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
      }
      
      // bmiメソッドを定義してください
      public static double bmi(double height, double weight) {
        return weight / height / height;
      }
      
    }

      //メソッドのオーバーロード・void=戻り値がないということ・同名のメソッドを定義することをオーバーロードという
      //同名のメソッドは原則として定義できない。しかし、引数の肩や個数が違う場合は、同名のメソッドを定義できる

      public static double average(int a, int b) {
        int total = add(a, b);
        return (double)total / 2;
      }

      public static int add(int a, int b) {
        return a + b;
      }

      //メソッドから他のメソッドを呼び出してみます。
      //averageメソッドは平均を求めるメソッドです。aとbの平均は「(a + b) / 2」で求められますが、足し算の部分はaddメソッドを利用しています。

      public static boolean isEven(int a) {
        return a % 2 == 0;
      }

      //真偽値を返すメソッド
      //真偽値のデータ型はbooleanだから、メソッド定義はpublic statis booleanになる
      //isEvenメソッドは引数の値が偶数かどうかを調べ、偶数であればtrue、奇数であればfalseを返す。
      //returnでは2で割った余りが0（つまり偶数）であればtrue

      public static void main(String[] args) {
        int number = 9;
        if(isEven(number)) {
          System.out.println(number + "は偶数です");
        } else {
          System.out.println(number + "は奇数です");
        }
      }
      public static boolean isEven(int a) {
        return a % 2 == 0;
      }

      //真偽値を返す、isEvenメソッド
      if (isEven(number)) = 9 % 2 == 0はfalse


      public class JavaSampleClass {

        public static void main(String[] args) {
          Station s = new Station();
          s.setName("Santa Clara");
          s.printName();
        }
      
      }
      
        class Station {
          private String name;
          
          public Station(String name) {
            this.name = name;
          }
          public void setName(String name) {
            this.name = name;
          }
          public void printName() {
            System.out.println(name);
          }
        }

        //コンストラクタを246・247で定義しているが、コンストラクタを定義していない場合は、デフォルトコンストラクタが自動的に定義される
        //上記のコードでは、コンパイルエラーが出る
        //理由は、236行目で、低数なしのコンストラクタが呼び出されているためコンパイルエラーになる

      public class JavaSampleClass {

        public static void main(String[] args) {
          Station s = new Station("name");
          s.setName("Santa Clara");
          s.printName();
        }
      
      }
      
        class Station {
          private String name;
          
          public Station(String name) {
            this.name = name;
          }
          public void setName(String name) {
            this.name = name;
          }
          public void printName() {
            System.out.println(name);
          }
        }
  
          //264行目の()の中に、"name"を入れることで、Santa Claraと表示されるようになる

          import java.util.Scanner;

          class Main {
            public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              
              System.out.print("名前：");
              // 文字列の入力を受け取ってください
              String firstName = scanner.next();
              
              System.out.print("名字：");
              // 文字列の入力を受け取ってください
              String lastName = scanner.next();
              
              System.out.print("年齢：");
              // 整数の入力を受け取ってください
              int age = scanner.nextInt();
              
              System.out.print("身長(m)：");
              // 小数の入力を受け取ってください
              double height = scanner.nextDouble();
              
              System.out.print("体重(kg)：");
              // 小数の入力を受け取ってください
              double weight = scanner.nextDouble();
              
              Person.printData(Person.fullName(firstName, lastName), age, height, weight);
            }
          }

          //Scanner scanner = new Scannwe(System.in);でscannerデータを初期化
          //String name = scanner.next();でコンソールに入力されてから次の処理に移る
          
          
          public class Sample {
            public static void main(String[] args) {
              Item item1 = new Item ();
              Item item2 = new Item ();
              Item1.name = "A";
              Item2.name = "B";
              System.out.println(item1.name);
            }
          }
          class Item {
            static String name;
          }

          //staticフィールドの問題
          //staticフィールドは全てのインスタンスで共有されるフィールド
          //ヒープ領域とstatic領域の二つがある
          //staticメソッドからインスタンスフィールドおよびインスタンスメソッドにアクセスすると、コンパイルエラーになる
        public class SuperClass {
          private int num;
          public void setNum(int num) {
            this.num = num;
          }
        }
        public class SubClass extends SuperClass {
          private int num;
          public int getNum() {
            return this.num;
          }
        }
        public class Main {
          public static void main(String[] args) {
            SubClass sub = new SubClass();
            sub.setNum(10);
            System.out.println(sub.getNum());
          }
        }
        //サブクラスのインスタンスを作る場合、スーパークラスとサブクラスの両方のインスタンスが作られ、それらが結合されてひとつのインスタンスになる。
        //また、SuperClassクラスのインスタンスと差分のインスタンスが持っているsetNumやgetNumといったメソッドは、それぞれが別々に持っているnumフィールドにデータを入れたり、取り出したりしています。そのため、setNumメソッドで値をセットしても、取り出す時に見にいくnumフィールドの値はデフォルト値(int型なので0)のまま。
        public class A {
          public A() {
            System.out.println("A");
          }
        }
        public class B extends A {
          public B() {
            System.out.println("B");
          }
        }
        public class Main {
          public static void main(String[] args) {
            B b = new B();
          }
        }
        //コンストラクタは、そのコンストラクタが定義されているクラスのインスタンスを準備するためのメソッドであることを忘れてはいけない！
        //このように、サブクラスのコンストラクタからスーパークラスのコンストラクタを呼び出しながら各インスタンスを準備数仕組みを「コンストラクタチェーン」と呼びます
        //サブクラスのコンパイル時には、サブクラスのコンストラクタの1行目に「super();」が追加される
        public class SuperClass {
          public SuperClass(String val) {
            System.out.println(val);
          }
        }
        public class SubClass extends SuperClass {
          public void test() {
            System.out.println("test");
          }
        }
        public class Sample {
          public static void main(String[] args) {
            SubClass sub = new SubClass();
            sub.test();
          }
        }
        //これだと、コンパイルエラーになる
        //理由は、SubClassにコンストラクタがないから。コンストラクタがないため、デフォルトコンストラクタが自動的に追加され、下記のようになる
        public class SubClass extends SuperClass {
          public SubClass() {
            super();
          }
          publicvoid test() {
            System.out.println("test");
          }
        }
        //ただし、デフォルトコンストラクタの場合、引数が定義されていない「引数なしのスーパーコンストラクタ」
        //設問のSuperClassクラスでは、引数なしのコンストラクタはありません。そのため、コンパイルエラーになる！

        class Main {
          public static void main(String[] args) {
            Person person = new Person();
            person.hello();
          }
        }

        class Person {
          public void hello() {
            // 「こんにちは」と出力されるように書き換えてください
            System.out.println("こんにちは");
          }
        }

        //クラスはインスタンスの設計図
        //インスタンスはオブジェクトの別名
        //インスタンスの情報と振る舞いはクラスに定義する
        //これが、クラスはメソッドをまとめる場所という意味に直結する

        
        public class A {
          protected void hello() {
            System.out.println("hello");
          }
        }
        public void hello() {
          System.out.println("B");
        }

        public class Main {
          public static void main (String[] args) {
            final String COLOR = "blue";
            COLOR = "red";
            System.out.println(CsOLOR);
          }
        }