package gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

@SuppressWarnings("serial")
public class BoardGrid extends JPanel {

	JPanel[] squarePanels = new JPanel[40];
	JPanel[] deedPanels = new JPanel[22];

	public BoardGrid() {
		this.setBounds(0, 0, 950, 946);
		setOpaque(false);
		setLayout(null);

		initialize();

		for (int i = 0; i < deedPanels.length; i++) {
			deedPanels[i].setOpaque(false);
		}

		for (int i = 0; i < squarePanels.length; i++) {
			squarePanels[i].setOpaque(false);
		}

	}

	private void initialize() {
		JPanel panel0 = new JPanel();
		panel0.setBounds(826, 822, 123, 124);
		add(panel0);
		JPanel panel1 = new JPanel();
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/oldkentroad.png"));
			}

			public void mouseExited(MouseEvent e) {
			
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel1.setBounds(749, 852, 73, 94);
		add(panel1);
		JPanel panel2 = new JPanel();
		panel2.setBounds(671, 852, 73, 94);
		add(panel2);
		JPanel panel3 = new JPanel();
		panel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/whitechapelroad.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel3.setBounds(593, 852, 73, 94);
		add(panel3);
		JPanel panel4 = new JPanel();
		panel4.setBounds(516, 852, 73, 94);
		add(panel4);
		JPanel panel5 = new JPanel();
		panel5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/railroadcards/kingscrossstation.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel5.setBounds(439, 852, 73, 94);
		add(panel5);
		JPanel panel6 = new JPanel();
		panel6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/theangelislington.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel6.setBounds(362, 852, 73, 94);
		add(panel6);
		JPanel panel7 = new JPanel();
		panel7.setBounds(285, 852, 73, 94);
		add(panel7);
		JPanel panel8 = new JPanel();
		panel8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/eustonroad.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel8.setBounds(205, 852, 73, 94);
		add(panel8);
		JPanel panel9 = new JPanel();
		panel9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/pentonvilleroad.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel9.setBounds(128, 852, 73, 94);
		add(panel9);
		JPanel panel10 = new JPanel();
		panel10.setBounds(0, 822, 124, 124);
		add(panel10);
		JPanel panel11 = new JPanel();
		panel11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/pallmall.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel11.setBounds(0, 746, 94, 73);
		add(panel11);
		JPanel panel12 = new JPanel();
		panel12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource//utilitycards/electriccompany.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel12.setBounds(0, 669, 94, 73);
		add(panel12);
		JPanel panel13 = new JPanel();
		panel13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/whitehall.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel13.setBounds(0, 592, 94, 73);
		add(panel13);
		JPanel panel14 = new JPanel();
		panel14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/northumrldavenue.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel14.setBounds(0, 515, 94, 73);
		add(panel14);
		JPanel panel15 = new JPanel();
		panel15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/railroadcards/marylebonestation.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel15.setBounds(0, 436, 94, 73);
		add(panel15);
		JPanel panel16 = new JPanel();
		panel16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/bowstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel16.setBounds(0, 359, 94, 73);
		add(panel16);
		JPanel panel17 = new JPanel();
		panel17.setBounds(0, 282, 94, 73);
		add(panel17);
		JPanel panel18 = new JPanel();
		panel18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/marlboroughstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel18.setBounds(0, 205, 94, 73);
		add(panel18);
		JPanel panel19 = new JPanel();
		panel19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/vinestreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel19.setBounds(0, 128, 94, 73);
		add(panel19);
		JPanel panel20 = new JPanel();
		panel20.setBounds(0, 0, 124, 124);
		add(panel20);
		JPanel panel21 = new JPanel();
		panel21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/strand.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel21.setBounds(128, 0, 73, 94);
		add(panel21);
		JPanel panel22 = new JPanel();
		panel22.setBounds(205, 0, 73, 94);
		add(panel22);
		JPanel panel23 = new JPanel();
		panel23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/fleetstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel23.setBounds(284, 0, 73, 94);
		add(panel23);
		JPanel panel24 = new JPanel();
		panel24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/trafalgarsquare.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel24.setBounds(361, 0, 73, 94);
		add(panel24);
		JPanel panel25 = new JPanel();
		panel25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/railroadcards/fenchurchststation.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel25.setBounds(440, 0, 73, 94);
		add(panel25);
		JPanel panel26 = new JPanel();
		panel26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/leicestersquare.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel26.setBounds(517, 0, 73, 94);
		add(panel26);
		JPanel panel27 = new JPanel();
		panel27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/coventrystreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel27.setBounds(594, 0, 73, 94);
		add(panel27);
		JPanel panel28 = new JPanel();
		panel28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/utilitycards/waterworks.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel28.setBounds(671, 0, 73, 94);
		add(panel28);
		JPanel panel29 = new JPanel();
		panel29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/piccadilly.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel29.setBounds(748, 0, 73, 94);
		add(panel29);
		JPanel panel30 = new JPanel();
		panel30.setBounds(825, 0, 124, 124);
		add(panel30);
		JPanel panel31 = new JPanel();
		panel31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/regentstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel31.setBounds(855, 128, 94, 73);
		add(panel31);
		JPanel panel32 = new JPanel();
		panel32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/oxfordstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel32.setBounds(855, 205, 94, 73);
		add(panel32);
		JPanel panel33 = new JPanel();
		panel33.setBounds(855, 282, 94, 73);
		add(panel33);
		JPanel panel34 = new JPanel();
		panel34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/bondstreet.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel34.setBounds(855, 359, 94, 73);
		add(panel34);
		JPanel panel35 = new JPanel();
		panel35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/railroadcards/liverpoolststation.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel35.setBounds(855, 436, 94, 73);
		add(panel35);
		JPanel panel36 = new JPanel();
		panel36.setBounds(855, 515, 94, 73);
		add(panel36);
		JPanel panel37 = new JPanel();
		panel37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/parklane.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel37.setBounds(855, 592, 94, 73);
		add(panel37);
		JPanel panel38 = new JPanel();
		panel38.setBounds(855, 669, 94, 73);
		add(panel38);
		JPanel panel39 = new JPanel();
		panel39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/titledeedcards/mayfair.png"));
			}

			public void mouseExited(MouseEvent e) {
				createAndSetLabelSizedIcon(MonopolyBoard.cardInfoLabel,
						MonopolyBoard.class.getResource("/resource/placeholder.png"));
			}
		});
		panel39.setBounds(855, 746, 94, 73);
		add(panel39);

		JPanel deed0 = new JPanel();
		deed0.setBounds(749, 822, 73, 29);
		add(deed0);

		JPanel deed1 = new JPanel();
		deed1.setBounds(593, 822, 73, 29);
		add(deed1);

		JPanel deed2 = new JPanel();
		deed2.setBounds(362, 822, 73, 29);
		add(deed2);

		JPanel deed3 = new JPanel();
		deed3.setBounds(205, 822, 73, 29);
		add(deed3);

		JPanel deed4 = new JPanel();
		deed4.setBounds(128, 822, 73, 29);
		add(deed4);

		JPanel deed5 = new JPanel();
		deed5.setBounds(97, 746, 29, 73);
		add(deed5);

		JPanel deed6 = new JPanel();
		deed6.setBounds(97, 591, 29, 73);
		add(deed6);

		JPanel deed7 = new JPanel();
		deed7.setBounds(97, 514, 29, 73);
		add(deed7);

		JPanel deed8 = new JPanel();
		deed8.setBounds(97, 358, 29, 73);
		add(deed8);

		JPanel deed9 = new JPanel();
		deed9.setBounds(97, 204, 29, 73);
		add(deed9);

		JPanel deed10 = new JPanel();
		deed10.setBounds(97, 127, 29, 73);
		add(deed10);

		JPanel deed11 = new JPanel();
		deed11.setBounds(129, 95, 73, 29);
		add(deed11);

		JPanel deed12 = new JPanel();
		deed12.setBounds(284, 95, 73, 29);
		add(deed12);

		JPanel deed13 = new JPanel();
		deed13.setBounds(361, 95, 73, 29);
		add(deed13);

		JPanel deed14 = new JPanel();
		deed14.setBounds(516, 95, 73, 29);
		add(deed14);

		JPanel deed15 = new JPanel();
		deed15.setBounds(594, 95, 73, 29);
		add(deed15);

		JPanel deed16 = new JPanel();
		deed16.setBounds(748, 95, 73, 29);
		add(deed16);

		JPanel deed17 = new JPanel();
		deed17.setBounds(824, 127, 29, 73);
		add(deed17);

		JPanel deed18 = new JPanel();
		deed18.setBounds(824, 204, 29, 73);
		add(deed18);

		JPanel deed19 = new JPanel();
		deed19.setBounds(824, 358, 29, 73);
		add(deed19);

		JPanel deed20 = new JPanel();
		deed20.setBounds(824, 591, 29, 73);
		add(deed20);

		JPanel deed21 = new JPanel();
		deed21.setBounds(824, 746, 29, 73);
		add(deed21);

		squarePanels[0] = panel0;
		squarePanels[1] = panel1;
		squarePanels[2] = panel2;
		squarePanels[3] = panel3;
		squarePanels[4] = panel4;
		squarePanels[5] = panel5;
		squarePanels[6] = panel6;
		squarePanels[7] = panel7;
		squarePanels[8] = panel8;
		squarePanels[9] = panel9;
		squarePanels[10] = panel10;
		squarePanels[11] = panel11;
		squarePanels[12] = panel12;
		squarePanels[13] = panel13;
		squarePanels[14] = panel14;
		squarePanels[15] = panel15;
		squarePanels[16] = panel16;
		squarePanels[17] = panel17;
		squarePanels[18] = panel18;
		squarePanels[19] = panel19;
		squarePanels[20] = panel20;
		squarePanels[21] = panel21;
		squarePanels[22] = panel22;
		squarePanels[23] = panel23;
		squarePanels[24] = panel24;
		squarePanels[25] = panel25;
		squarePanels[26] = panel26;
		squarePanels[27] = panel27;
		squarePanels[27] = panel27;
		squarePanels[28] = panel28;
		squarePanels[29] = panel29;
		squarePanels[30] = panel30;
		squarePanels[31] = panel31;
		squarePanels[32] = panel32;
		squarePanels[33] = panel33;
		squarePanels[34] = panel34;
		squarePanels[35] = panel35;
		squarePanels[36] = panel36;
		squarePanels[37] = panel37;
		squarePanels[38] = panel38;
		squarePanels[39] = panel39;
		//////////////////////////////////////////////////////////////////////
		deedPanels[0] = deed0;
		deedPanels[1] = deed1;
		deedPanels[2] = deed2;
		deedPanels[3] = deed3;
		deedPanels[4] = deed4;
		deedPanels[5] = deed5;
		deedPanels[6] = deed6;
		deedPanels[7] = deed7;
		deedPanels[8] = deed8;
		deedPanels[9] = deed9;
		deedPanels[10] = deed10;
		deedPanels[11] = deed11;
		deedPanels[12] = deed12;
		deedPanels[13] = deed13;
		deedPanels[14] = deed14;
		deedPanels[15] = deed15;
		deedPanels[16] = deed16;
		deedPanels[17] = deed17;
		deedPanels[18] = deed18;
		deedPanels[19] = deed19;
		deedPanels[20] = deed20;
		deedPanels[21] = deed21;
	}

	void createAndSetLabelSizedIcon(JLabel container, URL imgLocation) {
		ImageIcon originalicon = new ImageIcon(imgLocation);
		Image originalpic = originalicon.getImage();
		Image smallpic = originalpic.getScaledInstance(container.getWidth(), container.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledicon = new ImageIcon(smallpic);
		container.setIcon(scaledicon);
	}
}
