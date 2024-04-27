import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private Controller controller;
    private View view;

    private JPanel pnlUp, pnlDown;
    private JButton btnGraphicate;
    private JLabel lblArraySize, lblCounter, lblFormula, lblFormulaMath, lblComplexity,
            lblResCounter, lblResFormula, lblBubble;
    private JTextField txtArraySize;
    private Canvas canvas;

    public View(Controller controller) throws HeadlessException {

        this.controller = controller;

        this.pnlUp = new JPanel();
        this.pnlUp.setSize(1000, 200);
        this.pnlUp.setBackground(Color.decode("#E06000"));
        this.pnlUp.setLocation(0,0);
        this.pnlUp.setLayout(null);
        this.add(pnlUp);

        this.pnlDown = new JPanel();
        this.pnlDown.setSize(1000, 600);
        this.pnlDown.setBackground(Color.decode("#EE9600"));
        this.pnlDown.setLocation(0,200);
        this.pnlDown.setLayout(null);
        this.add(pnlDown);

        this.lblArraySize = new JLabel("Tamano Maximo del Arreglo: ");
        this.lblArraySize.setSize(200, 25);
        this.lblArraySize.setLocation(75, 40);
        this.pnlUp.add(lblArraySize);

        this.txtArraySize = new JTextField();
        this.txtArraySize.setSize(50, 25);
        this.txtArraySize.setBackground(Color.WHITE);
        this.txtArraySize.setLocation(300, 40);
        this.pnlUp.add(txtArraySize);

        this.btnGraphicate = new JButton("Graficar");
        this.btnGraphicate.setSize(200,25);
        this.btnGraphicate.setLocation(50, 120);
        this.btnGraphicate.setBackground(Color.decode("#A6001A"));
        this.btnGraphicate.setForeground(Color.white);
        this.btnGraphicate.setFocusPainted(false);
        this.pnlUp.add(btnGraphicate);
        this.btnGraphicate.addActionListener(controller);

        this.lblBubble = new JLabel("<html><h1 style=\"color: #731768;\">Busqueda Binaria</h1></html>");
        this.lblBubble.setSize(400, 25);
        this.lblBubble.setLocation(50, 0);
        this.pnlDown.add(lblBubble);

        this.lblCounter = new JLabel("Resultado por Contador: ");
        this.lblCounter.setSize(200, 25);
        this.lblCounter.setLocation(50, 25);
        this.pnlDown.add(lblCounter);

        this.lblFormula = new JLabel("Resultado por Formula: ");
        this.lblFormula.setSize(200, 25);
        this.lblFormula.setLocation(50, 50);
        this.pnlDown.add(lblFormula);

        this.lblFormulaMath = new JLabel("<html>Formula: 7 + 10 * log(N)</html>");
        this.lblFormulaMath.setSize(200, 25);
        this.lblFormulaMath.setLocation(50, 75);
        this.pnlDown.add(lblFormulaMath);

        this.lblComplexity = new JLabel("<html>Complejidad:   O(logN)</html>");
        this.lblComplexity.setSize(200, 25);
        this.lblComplexity.setLocation(50, 100);
        this.pnlDown.add(lblComplexity);

        this.lblResCounter = new JLabel("Aca va el resultado por contador");
        this.lblResCounter.setSize(200, 25);
        this.lblResCounter.setLocation(200, 25);
        this.pnlDown.add(lblResCounter);

        this.lblResFormula = new JLabel("Aca va el resultado por formula");
        this.lblResFormula.setSize(200, 25);
        this.lblResFormula.setLocation(200, 50);
        this.pnlDown.add(lblResFormula);

        this.canvas = new Canvas();
        this.canvas.setSize(500, 500);
        this.canvas.setBackground(Color.WHITE);
        this.canvas.setLocation(425, 25);
        this.pnlDown.add(canvas);

        this.setTitle("Busqueda Binaria");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setVisible(true);

    }

    public JButton getBtnGraphicate() {
        return btnGraphicate;
    }

    public JTextField getTxtArraySize() {
        return txtArraySize;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setLblFormulaMath(String formulaMath) {
        this.lblFormulaMath.setText(formulaMath);
    }

    public void setLblResCounter(int counter) {
        this.lblResCounter.setText("" + counter);
    }

    public void setLblResFormula(int resFormula) {
        this.lblResFormula.setText("" + resFormula);
    }

}
