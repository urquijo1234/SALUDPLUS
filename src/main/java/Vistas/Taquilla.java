package Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Cola;
import Modelo.Cola.Nodo;

public class Taquilla extends javax.swing.JFrame {

    DefaultTableModel model;
    private Cola<String> colaEspera = new Cola<>(); // Instancia de la cola de espera
    private StringBuilder colaEsperaText = new StringBuilder(); // Variable para almacenar los datos de la cola de espera

    
      
    // Método para agregar un ticket pagado a la cola de espera  (Taquilla)
    public void agregarTicketColaEspera(String identificador) {
        colaEspera.enqueue(identificador); // Agregar el identificador a la cola de espera
     
actualizarTextFieldCola();
//        // Actualizar el contenido de colaEsperaText
//        colaEsperaText.append(identificador).append("\n");
//        campo_cola_de_espera.setText(colaEsperaText.toString());
    }

    public Taquilla(DefaultTableModel model) {
        initComponents();
        this.model = model;
        tabla_taquilla.setModel(model);

   
        
    }
   
    // Restaurar el contenido de la cola de espera cuando vuelves al frame
    public void restaurarContenidoCola(String contenido) {
       campo_cola_de_espera.setText(contenido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_lobby = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campo_ticket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_taquilla = new javax.swing.JTable();
        boton_pago = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_cola_de_espera = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MODULO DE TAQUILLA DE PAGOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("SALUDPLUS");

        boton_lobby.setText("VOLVER AL LOBBY");
        boton_lobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_lobbyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(boton_lobby)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_lobby)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Ingrese el identificador de su cita");

        campo_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_ticketActionPerformed(evt);
            }
        });

        tabla_taquilla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_taquilla.setEnabled(false);
        jScrollPane1.setViewportView(tabla_taquilla);

        boton_pago.setBackground(new java.awt.Color(153, 255, 51));
        boton_pago.setText("PAGAR");
        boton_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pagoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("COLA DE ESPERA");

        campo_cola_de_espera.setEditable(false);
        campo_cola_de_espera.setBackground(new java.awt.Color(255, 255, 255));
        campo_cola_de_espera.setColumns(20);
        campo_cola_de_espera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campo_cola_de_espera.setRows(5);
        campo_cola_de_espera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campo_cola_de_espera.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campo_cola_de_espera.setEnabled(false);
        jScrollPane2.setViewportView(campo_cola_de_espera);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campo_ticket))
                        .addGap(118, 118, 118)
                        .addComponent(boton_pago)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(87, 87, 87))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_pago))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_ticketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_ticketActionPerformed

    private void boton_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pagoActionPerformed
       boolean todosPagados = true;
    // Verificar si todos los tickets están pagados
    for (int i = 0; i < tabla_taquilla.getRowCount(); i++) {
        Object estadoObject = tabla_taquilla.getValueAt(i, 6); // Suponiendo que la columna 6 contiene el estado de los tickets
        String estado = estadoObject != null ? estadoObject.toString() : "";
        if (!estado.equals("Pago")) {
            todosPagados = false;
            break;
        }
    }

    // Si todos los tickets están pagados, agregarlos a la cola de espera
    if (todosPagados) {
        for (int i = 0; i < tabla_taquilla.getRowCount(); i++) {
            Object ticketObject = tabla_taquilla.getValueAt(i, 5); // Obtener el objeto en la celda
            String ticket = ticketObject != null ? ticketObject.toString() : ""; // Convertir a String
            agregarTicketColaEspera(ticket);
        }
        JOptionPane.showMessageDialog(this, "Todos los tickets están pagados. Se agregaron a la cola de espera.");
    } else {
        // Obtener el identificador ingresado por el usuario
        String identificador = campo_ticket.getText();

        // Buscar el identificador en la tabla del Frame2
        for (int i = 0; i < tabla_taquilla.getRowCount(); i++) {
            Object ticketObject = tabla_taquilla.getValueAt(i, 5); // Obtener el objeto en la celda
            String ticket = ticketObject != null ? ticketObject.toString() : ""; // Convertir a String
            if (ticket.equals(identificador)) {
                // Verificar si la cita es de tipo examen
                Object motivoObject = tabla_taquilla.getValueAt(i, 3); // Suponiendo que la columna 3 contiene el motivo de la cita
                String motivo = motivoObject != null ? motivoObject.toString() : "";
                if (motivo.equalsIgnoreCase("Examen")) {
                    JOptionPane.showMessageDialog(this, "Esta cita es de tipo examen. Debe pasar por el módulo de registro de órdenes.");
                    return;
                }
                // Verificar si el ticket ya está marcado como "Pago"
                Object estadoObject = tabla_taquilla.getValueAt(i, 6); // Suponiendo que la columna 6 contiene el estado de los tickets
                String estado = estadoObject != null ? estadoObject.toString() : "";
                if (!estado.equals("Pago")) {
                    // Cambiar el estado del ticket a "Pago" Y el costo a 0 puesto que ya está pagado
                    tabla_taquilla.setValueAt(0, i, 4);
                    tabla_taquilla.setValueAt("Pago", i, 6);
                    model.fireTableDataChanged();
                    agregarTicketColaEspera(identificador);
                } else {
                    JOptionPane.showMessageDialog(this, "El ticket ya está marcado como 'Pago'", "Error", JOptionPane.ERROR_MESSAGE);
                }
                return; // Terminar la búsqueda una vez que se encuentre el ticket
            }
        }
        // Mostrar un mensaje si no se encuentra el ticket
        JOptionPane.showMessageDialog(this, "Ticket no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    }
        


//// Obtener el identificador ingresado por el usuario
//    String identificador = campo_ticket.getText();
//
//    // Buscar el identificador en la tabla del Frame2
//    for (int i = 0; i < tabla_taquilla.getRowCount(); i++) {
//        Object ticketObject = tabla_taquilla.getValueAt(i, 5); // Obtener el objeto en la celda
//        String ticket = ticketObject != null ? ticketObject.toString() : ""; // Convertir a String
//        if (ticket.equals(identificador)) {
//            // Verificar si el ticket ya está marcado como "Pago"
//            Object estadoObject = tabla_taquilla.getValueAt(i, 6); // Suponiendo que la columna 6 contiene el estado de los tickets
//            String estado = estadoObject != null ? estadoObject.toString() : "";
//            if (!estado.equals("Pago")) {
//                // Cambiar el estado del ticket a "Pago" Y el costo a 0 puesto que ya está pagado
//                tabla_taquilla.setValueAt(0, i, 4);
//                tabla_taquilla.setValueAt("Pago", i, 6);
//                model.fireTableDataChanged();
//
//                agregarTicketColaEspera(identificador);
//               
//            } else {
//                JOptionPane.showMessageDialog(this, "El ticket ya está marcado como 'Pago'", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//            return; // Terminar la búsqueda una vez que se encuentre el ticket
//        }
//    }
//    // Mostrar un mensaje si no se encuentra el ticket
//    JOptionPane.showMessageDialog(this, "Ticket no encontrado", "Error", JOptionPane.ERROR_MESSAGE);


    }//GEN-LAST:event_boton_pagoActionPerformed
    public void actualizarTextFieldCola() {
        StringBuilder colaStringBuilder = new StringBuilder();
        Nodo<String> temp = colaEspera.getCabeza(); // Obtener la cabeza de la cola
        while (temp != null) {
            colaStringBuilder.append(temp.getValor()).append("\n"); // Agregar el valor del nodo actual
            temp = temp.getSiguiente(); // Avanzar al siguiente nodo
        }
        campo_cola_de_espera.setText(colaStringBuilder.toString() + "\n"); // Establecer el texto en el JTextField
    }


    private void boton_lobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_lobbyActionPerformed
// Verificar si todos los tickets han sido procesados
    boolean todosProcesados = true;
    for (int i = 0; i < tabla_taquilla.getRowCount(); i++) {
        Object estadoObject = tabla_taquilla.getValueAt(i, 6); // Obtener el estado del ticket
        String estado = estadoObject != null ? estadoObject.toString() : "";
        Object motivoObject = tabla_taquilla.getValueAt(i, 3); // Obtener el motivo del ticket
        String motivo = motivoObject != null ? motivoObject.toString() : "";
        if (!estado.equals("Pago") && !motivo.equals("Examen")) {
            todosProcesados = false;
            break;
        }
    }

    // Si hay algún ticket pendiente de procesar, mostrar un mensaje de error
    if (!todosProcesados) {
        JOptionPane.showMessageDialog(this, "Aún hay citas pendientes de procesar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Si todos los tickets han sido procesados, volver al lobby
    Lobby lobby = new Lobby();
    lobby.agregarContenidoColaEspera(campo_cola_de_espera.getText()); // Establecer el contenido del JTextArea en Lobby
    JOptionPane.showMessageDialog(this, "Volviendo al lobby");

    lobby.setContenidoColaEspera(campo_cola_de_espera.getText());
    
    colaEsperaText = new StringBuilder(campo_cola_de_espera.getText());
    
    DefaultTableModel taquillaModel = (DefaultTableModel) tabla_taquilla.getModel();
    DefaultTableModel lobbyModel = lobby.obtenerTabla();
    lobbyModel.setRowCount(0); // Limpiar los datos existentes en la tabla del Lobby
    for (int i = 0; i < taquillaModel.getRowCount(); i++) {
        Object[] rowData = new Object[taquillaModel.getColumnCount()];
        for (int j = 0; j < taquillaModel.getColumnCount(); j++) {
            rowData[j] = taquillaModel.getValueAt(i, j);
        }
        lobbyModel.addRow(rowData);
    }

    colaEsperaText = new StringBuilder(campo_cola_de_espera.getText());

    this.dispose();
    lobby.setLocationRelativeTo(null);
    lobby.setVisible(true);
//        // Crear una instancia del Lobby y mostrarlo
//        Lobby lobby = new Lobby();
//    lobby.agregarContenidoColaEspera(campo_cola_de_espera.getText()); // Establecer el contenido del JTextArea en Lobby
//        JOptionPane.showMessageDialog(this, "Volviendo al lobby");
//
//        lobby.setContenidoColaEspera(campo_cola_de_espera.getText());
//        
//        colaEsperaText = new StringBuilder(campo_cola_de_espera.getText());
//        
//        // Obtener el modelo de la tabla de la taquilla
//        DefaultTableModel taquillaModel = (DefaultTableModel) tabla_taquilla.getModel();
//
//        // Establecer los datos de la tabla del Lobby con los datos de la taquilla
//        DefaultTableModel lobbyModel = lobby.obtenerTabla();
//        lobbyModel.setRowCount(0); // Limpiar los datos existentes en la tabla del Lobby
//        for (int i = 0; i < taquillaModel.getRowCount(); i++) {
//            Object[] rowData = new Object[taquillaModel.getColumnCount()];
//            for (int j = 0; j < taquillaModel.getColumnCount(); j++) {
//                rowData[j] = taquillaModel.getValueAt(i, j);
//            }
//            lobbyModel.addRow(rowData);
//        }
//
//        // Guardar el contenido actual del TextArea en la variable colaEsperaText
//        colaEsperaText = new StringBuilder(campo_cola_de_espera.getText());
//
//        this.dispose();
//        lobby.setLocationRelativeTo(null);
//        lobby.setVisible(true);
    }//GEN-LAST:event_boton_lobbyActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_lobby;
    private javax.swing.JButton boton_pago;
    private javax.swing.JTextArea campo_cola_de_espera;
    private javax.swing.JTextField campo_ticket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_taquilla;
    // End of variables declaration//GEN-END:variables
}
