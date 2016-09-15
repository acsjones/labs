package countriesApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {
	/*
	 * private String name;
	 * 
	 * public CountriesTextFile(String name) { this.name = name; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String toString() { return name; }
	 */

	private Path filePath;

	public CountriesTextFile(String filePathString) {
		this.filePath = Paths.get(filePathString);
	}

	public CountriesTextFile() {
		this("src/countriesApp/countries.txt");
	}

	public List<String> readCountryList() {
		List<String> countries = new ArrayList<>();
		if (!Files.exists(filePath)) {
			return countries;
		}
		try {
			File file = filePath.toFile();
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);

			String line = reader.readLine();
			while (line != null) {
				countries.add(line);
				line = reader.readLine();

			}
			reader.close();
			return countries;
		} catch (IOException ex) {
			throw new RuntimeException("Unable to read countries.", ex);
		}
	}
	
	public boolean saveCountryList(List<String> countryList) {
		try {
			if (!Files.exists(filePath)) {
				Files.createFile(filePath);
			}
			File file = filePath.toFile();
			PrintWriter writer = new PrintWriter(file);
			
			for (String country : countryList) {
				writer.println(country);
			}
			writer.close();
		} catch (IOException ex) {
			throw new RuntimeException("Unable to save countries.", ex);
		}
		return true;
	}


	
	
}
