/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author chizhang
 */
public class CourseWorkSummaryPage extends javax.swing.JFrame {

	//fields
	private int courseID;
    /**
     * Creates new form CourseWorkSummaryPage
     */
    public CourseWorkSummaryPage() {
        initComponents();
    }
    
    /**
     * constructor takes in the course Id
     * @param courseId
     */
    public CourseWorkSummaryPage(int courseId) {
    	this.courseID = courseId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        couseNameLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        mainPanel2 = new javax.swing.JPanel();
        moreActionLabel = new javax.swing.JLabel();
        moreActionsPanel = new javax.swing.JPanel();
        editScoresBt = new javax.swing.JButton();
        lockScoresBt = new javax.swing.JButton();
        cancelBt = new javax.swing.JButton();
        saveBt = new javax.swing.JButton();
        categorySummaryLabel = new javax.swing.JLabel();
        mainTableScrollPane = new javax.swing.JScrollPane();
        mainSummaryTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(25, 118, 210));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Dashboard");

        couseNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        couseNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        couseNameLabel.setText("Course Name");

        semesterLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        semesterLabel.setForeground(new java.awt.Color(255, 255, 255));
        semesterLabel.setText("Semester");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(semesterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(couseNameLabel))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainPanel2.setBackground(new java.awt.Color(255, 252, 252));
        mainPanel2.setPreferredSize(new java.awt.Dimension(770, 496));

        moreActionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        moreActionLabel.setForeground(new java.awt.Color(25, 118, 210));
        moreActionLabel.setText("More Actions");

        editScoresBt.setBackground(new java.awt.Color(255, 255, 255));
        editScoresBt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        editScoresBt.setForeground(new java.awt.Color(25, 118, 210));
        editScoresBt.setText("Edit Scores");
        editScoresBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editScoresBtActionPerformed(evt);
            }
        });

        lockScoresBt.setBackground(new java.awt.Color(255, 255, 255));
        lockScoresBt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lockScoresBt.setForeground(new java.awt.Color(25, 118, 210));
        lockScoresBt.setText("Lock Scores");
        lockScoresBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockScoresBtActionPerformed(evt);
            }
        });

        cancelBt.setBackground(new java.awt.Color(255, 255, 255));
        cancelBt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cancelBt.setForeground(new java.awt.Color(25, 118, 210));
        cancelBt.setText("Cancel");
        cancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtActionPerformed(evt);
            }
        });

        saveBt.setBackground(new java.awt.Color(255, 255, 255));
        saveBt.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        saveBt.setForeground(new java.awt.Color(25, 118, 210));
        saveBt.setText("Save");
        saveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout moreActionsPanelLayout = new javax.swing.GroupLayout(moreActionsPanel);
        moreActionsPanel.setLayout(moreActionsPanelLayout);
        moreActionsPanelLayout.setHorizontalGroup(
            moreActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreActionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(moreActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editScoresBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lockScoresBt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(cancelBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        moreActionsPanelLayout.setVerticalGroup(
            moreActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreActionsPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(editScoresBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lockScoresBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        categorySummaryLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        categorySummaryLabel.setForeground(new java.awt.Color(25, 118, 210));
        categorySummaryLabel.setText("XXX summay  ");

        mainTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        mainTableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        mainSummaryTable.setModel(this.defaultTable );
        mainSummaryTable.setColumnSelectionAllowed(true);
        mainSummaryTable.getTableHeader().setReorderingAllowed(false);
        mainTableScrollPane.setViewportView(mainSummaryTable);
        mainSummaryTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        mainSummaryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainSummaryTableMousePressed(evt);
            }
        });
        // check if there is any updates 
        mainSummaryTable.getModel().addTableModelListener(new TableModelListener() {

        	public void tableChanged(TableModelEvent e) {
        	    int firstRow = e.getFirstRow();
        	    int lastRow = e.getLastRow();
        	    int index = e.getColumn();

        	    switch (e.getType()) {
        	    case TableModelEvent.INSERT:
        	      for (int i = firstRow; i <= lastRow; i++) {
        	        System.out.println(i);
        	      }
        	      break;
        	    case TableModelEvent.UPDATE:
        	      if (firstRow == TableModelEvent.HEADER_ROW) {
        	        if (index == TableModelEvent.ALL_COLUMNS) {
        	          System.out.println("A column was added");
        	        } else {
        	          System.out.println(index + "in header changed");
        	        }
        	      } else {
        	        for (int i = firstRow; i <= lastRow; i++) {
        	          if (index == TableModelEvent.ALL_COLUMNS) {
        	            System.out.println("All columns have changed");
        	          } else {
        	        	System.out.println("row: "+ i);
        	            System.out.println("column: "+index);
        	            
        	          }
        	        }
        	      }
        	      break;
        	    case TableModelEvent.DELETE:
        	      for (int i = firstRow; i <= lastRow; i++) {
        	        System.out.println(i);
        	      }
        	      break;
        	    }
        	  }
          }); // end addTableModelListener
        
        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addComponent(categorySummaryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addComponent(mainTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(moreActionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moreActionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moreActionLabel)
                    .addComponent(categorySummaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(moreActionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editScoresBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editScoresBtActionPerformed
        // TODO: make all score columns editable
        System.out.println("clicked edit");
        
        this.defaultTable = new javax.swing.table.DefaultTableModel(this.rowData, columnNames) {
        	boolean[] canEdit = new boolean [] {
                    true, false, false, false, false, true
                };
        	public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit [columnIndex];
            }
        	
        };

        mainSummaryTable.setModel(this.defaultTable); // end of set DefaultTableModel

        ((AbstractTableModel) mainSummaryTable.getModel()).fireTableStructureChanged();


    }//GEN-LAST:event_editScoresBtActionPerformed

    private void lockScoresBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockScoresBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lockScoresBtActionPerformed

    private void cancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtActionPerformed

    private void saveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtActionPerformed
    private void editScoresBtMouseClicked(java.awt.event.MouseEvent evt) {                                          
    	
    }
    private void mainSummaryTableMousePressed(java.awt.event.MouseEvent evt) {                                              
        // TODO add your handling code here: read edit cells
//    	JTable table = (JTable) evt.getSource();
//    	int row = table.getSelectedRow();
//        int col = table.getSelectedColumn();
//        System.out.println(mainSummaryTable.getValueAt(row, col));
//        // update table val
//        //this.defaultTable.setValueAt(mainSummaryTable.getValueAt(row, col), row, col);
//        this.rowData[row][col] = mainSummaryTable.getValueAt(row, col);
        
    }
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
            java.util.logging.Logger.getLogger(CourseWorkSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseWorkSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseWorkSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseWorkSummaryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseWorkSummaryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBt;
    private javax.swing.JLabel categorySummaryLabel;
    private javax.swing.JLabel couseNameLabel;
    private javax.swing.JButton editScoresBt;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton lockScoresBt;
    private javax.swing.JPanel mainPanel2;
    private javax.swing.JTable mainSummaryTable;
    private javax.swing.JScrollPane mainTableScrollPane;
    private javax.swing.JLabel moreActionLabel;
    private javax.swing.JPanel moreActionsPanel;
    private javax.swing.JButton saveBt;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
    private Object[][] rowData = new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
    };
    private Object[] columnNames = new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
        };
    private javax.swing.table.DefaultTableModel defaultTable = new javax.swing.table.DefaultTableModel(this.rowData, columnNames){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit [columnIndex];
            }
        };
}
