
package GUI;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author pabilandokv
 */
public class Ramen {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("ramenimg.png");
    JButton btn = new JButton("Login");
//  JLabel lblBack = new JLabel(bg);
    
    public Ramen(){
        Image img = bg.getImage();
        bg = new ImageIcon(img.getScaledInstance(629, 361, Image.SCALE_SMOOTH));
        frame.setSize(629, 361);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JLabel lblBack = new JLabel(bg);
        lblBack.setLayout(new FlowLayout());
        lblBack.setBounds(0, 0, 629, 361);
        
        btn.setBounds(100, 100, 100, 100);
        lblBack.add(btn); 
        frame.add(lblBack);

        frame.setVisible(true);
    }
    public static void main(String[] args){
        Ramen GUI = new Ramen();
        
    }
}
