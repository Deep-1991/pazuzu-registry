CREATE TABLE FILE (
  ID  SERIAL PRIMARY KEY,
  NAME  VARCHAR(256) NOT NULL,
  CONTENT_PATH  VARCHAR(512) NOT NULL
);

CREATE TABLE FEATURE_FILES (
  ID  SERIAL  PRIMARY KEY,
  FEATURE_ID  INT  REFERENCES FEATURE (ID),
  FILES_ID  INT  REFERENCES FILE (ID),
  UNIQUE (FEATURE_ID, FILES_ID)
);