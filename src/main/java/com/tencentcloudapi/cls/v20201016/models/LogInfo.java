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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInfo extends AbstractModel{

    /**
    * Log time in milliseconds
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Log source IP
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Log filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * ID of the request package for log reporting
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Log ID in request package
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * Serialized JSON string of log content
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
    * Source host name of logs
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Raw log (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RawLog")
    @Expose
    private String RawLog;

    /**
    * The cause of index creation exception (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
     * Get Log time in milliseconds 
     * @return Time Log time in milliseconds
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set Log time in milliseconds
     * @param Time Log time in milliseconds
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Log source IP 
     * @return Source Log source IP
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source IP
     * @param Source Log source IP
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Log filename 
     * @return FileName Log filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Log filename
     * @param FileName Log filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get ID of the request package for log reporting 
     * @return PkgId ID of the request package for log reporting
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set ID of the request package for log reporting
     * @param PkgId ID of the request package for log reporting
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Log ID in request package 
     * @return PkgLogId Log ID in request package
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Log ID in request package
     * @param PkgLogId Log ID in request package
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get Serialized JSON string of log content
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LogJson Serialized JSON string of log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set Serialized JSON string of log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LogJson Serialized JSON string of log content
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    /**
     * Get Source host name of logs
Note: This field may return `null`, indicating that no valid value was found. 
     * @return HostName Source host name of logs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Source host name of logs
Note: This field may return `null`, indicating that no valid value was found.
     * @param HostName Source host name of logs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Raw log (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RawLog Raw log (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRawLog() {
        return this.RawLog;
    }

    /**
     * Set Raw log (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RawLog Raw log (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRawLog(String RawLog) {
        this.RawLog = RawLog;
    }

    /**
     * Get The cause of index creation exception (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IndexStatus The cause of index creation exception (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set The cause of index creation exception (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IndexStatus The cause of index creation exception (this parameter has a value only when an exception occurred while creating indexes for logs).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    public LogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInfo(LogInfo source) {
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.LogJson != null) {
            this.LogJson = new String(source.LogJson);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.RawLog != null) {
            this.RawLog = new String(source.RawLog);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "LogJson", this.LogJson);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RawLog", this.RawLog);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);

    }
}

