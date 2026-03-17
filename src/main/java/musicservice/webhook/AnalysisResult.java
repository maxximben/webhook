package musicservice.webhook;

import lombok.Data;

import java.util.Map;

@Data
public class AnalysisResult {
    private String jobId;
    private String status;
    private Double audioLengthSeconds;
    private MusicNN musicnn;
    private Discogs discogs;
    private String error;
}

@Data
class MusicNN {
    private String model;
    private Integer totalTags;
    private Map<String, Double> tags;
}

@Data
class Discogs {
    private String model;
    private Integer totalTags;
    private Map<String, Double> tags;
}