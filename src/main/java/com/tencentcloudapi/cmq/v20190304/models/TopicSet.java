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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicSet extends AbstractModel {

    /**
    * TopicId
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * TopicName
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Qps
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * FilterType
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * CreateUin
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Tags
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to enable message trace for a topic. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get TopicId
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicId TopicId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set TopicId
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicId TopicId
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get TopicName
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicName TopicName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TopicName
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicName TopicName
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRetentionSeconds MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRetentionSeconds MsgRetentionSeconds
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMsgSize MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMsgSize MaxMsgSize
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Qps
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qps Qps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Qps
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qps Qps
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get FilterType
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterType FilterType
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set FilterType
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterType FilterType
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get CreateTime
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime CreateTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTime LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTime LastModifyTime
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get MsgCount
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgCount MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgCount MsgCount
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get CreateUin
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin CreateUin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set CreateUin
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateUin CreateUin
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Tags
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tags
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Tags
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to enable message trace for a topic. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Trace Whether to enable message trace for a topic. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Whether to enable message trace for a topic. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Trace Whether to enable message trace for a topic. true: yes, false: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    public TopicSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicSet(TopicSet source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new Long(source.LastModifyTime);
        }
        if (source.MsgCount != null) {
            this.MsgCount = new Long(source.MsgCount);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

