/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinanumero;

/**
 *
 * @author Magnus
 */
public class MarcoInicial extends javax.swing.JFrame {

    private PcAdivina PCHandler;
    private YoAdivino YOHandler;

    
    public MarcoInicial(PcAdivina handlerPC, YoAdivino handlerYO) {
        PCHandler = handlerPC;
        YOHandler = handlerYO;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonYoAdv = new javax.swing.JButton();
        botonPcAdv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonYoAdv.setText("Yo Adivino");
        botonYoAdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYoAdvActionPerformed(evt);
            }
        });

        botonPcAdv.setText("Pc Adivina");
        botonPcAdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPcAdvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonPcAdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonYoAdv, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(botonYoAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(botonPcAdv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonYoAdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYoAdvActionPerformed
       MarcoYoAdivino marcoYo = new MarcoYoAdivino(YOHandler);
       marcoYo.setVisible(true);
    }//GEN-LAST:event_botonYoAdvActionPerformed

    private void botonPcAdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPcAdvActionPerformed
        MarcoPcAdivina marcoPc = new MarcoPcAdivina(PCHandler);
        marcoPc.setVisible(true);
        
    }//GEN-LAST:event_botonPcAdvActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPcAdv;
    private javax.swing.JButton botonYoAdv;
    // End of variables declaration//GEN-END:variables
}
