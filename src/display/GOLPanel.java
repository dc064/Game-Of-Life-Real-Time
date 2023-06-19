package display;

import java.awt.*;
import javax.swing.JPanel;

import cell.Cell;
import repositories.CellRepository;
import settings.GlobalSettings;

public class GOLPanel extends JPanel {

    public GOLPanel() {
        setBounds(10, 10, GlobalSettings.board_w, GlobalSettings.board_h);
        setVisible(true);

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.BLACK);

        g2D.setColor(GlobalSettings.color);
        
        if (CellRepository.actualCells != null) {
            for (Cell iterator : CellRepository.actualCells) {
                g2D.fillRect(iterator.x * GlobalSettings.h_cell, iterator.y * GlobalSettings.h_cell, GlobalSettings.h_cell, GlobalSettings.w_cell);
            }
        }
    }

    @Override
    public void update(Graphics g) {
        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.BLACK);

        super.paint(g);

        g2D.setColor(Color.red);

        if (CellRepository.actualCells != null) {
            for (Cell iterator : CellRepository.actualCells) {
                g2D.fillRect(iterator.x, iterator.y, GlobalSettings.h_cell, GlobalSettings.w_cell);
            }
        }
    }
}

