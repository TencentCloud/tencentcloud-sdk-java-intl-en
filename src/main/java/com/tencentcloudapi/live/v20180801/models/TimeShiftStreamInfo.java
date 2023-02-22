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

public class TimeShiftStreamInfo extends AbstractModel{

    /**
    * The group the push domain belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * The push domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The stream start time, which is a Unix timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The stream end time (for streams that ended before the time of query), which is a Unix timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The transcoding template ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TransCodeId")
    @Expose
    private Long TransCodeId;

    /**
    * The stream type. `0`: The original stream; `1`: The watermarked stream; `2`: The transcoded stream.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * The storage duration (seconds) of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get The group the push domain belongs to.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainGroup The group the push domain belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set The group the push domain belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainGroup The group the push domain belongs to.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get The push domain. 
     * @return Domain The push domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The push domain.
     * @param Domain The push domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The push path. 
     * @return AppName The push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path.
     * @param AppName The push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The stream name. 
     * @return StreamName The stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
     * @param StreamName The stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The stream start time, which is a Unix timestamp. 
     * @return StartTime The stream start time, which is a Unix timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The stream start time, which is a Unix timestamp.
     * @param StartTime The stream start time, which is a Unix timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The stream end time (for streams that ended before the time of query), which is a Unix timestamp. 
     * @return EndTime The stream end time (for streams that ended before the time of query), which is a Unix timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The stream end time (for streams that ended before the time of query), which is a Unix timestamp.
     * @param EndTime The stream end time (for streams that ended before the time of query), which is a Unix timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The transcoding template ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TransCodeId The transcoding template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTransCodeId() {
        return this.TransCodeId;
    }

    /**
     * Set The transcoding template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TransCodeId The transcoding template ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTransCodeId(Long TransCodeId) {
        this.TransCodeId = TransCodeId;
    }

    /**
     * Get The stream type. `0`: The original stream; `1`: The watermarked stream; `2`: The transcoded stream. 
     * @return StreamType The stream type. `0`: The original stream; `1`: The watermarked stream; `2`: The transcoded stream.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set The stream type. `0`: The original stream; `1`: The watermarked stream; `2`: The transcoded stream.
     * @param StreamType The stream type. `0`: The original stream; `1`: The watermarked stream; `2`: The transcoded stream.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get The storage duration (seconds) of the recording.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Duration The storage duration (seconds) of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The storage duration (seconds) of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Duration The storage duration (seconds) of the recording.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public TimeShiftStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftStreamInfo(TimeShiftStreamInfo source) {
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TransCodeId != null) {
            this.TransCodeId = new Long(source.TransCodeId);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TransCodeId", this.TransCodeId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

