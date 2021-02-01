package Frames;

import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TPDiA_TEST2 extends javax.swing.JFrame {
    public static final String dbFilePath = "C:/testDB/test.db";
    public static Connection connection;
    
    public TPDiA_TEST2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        insertToTableButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TPDiA Projekt Test");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        resultLabel.setText("Wynik zapytania");

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchButton.setText("Szukaj");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        insertToTableButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        insertToTableButton.setText("Dodaj wiersz");
        insertToTableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertToTableButtonMouseClicked(evt);
            }
        });

        resultText.setColumns(20);
        resultText.setRows(5);
        jScrollPane2.setViewportView(resultText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insertToTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(insertToTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Baza");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            if(!connection.isClosed()){
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing
    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        try {                                          
            String sql = "SELECT * FROM WORKERS";
            
            Statement stmt = connection.createStatement();
            try (ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()){
                    resultText.append(rs.getInt("ID") +  "\t" +
                            rs.getString("FIRST_NAME") + "\t" +
                            rs.getString("LAST_NAME") + "\t" +
                            rs.getString("CITY") + "\t" +
                            rs.getString("EMAIL") + "\t" +
                            rs.getInt("PHONE_NUMBER"));
                    resultText.append("\n");
                }
            } catch (SQLException ex) {
                Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchButtonMouseClicked
    private void insertToTableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertToTableButtonMouseClicked
        new InsertToTable(connection).setVisible(true);
    }//GEN-LAST:event_insertToTableButtonMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TPDiA_TEST2().setVisible(true);
        });
        connection = openDataBase(dbFilePath);
    }
    public static Connection openDataBase(String dbFilePath){
        connection = null;
        try {
            if(isDataBase(dbFilePath)){
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:" + dbFilePath);
                System.out.println("Opened database successfully");
            }else{
                System.out.println("Baza nie istnieje");
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public static boolean isDataBase(String dbFilePath){
        File dbFile = new File(dbFilePath);
        return dbFile.exists();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertToTableButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextArea resultText;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
