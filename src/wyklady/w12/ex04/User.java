package wyklady.w12.ex04;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public
    class User {

    private final String USERNAME_PROP_NAME = "username";
    private final ReadOnlyStringWrapper userName;

    private final String PASSWORD_PROP_NAME = "password";
    private final StringProperty password;

    public User(){
        this.userName = new ReadOnlyStringWrapper(
            this, USERNAME_PROP_NAME, "tomaszew"
        );
        this.password = new SimpleStringProperty(
            this, PASSWORD_PROP_NAME, "1234qwer"
        );
    }

    public ReadOnlyStringWrapper userNameProperty() {
        return userName;
    }

    public StringProperty passwordProperty() {
        return password;
    }
}
