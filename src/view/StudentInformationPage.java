/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import controller.StudentInformationController;
import model.Course;

/**
 *
 * @author chizhang
 */
public class StudentInformationPage extends javax.swing.JFrame {

	//fields
	private int courseID;
	private Object[][] studentTableMatrix;
	private String[] studentTableCols;
	
	//controller
	StudentInformationController studentInformationController;
    /**
     * Creates new form StudentInformationPage
     */
    public StudentInformationPage() {
        initComponents();
        
    }
    
    public StudentInformationPage(int courseId) {
    	this.courseID = courseId;
    	this.studentInformationController = new StudentInformationController(this.courseID);
    	initComponents();
    	
    }
    
    /**
     * filter rows of the student information table
     * @param query 
     */
    private void filter(String query) {
        RowSorter<? extends TableModel> rs = StudentInfoTable.getRowSorter();
        if (rs == null) {
        	StudentInfoTable.setAutoCreateRowSorter(true);
            rs = StudentInfoTable.getRowSorter();
        }
        TableRowSorter<? extends TableModel> rowSorter =
                (rs instanceof TableRowSorter) ? (TableRowSorter<? extends TableModel>) rs : null;

        if (rowSorter == null) {
            throw new RuntimeException("Cannot find appropriate rowSorter: " + rs);
        }
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" +query));
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
        mainPanel = new javax.swing.JPanel();
        mainTableScrollPane = new javax.swing.JScrollPane();
        StudentInfoTable = new javax.swing.JTable();
        saveBt = new javax.swing.JButton();
        cancelBt = new javax.swing.JButton();
        createStudentBt = new javax.swing.JButton();
        searchStudentjLabel = new javax.swing.JLabel();
        searchStudentjTextField =  new JTextField();
        deleteStudentjLabel2 = new javax.swing.JLabel();
        deleteStudentjTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(25, 118, 210));

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Student Information");

        //TODO: update course name 
        Course course = this.studentInformationController.getCourse(this.courseID);
        couseNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        couseNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        couseNameLabel.setText(course.getCourseName());

        //TODO: update semester name
        semesterLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        semesterLabel.setForeground(new java.awt.Color(255, 255, 255));
        semesterLabel.setText(course.getCourseSemester());

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(semesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(couseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        mainPanel.setBackground(new java.awt.Color(255, 252, 252));
        mainPanel.setPreferredSize(new java.awt.Dimension(770, 496));

        mainTableScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        mainTableScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        StudentInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(123), "Chi", null, null},
                { new Integer(456), "John", null, null},
                { new Integer(789), "Abhi", null, null},
                { new Integer(111), "Yang", null, null},
                { new Integer(3333), "Claire", null, null},
                { new Integer(222), "Terry", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Student Email", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentInfoTable.setRowHeight(35);
        StudentInfoTable.setColumnSelectionAllowed(true);
        StudentInfoTable.getTableHeader().setReorderingAllowed(false);
        mainTableScrollPane.setViewportView(StudentInfoTable);
        StudentInfoTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (StudentInfoTable.getColumnModel().getColumnCount() > 0) {
            StudentInfoTable.getColumnModel().getColumn(0).setResizable(false);
        }

        saveBt.setBackground(new java.awt.Color(255, 255, 255));
        saveBt.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        saveBt.setForeground(new java.awt.Color(25, 118, 210));
        saveBt.setText("Save");
        saveBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtActionPerformed(evt);
            }
        });

        cancelBt.setBackground(new java.awt.Color(255, 255, 255));
        cancelBt.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        cancelBt.setForeground(new java.awt.Color(25, 118, 210));
        cancelBt.setText("Cancel");
        cancelBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtActionPerformed(evt);
            }
        });

        createStudentBt.setBackground(new java.awt.Color(255, 255, 255));
        createStudentBt.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        createStudentBt.setForeground(new java.awt.Color(0, 153, 0));
        createStudentBt.setText("Create Student");
        createStudentBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentBtActionPerformed(evt);
            }
        });

        searchStudentjLabel.setText("Search Student:");

        searchStudentjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentjTextFieldActionPerformed(evt);
            }
        });
        searchStudentjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchStudentjTextFieldKeyReleased(evt);
            }
        });

        deleteStudentjLabel2.setForeground(new java.awt.Color(204, 0, 0));
        deleteStudentjLabel2.setText("Delete Student:");

        deleteStudentjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentjTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(mainTableScrollPane))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(createStudentBt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelBt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(searchStudentjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchStudentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246)
                                .addComponent(deleteStudentjLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteStudentjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchStudentjLabel)
                    .addComponent(searchStudentjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteStudentjLabel2)
                    .addComponent(deleteStudentjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createStudentBt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtActionPerformed
        // jump back to the course selection page, 
        // TODO: save the note in the database
    	HomePage homePage = new HomePage(this.courseID);
        homePage.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        homePage.setLocationRelativeTo( null ); // set the previous window location
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_saveBtActionPerformed

    private void cancelBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtActionPerformed
        // jump back to the course selection page, without saving anything
        HomePage homePage = new HomePage(this.courseID);
        homePage.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        homePage.setLocationRelativeTo( null ); // set the previous window location
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBtActionPerformed

    private void createStudentBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createStudentBtActionPerformed

    private void searchStudentjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchStudentjTextFieldActionPerformed

    private void deleteStudentjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteStudentjTextField1ActionPerformed

    private void searchStudentjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchStudentjTextFieldKeyReleased
        
        System.out.println(this.searchStudentjTextField.getText().toLowerCase());
        // filter rows 
    	this.filter(this.searchStudentjTextField.getText().toLowerCase());
    }//GEN-LAST:event_searchStudentjTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(StudentInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInformationPage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentInfoTable;
    private javax.swing.JButton cancelBt;
    private javax.swing.JLabel couseNameLabel;
    private javax.swing.JButton createStudentBt;
    private javax.swing.JLabel deleteStudentjLabel2;
    private javax.swing.JTextField deleteStudentjTextField1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainTableScrollPane;
    private javax.swing.JButton saveBt;
    private javax.swing.JLabel searchStudentjLabel;
    private javax.swing.JTextField searchStudentjTextField;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
