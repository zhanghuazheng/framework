package com.huazheng.framework.office.excel;

import com.alibaba.excel.EasyExcel;
import com.huazheng.framework.domain.DemoData;

/**
 * @Classname EasyReadFile
 * @Description TODO
 * @Date 2020/7/16 9:32
 * @Created by zhanghuazheng
 */
public class EasyReadFile {
    private static String  PATH="E:\\study\\studyCode\\workSpaces\\framework\\";

    public  void readFile(){
        String fileName = PATH + "easyExcelWrite03.xlsx";
        EasyExcel.read(fileName,DemoData.class,new DemoDataListener()).sheet().doRead();

    }
}
