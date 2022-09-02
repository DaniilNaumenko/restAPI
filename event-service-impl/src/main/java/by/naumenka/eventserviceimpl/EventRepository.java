package by.naumenka.eventserviceimpl;

import by.naumenka.eventservicedto.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findAll();

    List<Event> findAllByTitle(String title);
}