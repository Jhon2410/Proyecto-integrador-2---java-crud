/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudjavaproyectointegrador.View;

import crudjavaproyectointegrador.Conexion;
import crudjavaproyectointegrador.Login;
import crudjavaproyectointegrador.Usuario;
import java.awt.CheckboxGroup;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainView extends javax.swing.JFrame {

    
    public MainView() {
        initComponents();
    }
    public MainView(UsuarioLogin user) {
        initComponents();
        txtUserName.setText("Correo : " + user.getCorreo() + "    Nombre : " + user.getName());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNumeroDocuemento = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        lblPrimerNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JTextField();
        lblSegundoApeliido = new javax.swing.JTextField();
        drpTipoDocumento = new java.awt.Choice();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtDocumento = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        otroSexo = new java.awt.TextField();
        lblOtroSexo = new java.awt.Label();
        lblEdad = new javax.swing.JTextField();
        txtBuscar = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        label3 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jButton7.setText("Nuevo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clasificación");

        lblNumeroDocuemento.setBackground(new java.awt.Color(204, 204, 204));
        lblNumeroDocuemento.setBorder(new javax.swing.border.MatteBorder(null));

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Datos");

        lblPrimerNombre.setToolTipText("");

        label4.setText("Edad");

        label5.setText("Segundo nombre");

        label6.setText("Numero de documento");

        label7.setText("Tipo de documento");

        label8.setText("Primer nombre");

        label9.setText("Primer apellido");

        label10.setText("Segundo apellido");

        jLabel2.setText("Sexo");

        checkbox1.setLabel("Hombre");

        checkbox2.setLabel("Mujer");

        checkbox3.setLabel("Otro");
        checkbox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkbox3ItemStateChanged(evt);
            }
        });
        checkbox3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkbox3PropertyChange(evt);
            }
        });

        otroSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otroSexoActionPerformed(evt);
            }
        });

        lblOtroSexo.setText("¿Cual?");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblNumeroDocuementoLayout = new javax.swing.GroupLayout(lblNumeroDocuemento);
        lblNumeroDocuemento.setLayout(lblNumeroDocuementoLayout);
        lblNumeroDocuementoLayout.setHorizontalGroup(
            lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                        .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblNumeroDocuementoLayout.createSequentialGroup()
                                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(drpTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                                .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(otroSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOtroSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                    .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                        .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(lblSegundoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(lblPrimerApellido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSegundoApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(lblEdad))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        lblNumeroDocuementoLayout.setVerticalGroup(
            lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lblNumeroDocuementoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSegundoApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(drpTipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(lblNumeroDocuementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOtroSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkbox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(otroSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkbox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        drpTipoDocumento.add("Cedula de ciudadania");
        drpTipoDocumento.add("Cedula extrangera");
        drpTipoDocumento.add("Tarjeta de identidad");
        drpTipoDocumento.add("Pasaporte");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("Crear");
        jButton1.setVisible(false);

        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Opciones");

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Nuevo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        label2.setBackground(new java.awt.Color(0, 0, 0));
        label2.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Lista");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtUserName.setText("asdadasd");

        jButton8.setText("Salir");
        jButton8.setMaximumSize(new java.awt.Dimension(108, 103));
        jButton8.setMinimumSize(new java.awt.Dimension(108, 103));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(lblNumeroDocuemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName)
                                .addGap(19, 19, 19)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserName)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroDocuemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otroSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otroSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otroSexoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 lblOtroSexo.setVisible(false);
        otroSexo.setVisible(false);
        checkbox1.setState(rootPaneCheckingEnabled);
        limpiar();
    }//GEN-LAST:event_jButton6ActionPerformed
    public void limpiar(){
        lblPrimerNombre.setText("");
        lblSegundoNombre.setText("");
        lblPrimerApellido.setText("");
        lblSegundoApeliido.setText("");
        txtDocumento.setText("");
        lblEdad.setText("");
        checkbox1.setState(false);
        checkbox2.setState(false);
        checkbox3.setState(false);
       
    }
    public void guardar() throws SQLException{
        Conexion conexion = new Conexion();
        Connection db = conexion.getConexion();
        String sql = "insert into usuario(primer_nombre_usuario,segundo_nombre_usuario,primer_apellido_usuario,segundo_apellido_usuario,tipo_documento_usuario,documento_usuario,edad_usuario,sexo_usuario,cod_sexo_usuario) values(?,?,?,?,?,?,?,?,?)";
        Statement st = db.createStatement();
        PreparedStatement pstm = db.prepareStatement(sql);
        pstm.setString(1,lblPrimerNombre.getText());
        pstm.setString(2,lblSegundoNombre.getText());
        pstm.setString(3,lblPrimerApellido.getText());
        pstm.setString(4,lblSegundoApeliido.getText());
        pstm.setString(5,drpTipoDocumento.getSelectedItem());
        pstm.setString(6,txtDocumento.getText());
        pstm.setString(7,lblEdad.getText());
        if(checkbox1.getState()){
           pstm.setString(9,"1");
           pstm.setString(8,checkbox1.getLabel()); 
        }else if(checkbox2.getState()){
            pstm.setString(9,"2");
            pstm.setString(8,checkbox2.getLabel()); 
        }else{
            pstm.setString(9,"3");
            pstm.setString(8,otroSexo.getText()); 
        }
        
        
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Guardado con exito.");
        limpiar();
        listar();
        
        
    }
    private void checkbox3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkbox3PropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkbox3PropertyChange

    private void checkbox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkbox3ItemStateChanged
        // TODO add your handling code here:
        System.out.println(checkbox1.getState());
        System.out.println(checkbox2.getState());
        System.out.println(checkbox3.getState());
        if(checkbox3.getState()){
            lblOtroSexo.setVisible(true);
            otroSexo.setText("");
            otroSexo.setVisible(true);
        }
    }//GEN-LAST:event_checkbox3ItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            // TODO add your handling code here:
            guardar();
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            // TODO add your handling code here:
            buscar();
            //  System.out.println(jTable2.getSelectedRow());
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            eliminar();
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            buscar();
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            update();
            listar();
            limpiar();
            txtBuscar.setText("");
                    
            JOptionPane.showMessageDialog(null,"Modificado con exito.");
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.show();
        dispose();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTableClick(java.awt.event.MouseEvent evt) throws SQLException{
        buscar();
        System.out.println("as");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Choice drpTipoDocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField lblEdad;
    private javax.swing.JPanel lblNumeroDocuemento;
    private java.awt.Label lblOtroSexo;
    private javax.swing.JTextField lblPrimerApellido;
    private javax.swing.JTextField lblPrimerNombre;
    private javax.swing.JTextField lblSegundoApeliido;
    private javax.swing.JTextField lblSegundoNombre;
    private java.awt.TextField otroSexo;
    private java.awt.TextField txtBuscar;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables

    public void listar() {
        limpiar();
        CheckboxGroup cg = new CheckboxGroup();
        checkbox1.getState();
        checkbox1.setCheckboxGroup(cg);
        checkbox2.setCheckboxGroup(cg);
        checkbox3.setCheckboxGroup(cg);
        Conexion conexion = new Conexion();
        Connection db = conexion.getConexion();
        Statement st = null;
        try {
            st = db.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }

        ResultSet resultados = null;
        try {
            resultados = st.executeQuery("select * from usuario");
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        // System.out.println(resultados);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        DefaultTableModel modeloDefecto = new DefaultTableModel();
        modeloDefecto.addColumn("Id");
        modeloDefecto.addColumn("Nombre");
        modeloDefecto.addColumn("Apellido");
        modeloDefecto.addColumn("Sexo");
        modeloDefecto.addColumn("Tipo docuemnto");
        modeloDefecto.addColumn("Documento");
        
        jTable2.setModel(modeloDefecto);
        
        jTable2.clearSelection();
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();;
            while (resultados.next()) {
                Object us[] = new Object[6];
                Usuario user = new Usuario();
                user.setId_usuario(Integer.parseInt(resultados.getString("id_usuario")));
                user.setPrimer_nombre_usuario(resultados.getString("primer_nombre_usuario"));
                user.setSegundo_nombre_usuario(resultados.getString("segundo_nombre_usuario"));
                user.setPrimer_apellido_usuario(resultados.getString("primer_apellido_usuario"));
                user.setSegundo_apellido_usuario(resultados.getString("segundo_apellido_usuario"));
                user.setTipo_documento_usuario(resultados.getString("tipo_documento_usuario"));
                user.setDocumento_usuario(resultados.getString("documento_usuario"));
                user.setEdad_usuario(resultados.getString("edad_usuario"));
                user.setSexo_usuario(resultados.getString("sexo_usuario"));
                user.setCod_sexo_usuario(resultados.getString("cod_sexo_usuario"));
                usuarios.add(user);

                us[0] = user.getId_usuario();
                us[1] = user.getPrimer_nombre_usuario();
                us[2] = user.getPrimer_apellido_usuario();
                us[3] = user.getSexo_usuario();
                us[4] = user.getTipo_documento_usuario();
                us[5] = user.getDocumento_usuario();
                
                modelo.addRow(us);
                System.out.println(resultados.getString("id_usuario"));

            }
            jTable2.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }

        usuarios.forEach(user -> {
            System.out.println("user : " + user.getId_usuario());
        });
    }
    private void update() throws SQLException{
        Conexion conexion = new Conexion();
        Connection db = conexion.getConexion();
        String sql = "update usuario set primer_nombre_usuario = ?,segundo_nombre_usuario= ?,primer_apellido_usuario = ?,segundo_apellido_usuario = ?,tipo_documento_usuario = ?,documento_usuario = ?,edad_usuario = ?,sexo_usuario = ?,cod_sexo_usuario = ? where id_usuario = ?";
        Statement st = db.createStatement();
        PreparedStatement pstm = db.prepareStatement(sql);
        pstm.setString(1,lblPrimerNombre.getText());
        pstm.setString(2,lblSegundoNombre.getText());
        pstm.setString(3,lblPrimerApellido.getText());
        pstm.setString(4,lblSegundoApeliido.getText());
        pstm.setString(5,drpTipoDocumento.getSelectedItem());
        pstm.setString(6,txtDocumento.getText());
        pstm.setString(7,lblEdad.getText());
        if(checkbox1.getState()){
           pstm.setString(9,"1");
           pstm.setString(8,checkbox1.getLabel()); 
        }else if(checkbox2.getState()){
            pstm.setString(9,"2");
            pstm.setString(8,checkbox2.getLabel()); 
        }else{
            pstm.setString(9,"3");
            pstm.setString(8,otroSexo.getText()); 
        }
        if(txtBuscar.getText()!= ""){
            pstm.setInt(10, Integer.parseInt(txtBuscar.getText()));
        }
        
        
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Modificado con exito.");
        limpiar();
        listar();
    }
    private void buscar() throws SQLException{
        Conexion conexion = new Conexion();
        Connection db = conexion.getConexion();
        String sql = "select * from usuario ";
       // PreparedStatement pstm = db.prepareStatement(sql);
        Statement st = db.createStatement();
        //pstm.setInt(1, Integer.parseInt( jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString()));
        ResultSet resultados = st.executeQuery(sql);
        //JOptionPane.showMessageDialog(null, sql + Integer.parseInt( jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString());
        if(!resultados.next()){
            JOptionPane.showMessageDialog(null, "No Hay ningun usuario con id.");
        }
        boolean econtrado = false; 
        System.out.println(resultados);
        while(resultados.next()){
            Usuario user = new Usuario();
                user.setId_usuario(Integer.parseInt(resultados.getString("id_usuario")));
                user.setPrimer_nombre_usuario(resultados.getString("primer_nombre_usuario"));
                user.setSegundo_nombre_usuario(resultados.getString("segundo_nombre_usuario"));
                user.setPrimer_apellido_usuario(resultados.getString("primer_apellido_usuario"));
                user.setSegundo_apellido_usuario(resultados.getString("segundo_apellido_usuario"));
                user.setTipo_documento_usuario(resultados.getString("tipo_documento_usuario"));
                user.setDocumento_usuario(resultados.getString("documento_usuario"));
                user.setEdad_usuario(resultados.getString("edad_usuario"));
                user.setSexo_usuario(resultados.getString("sexo_usuario"));
                user.setCod_sexo_usuario(resultados.getString("cod_sexo_usuario"));
             
                lblPrimerNombre.setText(user.getPrimer_nombre_usuario());
                lblSegundoNombre.setText(user.getSegundo_nombre_usuario());
                lblPrimerApellido.setText(user.getPrimer_apellido_usuario());
                lblSegundoApeliido.setText(user.getSegundo_apellido_usuario());
                txtDocumento.setText(user.getDocumento_usuario());
                drpTipoDocumento.select(user.getTipo_documento_usuario());
                lblEdad.setText(user.getEdad_usuario());
                txtBuscar.setText(user.getId_usuario() + "");
              
                  
                   
                   try{
                       if(user.getSexo_usuario()=="Hombre"){
                   checkbox2.setState(true);
                   }else{
                       checkbox1.setState(true);
                   }    
                   }catch(Exception ex){
                       
                   }
                  
                  try{
                    int i = (int) jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0);
        
                    
               
                    if(Integer.parseInt( jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString())==user.getId_usuario()){
                        econtrado = true;
                        break;
                    }
              
                }catch(Exception ex){
                    if(!txtBuscar.getText().isEmpty()){
                        if(user.getId_usuario()==Integer.parseInt(txtBuscar.getText())){
                           econtrado = true;
                            break;
                        }
                    }
                    
                }
                    
    
              
            
        }
        jTable2.clearSelection();

        if(econtrado != true){
                    limpiar();
                    listar();
                    JOptionPane.showMessageDialog(null,"Usuario no encontrado.");
               }
       
    }
    
    private void eliminar() throws SQLException{
        if(txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"No Hay ningun usuario seleccionado.");
        }else{
         int borrar = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el usuario " +  txtBuscar.getText()  +" ?" );
            //System.out.println(borrar);
         if(borrar==0){
             Conexion conexion = new Conexion();
             Connection db = conexion.getConexion();
             String sql = "delete  from usuario where id_usuario = ?";
             PreparedStatement pstm = db.prepareStatement(sql);
             //pstm.setInt(1, Integer.parseInt( jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 0).toString()));
             pstm.setInt(1, Integer.parseInt(txtBuscar.getText()));
             pstm.execute();
             JOptionPane.showMessageDialog(null, "Eliminado exitoso!.");
             limpiar();
             listar();
         }
        }
        
    }
}
