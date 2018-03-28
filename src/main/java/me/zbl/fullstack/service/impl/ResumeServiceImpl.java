/*
 * Copyright 2018 JamesZBL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package me.zbl.fullstack.service.impl;

import me.zbl.fullstack.entity.Resume;
import me.zbl.fullstack.entity.dto.form.ResumeModifyForm;
import me.zbl.fullstack.mapper.ResumeMapper;
import me.zbl.fullstack.service.api.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JamesZBL
 * @date 2018-03-28
 */
@Service
public class ResumeServiceImpl implements IResumeService {

  @Autowired
  private ResumeMapper mResumeMapper;


  @Override
  public Resume getResume() {
    return mResumeMapper.selectAll().get(0);
  }

  @Override
  public void updateResume(ResumeModifyForm form, Resume resume) {
    resume.setId(1);
    resume.setHtmlMaterial(form.getHtmlMaterial());
    resume.setMdMaterial(form.getMdMaterial());
    mResumeMapper.updateByPrimaryKeySelective(resume);
  }
}
