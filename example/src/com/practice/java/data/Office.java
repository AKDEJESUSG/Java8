package example.src.com.practice.java.data;

public class Office {
    
    private String address;
    private int buildingNum;

    public Office(String address, int buildingNum){
        this.address = address;
        this.buildingNum = buildingNum;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(int buildingNum) {
        this.buildingNum = buildingNum;
    }

    @Override
    public String toString() {
        return "Office:{"
                    +"address='"+getAddress()+"',"
                    +"buildingNum='"+getBuildingNum()+"'"
                +'}';
    }
}
