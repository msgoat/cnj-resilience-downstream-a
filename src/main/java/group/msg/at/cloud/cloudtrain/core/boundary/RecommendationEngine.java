package group.msg.at.cloud.cloudtrain.core.boundary;

import group.msg.at.cloud.cloudtrain.core.entity.RecommendedItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RecommendationEngine {

    @Autowired
    private UnexpectedBehaviour behaviour;

    public List<RecommendedItem> calculateRecommendations(String userId) {
        behaviour.applyUnexpectedBehaviour();
        List<RecommendedItem> result = new ArrayList<>();
        result.add(new RecommendedItem(UUID.randomUUID(), "Truthseekers", BigDecimal.valueOf(98, 100)));
        result.add(new RecommendedItem(UUID.randomUUID(), "Into the Badlands", BigDecimal.valueOf(94, 100)));
        return result;
    }
}
