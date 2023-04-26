
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class FrmInicio extends javax.swing.JFrame {

    public FrmInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CONFRIMAR = new javax.swing.JButton();
        ENTRADA = new javax.swing.JButton();
        MENSAJES = new javax.swing.JButton();
        OPCIONES = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTAREA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("CUADROS DE  DIALOGO");

        CONFRIMAR.setBackground(new java.awt.Color(51, 255, 51));
        CONFRIMAR.setText("CONFIRMAR");
        CONFRIMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFRIMARActionPerformed(evt);
            }
        });

        ENTRADA.setBackground(new java.awt.Color(255, 255, 51));
        ENTRADA.setText("ENTRADA");
        ENTRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRADAActionPerformed(evt);
            }
        });

        MENSAJES.setBackground(new java.awt.Color(255, 0, 51));
        MENSAJES.setText("MENSAJES");
        MENSAJES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENSAJESActionPerformed(evt);
            }
        });

        OPCIONES.setBackground(new java.awt.Color(0, 204, 204));
        OPCIONES.setText("OPCIONES");
        OPCIONES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OPCIONESActionPerformed(evt);
            }
        });

        TXTAREA.setBackground(new java.awt.Color(51, 255, 51));
        TXTAREA.setColumns(20);
        TXTAREA.setRows(5);
        jScrollPane1.setViewportView(TXTAREA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CONFRIMAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ENTRADA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MENSAJES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OPCIONES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CONFRIMAR)
                        .addGap(42, 42, 42)
                        .addComponent(ENTRADA)
                        .addGap(41, 41, 41)
                        .addComponent(MENSAJES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OPCIONES)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CONFRIMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFRIMARActionPerformed
      int valor;
      TXTAREA.setText("");
      valor = JOptionPane.showConfirmDialog(this, "¿confirmar movimiento?");
      TXTAREA.setText("Respuesta del movimiento: "+valor);
      valor = JOptionPane.showConfirmDialog(this, "Borrar Datos","Eliminar Informacion",JOptionPane.OK_CANCEL_OPTION);
      TXTAREA.setText(TXTAREA.getText()+ "\n Respuesta a borrar: "+valor);
      valor =JOptionPane.showConfirmDialog(this, "Autoriza de cambio","Confirmacion",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
      TXTAREA.setText(TXTAREA.getText()+"\nRespuesta de cambio: "+ valor);
      ImageIcon icono = new ImageIcon("src/home.png");
      valor = JOptionPane.showConfirmDialog(this, "Autorizacion Transferencia","confirmacion", JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,icono);
      TXTAREA.setText(TXTAREA.getText()+"\nRespuesta a Transferencia"+valor);
      
    }//GEN-LAST:event_CONFRIMARActionPerformed

    private void ENTRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRADAActionPerformed
     String respuesta;
     int edad;
     TXTAREA.setText("");
     respuesta = JOptionPane.showInputDialog("ingrese nombre: ");
     TXTAREA.setText("Nombre: "+ respuesta +"\n");
     
     respuesta = JOptionPane.showInputDialog(this, "ingrese edad: ");
     edad = Integer.parseInt(respuesta);
     TXTAREA.append("Edad: "+edad +"\n");
     
     respuesta = JOptionPane.showInputDialog("Apellido Paterno: ","Mendoza");
     TXTAREA.append("Paterno: "+ respuesta +"\n");
     
     respuesta = JOptionPane.showInputDialog(this,"Apellido Materno:", "Reyes");
     TXTAREA.append("Materno: "+ respuesta+ "\n");
     
     respuesta = JOptionPane.showInputDialog(this, "Capturar Domicilio", "Dato de Contacto", JOptionPane.INFORMATION_MESSAGE);
     TXTAREA.append("Domicilio " + respuesta + "\n");
     
     String opciones[] = {"Elige","Jalico","Sinaloa","Michoacan","Yucatan"};
     ImageIcon icono = new ImageIcon("src/home.png");
     respuesta = JOptionPane.showInputDialog(this, "Estado que colinda con Jalisco: ", "Pregunte", JOptionPane.PLAIN_MESSAGE, icono, opciones , "Elige").toString();  
     TXTAREA.append("Estados: "+ respuesta + "\n");
    }//GEN-LAST:event_ENTRADAActionPerformed

    private void MENSAJESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENSAJESActionPerformed
     TXTAREA.setText("");
     ImageIcon icono = new ImageIcon("src/home.png");
     JOptionPane.showMessageDialog(null,"Datos Capturados");
     JOptionPane.showMessageDialog(this, "Esta es una advertencia", "Informativo", JOptionPane.WARNING_MESSAGE);
     JOptionPane.showMessageDialog(this, "Credito de vivienda aprobada ","Vivienda",JOptionPane.PLAIN_MESSAGE,icono);
    }//GEN-LAST:event_MENSAJESActionPerformed

    private void OPCIONESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OPCIONESActionPerformed
    TXTAREA.setText("");
    String opciones[]={"Alfa", "Beta", "Gama", "Epsilon", "Etha", "Otra"};
    ImageIcon icono = new ImageIcon("src/home.png");
    int respuesta;
    respuesta = JOptionPane.showOptionDialog(this, "Elige una de las Letras: ", "Letras Griegas", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icono,opciones, opciones[0]);
    TXTAREA.append("opciones numericas: "+ respuesta + "\n"+"Opciones textual"+ opciones[respuesta]);
    }//GEN-LAST:event_OPCIONESActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CONFRIMAR;
    private javax.swing.JButton ENTRADA;
    private javax.swing.JButton MENSAJES;
    private javax.swing.JButton OPCIONES;
    private javax.swing.JTextArea TXTAREA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
