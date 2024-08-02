package org.itinstruct.config;

public class Config {
    private API api;
    public API getApi() {
        return api;
    }

    public void setApi(API api) {
        this.api = api;
    }

    public static class API{
        private String baseURL;

        public String getBaseURL() {
            return baseURL;
        }

        public void setBaseURL(String baseURL) {
            this.baseURL = baseURL;
        }

        public Endpoints getEndpoints() {
            return endpoints;
        }

        public void setEndpoints(Endpoints endpoints) {
            this.endpoints = endpoints;
        }

        public Headers getHeaders() {
            return headers;
        }

        public void setHeaders(Headers headers) {
            this.headers = headers;
        }

        private Endpoints endpoints;
        private Headers headers;

        public static class Endpoints{
            public String getGetSingleUser() {
                return getSingleUser;
            }

            public void setGetSingleUser(String getSingleUser) {
                this.getSingleUser = getSingleUser;
            }

            public String getListUsers() {
                return listUsers;
            }

            public void setListUsers(String listUsers) {
                this.listUsers = listUsers;
            }

            private String getSingleUser;
            private String listUsers;
        }
        public static class Headers{
            public String getContentType() {
                return contentType;
            }

            public void setContentType(String contentType) {
                this.contentType = contentType;
            }

            public String getAccept() {
                return accept;
            }

            public void setAccept(String accept) {
                this.accept = accept;
            }

            private String contentType;
            private String accept;
        }
    }

}
