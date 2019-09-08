import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CubePanel extends JPanel{
    private RCubeDisplay rCubeDisplay;
    private JLabel label;
    private int startX;
    private int startY;

    public CubePanel(RCubeDisplay rCubeDisplay) {
        this.rCubeDisplay = rCubeDisplay;

        this.label = new JLabel("alap");
        this.label.setBounds(30,30,100,30);
        this.add(label);
        this.startX = 0;
        this.startY = 0;

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int[] result = rCubeDisplay.getTileByCoordinates(startX,startY);
                //label.setText("(" + startX + "," + startY + ") -> (" + e.getX() + "," + e.getY() + ")");
                label.setText("[" + result[0] + "," + result[1] + "," + result[2] + "]");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        rCubeDisplay.draw(grphcs);
    }

}
