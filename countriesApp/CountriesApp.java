package countriesApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import battingApp.Batter;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		System.out.println();
		System.out.print("Enter menu number: ");
		int menuChoice = input.nextInt();
		System.out.println();
	if (menuChoice == 1) {
	CountriesTextFile countries = new CountriesTextFile();
	List<String> listOfCountries = countries.readCountryList();
		 for (String lineList : listOfCountries)
			 System.out.println(lineList);
		 }
	if (menuChoice == 2) {
		System.out.println("Enter country: ");
		ArrayList<String> inputCountry1 = new ArrayList<String>();
		CountriesTextFile addCountry = new CountriesTextFile();
		inputCountry1.add(input.next());
		boolean country = addCountry.saveCountryList(inputCountry1);
			//it wont append to file, but i finally got it to print to file!!!!
		 }
	
  	  
	}

	
	
}


