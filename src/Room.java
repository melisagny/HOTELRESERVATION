class Room {
    String roomNumber;
    double pricePerNight;
    boolean isAvailable;

    public Room(String roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public String getAvailability() {
        return isAvailable ? "Available" : "Not Available";
    }


    public void reserve() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " has been reserved.");
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
        }
    }
}
