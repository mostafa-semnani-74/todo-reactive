package ir.mostafa.semnani.todo_reactive.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public Flux<Todo> findAll() {
        return todoService.findAll();
    }

    @PostMapping
    public Mono<Todo> save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

}
