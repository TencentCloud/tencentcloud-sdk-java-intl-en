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

public class DescribeRealtimeNetworkRequest extends AbstractModel{

    /**
    * Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 24 hours.
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
    * Type of data to query
sendLossRateRaw: upstream packet loss rate;
recvLossRateRaw: downstream packet loss rate.
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
     * Get Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 24 hours. 
     * @return StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 24 hours.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 24 hours.
     * @param StartTime Query start time in the format of local UNIX timestamp, such as 1588031999s, which is a point in time in the last 24 hours.
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
     * Get Type of data to query
sendLossRateRaw: upstream packet loss rate;
recvLossRateRaw: downstream packet loss rate. 
     * @return DataType Type of data to query
sendLossRateRaw: upstream packet loss rate;
recvLossRateRaw: downstream packet loss rate.
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set Type of data to query
sendLossRateRaw: upstream packet loss rate;
recvLossRateRaw: downstream packet loss rate.
     * @param DataType Type of data to query
sendLossRateRaw: upstream packet loss rate;
recvLossRateRaw: downstream packet loss rate.
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);

    }
}

