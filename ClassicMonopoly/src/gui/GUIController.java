package gui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import domain.GameController;

public class GUIController {
	// put grid controls here later

	ImageIcon die1Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die1.png"));
	ImageIcon die2Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die2.png"));
	ImageIcon die3Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die3.png"));
	ImageIcon die4Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die4.png"));
	ImageIcon die5Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die5.png"));
	ImageIcon die6Icon = createLabelSizedIcon(MonopolyBoard.die1Label,
			GUIController.class.getResource("/resource/diefaces/die6.png"));
	ImageIcon[] icons = new ImageIcon[6];

	public GUIController() {
		icons[0] = die1Icon;
		icons[1] = die2Icon;
		icons[2] = die3Icon;
		icons[3] = die4Icon;
		icons[4] = die5Icon;
		icons[5] = die6Icon;

		MonopolyBoard.turnLabel.setText("Player " + GameController.currentPlayer.getPlayerName() + "'s Turn");
		MonopolyBoard.die1Label.setIcon(die1Icon);
		MonopolyBoard.die2Label.setIcon(die1Icon);

		MonopolyBoard.rollButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				MonopolyBoard.rollButton.setEnabled(false);// this will change if double rolled
				int tokenIndexToMove = GameController.playerList.indexOf(GameController.currentPlayer);
				int[] dieVals = GameController.rollDice(GameController.die1, GameController.die2);
				
			//	playRollAnimation(); 

				MonopolyBoard.die1Label.setIcon(icons[dieVals[0] - 1]);
				MonopolyBoard.die2Label.setIcon(icons[dieVals[1] - 1]);
				MonopolyBoard.grid.moveOnGrid(MonopolyBoard.tokenList.get(tokenIndexToMove), dieVals[2]);
				MonopolyBoard.btnEndTurn.setEnabled(true);
			}

		});

		MonopolyBoard.btnEndTurn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				GameController.nextPlayer();
				MonopolyBoard.turnLabel.setText("Player " + GameController.currentPlayer.getPlayerName() + "'s Turn");
				MonopolyBoard.btnEndTurn.setEnabled(false);
				MonopolyBoard.rollButton.setEnabled(true);
			}

		});

	}

	void playRollAnimation() {
		Random rand = new Random();
		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			int secondsToWait = 10;
			int selectIndex = rand.nextInt(6);

			@Override
			public void run() {
				secondsToWait--;
				MonopolyBoard.die1Label.setIcon(icons[selectIndex]);
				selectIndex = rand.nextInt(6);
				MonopolyBoard.die2Label.setIcon(icons[selectIndex]);
				if (secondsToWait == 0) {
					timer.cancel();
					timer.purge();
				}
			}
		};

		timer.scheduleAtFixedRate(task, 0, 50);
	}

	private ImageIcon createLabelSizedIcon(JLabel container, URL imgLocation) {
		ImageIcon originalicon = new ImageIcon(imgLocation);
		Image originalpic = originalicon.getImage();
		Image smallpic = originalpic.getScaledInstance(container.getWidth(), container.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledicon = new ImageIcon(smallpic);
		return scaledicon;
	}
}
