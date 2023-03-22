package ro.itschool.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WinningCombination {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  //@ManyToMany
  //List<Byte> bytes = new ArrayList<>();
  private String winningNumbers;//4,34,6,20,13,40;

  private LocalDateTime insertTime;


}
