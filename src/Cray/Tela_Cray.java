

package Cray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Tela_Cray extends javax.swing.JFrame {

    
    public Tela_Cray() {
        initComponents();

        this.setSize(800, 565);

     

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        textArea1 = new java.awt.TextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cray");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 90, 800, 10);

        textArea1.setBackground(new java.awt.Color(0, 0, 0));
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12));
        textArea1.setForeground(new java.awt.Color(0, 255, 0));
        jPanel1.add(textArea1);
        textArea1.setBounds(250, 180, 500, 200);

        jButton1.setText("qstat");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 160, 90, 23);

        jButton2.setText("apstat");
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 200, 90, 23);

        jButton3.setText("xtnodestat");
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 240, 100, 23);

        jButton4.setText("ps | modoper");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 320, 110, 23);

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(670, 440, 80, 23);

        jButton6.setText("Estatísticas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 400, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cray/logo_cptec.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 80, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cray/inpe.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(670, 10, 80, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cray/cray_logo.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 40, 160, 30);

        jButton7.setText("pbsnodes –a");
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 280, 110, 23);

        jButton8.setText("top");
        jPanel1.add(jButton8);
        jButton8.setBounds(20, 120, 90, 23);

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String command = "tasklist";
        try {
            Process pr = Runtime.getRuntime().exec(command);
            InputStream in = pr.getInputStream();
            //850 do input stream é do DOS (faz ter acento no ouptut)
            BufferedReader entrada = new BufferedReader(new InputStreamReader(in,"850"));
            String aux = null;

            while ((aux= entrada.readLine())!= null)
            {
             //char temp[] = new char[aux.length()];
             //aux.getChars(0, aux.length(), temp, 0);
               textArea1.append((aux)+"\n");
            }

        } catch (IOException ex) { System.err.println("Erro de Entrada / Saida");}





    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        textArea1.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.gc();
        System.runFinalization();
        System.gc();
        new WebBrowser().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
