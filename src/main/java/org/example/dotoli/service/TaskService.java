package org.example.dotoli.service;

import org.example.dotoli.dto.task.TaskRequestDto;
import org.example.dotoli.dto.task.TaskResponseDto;
import org.example.dotoli.dto.task.ToggleRequestDto;

public interface TaskService {

	Long createTask(TaskRequestDto dto, Long memberId);

	TaskResponseDto getTaskById(Long taskId, Long memberId);

	void updateTask(Long taskId, TaskRequestDto dto, Long memberId);

	void deleteTask(Long targetId, Long memberId);

	void toggleDone(Long targetId, ToggleRequestDto dto, Long member);

}
