package Vistas;

import Modelo.Cola;
import Modelo.ListaDobleEnlazada;
import javax.swing.JOptionPane;

public class Llamado extends javax.swing.JFrame {


 private String contenidoColaEspera;
    public Llamado(String contenidoColaEsperaLobby) {
        initComponents();         
        campo_cola_de_espera_llamado.setText(contenidoColaEsperaLobby);
        contenidoColaEspera = contenidoColaEsperaLobby;
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton_retorno_lobby = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_cola_de_espera_llamado = new javax.swing.JTextArea();
        boton_llamado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pantalla_tickets = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("SALUDPLUS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("MODULO DE LLAMADO DE PACIENTES");

        boton_retorno_lobby.setText("VOLVER AL LOBBY");
        boton_retorno_lobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_retorno_lobbyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(boton_retorno_lobby)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_retorno_lobby)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("PACIENTES EN COLA:");

        campo_cola_de_espera_llamado.setColumns(20);
        campo_cola_de_espera_llamado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_cola_de_espera_llamado.setRows(5);
        campo_cola_de_espera_llamado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        pantalla_tickets.setColumns(20);
        pantalla_tickets.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        pantalla_tickets.setRows(5);
        pantalla_tickets.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(boton_llamado)))
                .addContainerGap(235, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_llamado)
                .addGap(0, 133, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea pantalla_tickets;
    // End of variables declaration//GEN-END:variables
}
