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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Environment extends AbstractModel {

    /**
    * Namespace name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Retention period for unconsumed messages in seconds. Maximum value: 1,296,000 seconds (15 days).
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Namespace ID.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Namespace name.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * The number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Message retention policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RetentionPolicy")
    @Expose
    private RetentionPolicy RetentionPolicy;

    /**
    * Whether to enable "Auto-Create Subscription"
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoSubscriptionCreation")
    @Expose
    private Boolean AutoSubscriptionCreation;

    /**
     * Get Namespace name. 
     * @return EnvironmentId Namespace name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace name.
     * @param EnvironmentId Namespace name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Description. 
     * @return Remark Description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description.
     * @param Remark Description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Retention period for unconsumed messages in seconds. Maximum value: 1,296,000 seconds (15 days). 
     * @return MsgTTL Retention period for unconsumed messages in seconds. Maximum value: 1,296,000 seconds (15 days).
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Retention period for unconsumed messages in seconds. Maximum value: 1,296,000 seconds (15 days).
     * @param MsgTTL Retention period for unconsumed messages in seconds. Maximum value: 1,296,000 seconds (15 days).
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified. 
     * @return UpdateTime Last modified.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified.
     * @param UpdateTime Last modified.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Namespace ID. 
     * @return NamespaceId Namespace ID.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace ID.
     * @param NamespaceId Namespace ID.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Namespace name. 
     * @return NamespaceName Namespace name.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name.
     * @param NamespaceName Namespace name.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get The number of topics.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicNum The number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set The number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicNum The number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Message retention policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RetentionPolicy Message retention policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.RetentionPolicy;
    }

    /**
     * Set Message retention policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RetentionPolicy Message retention policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRetentionPolicy(RetentionPolicy RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    /**
     * Get Whether to enable "Auto-Create Subscription"
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return AutoSubscriptionCreation Whether to enable "Auto-Create Subscription"
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoSubscriptionCreation() {
        return this.AutoSubscriptionCreation;
    }

    /**
     * Set Whether to enable "Auto-Create Subscription"
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param AutoSubscriptionCreation Whether to enable "Auto-Create Subscription"
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoSubscriptionCreation(Boolean AutoSubscriptionCreation) {
        this.AutoSubscriptionCreation = AutoSubscriptionCreation;
    }

    public Environment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Environment(Environment source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.RetentionPolicy != null) {
            this.RetentionPolicy = new RetentionPolicy(source.RetentionPolicy);
        }
        if (source.AutoSubscriptionCreation != null) {
            this.AutoSubscriptionCreation = new Boolean(source.AutoSubscriptionCreation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamObj(map, prefix + "RetentionPolicy.", this.RetentionPolicy);
        this.setParamSimple(map, prefix + "AutoSubscriptionCreation", this.AutoSubscriptionCreation);

    }
}

