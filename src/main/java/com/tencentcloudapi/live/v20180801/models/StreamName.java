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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamName extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push start time.
In UTC format, such as 2019-01-07T12:00:00Z.
    */
    @SerializedName("StreamStartTime")
    @Expose
    private String StreamStartTime;

    /**
    * Push end time.
In UTC format, such as 2019-01-07T15:00:00Z.
    */
    @SerializedName("StreamEndTime")
    @Expose
    private String StreamEndTime;

    /**
    * Stop reason.
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * Push duration in seconds.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Host IP.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Resolution.
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Application name. 
     * @return AppName Application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name.
     * @param AppName Application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Push domain name. 
     * @return DomainName Push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name.
     * @param DomainName Push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Push start time.
In UTC format, such as 2019-01-07T12:00:00Z. 
     * @return StreamStartTime Push start time.
In UTC format, such as 2019-01-07T12:00:00Z.
     */
    public String getStreamStartTime() {
        return this.StreamStartTime;
    }

    /**
     * Set Push start time.
In UTC format, such as 2019-01-07T12:00:00Z.
     * @param StreamStartTime Push start time.
In UTC format, such as 2019-01-07T12:00:00Z.
     */
    public void setStreamStartTime(String StreamStartTime) {
        this.StreamStartTime = StreamStartTime;
    }

    /**
     * Get Push end time.
In UTC format, such as 2019-01-07T15:00:00Z. 
     * @return StreamEndTime Push end time.
In UTC format, such as 2019-01-07T15:00:00Z.
     */
    public String getStreamEndTime() {
        return this.StreamEndTime;
    }

    /**
     * Set Push end time.
In UTC format, such as 2019-01-07T15:00:00Z.
     * @param StreamEndTime Push end time.
In UTC format, such as 2019-01-07T15:00:00Z.
     */
    public void setStreamEndTime(String StreamEndTime) {
        this.StreamEndTime = StreamEndTime;
    }

    /**
     * Get Stop reason. 
     * @return StopReason Stop reason.
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set Stop reason.
     * @param StopReason Stop reason.
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get Push duration in seconds. 
     * @return Duration Push duration in seconds.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Push duration in seconds.
     * @param Duration Push duration in seconds.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Host IP. 
     * @return ClientIp Host IP.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Host IP.
     * @param ClientIp Host IP.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Resolution. 
     * @return Resolution Resolution.
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution.
     * @param Resolution Resolution.
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamStartTime", this.StreamStartTime);
        this.setParamSimple(map, prefix + "StreamEndTime", this.StreamEndTime);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

