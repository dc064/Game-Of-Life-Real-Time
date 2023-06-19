import display.GOLFrame;
import filereaders.CellFileReader;
import filereaders.GameSettingsFileReader;
import repositories.CellRepository;
import settings.GlobalSettings;
import simulation.CellUpdater;

public class Main {
    public static void main(String args[]) throws Exception {
		GameSettingsFileReader.readFromFile("settings.txt");
		CellFileReader.readFromFile("startCells.txt");
		Thread.sleep(GlobalSettings.delay);

        GOLFrame golFrame = new GOLFrame();
        
        while (true) {
            CellUpdater.nextStep(CellRepository.actualCells, GlobalSettings.Y, GlobalSettings.X);

            golFrame.panel.repaint();
            
            Thread.sleep(GlobalSettings.delay);
        }
    }
}