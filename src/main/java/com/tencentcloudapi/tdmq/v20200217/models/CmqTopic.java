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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqTopic extends AbstractModel{

    /**
    * Topic ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Topic name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Maximum lifecycle of message in topic. After the period specified by this parameter has elapsed since a message is sent to the topic, the message will be deleted no matter whether it has been successfully pushed to the user. This parameter is measured in seconds and defaulted to one day (86,400 seconds), which cannot be modified.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Maximum message size, which ranges from 1,024 to 1,048,576 bytes (i.e., 1–1,024 KB). The default value is 65,536.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Number of messages published per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * Filtering policy selected when a subscription is created:
If `filterType` is 1, `FilterTag` will be used for filtering.
If `filterType` is 2, `BindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * Topic creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Time when the topic attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * Number of current messages in the topic (number of retained messages).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Topic ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicId Topic ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicId Topic ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Topic name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicName Topic name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicName Topic name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Maximum lifecycle of message in topic. After the period specified by this parameter has elapsed since a message is sent to the topic, the message will be deleted no matter whether it has been successfully pushed to the user. This parameter is measured in seconds and defaulted to one day (86,400 seconds), which cannot be modified.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRetentionSeconds Maximum lifecycle of message in topic. After the period specified by this parameter has elapsed since a message is sent to the topic, the message will be deleted no matter whether it has been successfully pushed to the user. This parameter is measured in seconds and defaulted to one day (86,400 seconds), which cannot be modified.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Maximum lifecycle of message in topic. After the period specified by this parameter has elapsed since a message is sent to the topic, the message will be deleted no matter whether it has been successfully pushed to the user. This parameter is measured in seconds and defaulted to one day (86,400 seconds), which cannot be modified.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRetentionSeconds Maximum lifecycle of message in topic. After the period specified by this parameter has elapsed since a message is sent to the topic, the message will be deleted no matter whether it has been successfully pushed to the user. This parameter is measured in seconds and defaulted to one day (86,400 seconds), which cannot be modified.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Maximum message size, which ranges from 1,024 to 1,048,576 bytes (i.e., 1–1,024 KB). The default value is 65,536.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxMsgSize Maximum message size, which ranges from 1,024 to 1,048,576 bytes (i.e., 1–1,024 KB). The default value is 65,536.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message size, which ranges from 1,024 to 1,048,576 bytes (i.e., 1–1,024 KB). The default value is 65,536.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxMsgSize Maximum message size, which ranges from 1,024 to 1,048,576 bytes (i.e., 1–1,024 KB). The default value is 65,536.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Number of messages published per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qps Number of messages published per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Number of messages published per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qps Number of messages published per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get Filtering policy selected when a subscription is created:
If `filterType` is 1, `FilterTag` will be used for filtering.
If `filterType` is 2, `BindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FilterType Filtering policy selected when a subscription is created:
If `filterType` is 1, `FilterTag` will be used for filtering.
If `filterType` is 2, `BindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set Filtering policy selected when a subscription is created:
If `filterType` is 1, `FilterTag` will be used for filtering.
If `filterType` is 2, `BindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FilterType Filtering policy selected when a subscription is created:
If `filterType` is 1, `FilterTag` will be used for filtering.
If `filterType` is 2, `BindingKey` will be used for filtering.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get Topic creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Topic creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Topic creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Topic creation time. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Time when the topic attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTime Time when the topic attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set Time when the topic attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTime Time when the topic attribute is last modified. A Unix timestamp accurate down to the millisecond will be returned.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get Number of current messages in the topic (number of retained messages).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgCount Number of current messages in the topic (number of retained messages).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set Number of current messages in the topic (number of retained messages).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgCount Number of current messages in the topic (number of retained messages).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateUin Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateUin Creator `Uin`. The `resource` field for CAM authentication is composed of this field.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Associated tag.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tags Associated tag.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Trace Message trace. true: enabled; false: not enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get Tenant ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TenantId Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TenantId Tenant ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Namespace name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceName Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceName Namespace name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Status Cluster status. 0: creating; 1: normal; 2: terminating; 3: deleted; 4. isolated; 5. creation failed; 6: deletion failed
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CmqTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqTopic(CmqTopic source) {
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
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

