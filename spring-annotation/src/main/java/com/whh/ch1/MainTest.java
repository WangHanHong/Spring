package com.whh.ch1;

import com.zw.common.util.dbencode.DdesUtil;

/**
 * @author whh
 * @date 2019/8/2
 */
public class MainTest {


    //public static  String pattern = "4,11,8,15,10,18,12,7,9,5,1,2,17,14,6,13,19,20,3,16@10,1,18,6,4,3,2,13,15,20,11,19,7,16,5,8,12,17,14,9@1,19,18,3,12,11,7,8,5,2,13,10,17,16,20,15,4,14,6,9@3,16,2,15,8,17,12,7,1,5,19,4,20,6,13,9,10,18,14,11@4,18,2,17,10,6,14,3,11,13,20,19,15,8,12,5,16,9,7,1@15,8,11,20,12,4,14,6,9,2,16,1,3,10,17,19,13,18,5,7@1,12,14,18,10,7,9,5,17,16,19,3,13,6,2,11,15,20,8,4@7,1,3,12,11,5,18,16,13,19,6,4,15,8,9,20,14,10,2,17@2,5,18,8,20,13,12,9,16,6,14,11,1,3,19,17,7,10,4,15@14,20,18,6,2,13,12,4,15,5,11,8,1,9,10,7,19,3,17,16@8,1,11,10,14,9,16,19,13,17,12,20,2,15,4,3,6,18,5,7@7,20,5,18,3,11,2,9,16,14,8,12,15,6,1,19,4,13,17,10@13,2,5,11,15,19,14,12,7,1,18,20,10,6,3,16,17,8,9,4@6,2,8,20,5,11,17,1,14,4,15,19,16,13,12,10,3,7,18,9@7,20,8,1,15,14,11,5,9,17,16,10,4,2,12,13,3,6,18,19@2,11,4,3,16,10,20,1,12,19,5,7,6,18,15,9,17,14,13,8";
	public static  String pattern = "2,15,10,9,14,13,7,8,17,6,4,12,11,3,1,19,18,5,20,16@13,4,5,15,14,8,10,16,19,7,6,20,12,9,3,2,11,1,18,17@3,17,16,6,7,13,11,5,2,14,15,1,9,12,18,19,10,20,8,4@18,6,14,7,19,13,17,5,10,12,1,2,15,20,9,3,16,4,11,8@19,8,9,17,12,1,10,18,6,15,5,13,20,7,16,4,3,2,14,11@18,17,20,7,13,10,6,4,14,8,9,11,19,5,1,15,3,12,2,16@14,10,8,16,2,15,6,9,1,19,4,7,13,17,11,3,20,5,18,12@10,5,17,2,13,20,8,4,14,1,16,12,7,9,11,15,18,6,19,3@8,14,16,18,9,5,1,15,3,17,7,6,20,11,2,13,19,10,12,4@19,10,20,2,1,8,3,12,4,14,13,6,18,7,5,11,9,15,17,16@7,2,18,10,9,15,5,3,8,12,16,20,11,6,19,17,14,1,13,4@6,9,19,17,2,4,20,3,11,18,10,14,13,1,12,15,16,7,8,5@4,20,15,19,18,6,9,1,7,17,12,8,5,16,10,13,2,11,14,3@12,5,11,7,8,1,16,17,13,10,19,14,3,20,9,15,2,18,6,4@10,4,20,12,2,6,15,1,13,5,9,18,3,16,11,17,8,14,19,7@5,2,12,18,11,4,6,16,19,7,17,3,10,1,15,14,13,20,9,8";

    public static void main(String[] args) {

        System.out.println(DdesUtil.generateDisorderingCode(null,pattern));
    }


}

class A{
    static {
        System.out.println("A");
    }
}

class B extends A{
    static {
        System.out.println("B");
    }

    public final static String C = "C";
    public final String c = "c";
}