package ir.mostafa.semnani.todo_reactive.todo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("todo")
public class Todo {
    @Id
    private Long id;

    private String description;

}
