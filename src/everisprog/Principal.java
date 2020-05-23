/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everisprog;

/**
 *
 * @author Vicente
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Principal extends JFrame implements ActionListener, ChangeListener {

    private JLabel labelLogo, labelLogin, labelTitle, labelUsuario, labelContrasena, labelNombreCliente, labelNombreContacto, labelTelefono, labelFax;
    private JTextField txtNombreCliente, txtNombreContacto, txtTelefonoContacto,
            txtFax, txtDireccion, txtUsuario, txtContrasena;
    private JComboBox comboDireccion;
    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup bg;
    private JButton boton1, boton2;
    private FileReader fr1, fr2;
    private BufferedReader bf1, bf2;
    private String txtUsuario1, txtContrasena1;

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 640, 535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }

    public Principal() {
        setLayout(null);
        setTitle("Entrar o Registrarse");
        getContentPane().setBackground(new Color(100, 170, 150));

        ImageIcon imagen = new ImageIcon("images/login2.jpg");
        labelLogo = new JLabel(imagen);
        labelLogo.setBounds(80, 30, 111, 148);
        add(labelLogo);

        labelLogin = new JLabel("Login");
        labelLogin.setBounds(80, 185, 100, 50);
        labelLogin.setFont(new Font("Andale Mono", 1, 32));
        labelLogin.setForeground(new Color(255, 255, 255));
        add(labelLogin);

        txtNombreCliente = new JTextField();
        txtNombreCliente.setBounds(350, 60, 220, 25);
        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNombreCliente);

        labelNombreCliente = new JLabel("Nombre Cliente:");
        labelNombreCliente.setBounds(350, 40, 90, 25);
        labelNombreCliente.setFont(new Font("Andale Mono", 1, 12));
        labelNombreCliente.setForeground(new Color(255, 255, 255));
        add(labelNombreCliente);

        txtNombreContacto = new JTextField();
        txtNombreContacto.setBounds(350, 100, 220, 25);
        txtNombreContacto.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreContacto.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtNombreContacto.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNombreContacto);

        labelNombreContacto = new JLabel("Nombre Contacto:");
        labelNombreContacto.setBounds(350, 80, 90, 25);
        labelNombreContacto.setFont(new Font("Andale Mono", 1, 12));
        labelNombreContacto.setForeground(new Color(255, 255, 255));
        add(labelNombreContacto);

        txtTelefonoContacto = new JTextField();
        txtTelefonoContacto.setBounds(350, 160, 220, 25);
        txtTelefonoContacto.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoContacto.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtTelefonoContacto.setForeground(new java.awt.Color(0, 0, 0));
        add(txtTelefonoContacto);

        labelTelefono = new JLabel("Telefono Contacto:");
        labelTelefono.setBounds(350, 140, 90, 25);
        labelTelefono.setFont(new Font("Andale Mono", 1, 12));
        labelTelefono.setForeground(new Color(255, 255, 255));
        add(labelTelefono);

        txtFax = new JTextField();
        txtFax.setBounds(350, 220, 220, 25);
        txtFax.setBackground(new java.awt.Color(255, 255, 255));
        txtFax.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtFax.setForeground(new java.awt.Color(0, 0, 0));
        add(txtFax);

        labelFax = new JLabel("Fax Contacto:");
        labelFax.setBounds(350, 200, 90, 25);
        labelFax.setFont(new Font("Andale Mono", 1, 12));
        labelFax.setForeground(new Color(255, 255, 255));
        add(labelFax);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(350, 280, 220, 25);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        add(txtDireccion);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(40, 280, 200, 25);
        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        add(txtUsuario);

        labelUsuario = new JLabel("Usuario:");
        labelUsuario.setBounds(40, 260, 90, 25);
        labelUsuario.setFont(new Font("Andale Mono", 1, 12));
        labelUsuario.setForeground(new Color(255, 255, 255));
        add(labelUsuario);

        txtContrasena = new JTextField();
        txtContrasena.setBounds(40, 340, 200, 25);
        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setFont(new java.awt.Font("Andale Mono", 1, 14));
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        add(txtContrasena);

        labelContrasena = new JLabel("Contrasena:");
        labelContrasena.setBounds(40, 320, 90, 25);
        labelContrasena.setFont(new Font("Andale Mono", 1, 12));
        labelContrasena.setForeground(new Color(255, 255, 255));
        add(labelContrasena);

        comboDireccion = new JComboBox();
        comboDireccion.setBounds(350, 340, 220, 25);
        comboDireccion.setBackground(new java.awt.Color(224, 224, 224));
        comboDireccion.setFont(new Font("Andale Mono", 1, 14));
        comboDireccion.setForeground(new java.awt.Color(0, 0, 0));
        add(comboDireccion);
        comboDireccion.addItem("");
        comboDireccion.addItem("Item 1");
        comboDireccion.addItem("Item 2");
        comboDireccion.addItem("Item 3");

//    FileReader fr1 = new FileReader("jardineria_bbdd.sql");
//    BufferedReader bf1 = new BufferedReader(fr1);
//    txtUsuario = bf1.readLine();
//
//    FileReader fr2 = new FileReader("jardineria_bbdd.sql");
//    BufferedReader bf2 = new BufferedReader(fr2);
//    txtContrasena = bf2.readLine();
        boton1 = new JButton("Log in");
        boton1.setBounds(40, 440, 200, 25);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Registrarse");
        boton2.setBounds(350, 440, 220, 25);
        add(boton2);
        boton2.addActionListener(this);

        bg = new ButtonGroup();
        radio1 = new JRadioButton("Calle");
        radio1.setBounds(350, 257, 55, 25);
        radio1.setBackground(null);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("Avenida");
        radio2.setBounds(405, 257, 72, 25);
        radio2.setBackground(null);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("Boulevard");
        radio3.setBounds(475, 257, 95, 25);
        radio3.setBackground(null);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
        }
        if (radio2.isSelected()) {
        }
        if (radio3.isSelected()) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {

            System.out.println("Acaba de iniciar sesion");
        } else {
            System.out.println("Error: El nombre de usuario o contraseña son incorrectos");
        }
        if (e.getSource() == boton2) {
        }
    }

}