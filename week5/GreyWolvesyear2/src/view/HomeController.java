/**
 * 
 */
package view;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

/**
 * @author stetc
 *
 */
public class HomeController {
	@FXML 
	private MenuItem close;
	@FXML 
	private Menu about;
	@FXML 
	private Button prediction;
	@FXML 
	private Button newPrediction;
	@FXML 
	private TextField wolves;
	@FXML 
	private TextField cows;
	@FXML 
	private TextField horses;
	@FXML 
	private TextField deers;
	@FXML 
	private TextField years;
	@FXML 
	private LineChart<?, ?> graph;
	
	public void close() {
		System.exit(0);
	}
}

