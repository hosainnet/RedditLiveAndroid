package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThreadPostList {

    @SerializedName("kind")
    private String kind;

    @SerializedName("data")
    private TheadPostData threadPostData;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setThreadPostData(TheadPostData threadPostData) {
        this.threadPostData = threadPostData;
    }

    public String getKind() {
        return kind;
    }

    public TheadPostData getThreadPostData() {
        return threadPostData;
    }

    public static class TheadPostData {
        @SerializedName("modhash")
        private String modhash;
        @SerializedName("after")
        private String after;
        @SerializedName("before")
        private Object before;

        @SerializedName("children")
        private List<ThreadPost> children;

        public void setModhash(String modhash) {
            this.modhash = modhash;
        }

        public void setAfter(String after) {
            this.after = after;
        }

        public void setBefore(Object before) {
            this.before = before;
        }

        public void setChildren(List<ThreadPost> children) {
            this.children = children;
        }

        public String getModhash() {
            return modhash;
        }

        public String getAfter() {
            return after;
        }

        public Object getBefore() {
            return before;
        }

        public List<ThreadPost> getChildren() {
            return children;
        }

        public static class ThreadPost {
            @SerializedName("kind")
            private String kind;

            @SerializedName("data")
            private DataEntity data;

            public void setKind(String kind) {
                this.kind = kind;
            }

            public void setData(DataEntity data) {
                this.data = data;
            }

            public String getKind() {
                return kind;
            }

            public DataEntity getData() {
                return data;
            }

            public static class DataEntity {
                @SerializedName("body")
                private String body;
                @SerializedName("name")
                private String name;
                @SerializedName("author")
                private String author;
                @SerializedName("created")
                private double created;
                @SerializedName("created_utc")
                private double createdUtc;
                @SerializedName("body_html")
                private String bodyHtml;
                @SerializedName("stricken")
                private boolean stricken;
                @SerializedName("id")
                private String id;
                @SerializedName("embeds")
                private List<?> embeds;

                public void setBody(String body) {
                    this.body = body;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setAuthor(String author) {
                    this.author = author;
                }

                public void setCreated(double created) {
                    this.created = created;
                }

                public void setCreatedUtc(double createdUtc) {
                    this.createdUtc = createdUtc;
                }

                public void setBodyHtml(String bodyHtml) {
                    this.bodyHtml = bodyHtml;
                }

                public void setStricken(boolean stricken) {
                    this.stricken = stricken;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public void setEmbeds(List<?> embeds) {
                    this.embeds = embeds;
                }

                public String getBody() {
                    return body;
                }

                public String getName() {
                    return name;
                }

                public String getAuthor() {
                    return author;
                }

                public double getCreated() {
                    return created;
                }

                public double getCreatedUtc() {
                    return createdUtc;
                }

                public String getBodyHtml() {
                    return bodyHtml;
                }

                public boolean isStricken() {
                    return stricken;
                }

                public String getId() {
                    return id;
                }

                public List<?> getEmbeds() {
                    return embeds;
                }
            }
        }
    }
}
