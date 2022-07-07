import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewJFramechatclient extends javax.swing.JFrame implements ActionListener
{
     Socket sock;
    
     PrintWriter pw;
     BufferedReader br,brn;
      
     String s;
     int n;

    public NewJFramechatclient()
    {
       
        
         try
        {
             initComponents();
             
             UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
             SwingUtilities.updateComponentTreeUI(this);
            
             setTitle("Client");
             setVisible(true);
             jta.setFocusable(false);
             jbt.addActionListener(this);
             jtf.addActionListener(this);
             jtf2.addActionListener(this);
             jtf3.addActionListener(this);
             
             
            
            
             
        }
        catch(ClassNotFoundException ex)
        {
             Logger.getLogger(NewJFramechatclient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
             Logger.getLogger(NewJFramechatclient.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(NewJFramechatclient.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(NewJFramechatclient.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    @Override
     public void actionPerformed(ActionEvent e)
      {
        
         s = jtf.getText();
         jta.append("client:"+s+"\n");
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
        jLabel1 = new javax.swing.JLabel();
        jtf3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jta.setBackground(new java.awt.Color(233, 233, 233));
        jta.setColumns(20);
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        jbt.setText("Send");
        jbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter the IP Address of Server");

        jLabel2.setText("Enter the port number");

        jbt1.setText("Connect");
        jbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtf)
                        .addGap(18, 18, 18)
                        .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtf2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActionPerformed
     if(evt.getSource()==jbt)
       {
         
                     try
                      {
                       
                       pw.println("client:"+s);
                       pw.flush(); 
                      }
                     catch(Exception ex)
                        {
                         ex.printStackTrace();
                         }
                    
                   
       }
    }//GEN-LAST:event_jbtActionPerformed

    private void jbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt1ActionPerformed
       if(evt.getSource()==jbt1)
       {
        try
            {
            String s = jtf2.getText(); 
            
            n = Integer.parseInt(jtf3.getText());   
            sock = new Socket(s,n);
            System.out.println("connection build");
                
            pw = new PrintWriter(sock.getOutputStream());
            
            brn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
    //        br = new BufferedReader(new InputStreamReader(System.in));
            
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
    }//GEN-LAST:event_jbt1ActionPerformed

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
                       // System.out.println(n);
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
       NewJFramechatclient obj =  new NewJFramechatclient();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFramechatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFramechatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFramechatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFramechatclient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt;
    private javax.swing.JButton jbt1;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField jtf;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf3;
    // End of variables declaration//GEN-END:variables
}
