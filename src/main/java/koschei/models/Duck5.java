package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Duck5 {

    @Autowired
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо" + egg.toString();
    }
}
