
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;



public class Acceso extends javax.swing.JFrame {
    
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    SerialPortEventListener escucha = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent serialPortEvent) {
            try {
                if(Arduino.isMessageAvailable()){
                    
                    String temporal;
                    temporal=Arduino.printMessage();
                    System.out.println("recibido "+temporal);
                    if(temporal.equals("10101010")){                                  
                        Principal iniciar = new Principal();
                        iniciar.setVisible(true);
                        dispose();
                        //Salida();
                    }else{
                        Error();
                    }
                    
                }
                
            } catch (SerialPortException ex) {
                Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    };
        
    public Acceso() {
        initComponents();
        try {
            Arduino.arduinoRXTX("COM3", 9600, escucha);
        } catch (ArduinoException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Caja1 = new javax.swing.JPasswordField();
        Cuno = new javax.swing.JButton();
        Cdos = new javax.swing.JButton();
        Ctres = new javax.swing.JButton();
        Ccuatro = new javax.swing.JButton();
        Ccinco = new javax.swing.JButton();
        Cseis = new javax.swing.JButton();
        Csiete = new javax.swing.JButton();
        Cocho = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        Ccero = new javax.swing.JButton();
        Enviar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Caja1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caja1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja1ActionPerformed(evt);
            }
        });

        Cuno.setBackground(new java.awt.Color(255, 255, 255));
        Cuno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cuno.setText("1");
        Cuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CunoActionPerformed(evt);
            }
        });

        Cdos.setBackground(new java.awt.Color(51, 51, 51));
        Cdos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cdos.setForeground(new java.awt.Color(255, 255, 255));
        Cdos.setText("2");
        Cdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdosActionPerformed(evt);
            }
        });

        Ctres.setBackground(new java.awt.Color(255, 255, 255));
        Ctres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ctres.setText("3");
        Ctres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtresActionPerformed(evt);
            }
        });

        Ccuatro.setBackground(new java.awt.Color(51, 51, 51));
        Ccuatro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ccuatro.setForeground(new java.awt.Color(255, 255, 255));
        Ccuatro.setText("4");
        Ccuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcuatroActionPerformed(evt);
            }
        });

        Ccinco.setBackground(new java.awt.Color(255, 255, 255));
        Ccinco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ccinco.setText("5");
        Ccinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CcincoActionPerformed(evt);
            }
        });

        Cseis.setBackground(new java.awt.Color(51, 51, 51));
        Cseis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cseis.setForeground(new java.awt.Color(255, 255, 255));
        Cseis.setText("6");
        Cseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CseisActionPerformed(evt);
            }
        });

        Csiete.setBackground(new java.awt.Color(255, 255, 255));
        Csiete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Csiete.setText("7");
        Csiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsieteActionPerformed(evt);
            }
        });

        Cocho.setBackground(new java.awt.Color(51, 51, 51));
        Cocho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cocho.setForeground(new java.awt.Color(255, 255, 255));
        Cocho.setText("8");
        Cocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CochoActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setText("9");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        Ccero.setBackground(new java.awt.Color(51, 51, 51));
        Ccero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ccero.setForeground(new java.awt.Color(255, 255, 255));
        Ccero.setText("0");
        Ccero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CceroActionPerformed(evt);
            }
        });

        Enviar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Enviar.setText(">");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Borrar.setText("X");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Borrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ccero))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Csiete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cocho))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Ccuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ccinco))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Cuno)
                                .addGap(29, 29, 29)
                                .addComponent(Cdos)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ctres)
                            .addComponent(Cseis)
                            .addComponent(jButton18)
                            .addComponent(Enviar))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuno)
                    .addComponent(Cdos)
                    .addComponent(Ctres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ccuatro)
                    .addComponent(Ccinco)
                    .addComponent(Cseis))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Csiete)
                    .addComponent(Cocho)
                    .addComponent(jButton18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ccero)
                    .addComponent(Enviar)
                    .addComponent(Borrar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CcuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcuatroActionPerformed
        Ingresa("0");
    }//GEN-LAST:event_CcuatroActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        try {
            Arduino.sendData(Caja1.getText());
            System.out.println("enviado "+ Caja1.getText());
            Caja1.setText("");
            //Client iniciar = new Principal();
            //iniciar.setVisible(true);
            //this.dispose();
        } catch (ArduinoException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SerialPortException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void Caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja1ActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        Caja1.setText("");
    }//GEN-LAST:event_BorrarActionPerformed

    private void CunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CunoActionPerformed
        Ingresa("1");
    }//GEN-LAST:event_CunoActionPerformed

    private void CdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdosActionPerformed
        Ingresa("0");
    }//GEN-LAST:event_CdosActionPerformed

    private void CtresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtresActionPerformed
        Ingresa("1");
    }//GEN-LAST:event_CtresActionPerformed

    private void CcincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CcincoActionPerformed
        Ingresa("1");
    }//GEN-LAST:event_CcincoActionPerformed

    private void CsieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsieteActionPerformed
        Ingresa("1");
    }//GEN-LAST:event_CsieteActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Ingresa("1");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void CseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CseisActionPerformed
        Ingresa("0");
    }//GEN-LAST:event_CseisActionPerformed

    private void CochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CochoActionPerformed
        Ingresa("0");
    }//GEN-LAST:event_CochoActionPerformed

    private void CceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CceroActionPerformed
        Ingresa("0");
    }//GEN-LAST:event_CceroActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }
    public void Ingresa(String dato){
        if(Caja1.getText().isEmpty()){
            Caja1.setText(dato);
            //System.out.println(Caja1.getText());
        }else{
            String temporal=Caja1.getText();
            Caja1.setText((temporal+dato));
            //System.out.println(Caja1.getText());
        }
        
    }
    
    public void Salida(){
        this.dispose();
    }
    public void Error(){
        JOptionPane.showMessageDialog(this,"Credenciales erroneas");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JPasswordField Caja1;
    private javax.swing.JButton Ccero;
    private javax.swing.JButton Ccinco;
    private javax.swing.JButton Ccuatro;
    private javax.swing.JButton Cdos;
    private javax.swing.JButton Cocho;
    private javax.swing.JButton Cseis;
    private javax.swing.JButton Csiete;
    private javax.swing.JButton Ctres;
    private javax.swing.JButton Cuno;
    private javax.swing.JButton Enviar;
    private javax.swing.JButton jButton18;
    // End of variables declaration//GEN-END:variables




}
