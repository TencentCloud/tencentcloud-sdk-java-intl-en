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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreviewLogStatistic extends AbstractModel {

    /**
    * Log content
    */
    @SerializedName("LogContent")
    @Expose
    private String LogContent;

    /**
    * Line number
    */
    @SerializedName("LineNum")
    @Expose
    private Long LineNum;

    /**
    * Target log topic
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * Error code. An empty string "" indicates no error.
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Log timestamp
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstTopicName")
    @Expose
    private String DstTopicName;

    /**
     * Get Log content 
     * @return LogContent Log content
     */
    public String getLogContent() {
        return this.LogContent;
    }

    /**
     * Set Log content
     * @param LogContent Log content
     */
    public void setLogContent(String LogContent) {
        this.LogContent = LogContent;
    }

    /**
     * Get Line number 
     * @return LineNum Line number
     */
    public Long getLineNum() {
        return this.LineNum;
    }

    /**
     * Set Line number
     * @param LineNum Line number
     */
    public void setLineNum(Long LineNum) {
        this.LineNum = LineNum;
    }

    /**
     * Get Target log topic 
     * @return DstTopicId Target log topic
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set Target log topic
     * @param DstTopicId Target log topic
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get Error code. An empty string "" indicates no error. 
     * @return FailReason Error code. An empty string "" indicates no error.
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Error code. An empty string "" indicates no error.
     * @param FailReason Error code. An empty string "" indicates no error.
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Log timestamp 
     * @return Time Log timestamp
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Log timestamp
     * @param Time Log timestamp
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Target topic name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstTopicName Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDstTopicName() {
        return this.DstTopicName;
    }

    /**
     * Set Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstTopicName Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstTopicName(String DstTopicName) {
        this.DstTopicName = DstTopicName;
    }

    public PreviewLogStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreviewLogStatistic(PreviewLogStatistic source) {
        if (source.LogContent != null) {
            this.LogContent = new String(source.LogContent);
        }
        if (source.LineNum != null) {
            this.LineNum = new Long(source.LineNum);
        }
        if (source.DstTopicId != null) {
            this.DstTopicId = new String(source.DstTopicId);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.DstTopicName != null) {
            this.DstTopicName = new String(source.DstTopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogContent", this.LogContent);
        this.setParamSimple(map, prefix + "LineNum", this.LineNum);
        this.setParamSimple(map, prefix + "DstTopicId", this.DstTopicId);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "DstTopicName", this.DstTopicName);

    }
}

