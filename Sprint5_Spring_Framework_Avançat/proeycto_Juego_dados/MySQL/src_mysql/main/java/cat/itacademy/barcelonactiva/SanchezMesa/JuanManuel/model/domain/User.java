package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.domain;

import cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.model.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
<<<<<<< HEAD
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
=======
>>>>>>> repo5/master
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
<<<<<<< HEAD
    @Document(collection = "user")

    public class User implements UserDetails {
        @Id
        private String id;

        private String firstName;
        private String lastName;

        @Indexed(unique = true)
=======
    @Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
    public class User implements UserDetails {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String firstName;
        private String lastName;
>>>>>>> repo5/master
        private String email;
        private String password;
        @Enumerated(EnumType.STRING)
        private Role role;
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return List.of(new SimpleGrantedAuthority(role.name()));
        }

        @Override
        public String getUsername() {
            return email;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }


