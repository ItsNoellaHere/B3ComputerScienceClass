package gameTest.Engine.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileUtils {
	public static String loadAsString(String path) {
		StringBuilder result = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(Class.class.getResourceAsStream(path)))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				result.append(line).append("\n");
			}
		}
		catch (IOException e) {
			System.err.println("couldn't find the file at " + path);
		}
		return result.toString();
	}
}
