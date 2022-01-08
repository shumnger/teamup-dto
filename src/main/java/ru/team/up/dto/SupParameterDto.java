package ru.team.up.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Степан Глущенко
 * Сущность для передачи параметров в другие модули приложения, система Sup.
 */

public class SupParameterDto<T> {
    /**
     * Имя параметар
     */
    private String parameterName;

    /**
     * Тип параметра
     */
    private T parameterType;

    /**
     * Имя модуля приложения, которому посылаются парамтеры.
     */
    private AppModuleName systemName;

    /**
     * Значение парамтера.
     */
    private T parameterValue;

    /**
     * Дата создания параметра.
     */
    private LocalDate creationDate;

    /**
     * Дата и время последнего обновления парамтера.
     */
    private LocalDateTime updateDate;
}