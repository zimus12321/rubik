import javax.swing.*;
import java.awt.*;

public class RubiksCubeGUI {
    private JFrame frame;
    private CubePanel cubePanel;
    private SidePanel sidePanel;
    private RCube rCube;
    private RCubeDisplay rCubeDisplay;

    public RubiksCubeGUI() {
        frame = new JFrame("RubiksCube");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rCube = new RCube();
        rCubeDisplay = new RCubeDisplay(rCube, 200, 200);

        cubePanel = new CubePanel(rCubeDisplay);
        sidePanel = new SidePanel(rCube, rCubeDisplay, cubePanel);
        sidePanel.setLayout(new GridLayout(4,6));

        frame.setPreferredSize(new Dimension(1280,720));

        frame.getContentPane().setLayout(new GridLayout(1,2));

        frame.getContentPane().add(cubePanel);
        frame.getContentPane().add(sidePanel);

        frame.pack();
        frame.setVisible(true);

    }
}
