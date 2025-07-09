/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScreenshotTaskRequest extends AbstractModel {

    /**
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The push domain.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The task end time, which must be a Unix timestamp and later than `StartTime` and the current time. The end time and start time cannot be more than 24 hours apart.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The ID of the screencapturing template, which is returned by `CreateLiveSnapshotTemplate`. If an incorrect template ID is passed in, the screencapturing task will fail.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * The task start time, which must be a Unix timestamp and cannot be later than six days from the current time. If you do not specify this parameter, the task will start immediately.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The publishing type. Valid values:
`0` (default): Live stream
`1`: Mixed stream
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * An extension field, which is not defined currently and is empty by default.
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

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
     * Get The push domain. 
     * @return DomainName The push domain.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The push domain.
     * @param DomainName The push domain.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
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
     * Get The task end time, which must be a Unix timestamp and later than `StartTime` and the current time. The end time and start time cannot be more than 24 hours apart. 
     * @return EndTime The task end time, which must be a Unix timestamp and later than `StartTime` and the current time. The end time and start time cannot be more than 24 hours apart.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The task end time, which must be a Unix timestamp and later than `StartTime` and the current time. The end time and start time cannot be more than 24 hours apart.
     * @param EndTime The task end time, which must be a Unix timestamp and later than `StartTime` and the current time. The end time and start time cannot be more than 24 hours apart.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The ID of the screencapturing template, which is returned by `CreateLiveSnapshotTemplate`. If an incorrect template ID is passed in, the screencapturing task will fail. 
     * @return TemplateId The ID of the screencapturing template, which is returned by `CreateLiveSnapshotTemplate`. If an incorrect template ID is passed in, the screencapturing task will fail.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The ID of the screencapturing template, which is returned by `CreateLiveSnapshotTemplate`. If an incorrect template ID is passed in, the screencapturing task will fail.
     * @param TemplateId The ID of the screencapturing template, which is returned by `CreateLiveSnapshotTemplate`. If an incorrect template ID is passed in, the screencapturing task will fail.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The task start time, which must be a Unix timestamp and cannot be later than six days from the current time. If you do not specify this parameter, the task will start immediately. 
     * @return StartTime The task start time, which must be a Unix timestamp and cannot be later than six days from the current time. If you do not specify this parameter, the task will start immediately.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The task start time, which must be a Unix timestamp and cannot be later than six days from the current time. If you do not specify this parameter, the task will start immediately.
     * @param StartTime The task start time, which must be a Unix timestamp and cannot be later than six days from the current time. If you do not specify this parameter, the task will start immediately.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The publishing type. Valid values:
`0` (default): Live stream
`1`: Mixed stream 
     * @return StreamType The publishing type. Valid values:
`0` (default): Live stream
`1`: Mixed stream
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set The publishing type. Valid values:
`0` (default): Live stream
`1`: Mixed stream
     * @param StreamType The publishing type. Valid values:
`0` (default): Live stream
`1`: Mixed stream
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get An extension field, which is not defined currently and is empty by default. 
     * @return Extension An extension field, which is not defined currently and is empty by default.
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set An extension field, which is not defined currently and is empty by default.
     * @param Extension An extension field, which is not defined currently and is empty by default.
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public CreateScreenshotTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScreenshotTaskRequest(CreateScreenshotTaskRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

