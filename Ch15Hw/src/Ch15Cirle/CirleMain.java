package Ch15Cirle;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class CircleMain  extends Application {
	  @Override
	  public void start(Stage primaryStage) {
	    final double WIDTH = 500.0;
	    final double HEIGHT = 500.0;

	    Circle circle = new Circle(Math.min(HEIGHT, WIDTH) / 10);
	    circle.setCenterX(WIDTH / 2);
	    circle.setCenterY(HEIGHT / 2);
	    circle.setFill(Color.RED);
	    circle.setStroke(Color.BLACK);

	    circle.setOnKeyPressed(e -> {
	      switch (e.getCode()) {
	        case W: circle.setCenterY(circle.getCenterY() - 10); break;
	        case S: circle.setCenterY(circle.getCenterY() + 10); break;
	        case A: circle.setCenterX(circle.getCenterX() - 10); break;
	        case D: circle.setCenterX(circle.getCenterX() + 10);
	      }
	    });

	    Pane pane = new Pane();
	    pane.getChildren().add(circle);

	    Scene scene = new Scene(pane, WIDTH, HEIGHT);
	    primaryStage.setTitle("E15_11");
	    primaryStage.setScene(scene);
	    primaryStage.show();

	    circle.requestFocus();
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
	}