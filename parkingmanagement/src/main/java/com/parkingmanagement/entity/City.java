package com.parkingmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "CITIES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @Size(max = 256)
    private String name;

    @Column
    @Size(max = 4)
    private String code;

    @Column
    @OneToMany
    private List<ParkingFacility> parkingFacilities;

}
