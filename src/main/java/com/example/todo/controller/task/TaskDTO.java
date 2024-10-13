package com.example.todo.controller.task;

import com.example.todo.service.task.TaskEntity;

public record TaskDTO ( // 型を定義してる

        Long id,

        String summary,

        String description,

        String status
){
    public static TaskDTO toDTO(TaskEntity entity) { // TaskEntity を　TaskDTO に変換してる
        return new TaskDTO(
                entity.id(),
                entity.summary(),
                entity.description(),
                entity.status().name()
        );
    }
}
