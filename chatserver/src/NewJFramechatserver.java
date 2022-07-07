import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class NewJFramechatserver extends javax.swing.JFrame implements ActionListener
{
     
 
     ServerSocket sersock;
     Socket sock;
    
     PrintWriter pw;
     BufferedReader br,brn;
      
     String s;
    
    public NewJFramechatserver() throws ClassNotFoundException
    {
       
        try
        {
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             SwingUtilities.updateComponentTreeUI(this);
             
           
             initComponents();
             setTitle("Server");
             setVisible(true);
             jta.setFocusable(false);
             jbt.addActionListener(this);
             jtf.addActionListener(this);
             jtf2.setFocusable(false);
          
            
             try
            {
             
            int port = 9000;   
            String ip = InetAddress.getLocalHost().getHostAddress();
            jtf2.setText("IP Address of Server is : "+ip+" (Port : "+port+")");
            
            
            sersock = new ServerSocket(port);
            jta.setText("server started at port 9000.......\n");
            System.out.println("server started");
            
            sock = sersock.accept();
            System.out.println("connection build");
            pw = new PrintWriter(sock.getOutputStream());
            
            brn = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            
            Thread t2 = new Thread(new receiver());
            t2.start();
           
            
            pw.println("Start chatting........\n");
            
            pw.flush();
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        catch(InstantiationException ex)
        {
             Logger.getLogger(NewJFramechatserver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
             Logger.getLogger(NewJFramechatserver.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(NewJFramechatserver.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
     @Override
     public void actionPerformed(ActionEvent e)
      {
        
         s = jtf.getText();
         jta.append("Sever:"+s+"\n");
         jtf.setText(null);
         jtf.requestFocus();
        
         
    }
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jtf = new javax.swing.JTextField();
        jbt = new javax.swing.JButton();
        jtf2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jta.setBackground(new java.awt.Color(233, 233, 234));
        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        jbt.setText("Send");
        jbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActionPerformed(evt);
            }
        });

        jtf2.setBackground(new java.awt.Color(233, 233, 234));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf)
                        .addGap(18, 18, 18)
                        .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtf2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActionPerformed
         if(evt.getSource()==jbt)
       {
         
                     try
                      {
                       pw.println("Server:"+s);
                       pw.flush(); 
                      }
                     catch(Exception ex)
                        {
                         ex.printStackTrace();
                         }
                    
                   
       }
         
    }//GEN-LAST:event_jbtActionPerformed

     class receiver implements Runnable
              {
                @Override
                public void run()
                {
                    String n;
                    while(true)
                    {
                     try
                     {
                       n = brn.readLine();
                       
                       jta.append(n+"\n");
                     }
                     catch(Exception e)
                      {
                         e.printStackTrace();
                      }
                    }
                }
             }

     
    public static void main(String args[])
    
    {

        try {
           NewJFramechatserver obj = new NewJFramechatserver();
             
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
                 java.util.logging.Logger.getLogger(NewJFramechatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 java.util.logging.Logger.getLogger(NewJFramechatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 java.util.logging.Logger.getLogger(NewJFramechatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                 java.util.logging.Logger.getLogger(NewJFramechatserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             }
             //</editor-fold>

         } catch ( ClassNotFoundException ex) {
             Logger.getLogger(NewJFramechatserver.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField jtf;
    private javax.swing.JTextField jtf2;
    // End of variables declaration//GEN-END:variables
}
