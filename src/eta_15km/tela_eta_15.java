

package eta_15km;

import java.awt.Color;
import java.awt.Font;
import java.awt.Paint;
import java.util.Calendar;


public class tela_eta_15 extends javax.swing.JFrame {

   
    public tela_eta_15() {
        initComponents();

        this.setSize(800, 565);
       jButton1.setVisible(false);
       textArea1.setEditable(false);
       jTextPane1.setEditable(false);
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
        textArea1 = new java.awt.TextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Eta_ams15km");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        textArea1.setBackground(new java.awt.Color(0, 0, 0));
        textArea1.setFont(new java.awt.Font("Dialog", 1, 12));
        textArea1.setForeground(new java.awt.Color(0, 255, 0));
        jPanel1.add(textArea1);
        textArea1.setBounds(20, 280, 430, 210);

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 80, 790, 10);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton2.setText("Pre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 110, 60, 21);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton3.setText("Fct");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 140, 60, 21);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton4.setText("Produtos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 200, 80, 21);

        jTextPane1.setBackground(new java.awt.Color(236, 233, 216));
        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTextPane1.setForeground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(460, 160, 320, 330);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10));
        jButton5.setText("Pos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 170, 60, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eta_15km/logo_cptec.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 80, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eta_15km/inpe.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(680, 10, 80, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("ETA ams_15km ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 30, 170, 30);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eta_15km/btn_atualizar.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(730, 100, 40, 25);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 90, 30, 10);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 110, 60, 20);

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//BOTAO  FCT
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      textArea1.setText(null);
     jTextPane1.setText(null);
        String quebra_linha = "\n=============================";
        String pre = "Responsável pela integração do modelo Eta.\n";
        String texxt = "\nDiretórios de Entrada:\n";
        String dir_entrada = "\n$WORK_HOME/Eta/ams_15km/$data/datarun/\n";
        String text_arq = "\nArquivos de Entrada:\n";
        String arq_entrada = "\ninit.file\nbndy.newstyle\nbndy.file\ncnst.file\n";
        String textsai = "\nDiretórios de saida:\n";
        String dir_saida = "\n$WORK_HOME/Eta/ams_15km/$data/datarun/\n";
        String arqsaitex = "\nArquivos de saida:\n";
        String arq_saida = "\nrestarts*.t00s";
        String pre_final;
        pre_final = pre + quebra_linha + texxt + dir_entrada + quebra_linha +
             text_arq + arq_entrada + quebra_linha + textsai + dir_saida + quebra_linha +
               arqsaitex + arq_saida ;
        jTextPane1.setText(pre_final);
           String pontinho = "............................................."
                   + "..........................................";

        textArea1.append("Arquivos de entrada"+pontinho+"OK\n\n");
        textArea1.append("Arquivos de saida"+pontinho+"....OK\n\n");
        textArea1.append("Fct.......................OK");
        Color verde = new Color(51,255,51);
       jButton3.setBackground(verde);

    }//GEN-LAST:event_jButton3ActionPerformed


    //BOTAO  Limpar
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     textArea1.setText(null);
     jTextPane1.setText(null);
     Color padrao = new Color(0,0,0);
        padrao = jButton1.getBackground();
        jButton2.setBackground(padrao);
        jButton3.setBackground(padrao);
        jButton4.setBackground(padrao);
        jButton5.setBackground(padrao);
        

    }//GEN-LAST:event_jButton6ActionPerformed


    //BOTAO   PRE
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


          textArea1.setText(null);
     jTextPane1.setText(null);
        String quebra_linha = "\n=============================";
        String pre = "Responsável pela geração das condições iniciais e contornos "
                + "laterais.\n";
        String texxt = "\nDiretórios de Entrada:\n";
        String dir_entrada = "\n$WORK_HOME/MCGA/poseta/dataout/poseta/dataout/TQ0213L042/$data/"
                              +"\n\n$SUBMIT_HOME/MCGA/pre/datain/\n";
        String text_arq = "\nArquivos de Entrada:\n";
        String arq_entrada = "\nGPOSETA*E.fct. TQ0213L042\n\nSST\n";
        String textsai = "\nDiretórios de saida:\n";
        String dir_saida = "\n$WORK_HOME/Eta/ams_15km/$data/datarun/\n";
        String arqsaitex = "\nArquivos de saida:\n";
        String arq_saida = "\ninit.file\nbndy.newstyle\nbndy.file\ncnst.file";
        String pre_final;
        pre_final = pre + quebra_linha + texxt + dir_entrada + quebra_linha +
             text_arq + arq_entrada + quebra_linha + textsai + dir_saida + quebra_linha +
               arqsaitex + arq_saida ;
        jTextPane1.setText(pre_final);
           String pontinho = "............................................."
                   + "..........................................";
           
        textArea1.append("Arquivos de entrada"+pontinho+"OK\n\n");
        textArea1.append("Arquivos de saida"+pontinho+"....OK\n\n");
        textArea1.append("Pre.......................OK");
        Color verde = new Color(51,255,51);
       jButton2.setBackground(verde);

    }//GEN-LAST:event_jButton2ActionPerformed

    
    //BOTAO  POS
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      textArea1.setText(null);
     jTextPane1.setText(null);
        String quebra_linha = "\n=============================";
        String pre = "Task responsável pela conversão dos dados da grade nativa do Eta.\n";
        String texxt = "\nDiretórios de Entrada:\n";
        String dir_entrada = "\n$WORK_HOME/Eta/ams_15km/$data/datarun/\n\n"
                + "$WORK_HOME/Eta/ams_15km/$data/binctl/\n";
        String text_arq = "\nArquivos de Entrada:\n";
        String arq_entrada = "\nrestarts*\nLATLON*\n*.bin\nprof_c1\n";
        String textsai = "\nDiretórios de saida:\n";
        String dir_saida = "\n${ARCHIVE_PNT}/Eta/ams_15km/YYYYMM/DDHH/\n";
        String arqsaitex = "\nArquivos de saida:\n";
        String arq_saida = "\ngrbctl\nprof_hst";
        String pre_final;
        pre_final = pre + quebra_linha + texxt + dir_entrada + quebra_linha +
             text_arq + arq_entrada + quebra_linha + textsai + dir_saida + quebra_linha +
               arqsaitex + arq_saida ;
        jTextPane1.setText(pre_final);
           String pontinho = "............................................."
                   + "..........................................";

        textArea1.append("Arquivos de entrada"+pontinho+"OK\n\n");
        textArea1.append("Arquivos de saida"+pontinho+"....OK\n\n");
        textArea1.append("Pós .....................OK");
        Color verde = new Color(51,255,51);
       jButton5.setBackground(verde);
    }//GEN-LAST:event_jButton5ActionPerformed

    //BOTAO  Produtos
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        textArea1.setText(null);
        jTextPane1.setText(null);
        String quebra_linha = "\n=============================";
        String pre = "Tarefa onde são gerados diversos produtos.\n";
        String texxt = "\nDiretórios de Entrada:\n";
        String dir_entrada = "\n$WORK_HOME/Eta/ams_15km/$data/grbctl/\n\n"
                + "$WORK_HOME/Eta/ams_15km/$data/binctl/\n";
        String text_arq = "\nArquivos de Entrada:\n";
        String arq_entrada = "\n*.grb\n*.bin\n";
        String textsai = "\nDiretórios de saida:\n";
        String dir_saida = "\n$WORK_HOME/Eta/ams_15km/$data/produtos/recortes/\n\n"
                + "$WORK_HOME/Eta/ams_15km/$data/produtos/sismaden/\n\n"
                + " $WORK_HOME/Eta/ams_15km/$data/produtos/sisalert/\n\n"
                + "$WORK_HOME/Eta/ams_15km/$data/produtos/ons/\n\n"
                + "$WORK_HOME/Eta/ams_15km/$data/produtos/fig_meteograma/\n";
        String arqsaitex = "\nArquivos de saida:\n";
        String arq_saida = "\nsup_eta*\nPrec15km*\neta*txt\n"
                + "vento_tramandai*txt\n*.png\n";
        String pre_final;
        pre_final = pre + quebra_linha + texxt + dir_entrada + quebra_linha +
             text_arq + arq_entrada + quebra_linha + textsai + dir_saida + quebra_linha +
               arqsaitex + arq_saida ;
        jTextPane1.setText(pre_final);
           String pontinho = "............................................."
                   + "..........................................";

        textArea1.append("Arquivos de entrada"+pontinho+"OK\n\n");

        textArea1.append("Produtos:\n\n");
        textArea1.append("Recortes"+pontinho+"OK\n");
        textArea1.append("SISMADEN"+pontinho+"OK\n");
        textArea1.append("SISALERT"+pontinho+"OK\n");
        textArea1.append("NOS"+pontinho+"OK\n");
        textArea1.append("METEOGRAMAS"+pontinho+"OK\n");



        Color verde = new Color(51,255,51);
       jButton4.setBackground(verde);
    }//GEN-LAST:event_jButton4ActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_eta_15().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
