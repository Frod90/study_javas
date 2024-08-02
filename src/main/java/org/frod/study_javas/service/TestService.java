package org.frod.study_javas.service;

import org.frod.study_javas.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {

	private final ProblemRepository problemRepository;

}
