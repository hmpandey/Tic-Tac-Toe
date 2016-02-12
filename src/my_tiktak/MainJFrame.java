/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_tiktak;

import javax.swing.JOptionPane;

/**
 *
 * @author chuchaa
 */
public class MainJFrame extends javax.swing.JFrame {
    static int val[]=new int[10];
    static int j=0;

    /**
     * Creates new form NewJFrame2
     */
    public MainJFrame() {
        initComponents();
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        
    }
    public void finally_call()
    {
     jButton10.setVisible(true);
     jButton11.setVisible(true);   
    }
public void action(int i)
{
 if(val[i]==0)
 {
  chance(i);   
 }
 else
 {
     JOptionPane.showMessageDialog(this,"PAGAL HO GYE HO BHAI");
 }
}


public void result()
{
    System.out.println(j);
    {
 if((val[1]==1&&val[2]==1&&val[3]==1)||(val[4]==1&&val[5]==1&&val[6]==1)||(val[7]==1&&val[8]==1&&val[9]==1)||(val[1]==1&&val[4]==1&&val[7]==1)||(val[2]==1&&val[5]==1&&val[8]==1)||(val[3]==1&&val[6]==1&&val[9]==1)||(val[1]==1&&val[5]==1&&val[9]==1)||(val[3]==1&&val[5]==1&&val[7]==1))
  {
      jLabel1.setText("DON'T LOSE HOPE BELIEVE IN YOURSELF");
      jLabel2.setText("YOU LOST");
      finally_call();
  }
  
 else if((val[1]==-1&&val[2]==-1&&val[3]==-1)||(val[4]==-1&&val[5]==-1&&val[6]==-1)||(val[7]==-1&&val[8]==-1&&val[9]==-1)||(val[1]==-1&&val[4]==-1&&val[7]==-1)||(val[2]==-1&&val[5]==-1&&val[8]==-1)||(val[3]==-1&&val[6]==-1&&val[9]==-1)||(val[1]==-1&&val[5]==-1&&val[9]==-1)||(val[3]==-1&&val[5]==-1&&val[7]==-1))
  {
      jLabel1.setText("TRUTH AND TRUST MAKE PERSON HAPPY AND SUCCESSFULL");
      jLabel2.setText("YOU WIN");
      finally_call();
  }
else if(j==9)
    {
    jLabel1.setText(" MUKABLA TAKKAR KA!!! best luck next time");
    jLabel2.setText("DRAW!!!");
    finally_call();
    }
   }
}

public  void chance(int i)
{
    if(j%2==0)
  {
        if(i==1)
        {
         MainJFrame.jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==2)
        {
         MainJFrame.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==3)
        {
         MainJFrame.jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==4)
        {
         MainJFrame.jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==5)
        {
         MainJFrame.jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==6)
        {
         MainJFrame.jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==7)
        {
         MainJFrame.jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==8)
        {
         MainJFrame.jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }
        if(i==9)
        {
         MainJFrame.jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/user.png")));    
        }

  jLabel1.setText("NOW PANDEY's TURN");
  jLabel2.setText("");
  val[i]=-1;
  j++;
  result();
  }
  else
  {
           if(i==1)
          {
           MainJFrame.jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==2)
          {
           MainJFrame.jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==3)
          {
           MainJFrame.jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==4)
          {
           MainJFrame.jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==5)
          {
           MainJFrame.jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==6)
          {
           MainJFrame.jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==7)
          {
           MainJFrame.jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==8)
          {
           MainJFrame.jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
          if(i==9)
          {
           MainJFrame.jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiktak_pack/harimohan.png")));    
          }
   
jLabel1.setText("ITS YOUR CHANCE " + WelcomeJframe.username);
  jLabel2.setText("");
  val[i]=1;  
  j++;
  result();
  }
  
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setForeground(new java.awt.Color(255, 51, 0));
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 51, 0));
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 0));
        jButton6.setForeground(new java.awt.Color(255, 51, 0));
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setForeground(new java.awt.Color(255, 51, 0));
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 51, 0));
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 153, 0));
        jButton9.setForeground(new java.awt.Color(255, 51, 0));
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 153, 0));
        jButton8.setForeground(new java.awt.Color(255, 51, 0));
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 153, 0));
        jButton7.setForeground(new java.awt.Color(255, 51, 0));
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 5));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 0));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Hi  "+ my_tiktak.WelcomeJframe.username+ " first is your turn!!! START NOW ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL THE BEST");
        jLabel2.setOpaque(true);

        jButton10.setBackground(new java.awt.Color(204, 255, 0));
        jButton10.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jButton10.setForeground(new java.awt.Color(204, 0, 51));
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 255, 51));
        jButton11.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 102));
        jButton11.setText("RETRY");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(28, 28, 28)
                        .add(jButton9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 12, Short.MAX_VALUE)
                        .add(jButton11)
                        .add(18, 18, 18)
                        .add(jButton10))
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButton8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jButton9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jButton7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(53, 53, 53))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton11)
                            .add(jButton10))
                        .add(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    action(1);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     action(4);    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    action(7);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      action(2);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    action(3);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       action(5);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    action(6);     // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      action(8);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      action(9);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
for(int i=0;i<10;i++)
{
}
}
    MainJFrame.j=0;
        this.dispose();
new WelcomeJframe().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private static javax.swing.JButton jButton5;
    private static javax.swing.JButton jButton6;
    private static javax.swing.JButton jButton7;
    private static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
