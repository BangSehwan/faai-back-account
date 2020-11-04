package com.faai.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account.login_history")
public class LoginHistory {
  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "uuid", name = "longin_history_uuid")
  private UUID uuid;
  @Column(name = "user_id", nullable = false, length = 50)
  private String userId;
  @Column(name = "connection_date")
  private Date connectionDate;
  @Column(name = "connection_ip", length = 20)
  private String connectionIp;
  @Column(name = "connection_success")
  private Boolean connectionSuccess;
  @Column(name = "connection_fail_reason", length = 200)
  private String connectionFailReason;
  @Column(name = "disconnection_date")
  private Date disconnectionDate;
  @Column(name = "connection_device", length = 20)
  private String connectionDevice;
}
