import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidePanel extends JPanel {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    RCube rCube;
    RCubeDisplay rCubeDisplay;
    JPanel cubePanel;

    public SidePanel(RCube rCube, RCubeDisplay rCubeDisplay, JPanel cubePanel){
        this.rCube = rCube;
        this.rCubeDisplay = rCubeDisplay;
        this.cubePanel = cubePanel;

        button1 = new JButton("U");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseUTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button2 = new JButton("U'");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseUTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button3 = new JButton("R");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseRTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button4 = new JButton("R'");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseRTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button5 = new JButton("F");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseFTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button6 = new JButton("F'");
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseFTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button7 = new JButton("D");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseDTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button8 = new JButton("D'");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseDTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button9 = new JButton("L");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseLTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button10 = new JButton("L'");
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseLTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button11 = new JButton("B");
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseBTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button12 = new JButton("B'");
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseBTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button13 = new JButton("M");
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseMTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button14 = new JButton("M'");
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseMTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button15 = new JButton("E");
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseETurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button16 = new JButton("E'");
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseETurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button17 = new JButton("S");
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.clockwiseSTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button18 = new JButton("S'");
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.antiClockwiseSTurn();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button19 = new JButton("X");
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeClockwiseByX();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button20 = new JButton("X'");
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeAntiClockwiseByX();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button21 = new JButton("Y");
        button21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeClockwiseByY();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button22 = new JButton("Y'");
        button22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeAntiClockwiseByY();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button23 = new JButton("Z");
        button23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeClockwiseByZ();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        button24 = new JButton("Z'");
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rCube.turnCubeAntiClockwiseByZ();
                rCubeDisplay.update();
                cubePanel.repaint();
            }
        });

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(button10);
        this.add(button11);
        this.add(button12);
        this.add(button13);
        this.add(button14);
        this.add(button15);
        this.add(button16);
        this.add(button17);
        this.add(button18);
        this.add(button19);
        this.add(button20);
        this.add(button21);
        this.add(button22);
        this.add(button23);
        this.add(button24);
    }
}
