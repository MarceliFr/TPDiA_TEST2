package Frames;

import background.CasheQuerryResult;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.io.File;
import java.io.FileNotFoundException;

import java.sql.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TPDiA_TEST2 extends javax.swing.JFrame {
    private static LoadingCache<String, CasheQuerryResult> resultCashe;
    public static Connection connection;
    
    public TPDiA_TEST2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        readFromFileButton = new javax.swing.JButton();
        insertToTableButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultText = new javax.swing.JTextArea();
        createStatementButton = new javax.swing.JButton();
        connectLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        connectToBaseMenuItem = new javax.swing.JMenuItem();
        disconnectMenuItem = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TPDiA Projekt Test");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        resultLabel.setText("Wynik zapytania");

        readFromFileButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        readFromFileButton.setText("Wczytaj z pliku");
        readFromFileButton.setEnabled(false);
        readFromFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readFromFileButtonMouseClicked(evt);
            }
        });

        insertToTableButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        insertToTableButton.setText("Dodaj wiersz");
        insertToTableButton.setEnabled(false);
        insertToTableButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertToTableButtonMouseClicked(evt);
            }
        });

        resultText.setColumns(20);
        resultText.setRows(5);
        resultText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        resultText.setDoubleBuffered(true);
        resultText.setEnabled(false);
        jScrollPane2.setViewportView(resultText);

        createStatementButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        createStatementButton.setText("Utwórz zapytanie");
        createStatementButton.setEnabled(false);
        createStatementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createStatementButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insertToTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createStatementButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(readFromFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertToTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createStatementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readFromFileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );

        connectLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        connectLabel.setText("Nie połączono z bazą");

        jMenu1.setText("File");

        jMenuItem4.setText("Zamknij");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Baza");

        connectToBaseMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        connectToBaseMenuItem.setText("Połącz z bazą");
        connectToBaseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectToBaseMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(connectToBaseMenuItem);

        disconnectMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        disconnectMenuItem.setText("Rozłącz");
        disconnectMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(disconnectMenuItem);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Przełącz bazę");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(connectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(connectLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            closeDataBase();
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing
    private void readFromFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readFromFileButtonMouseClicked
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter(".txt", "txt");
        jfc.addChoosableFileFilter(fnef);
        jfc.setFileFilter(fnef);
        jfc.showOpenDialog(null);
        jfc.setName("Odczyt zapytań z pliku tekstowego");
        if(jfc.getSelectedFile() != null){
            try {
                File readFile = jfc.getSelectedFile();
                Scanner myReader = new Scanner(readFile);
                String stmt = null;
                while (myReader.hasNextLine()) {
                    stmt = myReader.nextLine();
                    execute(stmt);
                }
                System.out.println(stmt);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_readFromFileButtonMouseClicked
    private void insertToTableButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertToTableButtonMouseClicked
        InsertToTable insertToTable = null;
        if(insertToTable == null){
            insertToTable = new InsertToTable(connection);
            insertToTable.setVisible(true);
        }
    }//GEN-LAST:event_insertToTableButtonMouseClicked
    private void createStatementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createStatementButtonMouseClicked
        TestPanel testPanel = new TestPanel();
        Object[] buttons = {"Execute", "Cancel"};
        
        int result = JOptionPane.showOptionDialog(null, testPanel, "Enter a Number", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
        if(result == 0){
            String querry = testPanel.getQuwrry();
            if("SELECT".equals(querry.split(" ", 0)[0].toUpperCase())){
                execute(querry);
            }else{
                try (Statement stmt = connection.createStatement()) {
                    stmt.executeUpdate(querry);
                } catch (SQLException ex) {
                    Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_createStatementButtonMouseClicked
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            closeDataBase();
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void connectToBaseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectToBaseMenuItemActionPerformed
        openDataBase();
    }//GEN-LAST:event_connectToBaseMenuItemActionPerformed
    private void disconnectMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectMenuItemActionPerformed
        try {
            closeDataBase();
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_disconnectMenuItemActionPerformed
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            closeDataBase();
            openDataBase();
        } catch (SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    public static void main(String args[]) throws SQLException, InterruptedException {
        java.awt.EventQueue.invokeLater(() -> {
            new TPDiA_TEST2().setVisible(true);
        });
        cashe();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connectLabel;
    private javax.swing.JMenuItem connectToBaseMenuItem;
    private javax.swing.JButton createStatementButton;
    private javax.swing.JMenuItem disconnectMenuItem;
    private javax.swing.JButton insertToTableButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton readFromFileButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextArea resultText;
    // End of variables declaration//GEN-END:variables
    public void openDataBase(){
        String path;
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter(".db", "db");
        jfc.addChoosableFileFilter(fnef);
        jfc.setFileFilter(fnef);
        jfc.showOpenDialog(null);
        jfc.setName("Znajdowanie bazy danych");
        if(jfc.getSelectedFile() != null){
            path = jfc.getSelectedFile().getAbsolutePath();
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:" + path);
                connection.setAutoCommit(false);
                connectLabel.setText("połączona z bazą: " + connection.getMetaData().getDatabaseProductName());
                insertToTableButton.setEnabled(true);
                createStatementButton.setEnabled(true);
                readFromFileButton.setEnabled(true);
            } catch ( SQLException | ClassNotFoundException e ) {
                Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    private void closeDataBase() throws SQLException {
        if(connection!=null && !connection.isClosed()){
            connection.close();
            connection = null;
        }
        insertToTableButton.setEnabled(false);
        createStatementButton.setEnabled(false);
        readFromFileButton.setEnabled(false);
        resultText.setText("");
        resultCashe.cleanUp();
        connectLabel.setText("nie połączono z bazą");
    }
    public void saveResult(String querry) throws SQLException {
        ArrayList<ArrayList<Object>> resultList;
        try (PreparedStatement stmt = connection.prepareStatement(querry); ResultSet resultSet = stmt.executeQuery()) {
            ResultSetMetaData md = resultSet.getMetaData();
            int columns = md.getColumnCount();
            resultList = new ArrayList<>();
            ArrayList<Object> indexes = new ArrayList<>(columns);
            for(int i=1;i<=resultSet.getMetaData().getColumnCount();i++){
                indexes.add(resultSet.getMetaData().getColumnName(i));
            }
            resultList.add(indexes);
            while (resultSet.next()) {
                ArrayList<Object> row = new ArrayList<>(columns);
                for (int i = 1; i <= columns; ++i) {
                    row.add(resultSet.getObject(i));
                }
                resultList.add(row);
            }
        }
        CasheQuerryResult casheQuerryResult = new CasheQuerryResult(resultList);
        resultCashe.put(querry, casheQuerryResult);
    }
    private void readResult(String querry) throws ExecutionException {
        resultText.setText("");
        CasheQuerryResult fromCashe = resultCashe.get(querry);
        ArrayList<ArrayList<Object>> toRead = fromCashe.getResultList();
        for (int i=0;i<toRead.size();i++){
            for (Object get : toRead.get(i)) {
                resultText.append(get + "\t");
            }
            resultText.append("\n");
        }
        System.out.println(resultCashe.size());
    }
    private static void cashe() throws InterruptedException{
        resultCashe = CacheBuilder.newBuilder()
            .maximumSize(20)
            .expireAfterAccess(5, TimeUnit.MINUTES)
            .build(new CacheLoader<String, CasheQuerryResult>() {
            
            @Override
            public CasheQuerryResult load(String querry) throws Exception {
                return resultCashe.get(querry);
            } 
        });
    }
    private void execute(String querry) {
        try {
            if(resultCashe.getIfPresent(querry) != null){
                System.out.println("Z cashe");
                readResult(querry);
            }else{
                saveResult(querry);
                readResult(querry);
            }
        } catch (ExecutionException | SQLException ex) {
            Logger.getLogger(TPDiA_TEST2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}