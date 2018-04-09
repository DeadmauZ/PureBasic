package Controller;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marius
 */
public abstract class LogInController implements Initializable{
    
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PageConnexion.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("titre");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

    
    
    

    /*
    @FXML
    private void createAccount() throws IOException{
        Parent root;
                
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/CreateUserView.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Créer un compte");
            stage.setScene(new Scene(root));
            stage.show();
            //createAccountBtn.getScene().getWindow().hide();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void checkLogin(ActionEvent event) throws IOException{
       
        /*UserDao uDao = new UserDao();
        User utilisateur = new User(emailUser.getText().toString(), passwordUser.getText().toString(), "", "");
        
       try {
           Parent root;
            ResultSet rs = uDao.Connexion(utilisateur);
           if(rs.next()){
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/AccueilView.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Accueil");
            stage.setScene(new Scene(root, 1024, 768));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            }else{
               IncorrectPassword.setVisible(true);
                       }
            
        } catch (SQLException ex) {
            Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
//        Parent root;
//        try {
//            // Appeler méthode de login et exécuter le code ci dessous si login OK.
//            root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/AccueilView.fxml"));
//            Stage stage = new Stage();
//            stage.setTitle("Accueil");
//            stage.setScene(new Scene(root, 1024, 768));
//            stage.show();
//            // Hide this current window (if this is what you want)
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
//        try {
//          
//            Connection conn = null;
//            Properties props = new Properties();
//            props.put("user", "user1");
//            props.put("password", "user1");
//            
//            conn = DriverManager.getConnection("jdbc:derby:" + "derbyDB" + ";create=true", props);
//            
//            Statement s = null;
//            s = conn.createStatement();
//            String rr = "INSERT INTO user (Login, Password, Name, FirstName) VALUES ('maxime.egido@gmail.com', '1234', 'aaa', 'aaaa')";
//            s.execute(rr);
//            
//            User currentUser = new User( emailUser.getText(), passwordUser.getText(), "ee", "eee");
//            
//            ResultSet resultat = s.executeQuery("SELECT *"
//                + "FROM user"
//                + "WHERE login = " + currentUser.getLogin()
//                + "AND password = " + currentUser.getPassword());
//            
//            if(resultat.next()){
//            BorderPane pane = FXMLLoader.load(getClass().getResource("/Views/AccueilView.fxml"));
//            rootPane.getChildren().setAll(pane);
//            
//            }else{
//                System.out.println("Non correct");
//            }
//          }
//        } catch (SQLException ex) {
//            Logger.getLogger(LogInController.class.getName()).log(Level.SEVERE, null, ex);
//        }

        
    

    
    
   

        
        /*
        createAccountBtn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Parent root;
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("Views/CreateUserView.fxml"), resources);
                    Stage stage = new Stage();
                    stage.setTitle("Créer un compte");
                    stage.setScene(new Scene(root));
                    stage.show();
                    // Hide this current window (if this is what you want)
                    createAccountBtn.getScene().getWindow().hide();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }  
        });
        */

    /*gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(10);
    gridPane.setVgap(10);
    GridPane.setConstraints(emailUser, 0, 0, 2, 1);
    GridPane.setConstraints(passwordUser, 0, 1, 2, 1);
    GridPane.setConstraints(checkBtn, 0, 2, 1, 1);
    GridPane.setConstraints(createAccountBtn, 1, 2, 1, 1);*/


      


