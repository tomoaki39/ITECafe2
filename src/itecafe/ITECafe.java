package ITECafe;

import java.util.Scanner;

public class ITECafe {

    public static void main(String[] args) {

        //商品の準備
        Item originalchicken = new Item(1, "オリジナルチキン", 880);
        Item honeychicken = new Item(2, "ハニーチキン", 880);
        Item cheesechicken = new Item(3, "チーズチキン", 880);
        Item potato = new Item(4, "もちチーズポテト", 580);
        Item takanjeong = new Item(5, "タッカンジョン", 550);
        Item cheesetackle = new Item(6, "チーズタッカルビ", 580);
        Item cheesetoppogi = new Item(7, "チーズトッポッキ", 580);
        Item seaweedroll = new Item(8, "キムパ", 580);
        Item Aset = new Item(9, "Aセット", 1180);
        Item Bset = new Item(10, "Bセット", 1280);
        Item Cset = new Item(11, "Cセット", 1380);
        Item orengejuice = new Item(12, "オレンジジュース", 300);
        Item cola = new Item(13, "コーラ", 300);
        Item cider = new Item(14, "サイダー", 300);
        Item coffee = new Item(15, "コーヒー", 250);
        Item beer = new Item(16, "ビール", 550);
        Item shochu = new Item(17, "焼酎", 500);

        //配列の作成
        Item[] items = new Item[17];
        items[0] = originalchicken;
        items[1] = honeychicken;
        items[2] = cheesechicken;
        items[3] = potato;
        items[4] = takanjeong;
        items[5] = cheesetackle;
        items[6] = cheesetoppogi;
        items[7] = seaweedroll;
        items[8] = Aset;
        items[9] = Bset;
        items[10] = Cset;
        items[11] = orengejuice;
        items[12] = cola;
        items[13] = cider;
        items[14] = coffee;
        items[15] = beer;
        items[16] = shochu;

        while (true) {
            System.out.println("ITEカフェシステム");

            int goukei = 0;
            String input;
            Scanner sc = new Scanner(System.in);
            int num;

            while (true) {
                System.out.println("商品番号を入力してください");

                input = sc.next();
                num = Integer.parseInt(input);

                int price = items[num - 1].getPrice();

                System.out.println("数量を入力してください");
                input = sc.next();
                num = Integer.parseInt(input);

                goukei += price * num;

                System.out.println("合計金額" + goukei);

                System.out.println("以上なら１を入力");
                input = sc.next();
                num = Integer.parseInt(input);
                if (num == 1) {
                    break;
                }
            }

            System.out.println("預かり金を入力してください");
            input = sc.next();
            num = Integer.parseInt(input);
            System.out.println("お釣りは" + (num - goukei) + "です");

            System.out.println("システムの終了は９を入力");
        }
        
     
    }
}
