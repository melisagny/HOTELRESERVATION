
public class RoomTransactions<T> {

    T roomData;


    RoomTransactions(T roomData) {
        this.roomData = roomData;
    }


    public T getRoomData() {
        return roomData;
    }

    public T getAfterRoom() {
        return null;
    }
}


