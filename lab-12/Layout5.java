import java.awt.Color;
import java.awt.Graphics;

public class Layout5 extends javax.swing.JFrame {

	public Layout5() {
		initComponents();
	}
	
	private void initComponents() {
		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				formMouseDragged(evt);
			}
		});
		
		jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 10));
		
		jButton1.setText("jButton1");
		jPanel1.add(jButton1);
		jButton2.setText("jButton2");
		jPanel1.add(jButton2);
		jButton3.setText("jButton3");
		jPanel1.add(jButton3);
		jButton4.setText("jButton4");
		jPanel1.add(jButton4);
		jButton5.setText("jButton5");
		jPanel1.add(jButton5);
		jButton6.setText("jButton6");
		jPanel1.add(jButton6);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461,javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
			)
		);
		
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79,javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(210, Short.MAX_VALUE)
			)
		);
		
		pack();
	
	}
	
	private void formMouseDragged(java.awt.event.MouseEvent evt) {
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.fillOval(evt.getX(), evt.getY(), 5, 5);
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
			java.util.logging.Logger.getLogger(Layout5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Layout5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Layout5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Layout5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Layout5().setVisible(true);
			}
		});
	}
	
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JPanel jPanel1; 
}