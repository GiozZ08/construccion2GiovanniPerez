
package clubProyect.Service.interfaces;


public interface LoginService {
      boolean authenticate ( String userName, String password) throws Exception;
    
    String getRole(String userName) throws Exception;
    
    void logout (String userName);
            }

