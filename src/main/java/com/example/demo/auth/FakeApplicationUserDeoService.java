package com.example.demo.auth;


import com.google.common.collect.Lists;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import static com.example.demo.security.ApplicationUserRole.*;

@Repository("fake")
public class FakeApplicationUserDeoService implements ApplicationUserDeo {

    private final PasswordEncoder passwordEncoder;

    public FakeApplicationUserDeoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUser().stream().filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }


    private List<ApplicationUser> getApplicationUser() {
        List<ApplicationUser> applicationUserList = Lists.newArrayList(
                new ApplicationUser(
                        "annasmith",
                        passwordEncoder.encode("password"),
                        (List<? extends GrantedAuthority>) STUDENT.getGrantedAuthority(),
                        true,
                        true,
                        true,
                        true

                ),
                new ApplicationUser(
                        "Linka",
                        passwordEncoder.encode("password"),
                        (List<? extends GrantedAuthority>) ADMIN.getGrantedAuthority(),
                        true,
                        true,
                        true,
                        true

                ),
                new ApplicationUser(
                        "Tom",
                        passwordEncoder.encode("password"),
                        (List<? extends GrantedAuthority>) ADMINTRAINEE.getGrantedAuthority(),
                        true,
                        true,
                        true,
                        true

                )

        );

    return applicationUserList;
}
}
