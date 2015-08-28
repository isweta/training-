package msg;

import javax.ejb.Remote;


@Remote
public interface MessageRemote {

    String sendMesg(String param);
    
}
