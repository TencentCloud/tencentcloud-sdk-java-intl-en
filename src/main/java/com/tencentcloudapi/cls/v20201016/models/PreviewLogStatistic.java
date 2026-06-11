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
    * Line number. Starts from 0.
    */
    @SerializedName("LineNum")
    @Expose
    private Long LineNum;

    /**
    * target log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("DstTopicId")
    @Expose
    private String DstTopicId;

    /**
    * Error message for failure. A null string "" indicates normal.
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * Log time, format: `2024-05-07 17:13:17.105`

-Invalid input parameter
-Valid at that time, the time format in logs
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
     * Get Line number. Starts from 0. 
     * @return LineNum Line number. Starts from 0.
     */
    public Long getLineNum() {
        return this.LineNum;
    }

    /**
     * Set Line number. Starts from 0.
     * @param LineNum Line number. Starts from 0.
     */
    public void setLineNum(Long LineNum) {
        this.LineNum = LineNum;
    }

    /**
     * Get target log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return DstTopicId target log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getDstTopicId() {
        return this.DstTopicId;
    }

    /**
     * Set target log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param DstTopicId target log topic ID
-Obtain the log topic Id through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setDstTopicId(String DstTopicId) {
        this.DstTopicId = DstTopicId;
    }

    /**
     * Get Error message for failure. A null string "" indicates normal. 
     * @return FailReason Error message for failure. A null string "" indicates normal.
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set Error message for failure. A null string "" indicates normal.
     * @param FailReason Error message for failure. A null string "" indicates normal.
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get Log time, format: `2024-05-07 17:13:17.105`

-Invalid input parameter
-Valid at that time, the time format in logs 
     * @return Time Log time, format: `2024-05-07 17:13:17.105`

-Invalid input parameter
-Valid at that time, the time format in logs
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Log time, format: `2024-05-07 17:13:17.105`

-Invalid input parameter
-Valid at that time, the time format in logs
     * @param Time Log time, format: `2024-05-07 17:13:17.105`

-Invalid input parameter
-Valid at that time, the time format in logs
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Target topic name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstTopicName Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getDstTopicName() {
        return this.DstTopicName;
    }

    /**
     * Set Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstTopicName Target topic name
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
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

