package com.mschmidt.springbook.cms.domain.vo;

import java.util.Set;

import com.mschmidt.springbook.cms.domain.models.Category;
import com.mschmidt.springbook.cms.domain.models.Tag;

import lombok.Data;

@Data
public class NewsRequest {

  String title;

  String content;

  Set<Category> categories;

  Set<Tag> tags;

}