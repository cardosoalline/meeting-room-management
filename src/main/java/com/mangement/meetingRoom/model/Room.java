package com.mangement.meetingRoom.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="meetingRoom")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="date", nullable = false)
    private String date;

    @Column(name="starHour", nullable = false)
    private String starHour;

    @Column(name="endHour", nullable = false)
    private String endHour;

}
