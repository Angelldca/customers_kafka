package com.angelldca.customers.CustomerTest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class CustomerTest {

    @Autowired
    private MockMvc mockMvc; // Inyecta MockMvc para realizar solicitudes simuladas

    @Test
    public void testGetting() throws Exception {

        mockMvc.perform(get("/customer"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Kafka + CI/CD"));
    }
}
