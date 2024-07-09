package codesync.ticketsystem.repositories;

import codesync.ticketsystem.entities.FacultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyEntity,Long> {
}
