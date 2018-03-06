package org.fy.common.factory;

/**
 * created by fy on 2018/2/7 17:16.
 * version:1.0
 * describe:
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends Human> T createHuman(Class<T> c);
}
