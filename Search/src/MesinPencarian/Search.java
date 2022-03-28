package MesinPencarian;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Search extends javax.swing.JFrame {
public Statement st;
public ResultSet rs;
public DefaultListModel model = new DefaultListModel();
public DefaultListModel model1 = new DefaultListModel();
public  DefaultListModel model2 = new DefaultListModel();

    

public Search() {
    initComponents();
    Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
    int x = layar.width / 2  - this.getSize().width / 2;
    int y = layar.height / 2 - this.getSize().height / 2;

    this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UAS Automata");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 0, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel1.setText("Masukkan Karakter");

        jTextField1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(204, 204, 255));
        jTextField1.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jTextField1.setSelectionColor(new java.awt.Color(204, 204, 255));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setText("Kata Dasar");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel3.setText("Kalimat ");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setText("Informasi");

        jList2.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jList2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jList2.setSelectionForeground(new java.awt.Color(204, 255, 255));
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jList3.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList3.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jList3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jList3);

        jLabel5.setFont(new java.awt.Font("Colonna MT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Gugel");
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 111, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
  
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    model.removeAllElements();
      model1.removeAllElements();
        model2.removeAllElements();
        try {
            java.sql.Connection conn = (java.sql.Connection)MesinPencarian.koneksi.koneksiDB();   
            st = conn.createStatement();
      
            String cr = jTextField1.getText();
            rs = st.executeQuery("SELECT * FROM kata WHERE kata like '"+ cr +"%' ORDER BY kata ASC");
                while (rs.next()){
                    String itemCode = rs.getString("kata");
                    byte[] itemCode1 = rs.getBytes("gambar");
                 //get the element in column "item_code"
                    model.addElement(new ImgsNText(itemCode, new ImageIcon((new ImageIcon(itemCode1).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)))));
  
                    jList1.setCellRenderer(new Renderer());
                    jList1.setModel(model);
                }
                if(jTextField1.getText().equals("")){
                    model.removeAllElements();
                    model1.removeAllElements();
                    model2.removeAllElements();
                }

        } catch (SQLException e) {
        }                                          
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
  // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
  // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked


    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
    model1.removeAllElements();
    model2.removeAllElements();
    try { // hapus data
        java.sql.Connection conn = (java.sql.Connection)MesinPencarian.koneksi.koneksiDB();
     
        String sql = "SELECT * FROM kalimat WHERE kalimat like'"+String.valueOf(jList1.getSelectedValue())+" %'ORDER BY kalimat ASC";
        st = conn.createStatement();
        rs = st.executeQuery(sql);
            while (rs.next()){
                String itemCode = rs.getString("kalimat");
                byte[] itemCode1 = rs.getBytes("gambar");
                //get the element in column "item_code"
                model1.addElement(new ImgsNText(itemCode, new ImageIcon((new ImageIcon(itemCode1).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)))));
 
                jList2.setCellRenderer(new Renderer());
                jList2.setModel(model1);     
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }        
// TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
    model2.removeAllElements();
    try { // hapus data
    String sql = "SELECT * FROM kalimat WHERE kalimat ='"+String.valueOf(jList2.getSelectedValue())+"'";
    java.sql.Connection conn = (java.sql.Connection)MesinPencarian.koneksi.koneksiDB();
    st = conn.createStatement();
    rs = st.executeQuery(sql);
        while (rs.next()){
            String itemCode = rs.getString("informasi"); 
            byte[] itemCode1 = rs.getBytes("gambar");
            model2.addElement(new ImgsNText(itemCode, new ImageIcon((new ImageIcon(itemCode1).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)))));
  
            jList3.setCellRenderer(new Renderer());
            jList3.setModel(model2);      
            }
        } catch (SQLException e) {
        }                
    }//GEN-LAST:event_jList2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(() -> {
             new Search().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
