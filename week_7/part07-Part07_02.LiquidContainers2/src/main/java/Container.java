public class Container {
     private int contains;

    public Container() {
        this.contains =0;
    }

    public int contains(){
        return this.contains;
    }

    public void add(int amount){
        if(amount > 0 & amount < 100 && this.contains + amount<=100 ){
            this.contains = this.contains+amount;
        } else if(amount > 100 || amount+ this.contains > 100){
            this.contains =100;
        }
    }

    public void remove(int amount){

        if(amount>0 && amount < 100 && this.contains - amount >= 0) {
            this.contains = this.contains - amount;
        } else if (this.contains - amount<0){
            this.contains =0;
        }

    }

    public String toString(){
        return this.contains + "/100";
    }


}
