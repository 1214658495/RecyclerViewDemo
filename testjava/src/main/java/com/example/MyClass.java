package com.example;

public class MyClass {

    public  static void main(String arg[]){
        String name,req;
        int size;
//        "rval":0,"msg_id":1282,"listing":
//        "[{"Leauto_20170719_155415A.MP4":"31457280 bytes|2017-07-19 15:54:34"}]"
        String descriptor = "{\"Leauto_20170719_191757A.MP4\":\"68157440 bytes|2017-07-19 19:18:40\"}";
        System.out.println("hello java ");
        descriptor = descriptor.replaceAll("[{}\"]", "");
        // parse the name
        int index = descriptor.indexOf(':');
        System.out.println(index);
        name = descriptor.substring(0, index).trim();
        System.out.println(name);

        descriptor = descriptor.substring(index + 1).trim();
        System.out.println(descriptor);
        index = descriptor.indexOf(" ");
        System.out.println(index);
        size = Integer.parseInt(descriptor.substring(0, index));
        System.out.println(size);
        req = "{\"token\":" + "1" + ",\"msg_id\":" +
                "2" + ",\"type\":\"" + "camera_clock" + "\",\"param\":" + "\"" +
                "3" + "\"" + "}";
        System.out.println(req.getBytes());
//        req.getBytes();

//        Integer.parseInt("123");
        System.out.println(Integer.parseInt("123"));

        int ip = 285911232;
        System.out.println(String.format("%d.%d.%d.%d", (ip & 0xFF), (ip >> 8 & 0xFF), (ip >> 16 & 0xFF), ip
                >> 24));

    }
}
