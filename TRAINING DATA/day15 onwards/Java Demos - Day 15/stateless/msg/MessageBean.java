
package msg;

import javax.ejb.Stateless;
@Stateless
public class MessageBean implements MessageRemote {

    public String sendMesg(String param) {
        return "Heloo! "+param;
    }
       
}
