package gov.va.vba.persistence.repository;

import gov.va.vba.persistence.entity.ModelRatingResultsStatus;
import gov.va.vba.persistence.entity.ModelRatingResultsStatusId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ProSphere User on 12/14/2016.
 */
@Repository
public interface ModelRatingResultsStatusRepository extends JpaRepository<ModelRatingResultsStatus, ModelRatingResultsStatusId> {
}
