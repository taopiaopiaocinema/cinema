package com.gnnu.schedule.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "schedule")
@Data
public class Schedule implements Serializable{
    @Id
    @Column(name = "Schedule_ID")
    private int scheduleId;
    @Column(name = "Hall_ID")
    private Integer hallId;
    @Column(name = "Schedule_Price")
    private BigDecimal schedulePrice;
    @Column(name = "Schedule_BeginDateTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp scheduleBeginDateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "Schedule_EndDateTime")
    private Timestamp scheduleEndDateTime;
    @ManyToOne
    @JoinColumn(name = "Movie_ID")
    private Movie movie;


}
