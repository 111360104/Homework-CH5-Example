import java.awt.*;
import java.awt.event.*;

public class ButtonClickApp {
    public static void main(String[] args) {
        Frame frame = new Frame("按鈕點擊範例");
        Button button = new Button("按下我!");
        Label label = new Label("等待點擊...");
        
        button.setBounds(100, 100, 80, 30);
        label.setBounds(100, 150, 200, 30);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("按鈕已被點擊!");
            }
        });
        
        frame.add(button);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
