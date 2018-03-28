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
package me.zbl.fullstack.service.api;

import me.zbl.fullstack.entity.Resume;
import me.zbl.fullstack.entity.dto.form.ResumeModifyForm;

/**
 * 简历业务接口
 *
 * @author JamesZBL
 * @date 2018-03-28
 */
public interface IResumeService {

  /**
   * 查询简历
   */
  Resume getResume();

  /**
   * 更新简历
   *
   * @param form 表单
   */
  void updateResume(ResumeModifyForm form, Resume resume);
}
