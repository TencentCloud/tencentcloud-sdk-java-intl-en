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

public class AlarmTargetInfo extends AbstractModel{

    /**
    * Logset ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Logset name
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

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
    * Query statement
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * Monitoring object number
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * Offset of the query start time from the current time. The value cannot be positive. Value range: -1440–0.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Long StartTimeOffset;

    /**
    * Offset of the query end time from the current time. The value cannot be positive and must be greater than `StartTimeOffset`. Value range: -1440–0.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Long EndTimeOffset;

    /**
     * Get Logset ID 
     * @return LogsetId Logset ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
     * @param LogsetId Logset ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Logset name 
     * @return LogsetName Logset name
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name
     * @param LogsetName Logset name
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
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
     * Get Query statement 
     * @return Query Query statement
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set Query statement
     * @param Query Query statement
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get Monitoring object number 
     * @return Number Monitoring object number
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Monitoring object number
     * @param Number Monitoring object number
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get Offset of the query start time from the current time. The value cannot be positive. Value range: -1440–0. 
     * @return StartTimeOffset Offset of the query start time from the current time. The value cannot be positive. Value range: -1440–0.
     */
    public Long getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Offset of the query start time from the current time. The value cannot be positive. Value range: -1440–0.
     * @param StartTimeOffset Offset of the query start time from the current time. The value cannot be positive. Value range: -1440–0.
     */
    public void setStartTimeOffset(Long StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset of the query end time from the current time. The value cannot be positive and must be greater than `StartTimeOffset`. Value range: -1440–0. 
     * @return EndTimeOffset Offset of the query end time from the current time. The value cannot be positive and must be greater than `StartTimeOffset`. Value range: -1440–0.
     */
    public Long getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset of the query end time from the current time. The value cannot be positive and must be greater than `StartTimeOffset`. Value range: -1440–0.
     * @param EndTimeOffset Offset of the query end time from the current time. The value cannot be positive and must be greater than `StartTimeOffset`. Value range: -1440–0.
     */
    public void setEndTimeOffset(Long EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public AlarmTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmTargetInfo(AlarmTargetInfo source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

