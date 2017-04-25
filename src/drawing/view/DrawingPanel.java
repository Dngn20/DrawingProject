package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import drawing.controller.DrawingController;



public class DrawingPanel extends JPanel
{
	private DrawingController baseController;
	private ShapePanel shapePanel;
	private SpringLayout baseLayout;
	private JButton button1;
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		shapePanel = new ShapePanel(baseController);
		
		this.button1 = new JButton("Draw rectangles");
		baseLayout.putConstraint(SpringLayout.NORTH, button1, 44, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, button1, 22, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(button1);
		this.setBackground(Color.GREEN);
		this.setMinimumSize(new Dimension(600, 600));
		
		this.add(shapePanel);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 240, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 262, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, 382, SpringLayout.WEST, this);
		
	
	}
	public void setupListeners()
	
	{
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				shapePanel.addRectangles();
			}
			
			
		});
	}
}
	
	





