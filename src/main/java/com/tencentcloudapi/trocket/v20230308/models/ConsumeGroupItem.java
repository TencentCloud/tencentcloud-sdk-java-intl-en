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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumeGroupItem extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Consumer group name
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Enable consumption
    */
    @SerializedName("ConsumeEnable")
    @Expose
    private Boolean ConsumeEnable;

    /**
    * Ordered delivery: true
Concurrent delivery: false.
    */
    @SerializedName("ConsumeMessageOrderly")
    @Expose
    private Boolean ConsumeMessageOrderly;

    /**
    * Maximum number of retries
    */
    @SerializedName("MaxRetryTimes")
    @Expose
    private Long MaxRetryTimes;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * ID of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * Namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * Consumer group name of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerGroupV4")
    @Expose
    private String ConsumerGroupV4;

    /**
    * Complete namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * Number of subscribed topics.
    */
    @SerializedName("SubscribeTopicNum")
    @Expose
    private Long SubscribeTopicNum;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * List of bound tags
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Retry policy
    */
    @SerializedName("RetryPolicy")
    @Expose
    private RetryPolicy RetryPolicy;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Consumer group name 
     * @return ConsumerGroup Consumer group name
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group name
     * @param ConsumerGroup Consumer group name
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Enable consumption 
     * @return ConsumeEnable Enable consumption
     */
    public Boolean getConsumeEnable() {
        return this.ConsumeEnable;
    }

    /**
     * Set Enable consumption
     * @param ConsumeEnable Enable consumption
     */
    public void setConsumeEnable(Boolean ConsumeEnable) {
        this.ConsumeEnable = ConsumeEnable;
    }

    /**
     * Get Ordered delivery: true
Concurrent delivery: false. 
     * @return ConsumeMessageOrderly Ordered delivery: true
Concurrent delivery: false.
     */
    public Boolean getConsumeMessageOrderly() {
        return this.ConsumeMessageOrderly;
    }

    /**
     * Set Ordered delivery: true
Concurrent delivery: false.
     * @param ConsumeMessageOrderly Ordered delivery: true
Concurrent delivery: false.
     */
    public void setConsumeMessageOrderly(Boolean ConsumeMessageOrderly) {
        this.ConsumeMessageOrderly = ConsumeMessageOrderly;
    }

    /**
     * Get Maximum number of retries 
     * @return MaxRetryTimes Maximum number of retries
     */
    public Long getMaxRetryTimes() {
        return this.MaxRetryTimes;
    }

    /**
     * Set Maximum number of retries
     * @param MaxRetryTimes Maximum number of retries
     */
    public void setMaxRetryTimes(Long MaxRetryTimes) {
        this.MaxRetryTimes = MaxRetryTimes;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get ID of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterIdV4 ID of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set ID of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterIdV4 ID of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get Namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceV4 Namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set Namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceV4 Namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get Consumer group name of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerGroupV4 Consumer group name of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerGroupV4() {
        return this.ConsumerGroupV4;
    }

    /**
     * Set Consumer group name of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerGroupV4 Consumer group name of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerGroupV4(String ConsumerGroupV4) {
        this.ConsumerGroupV4 = ConsumerGroupV4;
    }

    /**
     * Get Complete namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNamespaceV4 Complete namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set Complete namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNamespaceV4 Complete namespace of a 4.x cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get Number of subscribed topics. 
     * @return SubscribeTopicNum Number of subscribed topics.
     */
    public Long getSubscribeTopicNum() {
        return this.SubscribeTopicNum;
    }

    /**
     * Set Number of subscribed topics.
     * @param SubscribeTopicNum Number of subscribed topics.
     */
    public void setSubscribeTopicNum(Long SubscribeTopicNum) {
        this.SubscribeTopicNum = SubscribeTopicNum;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get List of bound tags 
     * @return TagList List of bound tags
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set List of bound tags
     * @param TagList List of bound tags
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Retry policy 
     * @return RetryPolicy Retry policy
     */
    public RetryPolicy getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy
     * @param RetryPolicy Retry policy
     */
    public void setRetryPolicy(RetryPolicy RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    public ConsumeGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumeGroupItem(ConsumeGroupItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.ConsumeEnable != null) {
            this.ConsumeEnable = new Boolean(source.ConsumeEnable);
        }
        if (source.ConsumeMessageOrderly != null) {
            this.ConsumeMessageOrderly = new Boolean(source.ConsumeMessageOrderly);
        }
        if (source.MaxRetryTimes != null) {
            this.MaxRetryTimes = new Long(source.MaxRetryTimes);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterIdV4 != null) {
            this.ClusterIdV4 = new String(source.ClusterIdV4);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.ConsumerGroupV4 != null) {
            this.ConsumerGroupV4 = new String(source.ConsumerGroupV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.SubscribeTopicNum != null) {
            this.SubscribeTopicNum = new Long(source.SubscribeTopicNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.RetryPolicy != null) {
            this.RetryPolicy = new RetryPolicy(source.RetryPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "ConsumeEnable", this.ConsumeEnable);
        this.setParamSimple(map, prefix + "ConsumeMessageOrderly", this.ConsumeMessageOrderly);
        this.setParamSimple(map, prefix + "MaxRetryTimes", this.MaxRetryTimes);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterIdV4", this.ClusterIdV4);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "ConsumerGroupV4", this.ConsumerGroupV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "SubscribeTopicNum", this.SubscribeTopicNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamObj(map, prefix + "RetryPolicy.", this.RetryPolicy);

    }
}

