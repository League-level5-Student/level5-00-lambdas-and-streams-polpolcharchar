package _00_JButtons_with_Lambdas;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	private JTextField answerField = new JTextField(40);
	private JTextField field1 = new JTextField(10);
	private JTextField field2 = new JTextField(10);

	private JPanel panelButton = new JPanel();
	private JPanel panelInput = new JPanel();
	private JPanel panelAnswer = new JPanel();
	
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout(3, 3));
		
		window.add(panelButton);
		window.add(panelInput);
		window.add(panelAnswer);
		
		
		panelButton.add(addNumbers);
		panelButton.add(randNumber);
		panelButton.add(tellAJoke);
		
		
		
		field1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		field2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		panelInput.add(field1);
		panelInput.add(field2);
		panelAnswer.add(answerField);
		
		
		
		
		
//		window.add(answerField);
//		window.add(field1);
//		window.add(field2);

		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener( (ActionEvent)  ->  {
			answerField.setText( "" + ( Integer.parseInt( field1.getText() ) + Integer.parseInt( field2.getText() ) ) );
			System.out.println("a");
		} );
		tellAJoke.addActionListener( (ActionEvent e)->{ answerField.setText("Whats a whale's favorite game? Swallow the leader!"); } );
		randNumber.addActionListener( (ActionEvent e)->{ answerField.setText( "" +  new Random().nextInt(10) ) ; } );

		
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
