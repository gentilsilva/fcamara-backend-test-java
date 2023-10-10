package com.fcamaraparking.domain.vehicles;

import com.fcamaraparking.dtos.VehicleForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity(name = "vehicles")
@Table(name = "tb_vehicles")
@Getter
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String color;
    @Column(unique = true)
    private String plate;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    public Vehicle(VehicleForm vehicleForm) {
        this.brand = vehicleForm.brand();
        this.model = vehicleForm.model();
        this.color = vehicleForm.color();
        this.plate = vehicleForm.plate();
        this.vehicleType = VehicleType.valueOf(vehicleForm.vehicleType());
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Vehicle vehicle = (Vehicle) o;
        return getId() != null && Objects.equals(getId(), vehicle.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
