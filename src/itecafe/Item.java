package itecafe;

public class Item {
    
    private int no;
    private String name;
    private int price;
    
    public Item(int no, String name, int price){
        this.no = no;
        this.name = name;
        this.price = price;
    }
    
    public int getNo(){
        return no;
    }
    
    public void setNo(int no){
        this.no = no;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
