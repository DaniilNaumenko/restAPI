package by.naumenka.eventserviceapi;

import by.naumenka.eventservicedto.Event;
import by.naumenka.eventservicedto.EventDto;

import java.util.List;

public interface EventService {

    EventDto createEvent(EventDto eventDto);

    EventDto updateEvent(EventDto event);

    EventDto getEvent(long eventId);

    void deleteEvent(long eventId);

    List<Event> getAllEvents();

    List<Event> getAllEventsByTitle(String title);
}