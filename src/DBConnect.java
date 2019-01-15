package src;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DBConnect{

    static int year;
    static int month;
    static String fromDate;
    static String toDate;

    public static Statement getStatement(Login obj){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com/K6ev8vMSS3", "K6ev8vMSS3", "IMvVX1GQSU");
            statement = connection.createStatement();
            obj.errorLabel.setText("");
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
            if(e.getMessage().contains("Communications link failure")){
                obj.errorLabel.setText("Internet connection failure, check internet connection");
            }
        }
        
        return statement;
    }

    public static Statement getStatement(Register obj){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com/K6ev8vMSS3", "K6ev8vMSS3", "IMvVX1GQSU");
            statement = connection.createStatement();
            obj.errorLabel.setText("");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            if(e.getMessage().contains("Communications link failure")){
                obj.errorLabel.setText("Internet connection failure, check internet connection");
            }
        }
        
        return statement;
    }

    public static Statement getStatement(Dashboard obj){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://remotemysql.com/K6ev8vMSS3", "K6ev8vMSS3", "IMvVX1GQSU");
            statement = connection.createStatement();
            obj.messageLabel.setText("");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            if(e.getMessage().contains("Communications link failure")){
                obj.messageLabel.setText("Internet connection failure, check internet connection");
            }
        }
        return statement;
    }

    static void getDate(){
        year = new Date().getYear() + 1900;
        month = new Date().getMonth() + 1;
        fromDate = ""+  year + "-" + month + "-1" ;
        toDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
    
}