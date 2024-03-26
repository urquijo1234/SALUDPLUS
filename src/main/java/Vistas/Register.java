package Vistas;

import java.awt.Image;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Register extends javax.swing.JFrame {
// Atributos para almacenar el correo y la contraseña durante el registro

    private String correoRegistro;
    private String contraseñaRegistro;

    public Register() {
        initComponents();
         this.setLocationRelativeTo(this);
         pintarImagen(label_logo, "D:\\Usuario\\Documents\\NetBeansProjects\\SALUDPLUS\\src\\main\\java\\resources\\logo2.png");
        

    }
    
     private void pintarImagen(JLabel lbl, String ruta){
     ImageIcon image = new ImageIcon(ruta);
     Icon icon = new ImageIcon(image.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
     lbl.setIcon(icon);
     this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        camponombre1 = new javax.swing.JTextField();
        camponombre3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        camponombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        campoapellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        campoedad = new javax.swing.JTextField();
        lblNum_Documento = new javax.swing.JLabel();
        combobox_identificaciones = new javax.swing.JComboBox<>();
        lblTipo_Identificacion = new javax.swing.JLabel();
        campo_num_documento = new javax.swing.JTextField();
        lblNum_telefono = new javax.swing.JLabel();
        campo_num_telefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        campocorreo = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        campocontraseña = new javax.swing.JPasswordField();
        lblConfirmeContraseña = new javax.swing.JLabel();
        campocontraseña2 = new javax.swing.JPasswordField();
        btn_registro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        camponombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombre1ActionPerformed(evt);
            }
        });

        camponombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombre3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nombre Completo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Tipo de Identificacion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblEdad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEdad.setText("Edad*:");

        camponombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        camponombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        camponombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombre.setText("Nombre*:");

        campoapellido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campoapellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campoapellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoapellidoActionPerformed(evt);
            }
        });

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblApellido.setText("Apellido*:");

        campoedad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campoedad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campoedad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoedadActionPerformed(evt);
            }
        });

        lblNum_Documento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNum_Documento.setText("Numero de documento*");

        combobox_identificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA DE CIUDADANIA", "TARJETA DE IDENTIDAD", "CEDULA DE EXTRANJERIA COLOMBIANA", "CEDULA EXTRANJERA", "DOCUMENTO EXTRANJERO", "PASAPORTE", "REGISTRO CIVIL", " " }));
        combobox_identificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_identificacionesActionPerformed(evt);
            }
        });

        lblTipo_Identificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipo_Identificacion.setText("Tipo de Identificacion*");

        campo_num_documento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campo_num_documento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campo_num_documento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_num_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_num_documentoActionPerformed(evt);
            }
        });

        lblNum_telefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNum_telefono.setText("Numero de telefono*");

        campo_num_telefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campo_num_telefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campo_num_telefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_num_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_num_telefonoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("DATOS DE ACCESO");

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCorreo.setText("Correo Electronico*:");

        campocorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campocorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campocorreo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocorreoActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña*:");

        campocontraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campocontraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        campocontraseña.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campocontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocontraseñaActionPerformed(evt);
            }
        });

        lblConfirmeContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConfirmeContraseña.setText("Confirme su contraseña*:");

        campocontraseña2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campocontraseña2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        btn_registro.setBackground(new java.awt.Color(102, 255, 51));
        btn_registro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_registro.setText("REGISTRARME");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCorreo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblContraseña))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConfirmeContraseña))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campocontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campocontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_registro)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfirmeContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocontraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_registro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setText("REGISTRO DE PACIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(camponombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNum_telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_num_telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(lblEdad)
                            .addComponent(campoedad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo_Identificacion)
                            .addComponent(combobox_identificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNum_Documento)
                            .addComponent(campo_num_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoedad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblTipo_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_identificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNum_Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_num_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNum_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_num_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombreActionPerformed

    }//GEN-LAST:event_camponombreActionPerformed

    private void camponombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombre1ActionPerformed

    }//GEN-LAST:event_camponombre1ActionPerformed

    private void campoapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoapellidoActionPerformed

    }//GEN-LAST:event_campoapellidoActionPerformed

    private void camponombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombre3ActionPerformed

    }//GEN-LAST:event_camponombre3ActionPerformed

    private void campoedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoedadActionPerformed

    }//GEN-LAST:event_campoedadActionPerformed

    private void combobox_identificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_identificacionesActionPerformed

    }//GEN-LAST:event_combobox_identificacionesActionPerformed

    private void campo_num_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_num_documentoActionPerformed

    }//GEN-LAST:event_campo_num_documentoActionPerformed

    private void campo_num_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_num_telefonoActionPerformed

    }//GEN-LAST:event_campo_num_telefonoActionPerformed

    private void campocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocorreoActionPerformed

    }//GEN-LAST:event_campocorreoActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed

        if (camposVacios() || !contraseñasCoinciden() || !validarEdad() || !validarNumeroDocumento() || !validarNumeroTelefono()) {
        JOptionPane.showMessageDialog(this, "Por favor complete todos los campos correctamente y asegúrese de que las contraseñas coincidan y los campos de edad, número de documento y número de teléfono sean enteros positivos.", "Error en el registro", JOptionPane.ERROR_MESSAGE);
        return; // Detener el proceso de registro
         }
        // Obtener el nombre del usuario del campo correspondiente
        String nombreUsuario = camponombre.getText();

        // Guardar el nombre del usuario en un archivo de texto
        try {
            FileWriter writer = new FileWriter("Pacientes.txt", true); // true para agregar al final del archivo
            writer.write(nombreUsuario + "\n"); // Escribir el nombre del usuario en una nueva línea
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el nombre de usuario.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Almacenar el correo y la contraseña durante el registro
        correoRegistro = campocorreo.getText();
        contraseñaRegistro = new String(campocontraseña.getPassword());

        Login login = new Login(this, true, campocorreo.getText(), new String(campocontraseña.getPassword()));
        JOptionPane.showMessageDialog(this, "Registro completado existosamente");
        this.dispose();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    private boolean camposVacios() {
        // Verificar si algún campo está vacío
        return camponombre.getText().isEmpty() || campoapellido.getText().isEmpty() || campoedad.getText().isEmpty()
                || campo_num_documento.getText().isEmpty() || campo_num_telefono.getText().isEmpty()
                || campocorreo.getText().isEmpty() || new String(campocontraseña.getPassword()).isEmpty()
                || new String(campocontraseña2.getPassword()).isEmpty();
    }

    private boolean contraseñasCoinciden() {
        // Verificar si las contraseñas coinciden
        String contraseña = new String(campocontraseña.getPassword());
        String confirmarContraseña = new String(campocontraseña2.getPassword());
        return contraseña.equals(confirmarContraseña);


    }//GEN-LAST:event_btn_registroActionPerformed
private boolean validarEdad() {
    String edadString = campoedad.getText();
    try {
        int edad = Integer.parseInt(edadString);
        // La edad debe ser un entero positivo
        return edad > 0;
    } catch (NumberFormatException e) {
        // Si la conversión falla, la cadena no es un número entero
        return false;
    }
}

private boolean validarNumeroDocumento() {
    String numDocumentoString = campo_num_documento.getText();
    try {
        int numDocumento = Integer.parseInt(numDocumentoString);
        // El número de documento debe ser un entero positivo
        return numDocumento > 0;
    } catch (NumberFormatException e) {
        // Si la conversión falla, la cadena no es un número entero
        return false;
    }
}

private boolean validarNumeroTelefono() {
    String numTelefonoString = campo_num_telefono.getText();
    try {
        long numTelefono = Long.parseLong(numTelefonoString);
        // El número de teléfono debe ser un entero positivo
        return numTelefono > 0;
    } catch (NumberFormatException e) {
        // Si la conversión falla, la cadena no es un número entero
        return false;
    }
}

    private void campocontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocontraseñaActionPerformed

    }//GEN-LAST:event_campocontraseñaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registro;
    private javax.swing.JTextField campo_num_documento;
    private javax.swing.JTextField campo_num_telefono;
    private javax.swing.JTextField campoapellido;
    private javax.swing.JPasswordField campocontraseña;
    private javax.swing.JPasswordField campocontraseña2;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campoedad;
    private javax.swing.JTextField camponombre;
    private javax.swing.JTextField camponombre1;
    private javax.swing.JTextField camponombre3;
    private javax.swing.JComboBox<String> combobox_identificaciones;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblConfirmeContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNum_Documento;
    private javax.swing.JLabel lblNum_telefono;
    private javax.swing.JLabel lblTipo_Identificacion;
    // End of variables declaration//GEN-END:variables
}
