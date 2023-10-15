package io.github.nahidrasel.controller;

import io.github.nahidrasel.models.DemoResponse;
import io.github.nahidrasel.models.PostRequest;
import io.github.nahidrasel.models.PostResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

  @RequestMapping("/getdemo")
  public DemoResponse SampleGetRequest(
      @RequestParam(value = "name", defaultValue = "HumanName") String name) {
    DemoResponse response = new DemoResponse();
    response.setUserId(1);
    response.setMessage("The customer name is " + name);
    return response;
  }

  @RequestMapping(value = "/postdemo", method = RequestMethod.POST)
  public PostResponse SamplePostRequest(@RequestBody PostRequest inputPayload) {
    PostResponse response = new PostResponse();
    response.setUserId(inputPayload.getUserId() * 100);
    response.setMessage("Good day, " + inputPayload.getCustomerName());
    response.setExtra("Thanks for Requesting the Response");
    return response;
  }
}
