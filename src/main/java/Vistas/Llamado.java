package Vistas;

import Modelo.Cola;
import Modelo.ListaDobleEnlazada;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Llamado extends javax.swing.JFrame {
  private StringBuilder colaEsperaText = new StringBuilder(); // Variable para almacenar los datos de la cola de espera

 private String contenidoColaEspera;
    public Llamado(String contenidoColaEsperaLobby) {
        initComponents();    
        setLocationRelativeTo(this);
        pintarImagen(label_logo, "D:\\Usuario\\Documents\\NetBeansProjects\\SALUDPLUS\\src\\main\\java\\resources\\logo1.png");
        campo_cola_de_espera_llamado.setText(contenidoColaEsperaLobby);
        contenidoColaEspera = contenidoColaEsperaLobby;
      
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boton_retorno_lobby = new javax.swing.JButton();
        label_logo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_cola_de_espera_llamado = new javax.swing.JTextArea();
        boton_llamado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantalla_tickets = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MODULO DE LLAMADO DE PACIENTES");

        boton_retorno_lobby.setText("VOLVER AL LOBBY");
        boton_retorno_lobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_retorno_lobbyActionPerformed(evt);
            }
        });

        label_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(boton_retorno_lobby)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(boton_retorno_lobby)
                        .addGap(14, 14, 14))
                    .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("PACIENTES EN COLA:");

        campo_cola_de_espera_llamado.setEditable(false);
        campo_cola_de_espera_llamado.setBackground(new java.awt.Color(255, 255, 255));
        campo_cola_de_espera_llamado.setColumns(20);
        campo_cola_de_espera_llamado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_cola_de_espera_llamado.setRows(5);
        campo_cola_de_espera_llamado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_cola_de_espera_llamado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_cola_de_espera_llamado.setEnabled(false);
        jScrollPane1.setViewportView(campo_cola_de_espera_llamado);

        boton_llamado.setBackground(new java.awt.Color(102, 255, 102));
        boton_llamado.setText("LLAMAR PACIENTE");
        boton_llamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_llamadoActionPerformed(evt);
            }
        });

        pantalla_tickets.setEditable(false);
        pantalla_tickets.setBackground(new java.awt.Color(255, 255, 255));
        pantalla_tickets.setColumns(20);
        pantalla_tickets.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        pantalla_tickets.setRows(5);
        pantalla_tickets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pantalla_tickets.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pantalla_tickets.setEnabled(false);
        jScrollPane2.setViewportView(pantalla_tickets);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(boton_llamado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_llamado)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_llamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_llamadoActionPerformed
   // Verificar si hay tickets en la cola de espera
        if (!contenidoColaEspera.isEmpty()) {
            // Buscar la posición del primer salto de línea para identificar el primer ticket
            int indiceSaltoLinea = contenidoColaEspera.indexOf("\n");

            // Verificar si se encontró el primer ticket
            if (indiceSaltoLinea != -1) {
                // Tomar el primer ticket
                String primerTicket = contenidoColaEspera.substring(0, indiceSaltoLinea);

                // Mostrar el ticket tomado en el área de pantalla de tickets
                pantalla_tickets.setText(primerTicket);

                // Eliminar el primer ticket de la cola de espera
                contenidoColaEspera = contenidoColaEspera.substring(indiceSaltoLinea + 1);

                // Actualizar la cola de espera en el campo correspondiente
                campo_cola_de_espera_llamado.setText(contenidoColaEspera);
            } else {
                // Si no se encuentra un salto de línea, significa que hay un único ticket en la cola de espera
                // Mostrar ese ticket en el área de pantalla de tickets y vaciar el campo de cola de espera
                pantalla_tickets.setText(contenidoColaEspera);
                contenidoColaEspera = "";
                campo_cola_de_espera_llamado.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay más tickets en la cola de espera.");
        }
    
    }//GEN-LAST:event_boton_llamadoActionPerformed

    private void boton_retorno_lobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_retorno_lobbyActionPerformed

        // Verificar si la cola de espera está vacía
    if (contenidoColaEspera.isEmpty()) {
        // Si la cola de espera está vacía, realizar la acción de regreso
        // Aquí puedes agregar la lógica para el regreso, por ejemplo:
        JOptionPane.showMessageDialog(null, "Regresando al lobby.");
        Lobby lobby = new Lobby();        
        this.dispose();
        lobby.setLocationRelativeTo(null);
        lobby.setVisible(true);
    } else {
        // Si la cola de espera no está vacía, mostrar un mensaje indicando que la cola aún tiene tickets
        JOptionPane.showMessageDialog(null, "La cola de espera aún tiene tickets pendientes.");
    }
    }//GEN-LAST:event_boton_retorno_lobbyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_llamado;
    private javax.swing.JButton boton_retorno_lobby;
    private javax.swing.JTextArea campo_cola_de_espera_llamado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_logo;
    private javax.swing.JTextArea pantalla_tickets;
    // End of variables declaration//GEN-END:variables
}
