import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercise8 extends Application {

    public void drawPicture(GraphicsContext g, int width, int height) {

        g.setFill(Color.BLACK);
        g.fillRect(0, 0, width, height); // First, fill the entire image with a background color.

        // As an example, draw a large number of colored disks.
        // To get a different picture, just erase this code, and substitute your own.

        int centerX = 0;     // The x-coord of the center of a disk.
        int centerY = 0;     // The y-coord of the center of a disk.
        int row = 0;
        int colorChoice; // Used to select a random color.
        int count;       // Loop control variable for counting disks

        for (count = 0; count <= 64; count++) {
            colorChoice = ((row + count) % 2);
            switch (colorChoice) {
                case 0:
                    g.setFill(Color.RED);
                    break;
                case 1:
                    g.setFill(Color.BLACK);
                    break;
            }

            g.fillRect( centerX, centerY, 50, 50 );
            if (centerX < 350) {
                centerX += 50;
            } else {
                row++;
                centerX = 0;
                centerY += 50;
            }
        }

    } // end drawPicture()

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 400;   // The width of the image.  You can modify this value!
        int height = 400;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}
