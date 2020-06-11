/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallDetailRequest extends AbstractModel{

    /**
    * Call ID (unique call ID): sdkappid_roomgString (room ID)_createTime (room creation time in UNIX timestamp in seconds). You can get the parameter value through the `DescribeRoomInformation` API which is used to query the room list.
    */
    @SerializedName("CommId")
    @Expose
    private String CommId;

    /**
    * Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Query end time in the format of local UNIX timestamp, such as 1588031999s.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * User `sdkappid`
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * User array to query, which contains up to 6 users. If it is left empty, 6 users will be returned by default.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * Metric to query. The user list will be returned if it is left empty; all metrics will be returned if its value is `all`.
appCpu: CPU utilization of application;
sysCpu: CPU utilization of system;
aBit: upstream/downstream audio bitrate;
aBlock: audio lag duration;
vBit: upstream/downstream video bitrate;
vCapFps: video capturing frame rate;
vEncFps: video sending frame rate;
vDecFps: rendering frame rate;
vBlock: video lag duration;
aLoss: upstream/downstream audio packet loss;
vLoss: upstream/downstream video packet loss;
vWidth: upstream/downstream resolution in width;
vHeight: upstream/downstream resolution in height.
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
     * Get Call ID (unique call ID): sdkappid_roomgString (room ID)_createTime (room creation time in UNIX timestamp in seconds). You can get the parameter value through the `DescribeRoomInformation` API which is used to query the room list. 
     * @return CommId Call ID (unique call ID): sdkappid_roomgString (room ID)_createTime (room creation time in UNIX timestamp in seconds). You can get the parameter value through the `DescribeRoomInformation` API which is used to query the room list.
     */
    public String getCommId() {
        return this.CommId;
    }

    /**
     * Set Call ID (unique call ID): sdkappid_roomgString (room ID)_createTime (room creation time in UNIX timestamp in seconds). You can get the parameter value through the `DescribeRoomInformation` API which is used to query the room list.
     * @param CommId Call ID (unique call ID): sdkappid_roomgString (room ID)_createTime (room creation time in UNIX timestamp in seconds). You can get the parameter value through the `DescribeRoomInformation` API which is used to query the room list.
     */
    public void setCommId(String CommId) {
        this.CommId = CommId;
    }

    /**
     * Get Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days. 
     * @return StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     * @param StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 5 days.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in the format of local UNIX timestamp, such as 1588031999s. 
     * @return EndTime Query end time in the format of local UNIX timestamp, such as 1588031999s.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in the format of local UNIX timestamp, such as 1588031999s.
     * @param EndTime Query end time in the format of local UNIX timestamp, such as 1588031999s.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get User `sdkappid` 
     * @return SdkAppId User `sdkappid`
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User `sdkappid`
     * @param SdkAppId User `sdkappid`
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get User array to query, which contains up to 6 users. If it is left empty, 6 users will be returned by default. 
     * @return UserIds User array to query, which contains up to 6 users. If it is left empty, 6 users will be returned by default.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set User array to query, which contains up to 6 users. If it is left empty, 6 users will be returned by default.
     * @param UserIds User array to query, which contains up to 6 users. If it is left empty, 6 users will be returned by default.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get Metric to query. The user list will be returned if it is left empty; all metrics will be returned if its value is `all`.
appCpu: CPU utilization of application;
sysCpu: CPU utilization of system;
aBit: upstream/downstream audio bitrate;
aBlock: audio lag duration;
vBit: upstream/downstream video bitrate;
vCapFps: video capturing frame rate;
vEncFps: video sending frame rate;
vDecFps: rendering frame rate;
vBlock: video lag duration;
aLoss: upstream/downstream audio packet loss;
vLoss: upstream/downstream video packet loss;
vWidth: upstream/downstream resolution in width;
vHeight: upstream/downstream resolution in height. 
     * @return DataType Metric to query. The user list will be returned if it is left empty; all metrics will be returned if its value is `all`.
appCpu: CPU utilization of application;
sysCpu: CPU utilization of system;
aBit: upstream/downstream audio bitrate;
aBlock: audio lag duration;
vBit: upstream/downstream video bitrate;
vCapFps: video capturing frame rate;
vEncFps: video sending frame rate;
vDecFps: rendering frame rate;
vBlock: video lag duration;
aLoss: upstream/downstream audio packet loss;
vLoss: upstream/downstream video packet loss;
vWidth: upstream/downstream resolution in width;
vHeight: upstream/downstream resolution in height.
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set Metric to query. The user list will be returned if it is left empty; all metrics will be returned if its value is `all`.
appCpu: CPU utilization of application;
sysCpu: CPU utilization of system;
aBit: upstream/downstream audio bitrate;
aBlock: audio lag duration;
vBit: upstream/downstream video bitrate;
vCapFps: video capturing frame rate;
vEncFps: video sending frame rate;
vDecFps: rendering frame rate;
vBlock: video lag duration;
aLoss: upstream/downstream audio packet loss;
vLoss: upstream/downstream video packet loss;
vWidth: upstream/downstream resolution in width;
vHeight: upstream/downstream resolution in height.
     * @param DataType Metric to query. The user list will be returned if it is left empty; all metrics will be returned if its value is `all`.
appCpu: CPU utilization of application;
sysCpu: CPU utilization of system;
aBit: upstream/downstream audio bitrate;
aBlock: audio lag duration;
vBit: upstream/downstream video bitrate;
vCapFps: video capturing frame rate;
vEncFps: video sending frame rate;
vDecFps: rendering frame rate;
vBlock: video lag duration;
aLoss: upstream/downstream audio packet loss;
vLoss: upstream/downstream video packet loss;
vWidth: upstream/downstream resolution in width;
vHeight: upstream/downstream resolution in height.
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CommId", this.CommId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);

    }
}

