package ir.mostafa.semnani.todo_reactive.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public Flux<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Mono<Todo> save(Todo todo) {
        return todoRepository.save(todo);
    }

}
