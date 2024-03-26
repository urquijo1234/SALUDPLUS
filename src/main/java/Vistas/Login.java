package Vistas;

import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {


    // Atributos para almacenar el correo y la contraseña durante el registro
    private final  String correoRegistro;
    private final  String contraseñaRegistro;
   private String codigoRecuperacion;
   
   
    public Login(Register aThis, boolean par, String correoRegistro, String contraseñaRegistro) {
        initComponents();
        this.correoRegistro = correoRegistro;
        this.contraseñaRegistro = contraseñaRegistro;
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

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campocorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campocontraseñalogin = new javax.swing.JPasswordField();
        btn_inicio = new javax.swing.JButton();
        checkbox = new javax.swing.JCheckBox();
        label_recuperacion = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CORREO ELECTRONICO:");

        campocorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocorreoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("CONTRASEÑA:");

        campocontraseñalogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        campocontraseñalogin.setEchoChar('*');

        btn_inicio.setBackground(new java.awt.Color(102, 255, 102));
        btn_inicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_inicio.setText("INICIAR SESION");
        btn_inicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        checkbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkbox.setText("Ver contraseña");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });

        label_recuperacion.setForeground(new java.awt.Color(0, 51, 255));
        label_recuperacion.setText("¿Olvidaste tu correo o contraseña?");
        label_recuperacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_recuperacionMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Iniciar Sesion");

        label_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(824, 824, 824)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_recuperacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(checkbox))
                            .addComponent(campocorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campocontraseñalogin, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campocontraseñalogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkbox)
                    .addComponent(label_recuperacion))
                .addGap(30, 30, 30)
                .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocorreoActionPerformed

    }//GEN-LAST:event_campocorreoActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
// Obtener el correo y la contraseña ingresados durante el inicio de sesión
        String correoLogin = campocorreo.getText();
        String contraseñaLogin = new String(campocontraseñalogin.getPassword());

        // Validar si el correo y la contraseña coinciden con los del registro
        if (correoLogin.equals(correoRegistro) && contraseñaLogin.equals(contraseñaRegistro)) {
            // Iniciar sesión
             Lobby lobby = new Lobby();
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            this.dispose();
            lobby.setLocationRelativeTo(null);
            lobby.setVisible(true);        
            
            // Realizar las acciones necesarias después de iniciar sesión
        } else {
            // Mostrar un mensaje de error si el correo o la contraseña son incorrectos
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
        
        
       

    }//GEN-LAST:event_btn_inicioActionPerformed

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        if (checkbox.isSelected()) {
            campocontraseñalogin.setEchoChar((char) 0);
        } else {
            campocontraseñalogin.setEchoChar('*');
        }
    }//GEN-LAST:event_checkboxActionPerformed

    private void label_recuperacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_recuperacionMouseClicked
       // Generar y mostrar el código de recuperación cuando se hace clic en el enlace
        generarCodigoRecuperacion();
        mostrarVentanaCodigoRecuperacion();  
    }//GEN-LAST:event_label_recuperacionMouseClicked
  private void generarCodigoRecuperacion() {
        // Generar un código aleatorio de 5 caracteres
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }
        codigoRecuperacion = sb.toString();
        System.out.println("Codigo de recuperacion: "+codigoRecuperacion);
    }

    private void mostrarVentanaCodigoRecuperacion() {
        // Mostrar un cuadro de diálogo de entrada para que el usuario ingrese el código
        String inputCodigo = JOptionPane.showInputDialog(this, "Ingrese el código de recuperación:", "Código de recuperación", JOptionPane.INFORMATION_MESSAGE);
        if (inputCodigo != null && inputCodigo.equals(codigoRecuperacion)) {
            // Si el código ingresado es correcto, mostrar el correo y la contraseña registrados
            JOptionPane.showMessageDialog(this, "CORREO ELECTRONICO: " + correoRegistro + "\nCONTRASEÑA: " + contraseñaRegistro, "Información de cuenta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si el código ingresado es incorrecto, preguntar si se desea reenviar el código
            int opcion = JOptionPane.showConfirmDialog(this, "Código incorrecto. ¿Desea reenviar el código?", "Código incorrecto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION) {
                // Si se elige reenviar el código, generar uno nuevo y mostrar de nuevo la ventana
                generarCodigoRecuperacion();
                mostrarVentanaCodigoRecuperacion();
            }
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inicio;
    private javax.swing.JPasswordField campocontraseñalogin;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_recuperacion;
    // End of variables declaration//GEN-END:variables
}
