
package adivinanumero;


public class MarcoYoAdivino extends javax.swing.JFrame {

    YoAdivino handlerYo;
    int numeroPensado;
    int numeroPersona;
    
    public MarcoYoAdivino(YoAdivino YOHandler) {
        initComponents();
        numeroPensado = YOHandler.inicializar();
        handlerYo = YOHandler;
        mensaje.setText("He pensado un numero, ingresa el que crees que es y te dire si es mayor o menor");
        System.out.println("el valor es "+numeroPensado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajaNumero = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mensaje = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cajaNumero.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cajaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroActionPerformed(evt);
            }
        });

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        mensaje.setEditable(false);
        mensaje.setColumns(1);
        mensaje.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        mensaje.setLineWrap(true);
        mensaje.setRows(3);
        mensaje.setWrapStyleWord(true);
        jScrollPane1.setViewportView(mensaje);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ingresar)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        //System.out.println("el valor es "+numeroPersona.getText());
        numeroPersona = Integer.parseInt(cajaNumero.getText());
        if((handlerYo.evaluarNumero(numeroPensado, numeroPersona) == 1))
            mensaje.setText("Equivocado, el numero es mayor");
        if((handlerYo.evaluarNumero(numeroPensado, numeroPersona) == -1))
            mensaje.setText("Equivocado, el numero es menor");
        if((handlerYo.evaluarNumero(numeroPensado, numeroPersona) == 0))
            mensaje.setText("Has adivinado el numero!");
    }//GEN-LAST:event_ingresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaNumero;
    private javax.swing.JButton ingresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mensaje;
    // End of variables declaration//GEN-END:variables
    
    

}
