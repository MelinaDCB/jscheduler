package project.scheduler;

import jakarta.persistence.*;

@Entity
public class RoomCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; // Unique ID for RoomCourse

    @OneToOne
    @JoinColumn(name = "room_id") // Foreign key reference to Room
    private Room room;

    @OneToOne
    @JoinColumn(name = "course_id") // Foreign key reference to Course
    private Course course;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
