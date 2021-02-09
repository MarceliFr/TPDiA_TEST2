package Frames;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertToTable extends javax.swing.JDialog {
    private final Connection connection;
    
    InsertToTable(Connection connection) {
        this.connection = connection;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        idWorkplace_workerText = new javax.swing.JTextField();
        idWorkplace_workerLabel = new javax.swing.JLabel();
        idHeadquarters_workerText = new javax.swing.JTextField();
        idHeadquarters_workerLabel = new javax.swing.JLabel();
        idManagerText = new javax.swing.JTextField();
        idManagerLabel = new javax.swing.JLabel();
        addWorkerButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        workplacesIdLabel = new javax.swing.JLabel();
        workplacesIdText = new javax.swing.JTextField();
        workplacesNameLabel = new javax.swing.JLabel();
        workplacesNameText = new javax.swing.JTextField();
        workplacesSalaryLabel = new javax.swing.JLabel();
        workplacesSalaryText = new javax.swing.JTextField();
        addWorkplaceButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        headquartersIdLabel = new javax.swing.JLabel();
        headquartersIdText = new javax.swing.JTextField();
        addHeadquartersButton = new javax.swing.JButton();
        headquartersNameLabel = new javax.swing.JLabel();
        headquartersNameText = new javax.swing.JTextField();
        headquartersAddressLabel = new javax.swing.JLabel();
        headquartersAddressText = new javax.swing.JTextField();
        headquartersCityLabel = new javax.swing.JLabel();
        headquartersCityText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodawanie wiersza do tabeli");

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idLabel.setText("ID");

        idText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        firstNameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstNameLabel.setText("First Name");

        lastNameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lastNameLabel.setText("Last Name");

        idWorkplace_workerText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idWorkplace_workerLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idWorkplace_workerLabel.setText("Id_workplace");

        idHeadquarters_workerText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idHeadquarters_workerLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idHeadquarters_workerLabel.setText("Id_headquarters");

        idManagerText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        idManagerLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        idManagerLabel.setText("Id_manager");

        addWorkerButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addWorkerButton.setText("Dodaj");
        addWorkerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addWorkerButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idManagerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idManagerText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idHeadquarters_workerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idHeadquarters_workerText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idWorkplace_workerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idWorkplace_workerText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addWorkerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idWorkplace_workerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idWorkplace_workerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idHeadquarters_workerText)
                    .addComponent(idHeadquarters_workerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idManagerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idManagerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addWorkerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("WORKERS", jPanel1);

        workplacesIdLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        workplacesIdLabel.setText("ID_WORKPLACE");

        workplacesIdText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        workplacesNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        workplacesNameLabel.setText("NAME");

        workplacesNameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        workplacesSalaryLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        workplacesSalaryLabel.setText("SALARY");

        workplacesSalaryText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        addWorkplaceButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addWorkplaceButton.setText("Dodaj");
        addWorkplaceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addWorkplaceButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addWorkplaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(workplacesSalaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workplacesNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workplacesIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(workplacesIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workplacesNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workplacesSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workplacesIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workplacesIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workplacesNameText)
                    .addComponent(workplacesNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(workplacesSalaryText)
                    .addComponent(workplacesSalaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(addWorkplaceButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("WORKPLACES", jPanel2);

        headquartersIdLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        headquartersIdLabel.setText("ID_HEADQUARTERS");

        headquartersIdText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        addHeadquartersButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addHeadquartersButton.setText("Dodaj");
        addHeadquartersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addHeadquartersButtonMouseClicked(evt);
            }
        });

        headquartersNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        headquartersNameLabel.setText("NAME");

        headquartersNameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        headquartersAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        headquartersAddressLabel.setText("ADDRESS");

        headquartersAddressText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        headquartersCityLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        headquartersCityLabel.setText("CITY");

        headquartersCityText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addHeadquartersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(headquartersNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headquartersNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(headquartersIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(headquartersIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(headquartersAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(headquartersAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(headquartersCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(headquartersCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headquartersIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headquartersNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headquartersAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(headquartersCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headquartersCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(addHeadquartersButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("HEADQUARTERS", jPanel3);

        jLabel1.setText("Wybór tabeli");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addWorkerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWorkerButtonMouseClicked
        String id = idText.getText();
        String firstName = firstNameText.getText();
        String lastName = lastNameText.getText();
        String city = idWorkplace_workerText.getText();
        String email = idHeadquarters_workerText.getText();
        String phoneNumber = idManagerText.getText();
        try (Statement statement = connection.createStatement()) {
            statement.execute("INSERT INTO WORKERS VALUES(" +id+ ", '" +firstName+ "', '" +lastName+ "', '" +city+ "', '" +email+ "', " +phoneNumber+ ");");
        } catch (SQLException ex) {
            Logger.getLogger(InsertToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_addWorkerButtonMouseClicked
    private void addWorkplaceButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWorkplaceButtonMouseClicked
        String workplaceId = workplacesIdText.getText();
        String workplaceName = workplacesNameText.getText();
        String workplaceSalary = workplacesSalaryText.getText();
        try (Statement statement = connection.createStatement()) {
            statement.execute("INSERT INTO WORKPLACES VALUES(" +workplaceId+ ", '" +workplaceName+ "', " +workplaceSalary+")");
        } catch (SQLException ex) {
            Logger.getLogger(InsertToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_addWorkplaceButtonMouseClicked
    private void addHeadquartersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHeadquartersButtonMouseClicked
        String headquartersId = headquartersIdText.getText();
        String headquartersName = headquartersNameText.getText();
        String headquartersAddress = headquartersAddressText.getText();
        String headquartersCity = headquartersCityText.getText();
        try (Statement statement = connection.createStatement()) {
            statement.execute("INSERT INTO HEADQUARTERS VALUES(" +headquartersId+ ", '" +headquartersName+ "', '"+headquartersAddress+ "', '" +headquartersCity+"')");
        } catch (SQLException ex) {
            Logger.getLogger(InsertToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_addHeadquartersButtonMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHeadquartersButton;
    private javax.swing.JButton addWorkerButton;
    private javax.swing.JButton addWorkplaceButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel headquartersAddressLabel;
    private javax.swing.JTextField headquartersAddressText;
    private javax.swing.JLabel headquartersCityLabel;
    private javax.swing.JTextField headquartersCityText;
    private javax.swing.JLabel headquartersIdLabel;
    private javax.swing.JTextField headquartersIdText;
    private javax.swing.JLabel headquartersNameLabel;
    private javax.swing.JTextField headquartersNameText;
    private javax.swing.JLabel idHeadquarters_workerLabel;
    private javax.swing.JTextField idHeadquarters_workerText;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idManagerLabel;
    private javax.swing.JTextField idManagerText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel idWorkplace_workerLabel;
    private javax.swing.JTextField idWorkplace_workerText;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel workplacesIdLabel;
    private javax.swing.JTextField workplacesIdText;
    private javax.swing.JLabel workplacesNameLabel;
    private javax.swing.JTextField workplacesNameText;
    private javax.swing.JLabel workplacesSalaryLabel;
    private javax.swing.JTextField workplacesSalaryText;
    // End of variables declaration//GEN-END:variables
}