package stocks4u;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *************************************************************** </h1>
 *          Stocks4U Portfolio Management System
 ***************************************************************
 * Filename: stocks4uGUI.java
 *<b>Requirements:</b>
 * Manage / Store a list of stock purchases
 * View, Add, Remove individual stocks.
 * @author  Johnny Romano
 * @version 1.0.1
 * @since   2016-09-23
 * 
 ***************************************************************
 */

public class stocks4uGUI extends javax.swing.JFrame {

    DefaultListModel listOfStock;
    ArrayList<Stock> stocks;
    
    /**
     * Creates new form Stocks4U GUI
     */
    public stocks4uGUI() {
        initComponents();                       //  instantiate:
        stocks = new ArrayList<>();             //  _ stocks array
        listOfStock = new DefaultListModel();   //  _ jListOnGUI
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListStock = new javax.swing.JList<>();
        jlblPnL = new javax.swing.JLabel();
        jbtnRemoveStock = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblStockName = new javax.swing.JLabel();
        jlblQuantity = new javax.swing.JLabel();
        jlblPurchasePrice = new javax.swing.JLabel();
        jlblCurrentPrice = new javax.swing.JLabel();
        jtxtStockName = new javax.swing.JTextField();
        jtxtStockQuantity = new javax.swing.JTextField();
        jtxtStockPurchasePrice = new javax.swing.JTextField();
        jtxtStockCurrentPrice = new javax.swing.JTextField();
        jbtnAddStock = new javax.swing.JButton();
        jlblAdded = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portfolio Management");

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jListStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListStock.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListStockValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListStock);

        jlblPnL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblPnL.setText("Gain / Loss : ");

        jbtnRemoveStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnRemoveStock.setText("Remove Stock");
        jbtnRemoveStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPnL)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jbtnRemoveStock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblPnL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnRemoveStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("List", jPanel1);

        jlblStockName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblStockName.setText("Stock Name");

        jlblQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblQuantity.setText("Quantity");

        jlblPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblPurchasePrice.setText("Purchase Price");

        jlblCurrentPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblCurrentPrice.setText("Current Price");

        jtxtStockName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxtStockQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxtStockPurchasePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jtxtStockCurrentPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jbtnAddStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnAddStock.setText("Add Stock");
        jbtnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddStockActionPerformed(evt);
            }
        });

        jlblAdded.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlblAdded.setText("  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblStockName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtStockQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jlblPurchasePrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jtxtStockPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCurrentPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblAdded, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtStockCurrentPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAddStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblStockName)
                    .addComponent(jtxtStockName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblQuantity)
                    .addComponent(jtxtStockQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlblPurchasePrice)
                    .addComponent(jtxtStockPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtStockCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCurrentPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblAdded))
                .addGap(81, 81, 81))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlblStockName, jtxtStockName});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jlblQuantity, jtxtStockQuantity});

        jTabbedPane1.addTab("Add Stock", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddStockActionPerformed
        // TODO add your handling code here:
        // textfield value !null
        if (jtxtStockName.getText().isEmpty() ||
                jtxtStockQuantity.getText().isEmpty() ||
                jtxtStockPurchasePrice.getText().isEmpty() ||
                jtxtStockCurrentPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please provide all input");
        }
        else
        {
            String stockName = jtxtStockName.getText();
            try
            {
                int stockQuantity = Integer.parseInt(jtxtStockQuantity.getText());
                float stockPurchasePrice = Float.parseFloat(jtxtStockPurchasePrice.getText());
                float stockCurrentPrice = Float.parseFloat(jtxtStockCurrentPrice.getText());
                
                //  if input value less than or equal to zero
                //  prompt user to correct
                //
                if (stockQuantity <= 0 ||
                    stockPurchasePrice <= 0 ||
                    stockCurrentPrice <= 0)
                {
                    JOptionPane.showMessageDialog(null, "Enter all VALUES > 0");
                    return;
                }
                else    // else add values to stock ArrayList
                {
                    stocks.add( new Stock(stockName, stockQuantity, stockPurchasePrice, stockCurrentPrice));
                }
                listOfStock.addElement(stockName);  // show added stock on portfolio
                jListStock.setModel(listOfStock);   // set jList default model
                jlblAdded.setText("stock: " + stockName + " added!");
            }
            catch (NumberFormatException ex)
            {
                System.out.println("error: " + ex);
                JOptionPane.showMessageDialog(null, "Replace: " + ex.getMessage() + " with number!");
                return;
            }
        }
    }//GEN-LAST:event_jbtnAddStockActionPerformed

    private void clearTextFields()
    {
        // clear the stock input textfields
        jtxtStockName.setText("");
        jtxtStockQuantity.setText("");
        jtxtStockPurchasePrice.setText("");
        jtxtStockCurrentPrice.setText("");
    }
    
    private void jListStockValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListStockValueChanged
        try 
        {
            int index = jListStock.getSelectedIndex();  // get selected list item index number
            int size = listOfStock.size();              // get size of items in listbox
            
            if (size == 0)                              // if size equals zero
            {
                jlblPnL.setText("Gain / Loss : ");      // display default label
            }
            else                                        // else list stock info
            {
                jlblPnL.setText(stocks.get(index).getLossOrGain()); // set stock info label    
            }
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Out of bounds exception");
        }
        clearTextFields();
        jlblAdded.setText("");
    }//GEN-LAST:event_jListStockValueChanged

    private void jbtnRemoveStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveStockActionPerformed
        // TODO add your handling code here:
        int index = jListStock.getSelectedIndex();      //  get selected list item index number
        stocks.remove(index);                           //  remove selected item from ArrayList
        listOfStock.remove(index);                      //  remove from ListBox
        jListStock.setSelectedIndex(index);
        jListStock.ensureIndexIsVisible(index);
    }//GEN-LAST:event_jbtnRemoveStockActionPerformed
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stocks4uGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stocks4uGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stocks4uGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stocks4uGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stocks4uGUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAddStock;
    private javax.swing.JButton jbtnRemoveStock;
    private javax.swing.JLabel jlblAdded;
    private javax.swing.JLabel jlblCurrentPrice;
    private javax.swing.JLabel jlblPnL;
    private javax.swing.JLabel jlblPurchasePrice;
    private javax.swing.JLabel jlblQuantity;
    private javax.swing.JLabel jlblStockName;
    private javax.swing.JTextField jtxtStockCurrentPrice;
    private javax.swing.JTextField jtxtStockName;
    private javax.swing.JTextField jtxtStockPurchasePrice;
    private javax.swing.JTextField jtxtStockQuantity;
    // End of variables declaration//GEN-END:variables
}
