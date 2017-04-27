package me.buhuan.config;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/4/26上午10:48
 */
@Configuration
@EnableWebSecurity
public class WebSecurytyConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity security) throws Exception{
        security.authorizeRequests()
                .antMatchers("/", "hello")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                    .formLogin()
                    .loginPage("/login")
                    .permitAll()
                .and()
                    .logout()
                    .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication()
            .withUser("user").password("passwd").roles("USER");
    }

}
