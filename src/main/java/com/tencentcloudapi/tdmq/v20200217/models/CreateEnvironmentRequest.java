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

public class CreateEnvironmentRequest extends AbstractModel{

    /**
    * Environment (namespace) name, which can contain up to 16 letters, digits, hyphens, and underscores.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s.
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
    * Pulsar cluster ID
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
     * Get Environment (namespace) name, which can contain up to 16 letters, digits, hyphens, and underscores. 
     * @return EnvironmentId Environment (namespace) name, which can contain up to 16 letters, digits, hyphens, and underscores.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment (namespace) name, which can contain up to 16 letters, digits, hyphens, and underscores.
     * @param EnvironmentId Environment (namespace) name, which can contain up to 16 letters, digits, hyphens, and underscores.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s. 
     * @return MsgTTL Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s.
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s.
     * @param MsgTTL Retention period for unconsumed messages in seconds. Value range: 60s to 1,296,000s.
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
     * Get Pulsar cluster ID 
     * @return ClusterId Pulsar cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar cluster ID
     * @param ClusterId Pulsar cluster ID
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

    public CreateEnvironmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnvironmentRequest(CreateEnvironmentRequest source) {
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

    }
}

