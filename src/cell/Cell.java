package cell;
public class Cell {
    public boolean alive;
    public int x, y;

    public Cell(int x, int y, boolean alive)
    {
        this.x = x;
        this.y = y;
        this.alive = alive;
    }

    public Cell(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.alive = false;
    }
}