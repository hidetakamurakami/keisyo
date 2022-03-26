class Customer{
    　String customerName; 　//顧客氏名
    　int customerAddress; 　 //顧客住所
    　public void setName(String name){
    　　customerName = name; 　//顧客氏名をセットする
    　}
    　public void getName(){
    　　return customerName; 　//顧客氏名を返す
    　}
    　public void setAddress(String address){
    　　customerAddress = address; 　//顧客住所をセットする
    　}
    　public void getAddress(){
    　　return customerAddress;　 //顧客住所を返す
    　}
    }
    
    class CustomerInfo extends Customer{
    　int customerID;　 //顧客ID
    　public void setID(int number){
    　　customerID = number; 　//顧客IDをセットする
    　}
    　public int getID(){
    　　return customerID; 　//顧客IDを返す
    　}
    }
    
    public class Example{
    　public static void main(string[] args){
    　　CustomerInfo hayashi = new CustomerInfo(); 　//hayashiをインスタンス化する
    
    　　hayashi.setName("Hayashi");
    　　hayashi.setAddress("Shibuya-ku, Tokyo");
    　　hayashi.setID(0001);
    
    　　System.out.println(hayashi.getName());　 //氏名を出力する
    　　System.out.println(hayashi.getAddress()); 　//住所を出力する
    　　System.out.println(hayashi.getID()); 　//IDを出力する
    　}
    }