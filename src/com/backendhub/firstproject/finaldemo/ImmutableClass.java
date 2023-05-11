package com.backendhub.firstproject.finaldemo;

public  final class  ImmutableClass {
    private final int a;

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "a=" + a +
                '}';
    }

    public ImmutableClass(int a) {
        this.a = a;
    }
}
