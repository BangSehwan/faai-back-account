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
@Table(name = "account.user_additional_info")
public class UserAdditionalInfo {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(columnDefinition = "uuid", name = "additional_info_uuid")
  private UUID uuid;
  @Column(name = "user_id", nullable = false, length = 50)
  private String userId;
  @Column(name = "additional_code")
  private int additionalCode;
  @Column(name = "additional_info", length = 100)
  private int additionalInfo;
  @Column(name = "create_date")
  private Date createDate;
  @Column(name = "update_date")
  private Date updateDate;
}
