package io.github.nahidrasel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class WebControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldGetUserDetails() throws Exception{
        mockMvc.perform(get("/api/services")).andExpect(status().isOk());
    }
}
