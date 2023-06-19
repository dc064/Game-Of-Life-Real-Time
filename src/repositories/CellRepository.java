package repositories;

import java.util.List;
import cell.Cell;

public class CellRepository {
    public static List<Cell> actualCells;

    public static void update(List<Cell> toPut) //throws Exception
    {
        if(toPut == null || toPut.size() == 0)
        {
            return;
            //throw new Exception();
        }
        actualCells = toPut;
    }
}
