package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBLogic {


	DBConnectUtil dbconnUtil = new DBConnectUtil(); //ConnectionUtilクラスのインスタンス生成
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

}
