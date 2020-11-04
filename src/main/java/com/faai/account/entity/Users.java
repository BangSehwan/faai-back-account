package com.faai.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account.users")
public class Users implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "uuid", name = "user_uuid")
  private UUID uuid;
  @Column(name = "user_id", nullable = false, unique = true, length = 50)
  private String userId;
  @Column(name = "password", nullable = false, length = 20)
  private String password;
  @Column(name = "user_name", nullable = false, length = 20)
  private String userName;
  @Column(name = "user_mobile", nullable = false, length = 20)
  private String userMobile;
  @Column(name = "dialing_code", nullable = false, length = 10)
  private String dialingCode;
  @Column(name = "is_active", nullable = false)
  private Boolean isActive;
  @Column(name = "last_login_date")
  private Date lastLoginDate;
  @Column(name = "create_date")
  private Date createDate;
  @Column(name = "update_date")
  private Date updateDate;
  @Column(name = "is_delete")
  private Boolean isDelete;
}
