package com.wang.chart;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.MessageDigest;
import java.util.HashMap;

public class IMEI {
    public static void main(String[] args) {
        try {
            String argsOne="D:\\AndroidStudioProjects\\wechart\\app\\src\\main\\java\\com\\wang\\chart\\systemInfo.cfg";
            String argsTwo="D:\\AndroidStudioProjects\\wechart\\app\\src\\main\\java\\com\\wang\\chart\\deviceConfig.cfg";
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                    argsOne));
            Object DL = in.readObject();
            HashMap hashWithOutFormat = (HashMap) DL;
//            ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(
//                    argsTwo));
//            Object DJ = in1.readObject();
//            HashMap hashWithOutFormat1 = (HashMap) DJ;
//            String s = String.valueOf(hashWithOutFormat1.get(Integer
//                    .valueOf(258)));
          String  s =  hashWithOutFormat.get(Integer.valueOf(1)).toString();
            s = encode(s);
            System.out.println("The Key is : " + s.substring(0, 7));
            in.close();
//            in1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String encode(String content)
    {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(content.getBytes());
            return getEncode32(digest);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    private static String getEncode32(MessageDigest digest)
    {
        StringBuilder builder = new StringBuilder();
        for (byte b : digest.digest())
        {
            builder.append(Integer.toHexString((b >> 4) & 0xf));
            builder.append(Integer.toHexString(b & 0xf));
        }
        return builder.toString();

    }

}
