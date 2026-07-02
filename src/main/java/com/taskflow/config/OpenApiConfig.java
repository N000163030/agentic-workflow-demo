@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI taskFlowOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("TaskFlow API")
                        .description("Task Management System API")
                        .version("1.0"));
    }
}