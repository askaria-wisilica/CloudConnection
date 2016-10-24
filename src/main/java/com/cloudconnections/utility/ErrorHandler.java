package com.cloudconnections.utility;

/**
 * Created by Albi on 20-10-2016.
 */
public class ErrorHandler {
    public static final int TIMEOUT_EXCEPTION = 100;
    public static final int EMPTY_RESPONSE = 101;

    public static final int INVALID_RESPONSE_JSON_EXCEPTION = 105;


    public static final int BAD_REQUEST = 400;

    public static final int API_RUNNING = 401;
    public static final int API_FINISHED = 402;
    public static final  int RESPONSE_CODE_ERROR =501;

    public static class ErrorMessage {
        public static final String BAD_REQUEST = "Bad Request... header data may be wrong....";

        public static final String TIMEOUT_EXCEPTION = "Request Timed Out";
        public static final String EMPTY_RESPONSE = "Server response empty";

        public static final String INVALID_RESPONSE_JSON_EXCEPTION = "Json exception in server response";


    }

}
