package org.zalando.pazuzu.exception;


public enum Error {
    CONTAINER_NOT_FOUND("container_not_found", "Container was not found"),
    FEATURE_DUPLICATE("feature_duplicate", "Feature with this name already exists"),
    FEATURE_NAME_EMPTY("feature_name_empty", "Feature name is empty"),
    FEATURE_NOT_FOUND("feature_not_found", "Feature was not found"),
    FEATURE_NOT_DELETABLE_DUE_TO_REFERENCES("feature_not_deletable_due_to_references", "Can't delete feature because it still has references"),
    FEATURE_HAS_RECURSIVE_DEPENDENCY("feature_has_recursive_dependency", "Recursive dependencies found");


    private String code;
    private String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
