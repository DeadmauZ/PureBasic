
import Entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
    
    private ConnecteurBdd connector;
   
    public void UserDao() throws ClassNotFoundException, SQLException
    {
        //this.connector = new ConnecteurBdd();
        
    }
    
    public void Inscription(User u) throws SQLException 
    {
        this.connector.ecrire(
                 "INSERT INTO user (Login, Password, FirstName, Name)" +
                 "VALUES ("
                         + u.getLogin() +
                         ", " 
                         + u.getPassword()+
                         ", " 
                         + u.getFirstName() +
                         ");"
        );
    }
    
    public ResultSet Connexion(User u) throws SQLException 
    {
        Connection conn = null;
        ConnecteurBdd ggg = new ConnecteurBdd();
        conn = ggg.getConn();
        Statement s = null;
        s = conn.createStatement();
            //statements.add(s);
//            String rr = "INSERT INTO USERS (Login, Password, Name, FirstName) VALUES ('maxime.egido@gmail.com', '1234', 'aaa', 'aaaa')";
//            s.execute(rr);
//            rr = "INSERT INTO USERS (Login, Password, Name, FirstName) VALUES ('marius.saurel@epsi.com', '1234', 'aaa', 'aaaa')";
//            s.execute(rr);
//            rr = "INSERT INTO USERS (Login, Password, Name, FirstName) VALUES ('pierre.joubert@epsi.com', '1234', 'aaa', 'aaaa')";
//            s.execute(rr);
//            rr = "INSERT INTO USERS (Login, Password, Name, FirstName) VALUES ('guillaume.langouet@gmail.com', '1234', 'aaa', 'aaaa')";
//            s.execute(rr);
//            
            
            
            
            
        return s.executeQuery(
                "SELECT * "
                + "FROM USERS "
                + "WHERE Login = '" + u.getLogin()
                + "' AND Password = '" + u.getPassword() + "'"
        );
    }

    
}
