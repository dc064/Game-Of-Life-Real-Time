package cell;

import java.util.List;

public class CellGeneration implements ICellGeneration {
    public List<Cell> cells;

    @Override
    public void setGeneration(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public List<Cell> getGeneration() {
        return this.cells;
    }
}
