package demoqa.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class TextBox {
    private String fullName;
    private String email;
    private String currentAddress;
    private String permanentAddress;

    public TextBox(String currentAddress, String email, String fullName, String permanentAddress) {
        this.currentAddress = currentAddress;
        this.email = email;
        this.fullName = fullName;
        this.permanentAddress = permanentAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextBox textBox = (TextBox) o;
        return Objects.equals(fullName, textBox.fullName) && Objects.equals(email, textBox.email) && Objects.equals(currentAddress, textBox.currentAddress) && Objects.equals(permanentAddress, textBox.permanentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, email, currentAddress, permanentAddress);
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "currentAddress='" + currentAddress + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                '}';
    }
}
