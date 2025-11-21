public class Task2_7 {


    public static void main(String[] args) {

       // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成しなさい。
       String[] country = {"JAPAN", "AMERICA", "KOREA", "ENGLAND"};

       
       // ② ①で作成した配列の要素数を出力して下さい。
       System.out.println(+ country.length);

        /* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
        *   1番目（先頭）の要素に 「りんご」 を代入
        *   2番目の要素に 「もも」 を代入
        *   3番目の要素に 「ぶどう」 を代入
        */
       String[] strArray = new String[4];
       strArray[0] = "りんご";
       strArray[1] = "もも";
       strArray[2] = "ぶどう";

       
       // ④ ③で作成した配列の3番目の要素を出力しなさい。
       System.out.println(strArray[2]);


        /* ⑤下記の処理について、何をしているのかコメントを記入して下さい。
        *  [intクラスの配列 intArray を定義]
        */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入して下さい。
        // [添え字（インデックス）が 0と4 の要素の合計値を表示]
        System.out.println(intArray[0] + intArray[4]);




    }
}

