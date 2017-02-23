package headphones;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vova on 15.02.2017.
 */
public class IListener implements ServletRequestListener {

    private Map<String,Integer> servlets = new HashMap<String,Integer>();
    @Override
    public void requestInitialized(ServletRequestEvent requestEvent) {
        //ServletRequest request = requestEvent.getServletRequest();
        String url = ((HttpServletRequest) requestEvent.getServletRequest()).getRequestURI();
        if (servlets.get(url) != null) {
            Integer count = servlets.get(url);
            count++;
            System.out.println("url" + url + "количество" + count);
        }else {
            Integer count=1;
            servlets.put(url,count);
            System.out.println("url" + url + "количество" + count);
        }
    }
    @Override
    public void requestDestroyed(ServletRequestEvent requestEvent) {
    }
        }



