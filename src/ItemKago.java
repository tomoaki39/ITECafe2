import itecafe.Item;
 import java.util.ArrayList;

class ItemKago {
    private ArrayList<Item> List = new ArrayList<Item>();  //商品
    private int[] count = new int [100];  //数量
    
    public ArrayList<Item> getList(){
        return List;
    }
    
    public void setCount(int count){
        this.count[List.size()] = count;
    }
    
    //商品をカゴに入れる
    public void inputKago( Item item, int count ){
        boolean flg = false;
    if( List,isEmpty() == true ){
        this.List.add(item);
        this.count[List.size()-1] = count;
                flg = true;
                
    }
    for( int i = 0; i < List.size(); i++){
        if( List.get(i).equals(item) == true && flg == false){
    this.count[i] += count;
    if( this.count[i] <= 0){
        this.count[i] = 0;
    }
                flg = true;
        }
    }
    if( flg == false ){
        this.List.add( item );
        this.count[List.size()-1] = count;
    }
    
    }
     
    //カゴの商品一覧を出力する
    public void dispKago(){
        for( int i = 0 ; i < List.size(); i++ ){
            System.out.println( i+1 + ":" + List.get( i ).getName() 
                                + "/" + count[i] + "個");
            
        }
    }
    public void clearKago(){
        this.List.clear();
        for( int i = 0; i < this.count.length; i++){
            this.count[i] = 0;
        }
    }

    private boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
