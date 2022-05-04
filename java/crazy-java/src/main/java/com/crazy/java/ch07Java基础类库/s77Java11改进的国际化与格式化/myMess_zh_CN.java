package com.crazy.java.ch07Java基础类库.s77Java11改进的国际化与格式化;
import java.util.*;
public class myMess_zh_CN extends ListResourceBundle {
    // 定义资源
    private final Object myData[][] =
            {
                    {"msg", "{0}，你好！今天的日期是{1}"}
            };
    // 重写方法getContents()
    @Override
    public Object[][] getContents() {
        // 该方法返回资源的key-value对
        return myData;
    }
}