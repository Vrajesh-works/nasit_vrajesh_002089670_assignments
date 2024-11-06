///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package info5100.university.example.Campus;
//
///**
// *
// * @author kal bugrara
// */
//public class CampusMainExample {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        /*
//        0. Create Address object  
//        1. create campus object
//        2. Create and add buildings
//        3. Create and floors
//        4. Create and add rooms
//        5. Assign sprinkers.
//        6. Write methods to determine is campus safe => are builinds safe etc.
//*/
//
//
//
//
//
//    }
//    
//}
package info5100.university.example.Campus;

public class CampusMainExample {
    public static void main(String[] args) {
        // 0. Create Address object for campus
        Address campusAddress = new Address(360, "Huntington Avenue", "02115", "42.3398° N, 71.0892° W");
        
        // 1. Create campus object
        Campus northeastern = new Campus(campusAddress);
        
        // 2. Create and add buildings with their addresses
        Address snellAddress = new Address(376, "Huntington Avenue", "02115", "42.3380° N, 71.0876° W");
        Address ryderAddress = new Address(380, "Huntington Avenue", "02115", "42.3375° N, 71.0878° W");
        Address richardsAddress = new Address(384, "Huntington Avenue", "02115", "42.3372° N, 71.0880° W");
        
        Building snellLibrary = new Building(1, snellAddress);
        Building ryderHall = new Building(2, ryderAddress);
        Building richardsHall = new Building(3, richardsAddress);
        
        northeastern.buildings.add(snellLibrary);
        northeastern.buildings.add(ryderHall);
        northeastern.buildings.add(richardsHall);
        
        // 3. Create and add floors to each building
        // Snell Library (4 floors)
        for (int i = 1; i <= 4; i++) {
            Floor floor = snellLibrary.addNewFloor(i);
            // Add rooms to each floor
            for (int j = 1; j <= 5; j++) {
                floor.newRoom(j);
                // Add sprinklers to each room
                addSprinklerToRoom(floor.rooms.get(j-1));
            }
        }
        
        // Ryder Hall (3 floors)
        for (int i = 1; i <= 3; i++) {
            Floor floor = ryderHall.addNewFloor(i);
            for (int j = 1; j <= 4; j++) {
                floor.newRoom(j);
                addSprinklersToRoom(floor.rooms.get(j-1));
            }
        }
        
        // Richards Hall (3 floors)
        for (int i = 1; i <= 3; i++) {
            Floor floor = richardsHall.addNewFloor(i);
            for (int j = 1; j <= 4; j++) {
                floor.newRoom(j);
                addSprinklersToRoom(floor.rooms.get(j-1));
            }
        }
        
        // Test safety system by disabling some sprinklers
        // Disable one sprinkler in Snell Library
        disableSomeSprinklersForTesting(snellLibrary);
        
        // 5. Check and print campus safety status
        printSafetyReport(northeastern);
    }
    
    // Helper method to add sprinklers to a room
    private static void addSprinklerToRoom(Classroom room) {
        // Add two sprinklers per room for redundancy
        Sprinkler sprinkler1 = new Sprinkler("Model-A" + room.number, "SN-" + room.number + "-1");
        Sprinkler sprinkler2 = new Sprinkler("Model-B" + room.number, "SN-" + room.number + "-2");
        room.sprinklers.add(sprinkler1);
        room.sprinklers.add(sprinkler2);
    }
    
    // Method to disable some sprinklers for testing
    private static void disableSomeSprinklersForTesting(Building building) {
        // Disable a sprinkler on the first floor, first room
        if (!building.floors.isEmpty() && !building.floors.get(0).rooms.isEmpty()) {
            Classroom room = building.floors.get(0).rooms.get(0);
            if (!room.sprinklers.isEmpty()) {
                room.sprinklers.get(0).disable();
                System.out.println("\nAlert: Sprinkler disabled in Building " + building.number + 
                                 ", Floor 1, Room 1 (Serial: " + room.sprinklers.get(0).serialnumber + ")");
            }
        }
    }
    
    // Updated safety check method
    private static boolean checkCampusSafety(Campus campus) {
        boolean isSafe = true;
        for (Building building : campus.buildings) {
            if (!checkBuildingSafety(building)) {
                isSafe = false;
                break;
            }
        }
        return isSafe;
    }
    
    private static boolean checkBuildingSafety(Building building) {
        boolean isSafe = true;
        for (Floor floor : building.floors) {
            if (!checkFloorSafety(floor)) {
                isSafe = false;
                break;
            }
        }
        return isSafe;
    }
    
    private static boolean checkFloorSafety(Floor floor) {
        boolean isSafe = true;
        for (Classroom room : floor.rooms) {
            if (!checkRoomSafety(room)) {
                isSafe = false;
                break;
            }
        }
        return isSafe;
    }
    
    private static boolean checkRoomSafety(Classroom room) {
        // Room is safe if at least one sprinkler is active
        return room.sprinklers.stream().anyMatch(Sprinkler::isActive);
    }
    
    // Updated safety report method
    private static void printSafetyReport(Campus campus) {
        System.out.println("\n=== Campus Safety Report ===");
        System.out.println("Campus Address: " + campus.address.number + " " + campus.address.street);
        boolean campusSafe = checkCampusSafety(campus);
        System.out.println("Overall Campus Safety Status: " + (campusSafe ? "SAFE" : "UNSAFE") + "\n");
        
        for (Building building : campus.buildings) {
            boolean buildingSafe = checkBuildingSafety(building);
            System.out.println("\nBuilding #" + building.number);
            System.out.println("Address: " + building.address.number + " " + building.address.street);
            System.out.println("Building Safety Status: " + (buildingSafe ? "SAFE" : "UNSAFE"));
            
            for (Floor floor : building.floors) {
                boolean floorSafe = checkFloorSafety(floor);
                System.out.println("\n  Floor #" + floor.number);
                System.out.println("  Floor Safety Status: " + (floorSafe ? "SAFE" : "UNSAFE"));
                
                for (Classroom room : floor.rooms) {
                    boolean roomSafe = checkRoomSafety(room);
                    System.out.println("\n    Room #" + room.number);
                    System.out.println("    Room Safety Status: " + (roomSafe ? "SAFE" : "UNSAFE"));
                    System.out.println("    Sprinkler Status:");
                    for (Sprinkler sprinkler : room.sprinklers) {
                        System.out.println("      - Sprinkler " + sprinkler.serialnumber + 
                                         " (" + sprinkler.model + "): " + 
                                         (sprinkler.isActive() ? "Active" : "Inactive"));
                    }
                }
            }
        }
    }
}