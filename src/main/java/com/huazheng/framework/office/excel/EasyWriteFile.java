package com.huazheng.framework.office.excel;

import com.alibaba.excel.EasyExcel;
import com.huazheng.framework.domain.DemoData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Classname EasyWriteFile
 * @Description 使用easyExcel写文件
 * @Date 2020/7/16 9:32
 * @Created by zhanghuazheng
 */
public class EasyWriteFile {
    private static String PATH = "E:\\study\\studyCode\\workSpaces\\framework\\";

    public void writeFile() {
        String fileName = PATH + System.currentTimeMillis() + "easyExcelWrite.xlsx";

//        EasyExcel.write(fileName, DemoData.class).excelType(ExcelTypeEnum.XLS).sheet("测试").doWrite(data());
//        EasyExcel.write(fileName, DemoData.class).excelType(ExcelTypeEnum.XLS).sheet("测试").doWrite(data());
        EasyExcel.write(fileName, DemoData.class).sheet("测试").doWrite(data());
    }

    private List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
}
