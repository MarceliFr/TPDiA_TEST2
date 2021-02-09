package Frames;

public class TestPanel extends javax.swing.JPanel {
    public String querry;
    
    public TestPanel() {
        initComponents();
    }

    public TestPanel(String querry) {
        this.querry = querry;
        initComponents();
    }
    public String getQuwrry(){
        return statementText.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        statementText = new javax.swing.JTextArea();
        cleanButton = new javax.swing.JButton();

        statementText.setColumns(20);
        statementText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        statementText.setRows(5);
        jScrollPane1.setViewportView(statementText);

        cleanButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cleanButton.setText("Wyczyść");
        cleanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 320, Short.MAX_VALUE)
                        .addComponent(cleanButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cleanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cleanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanButtonMouseClicked
        statementText.setText("");
    }//GEN-LAST:event_cleanButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea statementText;
    // End of variables declaration//GEN-END:variables
}
