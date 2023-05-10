package Tarea11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLOutput;

public class Ventana2 extends JFrame{
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;

    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblNombre = new JLabel("INGRESA UN NOMBRE: ");
        this.getContentPane().add(lblNombre);
        txtNombre = new JTextField(30);
        this.getContentPane().add(txtNombre);
        boton = new JButton("AGREGAR");
        this.getContentPane().add(boton);


        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");
        combo = new JComboBox(modelo);
        this.getContentPane().add(combo);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtNombre.getText();
                modelo.agregarNombre(nuevo);
                txtNombre.setText("");
            }
        });
        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Hola " + combo.getSelectedItem());
            }
        });
    }
}
