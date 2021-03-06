
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Principal extends javax.swing.JFrame implements Runnable {
    public String Mensaje;
    public String Usuario;

    public Principal() {
        initComponents();
        Thread hilo =new Thread(this);
        
        hilo.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        Caja1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Caja2 = new javax.swing.JTextArea();
        Direccion = new javax.swing.JTextField();
        Eenviar = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Descifrar = new javax.swing.JButton();
        Entrada = new javax.swing.JTextField();
        Llave11 = new javax.swing.JTextField();
        Llave22 = new javax.swing.JTextField();
        Llave1 = new javax.swing.JLabel();
        Llave2 = new javax.swing.JLabel();
        EtiNick1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ip");

        Enviar.setText("Envia");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        Caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caja1ActionPerformed(evt);
            }
        });

        Caja2.setColumns(20);
        Caja2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Caja2.setRows(5);
        jScrollPane1.setViewportView(Caja2);

        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        Eenviar.setText("Enviar");

        Nombre.setEnabled(false);
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Descifrar.setText("Descifrar");
        Descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifrarActionPerformed(evt);
            }
        });

        Entrada.setEnabled(false);

        Llave11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Llave11ActionPerformed(evt);
            }
        });

        Llave22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Llave22ActionPerformed(evt);
            }
        });

        Llave1.setText("Llave 1");

        Llave2.setText("Llave 2");

        EtiNick1.setText("Nick");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Descifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Entrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Eenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(EtiNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Llave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Llave11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Llave2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Llave22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Llave11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Llave22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Llave1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Llave2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiNick1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Eenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Descifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed

        String prueba = Caja1.getText();

        
        String relleno1 = Llave11.getText();
        String relleno2 = Llave22.getText();
        for (int x=0; relleno1.length()<prueba.length() ; x++){
            relleno1+=Llave11.getText();
        }
        for (int x=0; relleno2.length()<prueba.length() ; x++){
            relleno2+=Llave22.getText();
        }

      
        char[] cadena= textoBinario(prueba).toCharArray();
        char[] first = textoBinario(relleno1).toCharArray();
        char[] second= textoBinario(relleno2).toCharArray();

        String resultado1="";
        for (int x=0; x<cadena.length ; x++){
            if(cadena[x]==' ' || first[x]== ' ')
                resultado1+=" ";
            else
                resultado1+=(filtroUno(cadena[x],first[x] ));
        }
        
        char[] filtrado= resultado1.toCharArray();
        
     
        String resultado2="";
        for (int x=0; x<filtrado.length ; x++){
            if(filtrado[x]==' ' || second[x]== ' ')
                resultado2+=" ";
            else
                resultado2+=(filtroUno(filtrado[x],second[x] ));
        }

        
        
        Socket socket;
        try {

            socket = new Socket("10.0.2.5",9999);
            Paquete datos = new Paquete();
            
           
            datos.setIp(Direccion.getText());
            datos.setNombre(Nombre.getText());
            datos.setMensaje(resultado2);
            //datos.setMensaje(fin);
            
            ObjectOutputStream envia=new ObjectOutputStream(socket.getOutputStream());
            envia.writeObject(datos);
            socket.close();
            Caja2.append("Yo: "+Caja1.getText()+"\n");
            Caja1.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
           

       
    }//GEN-LAST:event_EnviarActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void Caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caja1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caja1ActionPerformed

    private void DescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifrarActionPerformed
        Caja2.append(this.Usuario+": "+Descifrar(Mensaje, Llave11.getText(), Llave22.getText())+"\n");
        Entrada.setText(" ");
    }//GEN-LAST:event_DescifrarActionPerformed

    private void Llave11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Llave11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Llave11ActionPerformed

    private void Llave22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Llave22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Llave22ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Caja1;
    private javax.swing.JTextArea Caja2;
    private javax.swing.JButton Descifrar;
    private javax.swing.JTextField Direccion;
    private javax.swing.JLabel Eenviar;
    private javax.swing.JTextField Entrada;
    private javax.swing.JButton Enviar;
    private javax.swing.JLabel EtiNick1;
    private javax.swing.JLabel Llave1;
    private javax.swing.JTextField Llave11;
    private javax.swing.JLabel Llave2;
    private javax.swing.JTextField Llave22;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        String nombre=JOptionPane.showInputDialog("Prop. Tu nombre");
        
        Nombre.setText(nombre);
           
        try {
            
            ServerSocket servidor = new ServerSocket(9090);
            Socket cliente;
            Paquete llega;
            
            while(true){
                cliente=servidor.accept();
                ObjectInputStream entrada =new ObjectInputStream(cliente.getInputStream());
                llega=(Paquete) entrada.readObject();
                this.Usuario=llega.getNombre();
                this.Mensaje=llega.getMensaje();
                Entrada.setText(" ");
                
                /*empieza
                String relleno1 = Llave11.getText();
                String relleno2 = Llave22.getText();
                for (int x=0; relleno1.length()<llega.getMensaje().length() ; x++){
                    relleno1+=Llave11.getText();
                }
                for (int x=0; relleno2.length()<llega.getMensaje().length() ; x++){
                    relleno2+=Llave22.getText();
                 }

                char[] first = textoBinario(relleno1).toCharArray();
                char[] second= textoBinario(relleno2).toCharArray();
                
                char[] intro= llega.getMensaje().toCharArray();
                String entra2=""; 

                for (int x=0; x<intro.length ; x++){
                    if(intro[x]==' ' || second[x]== ' ')
                        entra2+=" ";
                    else
                        entra2+=(filtrodos(intro[x],second[x] ));
                }

                char[] filtrado2= entra2.toCharArray();

                String entra1="";
                for (int x=0; x<filtrado2.length ; x++){
                    if(filtrado2[x]==' ' || second[x]== ' ')
                        entra1+=" ";
                    else
                        entra1+=(filtrodos(filtrado2[x],first[x] ));
                }
                String fin2=binarioTexto(entra1);
                System.out.println(fin2);
                seccion*/
                Entrada.setText(llega.getMensaje());
                Caja2.append(llega.getNombre()+": "+llega.getMensaje()+"\n");
                
            }
            
            
            
            
        } catch (Exception e) {
        }
        
 
    }
    
    
    
    
    public static String Descifrar(String llega, String Llave11, String Llave22){

        String relleno1 = Llave11;
        String relleno2 = Llave22;
        for (int x=0; relleno1.length()<llega.length() ; x++){
            relleno1+=Llave11;
        }
        for (int x=0; relleno2.length()<llega.length() ; x++){
            relleno2+=Llave22;
         }

        char[] first = textoBinario(relleno1).toCharArray();
        char[] second= textoBinario(relleno2).toCharArray();
        char[] intro= llega.toCharArray();
        
        String entra2=""; 

        for (int x=0; x<intro.length ; x++){
            if(intro[x]==' ' || second[x]== ' ')
                entra2+=" ";
            else
                entra2+=(filtrodos(intro[x],second[x] ));
        }

        char[] filtrado2= entra2.toCharArray();

        String entra1="";
        for (int x=0; x<filtrado2.length ; x++){
            if(filtrado2[x]==' ' || second[x]== ' ')
                entra1+=" ";
            else
                entra1+=(filtrodos(filtrado2[x],first[x] ));
        }
        String fin2=binarioTexto(entra1);
        //System.out.println(fin2);
        return fin2;
    }
    
    
    
    public static char filtroUno(char a, char b){
        char resp=' ';
        if (a != b)
            resp='1';
        else
            resp='0';
        return resp;
    }
    
    public static char filtrodos(char a, char b){
        char resp=' ';
        if (a == b)
            resp='1';
        else
            resp='0';
        
        return resp;
    }
    

    public static String binarioTexto(String bin){
        String binario = bin.trim().replaceAll(" ", "");
        String frase = "";

        for (int i = 0; i < binario.length(); i += 8) {
            String cadenaSeparada = binario.substring(i, i + 8);
            int decimal = Integer.parseInt(cadenaSeparada, 2);
            frase = frase + (char) decimal;
        }
        return frase;
    }
    
    
    public static String textoBinario(String origen){
        String texto = origen;
        String codigoBinario = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            int aux = Binario((int) (letra)).length();
            for (int j = 0; j < 8; j++) {
                if (aux < 8) {
                    codigoBinario = codigoBinario + "0";
                    aux++;
                }
            }
            codigoBinario = codigoBinario + Binario((int) (letra)) + " ";
        }
        return codigoBinario;
    }
    
        
        
    public static String Binario(int Decimal) {
        int R, x = 0;
        String Binario = "";
        R = Decimal % 2;
        if (R == 1) {
            while (Decimal > 1) {
                Decimal /= 2;
                x = Decimal % 2;
                Binario = String.valueOf(x + Binario);
            }
        } else {
            while (Decimal > 0) {
                Decimal /= 2;
                x = Decimal % 2;
                Binario = String.valueOf(x + Binario);
            }
        }
        return String.valueOf(Binario + x);
    }
}



class Paquete implements Serializable{
    private String mensaje, ip, nombre;



    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}