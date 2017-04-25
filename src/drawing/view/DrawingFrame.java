package drawing.view;

import javax.swing.JFrame;
import drawing.view.DrawingPanel;
import drawing.controller.DrawingController;
import java.awt.Dimension;
public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel DrawingPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.DrawingPanel = new DrawingPanel(baseController);
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(DrawingPanel);
		this.setSize(new Dimension (900, 600));
		this.setTitle("The Simple Games");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public DrawingPanel getdrawingPanel()
	{
		return DrawingPanel;
	}
	
	public void setDrawingPane(DrawingPanel DrawingPanel)
	{
		this.DrawingPanel = DrawingPanel;
	}
}
