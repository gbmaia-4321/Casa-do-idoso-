import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o FXML - CORRETO
        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Casa do Idoso");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}