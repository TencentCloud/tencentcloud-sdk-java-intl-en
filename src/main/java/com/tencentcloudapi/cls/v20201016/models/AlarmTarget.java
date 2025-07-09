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
    * Log topic IDNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Query statementNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Serial number of alarm object, which is incremental from 1.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * Offset of the query start time from the alarm execution time in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Long StartTimeOffset;

    /**
    * Offset of the query end time from the alarm execution time in minutes. The value cannot be positive and must be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Long EndTimeOffset;

    /**
    * Logset IDNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Search syntax rules; default value: 0.0: Lucene syntax; 1: CQL syntax.For detailed instructions, see <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Search Condition Syntax Rules</a>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get Log topic IDNote: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicId Log topic IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic IDNote: This field may return null, indicating that no valid values can be obtained.
     * @param TopicId Log topic IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Query statementNote: This field may return null, indicating that no valid values can be obtained. 
     * @return Query Query statementNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statementNote: This field may return null, indicating that no valid values can be obtained.
     * @param Query Query statementNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Serial number of alarm object, which is incremental from 1.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Number Serial number of alarm object, which is incremental from 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Serial number of alarm object, which is incremental from 1.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Number Serial number of alarm object, which is incremental from 1.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get Offset of the query start time from the alarm execution time in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTimeOffset Offset of the query start time from the alarm execution time in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Offset of the query start time from the alarm execution time in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTimeOffset Offset of the query start time from the alarm execution time in minutes. The value cannot be positive. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTimeOffset(Long StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset of the query end time from the alarm execution time in minutes. The value cannot be positive and must be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTimeOffset Offset of the query end time from the alarm execution time in minutes. The value cannot be positive and must be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset of the query end time from the alarm execution time in minutes. The value cannot be positive and must be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTimeOffset Offset of the query end time from the alarm execution time in minutes. The value cannot be positive and must be greater than StartTimeOffset. Maximum value: 0. Minimum value: -1440.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTimeOffset(Long EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Logset IDNote: This field may return null, indicating that no valid values can be obtained. 
     * @return LogsetId Logset IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset IDNote: This field may return null, indicating that no valid values can be obtained.
     * @param LogsetId Logset IDNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Search syntax rules; default value: 0.0: Lucene syntax; 1: CQL syntax.For detailed instructions, see <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Search Condition Syntax Rules</a>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SyntaxRule Search syntax rules; default value: 0.0: Lucene syntax; 1: CQL syntax.For detailed instructions, see <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Search Condition Syntax Rules</a>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set Search syntax rules; default value: 0.0: Lucene syntax; 1: CQL syntax.For detailed instructions, see <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Search Condition Syntax Rules</a>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SyntaxRule Search syntax rules; default value: 0.0: Lucene syntax; 1: CQL syntax.For detailed instructions, see <a href="https://intl.cloud.tencent.com/document/product/614/47044?from_cn_redirect=1#RetrievesConditionalRules" target="_blank">Search Condition Syntax Rules</a>
Note: This field may return null, indicating that no valid values can be obtained.
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

