
class Rooms implements IRoom {

    String roomNumber;
    String roomType;
    int workHour;
    int hireYear;
    double price;


    public String getRoomNumber() {
        return this.roomNumber;
    }


    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }


    public String getRoomType() {
        return this.roomType;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        RoomTransactions<Double> Obj = new RoomTransactions<Double>(this.price);
        return Obj.getAfterRoom();
    }


    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    public int getHireYear() {
        return this.hireYear;
    }


    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }


    public int getWorkHour() {
        return this.workHour;
    }
}
