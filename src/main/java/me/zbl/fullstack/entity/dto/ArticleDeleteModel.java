package me.zbl.fullstack.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 批量操作对主键的封装
 * Created by James on 17-12-11.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ArticleDeleteModel {

  private List<Integer> ids;
}
