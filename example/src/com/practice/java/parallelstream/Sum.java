package example.src.com.practice.java.parallelstream;

public class Sum {
    
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input){
        this.total +=input;
    }
}
