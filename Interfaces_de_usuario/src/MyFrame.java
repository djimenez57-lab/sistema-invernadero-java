import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
//import java.awt.URL;

import javax.swing.ImageIcon;

public class MyFrame extends JFrame {
    public MyFrame() {
//---------------------PANELES------------------------------------------------
        JPanel panelDatos = new JPanel();
        JPanel panelBotones = new JPanel();

//-------------------ELEMNTOS-------------------------------------------------
        JButton btnOk = new JButton("Ok");
        JButton btnCancelar = new JButton("Cancelar");

        ActionListener btnOkListen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se hizo click en el botón Ok.");
            }
        };

        ActionListener btnCancelListen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se hizo click en el botón Cancel.");
            }
        };
        btnOk.addActionListener(btnOkListen);
        btnCancelar.addActionListener(btnCancelListen);


        JLabel lbUsuario = new JLabel("Usuaruio: ");
        JLabel pasword = new JLabel("Pon tu contraseña: ");
        JTextField tUsusario = new JTextField(20);
        JTextField tPasword = new JTextField(18);
        URL image_url = MyFrame.class.getResource("image/flag5.jpg");
        ImageIcon fl1_Icon = new ImageIcon(image_url);

//----------------------PLANTILLAS--------------------------------------------
        FlowLayout lyFlow = new FlowLayout(FlowLayout.CENTER);
        GridLayout lyGrid = new GridLayout(2,2,4,5); //gap -> Pequeño espacio
        BorderLayout lyBorder = new BorderLayout(); //Divide la pantalla en 5 zonas
        panelDatos.setLayout(lyGrid);
        panelBotones.setLayout(lyFlow);
        //Color colorBotCancel = new Color(239, 91, 91);
        //Color colorBotOk = new Color(89, 226, 89);

//------------------------AJUSTES----------------------------------------------
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Prueba");
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(lyBorder);
        btnCancelar.setForeground(new Color(255,0,0));//También podemos hacer esto
        btnOk.setForeground(new Color(89, 226, 89));
        setLayout(new FlowLayout());

//-------------------ADICIÓN------------------------------------
        panelBotones.add(btnOk);
        panelBotones.add(btnCancelar);
        panelDatos.add(lbUsuario);
        panelDatos.add(tUsusario);
        panelDatos.add(pasword);
        panelDatos.add(tPasword);

        add(new JLabel(fl1_Icon));
        add(panelBotones, BorderLayout.SOUTH);
        add(panelDatos, BorderLayout.NORTH);

    }
}
