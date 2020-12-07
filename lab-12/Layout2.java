public class Layout2 extends javax.swing.JFrame {

	public Layout2() {
		initComponents();
	}
	
	private void initComponents() {
		jPanel2 = new javax.swing.JPanel();
		p1 = new javax.swing.JPanel();

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		p2 = new javax.swing.JPanel();
		
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		
		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 500, Short.MAX_VALUE)
		);

		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 490, Short.MAX_VALUE)
		);
				
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setSize(new java.awt.Dimension(500, 500));

		jButton1.setText("jButton1");
		p1.add(jButton1);
		jButton2.setText("jButton2");
		p1.add(jButton2);
		jButton3.setText("jButton3");
		p1.add(jButton3);
		getContentPane().add(p1, java.awt.BorderLayout.NORTH);
		jButton4.setText("jButton4");
		p2.add(jButton4);
		jButton5.setText("jButton5");
		p2.add(jButton5);
		jButton6.setText("jButton6");
		p2.add(jButton6);
		
		getContentPane().add(p2, java.awt.BorderLayout.SOUTH);
		setBounds(0, 0, 414, 111);
	
	}
			
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info :javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Layout2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Layout2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Layout2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Layout2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Layout2().setVisible(true);
			}
		});
	
	}
	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel p1;
	private javax.swing.JPanel p2;
			
}