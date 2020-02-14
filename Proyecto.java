package proyecto;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;

public class Proyecto extends JFrame {

    JFrame j = new JFrame("hola");
    JList lista = new JList();
    JLabel label = new JLabel();
    JTextField texto = new JTextField();
    GridBagLayout q = new GridBagLayout();
    GridBagLayout w = new GridBagLayout();
    GridBagLayout e = new GridBagLayout();
    GridBagLayout r = new GridBagLayout();
    ImageIcon imagen = new ImageIcon();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    public Proyecto() {
        panel3.setSize(200, 300);
        setSize(600, 500);
        Agregar();
        Panel2();
//        Panel3();
        Panel4();
        cbActionLister();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        this.pack();
    }

    public void Agregar() {
        getContentPane().add(panel1);

        panel1.setLayout(q);
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);

        panel1.add(panel2, g);
        g.gridx = 2;

        panel1.add(panel3, g);

        g.gridx = 2;
        g.gridy = 2;
        panel1.add(panel4, g);

    }

    public void Panel2() {
        panel2.setLayout(w);
        GridBagConstraints w = new GridBagConstraints();
        w.gridx = 0;
        w.gridy = 0;
        Vector v = new Vector(4);
        v.addElement("Numark");
        v.addElement("Piones");
        v.addElement("Yamaha");
        v.addElement("Beginger");
        v.addElement("Hercules");

        JList lista = new JList(v);
        panel2.add(lista, w);
        lista.addListSelectionListener(new ListSelectionListener() {

            public void valueChanged(ListSelectionEvent lse) {
                
                cbActionLister();
            }
        });
    }

    public void Panel3() {

        panel3.setLayout(e);

        label = new JLabel(imagen= new ImageIcon("Numark.jpg"));

        GridBagConstraints e = new GridBagConstraints();
        e.gridx = 0;
        e.gridy = 0;
        panel3.add(label, e);
        panel3.setSize(200, 300);

    }

    public void Panel4() {
        texto = new JTextField(10);
        panel3.setLayout(r);
        GridBagConstraints r = new GridBagConstraints();
        r.gridx = 0;
        r.gridy = 0;
        panel4.add(texto, r);
    }

    public void cbActionLister() {
        GridBagConstraints e = new GridBagConstraints();
        switch (lista.getSelectedIndex()) {
            
            case 0:
                label = new JLabel(imagen = new ImageIcon("C:\\Users\\MAX\\Downloads\\Proyecto\\Numark.jpg"));
           
                e.gridx = 0;
                e.gridy = 0;
                panel3.add(label, e);
                break;
            case 1:
                

                label = new JLabel(imagen = new ImageIcon("C:\\Users\\MAX\\Downloads\\Proyecto\\pioner.jpg"));

                
                e.gridx = 0;
                e.gridy = 0;
                panel3.add(label, e);
                panel3.setSize(200, 300);

                break;
            case 2:
                label = new JLabel(imagen = new ImageIcon("C:\\Users\\MAX\\Downloads\\Proyecto\\Numark.jpg"));
                break;
            case 3:
                label = new JLabel(imagen = new ImageIcon("C:\\Users\\MAX\\Downloads\\Proyecto\\Numark.jpg"));
                break;

            case 4:
                label = new JLabel(imagen = new ImageIcon("C:\\Users\\MAX\\Downloads\\Proyecto\\Numark.jpg"));
                break;
        }
    }

    public static void main(String H[]) {
        Proyecto b = new Proyecto();

    }

}
