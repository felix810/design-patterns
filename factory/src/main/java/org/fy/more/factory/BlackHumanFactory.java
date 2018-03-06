package org.fy.more.factory;

import org.fy.common.factory.BlackHuman;
import org.fy.common.factory.Human;

/**
 * created by fy on 2018/2/8 10:43.
 * version:1.0
 * describe:
 */
public class BlackHumanFactory extends AbstractHumanMoreFactory {
    public Human createHuman() {
        return new BlackHuman();
    }
}
