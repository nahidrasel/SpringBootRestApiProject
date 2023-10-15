package io.github.nahidrasel.models;

public class DemoResponse {
  private long userId;
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long id) {
    this.userId = id;
  }
}
