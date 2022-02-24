package com.example.demo.security;

public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("student:read"),
    COURSE_WRITE("student:write");

        private final String permisssion;

    ApplicationUserPermission(String permisssion) {
        this.permisssion = permisssion;
    }

    public String getPermisssion() {
        return permisssion;
    }
}
