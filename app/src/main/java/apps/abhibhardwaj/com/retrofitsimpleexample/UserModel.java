package apps.abhibhardwaj.com.retrofitsimpleexample;

import com.google.gson.annotations.SerializedName;

public class UserModel {

  @SerializedName("id")
  private Integer id;

  @SerializedName("name")
  private String name;

  @SerializedName("username")
  private String userName;

  @SerializedName("email")
  private String emailAddress;


  public UserModel() {
  }

  public UserModel(Integer id, String name, String userName, String emailAddress) {
    this.id = id;
    this.name = name;
    this.userName = userName;
    this.emailAddress = emailAddress;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
}
