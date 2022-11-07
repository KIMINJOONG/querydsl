package study.querydsl.dto;

import lombok.Data;

@Data
public class MemberSearchCondition {
    private String unsername;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;
}
