/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.LopsinhhoatController;

/**
 *
 * @author Admin
 */
public class Bangdiemlopsinhhoat extends javax.swing.JPanel {

    /**
     * Creates new form Bangdiemlopsinhhoat
     */
//    public String selection;
    public Bangdiemlopsinhhoat() {
        initComponents();
    }
    public Bangdiemlopsinhhoat(String selection){
        initComponents();
        LopsinhhoatController controller=new LopsinhhoatController(this.jtableView,selection);
        controller.setEvent();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableView = new javax.swing.JTable();

        jtableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lớp", "Tên môn", "Điểm quá trình", "Điểm giữa kì", "Điểm thực hành", "Điểm cuối kì"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableView);
        if (jtableView.getColumnModel().getColumnCount() > 0) {
            jtableView.getColumnModel().getColumn(0).setResizable(false);
            jtableView.getColumnModel().getColumn(1).setResizable(false);
            jtableView.getColumnModel().getColumn(2).setResizable(false);
            jtableView.getColumnModel().getColumn(3).setResizable(false);
            jtableView.getColumnModel().getColumn(4).setResizable(false);
            jtableView.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableView;
    // End of variables declaration//GEN-END:variables
}
