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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCRealTimeScaleDataRequest extends AbstractModel {

    /**
    * User SDKAppId (e.g., 1400xxxxxx)
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Start time, unix timestamp, Unit: seconds (Query time range depends on the function version of the monitoring dashboard, premium edition can query up to 1 hours)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, unix timestamp, Unit: seconds
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Room ID
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
     * Get User SDKAppId (e.g., 1400xxxxxx) 
     * @return SdkAppId User SDKAppId (e.g., 1400xxxxxx)
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User SDKAppId (e.g., 1400xxxxxx)
     * @param SdkAppId User SDKAppId (e.g., 1400xxxxxx)
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Start time, unix timestamp, Unit: seconds (Query time range depends on the function version of the monitoring dashboard, premium edition can query up to 1 hours) 
     * @return StartTime Start time, unix timestamp, Unit: seconds (Query time range depends on the function version of the monitoring dashboard, premium edition can query up to 1 hours)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, unix timestamp, Unit: seconds (Query time range depends on the function version of the monitoring dashboard, premium edition can query up to 1 hours)
     * @param StartTime Start time, unix timestamp, Unit: seconds (Query time range depends on the function version of the monitoring dashboard, premium edition can query up to 1 hours)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, unix timestamp, Unit: seconds 
     * @return EndTime End time, unix timestamp, Unit: seconds
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, unix timestamp, Unit: seconds
     * @param EndTime End time, unix timestamp, Unit: seconds
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Room ID 
     * @return RoomId Room ID
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID
     * @param RoomId Room ID
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public DescribeTRTCRealTimeScaleDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCRealTimeScaleDataRequest(DescribeTRTCRealTimeScaleDataRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);

    }
}

