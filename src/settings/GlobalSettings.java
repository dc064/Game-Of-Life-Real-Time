package settings;

import java.awt.Color;

public class GlobalSettings {
    public static final int window_w = 1200;
    public static final int window_h = 800;
    
    public static int board_w = 800;
    public static int board_h = 800;

    public static int Y = 40;
    public static int X = 40;

    public static int w_cell = board_w / Y;
    public static int h_cell = board_h / X;

    public static int delay = 80;
    public static int neighbourhood = 1;
    public static int borderType = 0;

    public static Color color = Color.red;

    public static boolean toAdd = true;

    public static void changeColor(Color actual)
    {
        Color [] palette = {Color.red, Color.blue, Color.yellow, Color.green, Color.orange, Color.black, Color.magenta};
        
        int i = 0;
        for(; i<palette.length; i++)
        {
            if(actual.equals(palette[i]))
            {
                GlobalSettings.color = palette[(i + 1) % palette.length];
                break;
            }
        }
    }

    public static void changeNeighbourhood()
    {
        GlobalSettings.neighbourhood = (GlobalSettings.neighbourhood + 1) % 2;
    }

    public static void changeBorders()
    {
        GlobalSettings.borderType = (GlobalSettings.borderType + 1) % 2;
    }

    public static void increaseDelay() 
    {
        GlobalSettings.delay += 50;
    }

    public static void decreaseDelay() 
    {
        if(GlobalSettings.delay - 50 > 0)
        {
            GlobalSettings.delay -= 50;
        }
    }

    public static void addRandomCells() 
    {
        GlobalSettings.toAdd = true;
    }
}
