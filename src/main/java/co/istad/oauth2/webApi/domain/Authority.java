package co.istad.oauth2.webApi.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "authorities")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}


