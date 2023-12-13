package com.github.shoppingmallproject.repository.user_roles;

import com.github.shoppingmallproject.repository.users.UserEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "user_roles")
@Getter
public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_roles_id")
    private Integer userRolesId;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "roles",nullable = false)
    private Roles roles;
}
