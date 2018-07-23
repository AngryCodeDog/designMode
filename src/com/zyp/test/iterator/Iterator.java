package com.zyp.test.iterator;

public interface Iterator {
    /**
     * 移动到第一个元素
     */
    void first();

    /**
     * 移动到下一个元素
     */
    void next();

    /**
     * 是否是最后一个元素
     * @return
     */
    boolean isDone();

    /**
     * 返回当前元素
     * @return
     */
    Object currentItem();
}
