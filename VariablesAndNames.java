package lol;

public class VariablesAndNames {

	public static void main(String[] args) {
		
		int cars, drivers, passengers, cars_not_driven, cars_driven; // Assigning these variables as integers
        double space_in_a_car, carpool_capacity, average_passengers_per_car; //Assigning these variables as floats

        cars = 100; // Setting the variable car to equal the value of 100	
        space_in_a_car = 4.0; // Setting the variable to equal the value of 4.0
        drivers = 30; // Setting the variable drivers to equal the value of 30
        passengers = 90; // Setting the variable passengers to equal 90
        cars_not_driven = cars - drivers; // Setting the value of "cars_not_driven" to equal "cars" minus "drivers"
        cars_driven = drivers; // Setting "cars_driven" to equal "drivers"
        carpool_capacity = cars_driven * space_in_a_car; // Setting "carpool_capacity" to equal "cars_driven" multiplied by "space_in_a_car"
        average_passengers_per_car = passengers / cars_driven; // Setting "average_passengers_per_car"  to equal "passengers" divided by "cars_driven"


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
	}

}
