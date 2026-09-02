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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogSearchResult extends AbstractModel {

    /**
    * <p>Time</p>
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * <p>Topic</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>Topic name.</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>Source.</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>File name</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>pkgid</p>
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * <p>pkglogid</p>
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * <p>json data</p>
    */
    @SerializedName("LogJson")
    @Expose
    private String LogJson;

    /**
    * <p>host name</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>log message</p>
    */
    @SerializedName("RawLog")
    @Expose
    private String RawLog;

    /**
    * <p>Index status.</p>
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * <p>Highlighted Information</p>
    */
    @SerializedName("HighLights")
    @Expose
    private LogHighLightItem [] HighLights;

    /**
     * Get <p>Time</p> 
     * @return Time <p>Time</p>
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set <p>Time</p>
     * @param Time <p>Time</p>
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get <p>Topic</p> 
     * @return TopicId <p>Topic</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>Topic</p>
     * @param TopicId <p>Topic</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>Topic name.</p> 
     * @return TopicName <p>Topic name.</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Topic name.</p>
     * @param TopicName <p>Topic name.</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>Source.</p> 
     * @return Source <p>Source.</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>Source.</p>
     * @param Source <p>Source.</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>File name</p> 
     * @return FileName <p>File name</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>File name</p>
     * @param FileName <p>File name</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>pkgid</p> 
     * @return PkgId <p>pkgid</p>
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set <p>pkgid</p>
     * @param PkgId <p>pkgid</p>
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get <p>pkglogid</p> 
     * @return PkgLogId <p>pkglogid</p>
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set <p>pkglogid</p>
     * @param PkgLogId <p>pkglogid</p>
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get <p>json data</p> 
     * @return LogJson <p>json data</p>
     */
    public String getLogJson() {
        return this.LogJson;
    }

    /**
     * Set <p>json data</p>
     * @param LogJson <p>json data</p>
     */
    public void setLogJson(String LogJson) {
        this.LogJson = LogJson;
    }

    /**
     * Get <p>host name</p> 
     * @return HostName <p>host name</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>host name</p>
     * @param HostName <p>host name</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>log message</p> 
     * @return RawLog <p>log message</p>
     */
    public String getRawLog() {
        return this.RawLog;
    }

    /**
     * Set <p>log message</p>
     * @param RawLog <p>log message</p>
     */
    public void setRawLog(String RawLog) {
        this.RawLog = RawLog;
    }

    /**
     * Get <p>Index status.</p> 
     * @return IndexStatus <p>Index status.</p>
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set <p>Index status.</p>
     * @param IndexStatus <p>Index status.</p>
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get <p>Highlighted Information</p> 
     * @return HighLights <p>Highlighted Information</p>
     */
    public LogHighLightItem [] getHighLights() {
        return this.HighLights;
    }

    /**
     * Set <p>Highlighted Information</p>
     * @param HighLights <p>Highlighted Information</p>
     */
    public void setHighLights(LogHighLightItem [] HighLights) {
        this.HighLights = HighLights;
    }

    public LogSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSearchResult(LogSearchResult source) {
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
        if (source.HighLights != null) {
            this.HighLights = new LogHighLightItem[source.HighLights.length];
            for (int i = 0; i < source.HighLights.length; i++) {
                this.HighLights[i] = new LogHighLightItem(source.HighLights[i]);
            }
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
        this.setParamArrayObj(map, prefix + "HighLights.", this.HighLights);

    }
}

