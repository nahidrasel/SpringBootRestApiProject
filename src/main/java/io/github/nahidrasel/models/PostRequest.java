package io.github.nahidrasel.models;

public class PostRequest {
  int userId;
  String customerName;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int id) {
    this.userId = userId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String Name) {
    this.customerName = Name;
  }
}
