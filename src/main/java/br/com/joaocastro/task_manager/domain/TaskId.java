package br.com.joaocastro.task_manager.domain;

import java.util.UUID;

import org.springframework.util.Assert;

public record TaskId(UUID id) {
    public TaskId {
        Assert.notNull(id, "TaskId cannot be null");
    }

    public TaskId() {
        this(UUID.randomUUID());
    }
}
