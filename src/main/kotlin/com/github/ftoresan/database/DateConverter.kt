package com.github.ftoresan.database

import java.sql.Date
import java.time.LocalDate
import javax.persistence.AttributeConverter
import javax.persistence.Converter

/**
 * Created by Fabricio Toresan on 28/05/16.
 */
@Converter(autoApply = true)
class DateConverter : AttributeConverter<LocalDate, Date> {

    override fun convertToDatabaseColumn(locDate : LocalDate?) : Date? {
        if (locDate == null) {
            return null
        }
        return Date.valueOf(locDate)
    }

    override fun convertToEntityAttribute(sqlDate : Date?) : LocalDate? {
        if (sqlDate == null) {
            return null
        }
        return sqlDate.toLocalDate()
    }
}
