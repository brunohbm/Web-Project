package crasyfox.control;

import crasyfox.connection.ConnectionMySQL;
import java.sql.SQLException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author CrasyFox
 */
public class LoginController extends ConnectionMySQL {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }        
    
    public  Boolean login(String user, String password) {
        return (user != null && password != null && exist(user, password));
    }

    public  Cookie getCookie(String name, String value){
        Cookie cookie = new Cookie(name, value);
        return  cookie;
    }
    
    public  Boolean isLogin(HttpServletRequest request, String type){
        Cookie[] cookies = request.getCookies();
        String user = cookies[1].getName();
        String password = cookies[2].getName();
        String cookieType = (String) cookies[3].getValue();
        return (user.equals("user") && password.equals("password") && cookieType.equalsIgnoreCase(type));
    }
    
    public  Boolean exist(String user, String password) {
        try {
            String userBD = null;
            String passwordBD = null;

            runSQL("SELECT * FROM USER WHERE USERNAME = '"+user+"' AND PASSWORD = '"+password+"'");
                        
            while (resultSet.next()) {
                userBD = resultSet.getString("USERNAME");
                passwordBD = resultSet.getString("PASSWORD");
                setType(resultSet.getString("TYPE"));
            }            
                        
            return ((userBD != null) && (passwordBD != null));
        } catch (SQLException e) {
            return false;
        }
    }
}
