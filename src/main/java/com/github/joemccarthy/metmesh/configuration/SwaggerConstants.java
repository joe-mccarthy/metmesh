package com.github.joemccarthy.metmesh.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SwaggerConstants {

    public final static String API_TITLE = "MetMesh API";
    public final static String API_VERSION = "0.0.0";
    public final static String API_DESCRIPTION = "";

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public class SwaggerLicence {
        public final static String NAME = "LGPL-2.1-1";
        public final static String URL = "https://opensource.org/license/lgpl-2-1";
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public class SwaggerContact {
        public final static String NAME = "Metmesh";
        public final static String EMAIL = "";
        public final static String URL = "https://github.com/joe-mccarthy/metmesh";
    }
}
