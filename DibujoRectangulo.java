import javax.swing.*;
import java.awt.*;

public class DibujoRectangulo extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja un rectángulo
        g.setColor(Color.BLUE); // Color del rectángulo
        g.fillRect(50, 50, 200, 100); // (x, y, ancho, alto)
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
        DibujoRectangulo panel = new DibujoRectangulo();
        
        ventana.add(panel);
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
