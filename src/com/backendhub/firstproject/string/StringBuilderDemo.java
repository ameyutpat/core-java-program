package com.backendhub.firstproject.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String a = "Welcome ";
        a.concat("to java class.");
        System.out.println(a);

        StringBuilder stringBuilder = new StringBuilder("Welcome ");
        stringBuilder.append("to java class.");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("JVM ");
        stringBuffer.append(" is virtual machine..");
        System.out.println(stringBuffer);

    }
}
