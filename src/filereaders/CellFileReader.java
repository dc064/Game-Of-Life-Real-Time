package filereaders;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cell.Cell;
import repositories.CellRepository;
import settings.GlobalSettings;

public class CellFileReader {
    public static void readFromFile(String filename) throws Exception
    {
        List<Cell> newCells = new ArrayList<>();

        File data = new File(filename);
        String currentLine;
        try (Scanner scanner = new Scanner(data)) {

            while (scanner.hasNextLine()) {
                currentLine = scanner.nextLine();

                String[] newPoint = currentLine.split(",");
                if (newPoint.length != 2) {
                    throw new IllegalArgumentException("Data file not in correct format: \nexpected x1,x2\nObtained: " + currentLine);
                }

                int newX = Integer.parseInt(newPoint[0]);
                int newY = Integer.parseInt(newPoint[1]);

                if(newX > GlobalSettings.Y || newX < 0
                || newY > GlobalSettings.X || newY < 0)
                {
                    throw new IndexOutOfBoundsException("Incorrect start cell index: " + newX + " " + newY);
                }
                newCells.add(new Cell(newX, newY));
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("There is a problem with data file");
        }

        CellRepository.update(newCells);
    }
}
