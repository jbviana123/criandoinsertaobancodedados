package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import conexaojdbc.SingleConection;
import model.Userposjava;

public class UserPosDao {
    private Connection connection;
    
    public UserPosDao(){
    	
    	connection = SingleConection.getConnection();
    	
    }
    public void salvar(Userposjava userposjava) {
    	
    	    try {
    		String sql = "insert into userposjava(id,nome,email) values (?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, 3);
			insert.setString(2, "maria elaine");
			insert.setString(3, "joaobvianna@hotmail");
			insert.execute();
    	    }catch (Exception e) {
				e.printStackTrace();
			}
    	    
    }
    	
    
}
