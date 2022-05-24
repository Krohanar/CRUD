package view;

import java.awt.EventQueue;

public class main {

	public static void main(String[] args) {
		new menuPrincipal();
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						menuPrincipal frame = new menuPrincipal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

