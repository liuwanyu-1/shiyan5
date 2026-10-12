package lwy.study.spring.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;
    private String adminRole;
    private String adminStatus;
}
