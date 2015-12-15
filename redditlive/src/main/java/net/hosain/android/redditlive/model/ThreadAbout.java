package net.hosain.android.redditlive.model;

import com.google.gson.annotations.SerializedName;

public class ThreadAbout {

    @SerializedName("kind")
    private String kind;

    @SerializedName("data")
    private ThreadAboutData threadAboutData;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setThreadAboutData(ThreadAboutData threadAboutData) {
        this.threadAboutData = threadAboutData;
    }

    public String getKind() {
        return kind;
    }

    public ThreadAboutData getThreadAboutData() {
        return threadAboutData;
    }

    public static class ThreadAboutData {
        @SerializedName("description")
        private String description;
        @SerializedName("description_html")
        private String descriptionHtml;
        @SerializedName("title")
        private String title;
        @SerializedName("created")
        private double created;
        @SerializedName("created_utc")
        private double createdUtc;
        @SerializedName("websocket_url")
        private String websocketUrl;
        @SerializedName("state")
        private String state;
        @SerializedName("nsfw")
        private boolean nsfw;
        @SerializedName("viewer_count")
        private int viewerCount;
        @SerializedName("viewer_count_fuzzed")
        private boolean viewerCountFuzzed;
        @SerializedName("resources_html")
        private String resourcesHtml;
        @SerializedName("id")
        private String id;
        @SerializedName("resources")
        private String resources;
        @SerializedName("name")
        private String name;

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDescriptionHtml(String descriptionHtml) {
            this.descriptionHtml = descriptionHtml;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCreated(double created) {
            this.created = created;
        }

        public void setCreatedUtc(double createdUtc) {
            this.createdUtc = createdUtc;
        }

        public void setWebsocketUrl(String websocketUrl) {
            this.websocketUrl = websocketUrl;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setNsfw(boolean nsfw) {
            this.nsfw = nsfw;
        }

        public void setViewerCount(int viewerCount) {
            this.viewerCount = viewerCount;
        }

        public void setViewerCountFuzzed(boolean viewerCountFuzzed) {
            this.viewerCountFuzzed = viewerCountFuzzed;
        }

        public void setResourcesHtml(String resourcesHtml) {
            this.resourcesHtml = resourcesHtml;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setResources(String resources) {
            this.resources = resources;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public String getDescriptionHtml() {
            return descriptionHtml;
        }

        public String getTitle() {
            return title;
        }

        public double getCreated() {
            return created;
        }

        public double getCreatedUtc() {
            return createdUtc;
        }

        public String getWebsocketUrl() {
            return websocketUrl;
        }

        public String getState() {
            return state;
        }

        public boolean isNsfw() {
            return nsfw;
        }

        public int getViewerCount() {
            return viewerCount;
        }

        public boolean isViewerCountFuzzed() {
            return viewerCountFuzzed;
        }

        public String getResourcesHtml() {
            return resourcesHtml;
        }

        public String getId() {
            return id;
        }

        public String getResources() {
            return resources;
        }

        public String getName() {
            return name;
        }
    }
}
