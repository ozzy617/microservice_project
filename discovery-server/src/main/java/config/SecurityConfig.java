package config;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;



public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf
//                        .ignoringRequestMatchers("/eureka/**")) // Отключаем CSRF для Eureka
//                .authorizeHttpRequests(authz -> authz
//                        .anyRequest().permitAll() // Разрешаем доступ ко всем запросам
//                );
//
//        return http.build();
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.ignoringRequestMatchers("/eureka/**")) // Отключаем CSRF для Eureka
//                .authorizeHttpRequests(authz -> authz
//                        .requestMatchers("/eureka/**").permitAll() // Разрешаем доступ к Eureka без аутентификации
//                        .anyRequest().authenticated() // Все остальные запросы требуют аутентификации
//                )
//                .httpBasic(customizer -> customizer // Основная аутентификация
//                        .authenticationEntryPoint((request, response, authException) ->
//                                response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                );
//
//        return http.build();
//    }
//    @Bean
//    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser("eureka")
//                .password("password");
//    }
}
