package com.LessonFirstTime;

public class Pet implements IName{

    private final String name;
    private final String kind;

    public Pet(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String getName() {
        return name;
    }
}
