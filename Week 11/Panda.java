
package GUI;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author pabilandokv
 */
public class Panda extends JFrame implements KeyListener, MouseListener {
    ImageIcon img = new ImageIcon("ponyoramen.gif");
    JTextField tfAction = new JTextField(20);
    JLabel object = new JLabel(img);
    
    public Panda(){
        setSize(498, 320);
        setLayout(new FlowLayout());
        setTitle("Ram En House");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tfAction.setFocusable(false);
        addKeyListener(this);
        addMouseListener(this);
        
//        JLabel object = new JLabel(img);
        add(tfAction);
        add(object);
        
        setVisible(true);
    }
    public static void main(String[] args){
        new Panda();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getKeyCode()== KeyEvent.VK_LEFT){
            tfAction.setText("Pressed Arrow Key LEFT.");
            object.setLocation(object.getX()-20, object.getY());
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            tfAction.setText("Pressed Arrow Key RIGHT.");
            object.setLocation(object.getX()+20, object.getY());
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            tfAction.setText("Pressed Arrow Key UP.");
            object.setLocation(object.getX(), object.getY()-20);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            tfAction.setText("Pressed Arrow Key DOWN.");
            object.setLocation(object.getX(), object.getY()+20);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          tfAction.setText("Mouse Clicked.");
          object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          tfAction.setText("Mouse Pressed.");
          object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          tfAction.setText("Mouse Released.");
          object.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          tfAction.setText("Mouse Entered the Frame.");
          object.setLocation(0, 0);
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          tfAction.setText("Mouse Exited the Frame.");
          object.setLocation(400, 400);
    }

}
