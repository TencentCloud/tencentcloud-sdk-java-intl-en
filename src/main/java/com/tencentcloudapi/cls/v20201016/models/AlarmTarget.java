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

public class AlarmTarget extends AbstractModel {

    /**
    * Log topic ID. Obtain the log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Query statement.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Alarm object SN. It starts from 1 and increments.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * Offset of the start time of the query time range from alarm execution time, in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1,440.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Long StartTimeOffset;

    /**
    * Offset of the end time of the query time range from alarm execution time, in minutes. The value cannot be positive and should be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Long EndTimeOffset;

    /**
    * Logset ID. Obtain the logset ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Search syntax rules. Default value is 0.
0: Lucene syntax; 1: CQL syntax.
For detailed explanation, refer to <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get Log topic ID. Obtain the log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return TopicId Log topic ID. Obtain the log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID. Obtain the log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param TopicId Log topic ID. Obtain the log topic ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Query statement. 
     * @return Query Query statement.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement.
     * @param Query Query statement.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Alarm object SN. It starts from 1 and increments. 
     * @return Number Alarm object SN. It starts from 1 and increments.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Alarm object SN. It starts from 1 and increments.
     * @param Number Alarm object SN. It starts from 1 and increments.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get Offset of the start time of the query time range from alarm execution time, in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1,440. 
     * @return StartTimeOffset Offset of the start time of the query time range from alarm execution time, in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1,440.
     */
    public Long getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Offset of the start time of the query time range from alarm execution time, in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1,440.
     * @param StartTimeOffset Offset of the start time of the query time range from alarm execution time, in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1,440.
     */
    public void setStartTimeOffset(Long StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset of the end time of the query time range from alarm execution time, in minutes. The value cannot be positive and should be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440. 
     * @return EndTimeOffset Offset of the end time of the query time range from alarm execution time, in minutes. The value cannot be positive and should be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.
     */
    public Long getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset of the end time of the query time range from alarm execution time, in minutes. The value cannot be positive and should be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.
     * @param EndTimeOffset Offset of the end time of the query time range from alarm execution time, in minutes. The value cannot be positive and should be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.
     */
    public void setEndTimeOffset(Long EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Logset ID. Obtain the logset ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1). 
     * @return LogsetId Logset ID. Obtain the logset ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID. Obtain the logset ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     * @param LogsetId Logset ID. Obtain the logset ID through [Get Log Topic List](https://www.tencentcloud.com/document/product/614/56454?from_cn_redirect=1).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Search syntax rules. Default value is 0.
0: Lucene syntax; 1: CQL syntax.
For detailed explanation, refer to <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a> 
     * @return SyntaxRule Search syntax rules. Default value is 0.
0: Lucene syntax; 1: CQL syntax.
For detailed explanation, refer to <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Search syntax rules. Default value is 0.
0: Lucene syntax; 1: CQL syntax.
For detailed explanation, refer to <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     * @param SyntaxRule Search syntax rules. Default value is 0.
0: Lucene syntax; 1: CQL syntax.
For detailed explanation, refer to <a href="https://www.tencentcloud.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Retrieve Syntax Rules</a>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public AlarmTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmTarget(AlarmTarget source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Long(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Long(source.EndTimeOffset);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

