package com.cloudconnections.utility;

/**
 * Created by Albi on 20-10-2016.
 */
public class CloudConnectStatus {



    public static  final int STATE_IDLE=0;
    public static  final int STATE_RUNNING=1;
    public static  final int STATE_PRE_RUNNING=2;
    private static CloudConnectStatus wiSeCloudConnectStatus ;
    private int apiRunningStatus;

    public static CloudConnectStatus getInstance() {

        if(wiSeCloudConnectStatus==null)
            wiSeCloudConnectStatus    = new CloudConnectStatus();

        return wiSeCloudConnectStatus;
    }

    public int getApiRunningStatus() {
        return apiRunningStatus;
    }

    public void setApiRunningStatus(int apiRunningStatus) {
        this.apiRunningStatus = apiRunningStatus;
    }




}
