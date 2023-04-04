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

public class LogContextInfo extends AbstractModel{

    /**
    * Log source device
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Collection path
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * Log content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Log package number
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Log number in log package
    */
    @SerializedName("PkgLogId")
    @Expose
    private Long PkgLogId;

    /**
    * Log timestamp
    */
    @SerializedName("BTime")
    @Expose
    private Long BTime;

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
     * Get Log source device 
     * @return Source Log source device
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Log source device
     * @param Source Log source device
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Collection path 
     * @return Filename Collection path
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set Collection path
     * @param Filename Collection path
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get Log content 
     * @return Content Log content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Log content
     * @param Content Log content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Log package number 
     * @return PkgId Log package number
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log package number
     * @param PkgId Log package number
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Log number in log package 
     * @return PkgLogId Log number in log package
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Log number in log package
     * @param PkgLogId Log number in log package
     */
    public void setPkgLogId(Long PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get Log timestamp 
     * @return BTime Log timestamp
     */
    public Long getBTime() {
        return this.BTime;
    }

    /**
     * Set Log timestamp
     * @param BTime Log timestamp
     */
    public void setBTime(Long BTime) {
        this.BTime = BTime;
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

    public LogContextInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogContextInfo(LogContextInfo source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new Long(source.PkgLogId);
        }
        if (source.BTime != null) {
            this.BTime = new Long(source.BTime);
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
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RawLog", this.RawLog);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);

    }
}

