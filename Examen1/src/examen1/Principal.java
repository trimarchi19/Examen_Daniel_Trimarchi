/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author alexycruz1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        us.add(new Usuario("Admin", "admin", "0000-0000", "admin@unitec.edu", "admin"));
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_nombre = new javax.swing.JTextField();
        b_con = new javax.swing.JTextField();
        b_num = new javax.swing.JTextField();
        b_us = new javax.swing.JTextField();
        b_correo = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jd_logeado = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p_nom = new javax.swing.JTextField();
        p_correo = new javax.swing.JTextField();
        p_numero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        p_con = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        j_table = new javax.swing.JTable();
        actualizar = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_area = new javax.swing.JTextArea();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Iniciar_S = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        r_us = new javax.swing.JTextField();
        r_con = new javax.swing.JPasswordField();

        jd_registrar.getContentPane().setLayout(null);

        jLabel3.setText("NOMMBRE");
        jd_registrar.getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 90, 40);

        jLabel4.setText("USUARIO");
        jd_registrar.getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 58, 23);

        jLabel5.setText("CONTRASEÑA");
        jd_registrar.getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 120, 80, 30);

        jLabel6.setText("CORREO");
        jd_registrar.getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 240, 70, 30);

        jLabel7.setText("NUMERO");
        jd_registrar.getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 170, 43, 14);
        jd_registrar.getContentPane().add(b_nombre);
        b_nombre.setBounds(160, 70, 100, 40);
        jd_registrar.getContentPane().add(b_con);
        b_con.setBounds(160, 110, 100, 40);
        jd_registrar.getContentPane().add(b_num);
        b_num.setBounds(160, 150, 100, 40);
        jd_registrar.getContentPane().add(b_us);
        b_us.setBounds(160, 190, 100, 40);
        jd_registrar.getContentPane().add(b_correo);
        b_correo.setBounds(160, 230, 100, 40);

        jToggleButton1.setText("REGISTRAR");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jd_registrar.getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(130, 320, 89, 23);

        jd_logeado.getContentPane().setLayout(null);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Correo");

        jLabel10.setText("Numero");

        p_nom.setEditable(false);

        p_correo.setEditable(false);

        p_numero.setEditable(false);

        jLabel15.setText("Contraseña");

        p_con.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_correo)
                    .addComponent(p_nom)
                    .addComponent(p_numero)
                    .addComponent(p_con, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addGap(509, 509, 509))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_correo))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(p_numero)
                        .addGap(7, 7, 7))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(p_con, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        j_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CLASES", "VARIABLES", "METODOS", "VARIABLES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(j_table);

        actualizar.setText("ACTUALIZAR TABLA");
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarMouseClicked(evt);
            }
        });
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VIsualizar", jPanel2);

        t_area.setColumns(20);
        t_area.setRows(5);
        jScrollPane1.setViewportView(t_area);

        jToggleButton2.setText("EJECUTAR");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("CC/\"NOMBRE DE LA CLASE\"\n***//CREA UNA CLASE//***\nEJEMPLO                   CC.perro \n\nCM/\"NOMBRE DEL METODO\"()/\"NOMBRE DE LA CLASE\"\n***//CREA UN METODO EN UNA CLASE//**\nEJEMPLO                  CM/eat()/perro\n\nCA/\"TIPO DE ATRIBUTO\"_\"NOMBRE DE LA VARIABLE\"/\"CLASE\"/\"METODO\"()\n***//CREA UN ATRIBUTO EN UN METODO//**\nEJEMPLO                   CM/int_x/eat()/perro\n\nMM/\"METODO\"()/\"CLASE\"/\"NUEVO NOMBRE DEL METODO\"\n***//CAMBIA UN METODO EN UNA CLASE//**\nEJEMPLO                   MM/eat()/perro/dormir() == dormir()/perro\n\nAM/\"METODO\"()/\"CLASE\"/\"Mensaje o Cuerpo\"\n***//AGREGA CUERPO AL METODO\nEJEMPLO                   AM/eat()/perro/\"int x,y, return x*y;\"\n\nNC/\"Nombre de la Clase\" ***//Crea el Constructor de una clase//***\nNC/perro\n\nTT/\"Nombre de la Clase\" ***//Crea El to String de la CLase//***\n\n\nBM/\"METODO\"().\"CLASE\" **+//BORRA EL METODO DE LA CLASE//***\n\nVC/\"nombre de la variable\"/clase\nEJEMPLO  VC/INT_X/perro\n\nMC/\"clase original\"/\"Nuevo Nombre de la CLase\"////\"Cambia el nombre de la clase////\nMA/\"nombre de la variable\"/\"Nombre de la clase\"/\"Nuevo Nombre del Atributo\" ///Cambia el nombre de la variable en la clase///\n**");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Ejecutar", jPanel3);

        jd_logeado.getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 11, 767, 588);

        jButton3.setText("Cerrar Sesion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jd_logeado.getContentPane().add(jButton3);
        jButton3.setBounds(650, 610, 97, 23);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        Iniciar_S.setText("Iniciar Sesion");
        Iniciar_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Iniciar_SMouseClicked(evt);
            }
        });
        Iniciar_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_SActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Iniciar_S)
                            .addComponent(r_con)
                            .addComponent(r_us, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(r_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(r_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Iniciar_S)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Iniciar_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iniciar_SMouseClicked
        // TODO add your handling code here:
        int cont = 0;
        String contraseña = r_con.getText();
        String usuario = r_us.getText();
        for (Usuario u : us) {
            if (usuario.equals(u.getUsuario()) && contraseña.equals(u.getContraseña())) {
                actual = u;
                System.out.println("SIMONNNN");
                jd_logeado.pack();
                jd_logeado.setLocationRelativeTo(this);
                jd_logeado.setVisible(true);
                p_nom.setText(actual.getNombre());
                p_correo.setText(actual.getCorreo());
                p_numero.setText(actual.getNumero());
                p_con.setText(actual.getContraseña());
                ac = cont;
                System.out.println(ac + "LIsta Ubicacion");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario No Encontrado");
            }
            cont++;
        }


    }//GEN-LAST:event_Iniciar_SMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_registrar.setModal(true);
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(this);
        jd_registrar.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_logeado.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked

    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (!(b_nombre.getText().isEmpty() && b_con.getText().isEmpty() && b_num.getText().isEmpty()
                && b_correo.getText().isEmpty() && b_us.getText().isEmpty())) {
            String nombre = b_nombre.getText();
            String contraseña = b_con.getText();
            String numero = b_num.getText();
            String correos = b_correo.getText();
            String usuario = b_us.getText();

            us.add(new Usuario(nombre, contraseña, numero, correos, usuario));
            JOptionPane.showMessageDialog(this, "Usuario Creado Exitosamente");
            b_nombre.setText("");
            b_con.setText("");
            b_num.setText("");
            b_correo.setText("");
            b_us.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Debe Llenar todos los Parametros");
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Iniciar_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iniciar_SActionPerformed

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked

    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged


    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String texto = t_area.getText();
        String[] partes = texto.split("/");
        System.out.println(partes[0]);
        try {
            if (partes[0].equals("CC")) {
                us.get(ac).getClases().add(new Clases(partes[1]));
            } else if (partes[0].equals("CM")) {
                System.out.println(partes[2]);
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[2])) {
                        us.get(ac).getClases().get(i).getMetodos().add(new Metodos(partes[1]));
                    }
                }

            } else if (partes[0].equals("CA")) {
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[3])) {
                        for (int j = 0; j < us.get(ac).getClases().get(i).getMetodos().size(); j++) {
                            if (us.get(ac).getClases().get(i).getMetodos().get(j).getM_nombre().equals(partes[2])) {
                                us.get(ac).getClases().get(i).getMetodos().get(j).setAtributo1(partes[1]);
                            }
                            //  CM/int_x/eat()/perro
                        }
                    }
                }

            } else if (partes[0].equals("BM")) {
                //"METODO"()/"CLASE
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[2])) {
                        for (int j = 0; j < us.get(ac).getClases().get(i).getMetodos().size(); j++) {
                            System.out.println("TODO BIEN???????");
                            if (us.get(ac).getClases().get(i).getMetodos().get(j).getM_nombre().equals(partes[1])) {
                                us.get(ac).getClases().get(i).getMetodos().remove(j);
                                System.out.println("SE BORRO");
                                j=us.get(ac).getClases().get(i).getMetodos().size();
                            }
                            //  CM/int_x/eat()/perro
                        }
                    }
                }

            } else if (partes[0].equals("VC")) {
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[2])) {
                        us.get(ac).getClases().get(i).getAtri().add(new Atributos(partes[1]));
                    }
                }

            } else if (partes[0].equals("NC")) {
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[1])) {
                       String nom= us.get(ac).getClases().get(i).getNombre()+"()";
                        us.get(ac).getClases().get(i).getMetodos().add(new Metodos(nom));
                    }
                }
            } else if (partes[0].equals("TT")) {
                  for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[1])) {
                       String nom="to String()";
                        us.get(ac).getClases().get(i).getMetodos().add(new Metodos(nom));
                    }
                }
            }else if (partes[0].equals("MM")) {
                // MM/eat()/perro/dormir() == dormir()/perro
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[2])) {
                        for (int j = 0; j < us.get(ac).getClases().get(i).getMetodos().size(); j++) {
                            if (us.get(ac).getClases().get(i).getMetodos().get(j).getM_nombre().equals(partes[1])) {
                                us.get(ac).getClases().get(i).getMetodos().get(j).setM_nombre(partes[3]);
                            }
                            
                        }
                    }
                }

            }else if (partes[0].equals("MC")) {
                for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[1])) {
                        us.get(ac).getClases().get(i).setNombre(partes[2]);
                    }
                }
            }else if (partes[0].equals("MC")) {
               for (int i = 0; i < us.get(ac).getClases().size(); i++) {
                    if (us.get(ac).getClases().get(i).getNombre().equals(partes[2])) {
                        for(int j=0;j<us.get(ac).getClases().get(i).getAtri().size();j++){
                            System.out.println(us.get(ac).getClases().get(i).getAtri().get(j).getNombre());
                            if (us.get(ac).getClases().get(i).getAtri().get(j).getNombre().equals(partes[1])){
                                us.get(ac).getClases().get(i).getAtri().get(j).setNombre(partes[3]);
                            }
                                    //MA/"nombre de la variable"/"Nombre de la clase"/"Nuevo Nombre del Atributo"
                        }
                    }
                } 
            }
        } catch (Exception e) {
            System.out.println("FATAL ERROR");
        }
        //NC/"Nombre de la Clase" ***//Crea el Constructor de una clase//***
        //NC/perro

        //TT/"Nombre de la Clase" ***//Crea El to String de la CLase//***
        //
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseClicked

        j_table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "CLASES", "VARIABLES", "METODOS", "VARIABLES"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        DefaultTableModel modelo = (DefaultTableModel) j_table.getModel();
        for (int i = 0; i < us.get(ac).getClases().size(); i++) {
            String variables = "";
            for (int j = 0; j < us.get(ac).getClases().get(i).getMetodos().size(); j++) {
                variables += us.get(ac).getClases().get(i).getMetodos().get(j).getAtributo1();
            }
            Object[] newrow = {
                us.get(ac).getClases().get(i).getNombre(),
                us.get(ac).getClases().get(i).getAtri(),
                us.get(ac).getClases().get(i).getMetodos(),
                variables
            };

            modelo.addRow(newrow);

        }
        j_table.setModel(modelo);
    }//GEN-LAST:event_actualizarMouseClicked

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar_S;
    private javax.swing.JToggleButton actualizar;
    private javax.swing.JTextField b_con;
    private javax.swing.JTextField b_correo;
    private javax.swing.JTextField b_nombre;
    private javax.swing.JTextField b_num;
    private javax.swing.JTextField b_us;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable j_table;
    private javax.swing.JDialog jd_logeado;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JTextField p_con;
    private javax.swing.JTextField p_correo;
    private javax.swing.JTextField p_nom;
    private javax.swing.JTextField p_numero;
    private javax.swing.JPasswordField r_con;
    private javax.swing.JTextField r_us;
    private javax.swing.JTextArea t_area;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuario> us = new ArrayList();
    Usuario actual = new Usuario();
    int ac = 0;

}
