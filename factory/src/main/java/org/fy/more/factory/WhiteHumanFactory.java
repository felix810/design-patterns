package org.fy.more.factory;

import org.fy.common.factory.Human;
import org.fy.common.factory.WhiteHuman;

/**
 * created by fy on 2018/2/8 10:44.
 * version:1.0
 * describe:
 */
public class WhiteHumanFactory extends AbstractHumanMoreFactory {
    public Human createHuman() {
        return new WhiteHuman();
    }
}
