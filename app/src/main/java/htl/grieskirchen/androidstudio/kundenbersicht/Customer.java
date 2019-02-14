package htl.grieskirchen.androidstudio.kundenbersicht;

public class Customer {
    private String id;
    private String name;
    private String firstName;

    public Customer(String input){
        String[] inputArray = input.split(",");
        id = inputArray[0];
        firstName = inputArray[1];
        name = inputArray[2];
    }
}
