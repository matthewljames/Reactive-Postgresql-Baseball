package com.baseball.docker.compose.reactive.resourceImpl;

import com.baseball.docker.compose.reactive.v1.api.StadiumResourceAPI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/stadiums")
public class StadiumResourceImpl implements StadiumResourceAPI {
}
