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

public class ModifyEnvironmentAttributesRequest extends AbstractModel {

    /**
    * Namespace name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s (or 15 days).
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Message retention policy
    */
    @SerializedName("RetentionPolicy")
    @Expose
    private RetentionPolicy RetentionPolicy;

    /**
    * Whether to enable "Auto-Create Subscription"
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
     * Get Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s (or 15 days). 
     * @return MsgTTL Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s (or 15 days).
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s (or 15 days).
     * @param MsgTTL Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s (or 15 days).
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Remarks (up to 128 characters). 
     * @return Remark Remarks (up to 128 characters).
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
     * @param Remark Remarks (up to 128 characters).
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Message retention policy 
     * @return RetentionPolicy Message retention policy
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.RetentionPolicy;
    }

    /**
     * Set Message retention policy
     * @param RetentionPolicy Message retention policy
     */
    public void setRetentionPolicy(RetentionPolicy RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    /**
     * Get Whether to enable "Auto-Create Subscription" 
     * @return AutoSubscriptionCreation Whether to enable "Auto-Create Subscription"
     */
    public Boolean getAutoSubscriptionCreation() {
        return this.AutoSubscriptionCreation;
    }

    /**
     * Set Whether to enable "Auto-Create Subscription"
     * @param AutoSubscriptionCreation Whether to enable "Auto-Create Subscription"
     */
    public void setAutoSubscriptionCreation(Boolean AutoSubscriptionCreation) {
        this.AutoSubscriptionCreation = AutoSubscriptionCreation;
    }

    public ModifyEnvironmentAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvironmentAttributesRequest(ModifyEnvironmentAttributesRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "RetentionPolicy.", this.RetentionPolicy);
        this.setParamSimple(map, prefix + "AutoSubscriptionCreation", this.AutoSubscriptionCreation);

    }
}

