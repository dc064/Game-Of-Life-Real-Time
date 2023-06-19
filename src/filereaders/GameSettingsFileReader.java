package filereaders;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import settings.GlobalSettings;

public class GameSettingsFileReader {
    public static void readFromFile(String filename)
    {

        File data = new File(filename);
        String currentLine;
        try (Scanner scanner = new Scanner(data)) {

            //board size
            currentLine = scanner.nextLine();
            String[] boardCoords = currentLine.split(",");
            
            if(boardCoords.length != 2)
            {
                throw new IllegalArgumentException("Found a mistake in data file!");
            }

            GlobalSettings.X = Integer.parseInt(boardCoords[0]);
            GlobalSettings.Y = Integer.parseInt(boardCoords[1]);

            //delay
            currentLine = scanner.nextLine();
            GlobalSettings.delay = Integer.parseInt(currentLine);

            //neighbourhood
            currentLine = scanner.nextLine();
            GlobalSettings.neighbourhood = Integer.parseInt(currentLine);

            //borders - 0 normal, 1 wrapped
            currentLine = scanner.nextLine();
            GlobalSettings.borderType = Integer.parseInt(currentLine);
            
            scanner.close();

        } catch (IOException e) {
            System.out.println("There is a problem with data file");
        }
    }
}
