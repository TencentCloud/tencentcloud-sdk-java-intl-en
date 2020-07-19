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

public class CreateRecordTaskRequest extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Recording task end time in UNIX timestamp, which must be after `StartTime` and within 24 hours from the current time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Recording task start time in UNIX timestamp. If this parameter is left empty, it indicates to start recording immediately. It must be within 24 hours from the current time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Push type. Default value: 0. Valid values:
0: LVB push.
1: mixed stream, i.e., A + B = C mixed stream.
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * Recording template ID, which is the returned value of `CreateLiveRecordTemplate`. If this parameter is left empty or incorrect, the stream will be recorded in HLS format and retained permanently by default.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Extended field, which is empty by default.
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

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
     * Get Push path. 
     * @return AppName Push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path.
     * @param AppName Push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Recording task end time in UNIX timestamp, which must be after `StartTime` and within 24 hours from the current time. 
     * @return EndTime Recording task end time in UNIX timestamp, which must be after `StartTime` and within 24 hours from the current time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Recording task end time in UNIX timestamp, which must be after `StartTime` and within 24 hours from the current time.
     * @param EndTime Recording task end time in UNIX timestamp, which must be after `StartTime` and within 24 hours from the current time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Recording task start time in UNIX timestamp. If this parameter is left empty, it indicates to start recording immediately. It must be within 24 hours from the current time. 
     * @return StartTime Recording task start time in UNIX timestamp. If this parameter is left empty, it indicates to start recording immediately. It must be within 24 hours from the current time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Recording task start time in UNIX timestamp. If this parameter is left empty, it indicates to start recording immediately. It must be within 24 hours from the current time.
     * @param StartTime Recording task start time in UNIX timestamp. If this parameter is left empty, it indicates to start recording immediately. It must be within 24 hours from the current time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Push type. Default value: 0. Valid values:
0: LVB push.
1: mixed stream, i.e., A + B = C mixed stream. 
     * @return StreamType Push type. Default value: 0. Valid values:
0: LVB push.
1: mixed stream, i.e., A + B = C mixed stream.
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Push type. Default value: 0. Valid values:
0: LVB push.
1: mixed stream, i.e., A + B = C mixed stream.
     * @param StreamType Push type. Default value: 0. Valid values:
0: LVB push.
1: mixed stream, i.e., A + B = C mixed stream.
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Recording template ID, which is the returned value of `CreateLiveRecordTemplate`. If this parameter is left empty or incorrect, the stream will be recorded in HLS format and retained permanently by default. 
     * @return TemplateId Recording template ID, which is the returned value of `CreateLiveRecordTemplate`. If this parameter is left empty or incorrect, the stream will be recorded in HLS format and retained permanently by default.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Recording template ID, which is the returned value of `CreateLiveRecordTemplate`. If this parameter is left empty or incorrect, the stream will be recorded in HLS format and retained permanently by default.
     * @param TemplateId Recording template ID, which is the returned value of `CreateLiveRecordTemplate`. If this parameter is left empty or incorrect, the stream will be recorded in HLS format and retained permanently by default.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Extended field, which is empty by default. 
     * @return Extension Extended field, which is empty by default.
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set Extended field, which is empty by default.
     * @param Extension Extended field, which is empty by default.
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

