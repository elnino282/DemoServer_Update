package org.example.AgentManagementBE;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Cho phép tất cả các endpoint
                .allowedOrigins("http://localhost:5174")
                .allowedOrigins("http://localhost:5173") 
                .allowedOrigins("http://localhost:5175")
                .allowedOrigins("https://*.onrender.com") // Cho phép từ Render domains
                .allowedOrigins("*") // Cho phép tất cả origin cho production (có thể giới hạn sau)
                // Cho phép nguồn gốc từ React frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Các phương thức được phép
                .allowedHeaders("*") // Cho phép tất cả header
                .allowCredentials(false); // Tắt credentials khi allow all origins
    }
}