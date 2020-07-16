package com.huazheng.framework.dao.api;

import com.huazheng.framework.domain.DemoData;

import java.util.List;

/**
 * @Classname DemoDAO
 * @Description TODO
 * @Date 2020/7/16 10:54
 * @Created by zhanghuazheng
 */
public class DemoDAO {
    public void save(List<DemoData> list) {
        // 如果是mybatis,尽量别直接调用多次insert,自己写一个mapper里面新增一个方法batchInsert,所有数据一次性插入
    }
}
