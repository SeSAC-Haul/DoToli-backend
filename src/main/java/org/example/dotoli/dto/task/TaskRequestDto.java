package org.example.dotoli.dto.task;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Task 항목 생성/수정 요청 정보를 담는 DTO 클래스
 */
@Data
public class TaskRequestDto {

	@NotBlank(message = "내용은 필수 입력값입니다.")
	private String content;

}