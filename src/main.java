import connector.*;
import gui.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.json.JSONObject;


public class main extends Application{

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/gui/loginUI.fxml"));

        //LoginController loginController = new LoginController();
        //fxmlLoader.setController(loginController);

        Parent root = (Parent) fxmlLoader.load(/*this.getClass().getResource("/gui.loginUI.fxml")*/);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        /*tcpSocketHandler s;
        s = new tcpSocketHandler("127.0.0.1", 1337);
        s.send("Hei på deg");
        s.disconnect();*/
        launch(args);

    }
    /*
    public static void main(String[] args){
        tcpSocketHandler s;
        s = new tcpSocketHandler("127.0.0.1", 1337);
        s.send("Hei på deg");
        s.disconnect();
    }*/
}
