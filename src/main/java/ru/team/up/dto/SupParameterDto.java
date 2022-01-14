package ru.team.up.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Степан Глущенко
 * Сущность для передачи параметров в другие модули приложения, система Sup.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SupParameterDto<T> {
    /**
     * Имя параметар
     */
    private String parameterName;

    /**
     * Имя модуля приложения, которому посылаются парамтеры.
     */
    private AppModuleNameDto systemName;

    /**
     * Значение парамтера.
     */
    private T parameterValue;
}