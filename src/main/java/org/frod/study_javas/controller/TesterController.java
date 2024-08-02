package org.frod.study_javas.controller;

import org.frod.study_javas.service.TestService;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TesterController {

	private final TestService testService;

}
