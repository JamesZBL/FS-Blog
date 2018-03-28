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
package me.zbl.fullstack.controller;

import me.zbl.fullstack.controller.base.BaseController;
import me.zbl.fullstack.entity.Resume;
import me.zbl.fullstack.entity.dto.form.ResumeModifyForm;
import me.zbl.fullstack.service.api.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author JamesZBL
 * @date 2018-03-28
 */
@Controller
public class ResumeController extends BaseController {

  @Autowired
  private IResumeService mResumeService;

  @ModelAttribute
  public Resume createResume() {
    return new Resume();
  }

  @GetMapping("/resume")
  public String getResume(Model model) {
    Resume resume = mResumeService.getResume();
    model.addAttribute("article", resume);
    return "resume";
  }


  @PostMapping("/update_resume.f")
  @ResponseBody
  public Object updateResume(ResumeModifyForm form, @ModelAttribute(binding = false) Resume resume) {
    mResumeService.updateResume(form, resume);
    return responseSimpleOK();
  }
}
