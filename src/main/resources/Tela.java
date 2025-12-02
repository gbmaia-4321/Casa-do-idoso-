


public class Tela {
    @Override
    public void start() throws Exception {
        Carrega o FXML - CORRETO
        Parent root = FXMLLoader.load(getClass().getResource("/view.fxml"));

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Casa do Idoso");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
