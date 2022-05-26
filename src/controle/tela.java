
package controle;
import java.awt.Color;
import java.util.Calendar;
import java.text.DateFormatSymbols;
import Ncep.*;
import Cray.*;
import eta_15km.*;



public final class tela extends javax.swing.JFrame {


    public tela() {
        initComponents();
        
        this.getContentPane().setBackground(Color.white);
        this.setSize(820, 565);
        jButton17.setVisible(false);
        Calendar datahora = Calendar.getInstance();
        String diaa, mess, anoo, data_final;
        
        int dayy= datahora.get(Calendar.DAY_OF_MONTH);
        int ma = datahora.get(Calendar.MONTH);
        ma++;
        int year = datahora.get(Calendar.YEAR);
        int semm = datahora.get(Calendar.DAY_OF_WEEK);

        String[] shortWeekdays = new DateFormatSymbols().getWeekdays();
        String dia_semana = shortWeekdays[semm];

        
        if (dayy < 10){diaa = "0"+String.valueOf(dayy);}
        else {diaa = String.valueOf(dayy);}
        
        if (ma < 10){mess = "0"+String.valueOf(ma);}
        else {mess = String.valueOf(ma);}
        
        if (year < 10){anoo = "0"+String.valueOf(year);}
        else {anoo= String.valueOf(year);}
        
        data_final = dia_semana+",   "+diaa+"-"+mess+"-"+anoo;
        jLabel5.setText(data_final);



  
        iniciaRelogio();


    }
public void iniciaRelogio(){
    new Thread(){//instancia nova thread já implementando o método run()
    @Override
    public void run() {//sobrescreve o método run()

    while(true){//while para fazer o loop infinito
        
        Calendar test = Calendar.getInstance();
        String data, datah, datam, datas;
        int hora = test.get(Calendar.HOUR_OF_DAY);//pega as horas
        int minuto = test.get(Calendar.MINUTE);//pega os minutos
        int segundo = test.get(Calendar.SECOND);//pega os segundos

        if (hora < 10){datah = "0"+String.valueOf(hora);}
        else {datah = String.valueOf(hora);}
        if (minuto < 10){datam = "0"+String.valueOf(minuto);}
        else {datam = String.valueOf(minuto);}
        if (segundo < 10){datas = "0"+String.valueOf(segundo);}
        else {datas = String.valueOf(segundo);}

        data = datah+":"+datam+":"+datas;
        jLabel4.setText(data);

      try{
           sleep(1000);//faz a thread entrar em estado de espera por 1 segundo
        }catch(Exception e){}
     }
   }
  }.start();//inicia a thread.
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jButton12 = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cyborg");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(418, 700));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 92, 820, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/logo_cptec.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(33, 11, 80, 63);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/inpe.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(700, 11, 80, 63);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Controle");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 30, 412, 22);

        jButton1.setText("NCEP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(294, 292, 98, 59);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(108, 313, 190, 10);

        jButton2.setText("Ens_T126");
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 290, 90, 40);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(50, 220, 15, 70);

        jButton3.setText("Ens_ETA");
        jPanel1.add(jButton3);
        jButton3.setBounds(23, 183, 100, 34);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(50, 330, 15, 80);

        jButton4.setText("Eta_15km");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(23, 412, 100, 42);

        jButton5.setText("Nordeste");
        jPanel1.add(jButton5);
        jButton5.setBounds(120, 530, 90, 36);

        jButton6.setText("Serra Mar");
        jPanel1.add(jButton6);
        jButton6.setBounds(120, 640, 93, 38);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(45, 450, 10, 210);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(50, 548, 70, 11);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(46, 660, 80, 10);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(350, 353, 11, 70);

        jButton7.setText("T213");
        jPanel1.add(jButton7);
        jButton7.setBounds(314, 426, 67, 37);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(300, 170, 15, 120);

        jButton8.setText("WWatch");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(240, 130, 90, 40);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(377, 176, 15, 120);

        jButton9.setText("T299");
        jPanel1.add(jButton9);
        jButton9.setBounds(350, 130, 65, 40);

        jSeparator11.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(388, 341, 200, 10);

        jButton10.setText("Umidade");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(590, 320, 90, 34);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(350, 540, 110, 10);

        jButton11.setText("BRAMS_CATT");
        jPanel1.add(jButton11);
        jButton11.setBounds(460, 520, 120, 43);

        jSeparator13.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(346, 460, 10, 210);

        jSeparator14.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(350, 670, 100, 10);

        jButton12.setText("BRAMS_20km");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(450, 650, 115, 32);

        jSeparator15.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(390, 300, 60, 10);

        jSeparator16.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(451, 212, 11, 90);

        jSeparator17.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator17);
        jSeparator17.setBounds(451, 214, 100, 10);

        jSeparator18.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator18);
        jSeparator18.setBounds(581, 218, 100, 10);

        jButton13.setText("GPSAS");
        jPanel1.add(jButton13);
        jButton13.setBounds(681, 199, 80, 43);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/banco2.JPG"))); // NOI18N
        jPanel1.add(jButton14);
        jButton14.setBounds(553, 199, 33, 46);

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/btn_atualizar.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(740, 110, 39, 25);

        jButton16.setBackground(new java.awt.Color(0, 0, 255));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("CRAY");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(600, 430, 70, 23);

        jButton17.setText("jButton17");
        jPanel1.add(jButton17);
        jButton17.setBounds(170, 360, 40, 23);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(560, 110, 60, 20);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 170, 14);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
      
       new tela_ncep().setVisible(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        new Tela_Cray().setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new tela_eta_15().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        System.gc();
        System.runFinalization();
        System.gc();

        Color verde = new Color(0,255,0);
        Color amarelo = new Color(255,255,0);
        Color padrao = new Color(0,0,0);
        padrao = jButton17.getBackground();

        jButton13.setBackground(verde);
        jButton1.setBackground(verde);
      //  jButton1.setForeground(verde);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed



        
    }//GEN-LAST:event_jButton8ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

}
