package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String nickName;
  private final String phone;

  public ContactData(String firstName, String lastName, String nickName, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.phone = phone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public String getPhone() {
    return phone;
  }
}
