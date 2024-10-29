import javax.swing.*;
import java.awt.*;

public class DibujoRectangulo extends JPanel {

    public Rectangulo r1;

     public DibujoRectangulo() {
        this.r1 = new Rectangulo(new Point(300, 200), new Point(500, 300), Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja un rectángulo
        g.setColor(Color.BLUE); // Color del rectángulo
        g.fillRect(50, 50, 200, 100); // (x, y, ancho, alto)
        this.r1.dibujar(g);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
        DibujoRectangulo panel = new DibujoRectangulo();
       
        ventana.add(panel);
        ventana.setSize(800, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
