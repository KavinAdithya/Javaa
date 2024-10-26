package com.techcrack.Annotation.Task;

public class User {
    @NotNull
    @MaxLength(maxLength = 12)
    @MinLength(minLength = 6)
    private String name;

    @NotNull
    @MinLength
    @MaxLength(maxLength = 16)
    private String password;

    @NotNull(isNull = false)
    @MinLength(minLength = 10)
    @MaxLength(maxLength = 20)
    private String email;

    public User( String name, String password, String email) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
