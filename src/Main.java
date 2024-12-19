import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String args[])
    {

        Room room1 = new Room("101", 100.00);
        Room room2 = new Room("102", 150.00);
        Room room3 = new Room("103", 90.00);
        Room room4 = new Room("104", 200.00);


        System.out.println("Room 1 availability:");
        System.out.println(room1.getAvailability());
        System.out.println("Room 2 availability:");
        System.out.println(room2.getAvailability());
        System.out.println("Room 3 availability:");
        System.out.println(room3.getAvailability());
        System.out.println("Room 4 availability:");
        System.out.println(room4.getAvailability());


        List <Room> availableRooms = new ArrayList <Room>();

        availableRooms.add(room1);
        availableRooms.add(room2);
        availableRooms.add(room3);
        availableRooms.add(room4);


        System.out.println("Rooms available starting with 1..:");
        availableRooms.stream()
                .filter((p) -> p.roomNumber.startsWith("1"))
                .map((p) -> p.roomNumber)
                .sorted()
                .forEach((p) -> System.out.println("Room: " + p));


        room2.reserve();


        System.out.println("Room 2 availability after reservation:");
        System.out.println(room2.getAvailability());
    }
}
