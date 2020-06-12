package nl.craftsmen.java14demo;


public record CoordinateRecord(int x, int y) {

    //you can specify a constructor with more logic but you don't need to
    public CoordinateRecord {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
    }
}