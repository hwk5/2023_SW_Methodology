package dice_game;

public class Main extends Application {
    private Game game = new Game();
    private Label resultLabel = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dice Game");

        Button rollButton = new Button("Roll Dice");
        rollButton.setOnAction(e -> playGame());

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(rollButton, resultLabel);

        Scene scene = new Scene(vbox, 200, 150);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void playGame() {
        game.play();
        int user1Result = game.getUser1Result();
        int user2Result = game.getUser2Result();

        String message = "사용자 1의 결과: " + user1Result + "\n" +
                         "사용자 2의 결과: " + user2Result + "\n";

        if (user1Result == user2Result) {
            message += "무승부입니다.";
        } else if (user1Result > user2Result) {
            message += "사용자 1이 이겼습니다!";
        } else {
            message += "사용자 2가 이겼습니다!";
        }

        resultLabel.setText(message);
    }
}