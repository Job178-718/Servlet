package com.sun.util;

import com.sun.model.Account;

import java.sql.*;
import java.util.List;

public class DButil {
    private static String user = "root";
    private static String password= "123456";
    private static String URL = "jdbc:mysql://localhost:3306/java80?useUnicode=true&" +
            "characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8";
    private static Connection connection = null;
    private static PreparedStatement statement=null;
    private  static ResultSet resultSet = null;
    /**
     * useUnicode=true
     * characterEncoding=utf-8
     * useSSL=false
     * serverTimezone=GMT%2B8
     */

    /**
     * 加载驱动
     * @throws SQLException
     */
    public static Connection getCon(){
        /**
         * 可以获取数据流；
         */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, user, password);

        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 查
     */
    public static List  select(String sql){

        List<Account> list = null;
        try {
            connection = getCon();
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();

            //获取列数
            ResultSetMetaData md= resultSet.getMetaData();
            int columnSize = md.getColumnCount();

            System.out.println("查询结果如下:");
            for(int i = 1; i <= columnSize; i++){
                    System.out.printf("%-12s",md.getColumnName(i));
                  }

            System.out.println();
              //打印所有记录
              while(resultSet.next()) {
                     for(int i = 1; i <= columnSize ; i++){
                             System.out.printf("%-12s",resultSet.getObject(i));
                         }
                     System.out.println();
                 }
                System.out.print("\n结束查询");

            close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    public static void close() throws SQLException {
        if(connection!=null) {
            connection.close();
        }
        if(statement!=null){
            statement.close();
        }
        if(resultSet!=null){
            resultSet.close();
        }
        }


}
