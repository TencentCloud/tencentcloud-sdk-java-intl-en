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

public class CreateRocketMQNamespaceRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Retention time of unconsumed messages in milliseconds. Value range: 60 seconds–15 days
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * Retention time of persisted messages in milliseconds
    */
    @SerializedName("RetentionTime")
    @Expose
    private Long RetentionTime;

    /**
    * Remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores 
     * @return NamespaceId Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores
     * @param NamespaceId Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Retention time of unconsumed messages in milliseconds. Value range: 60 seconds–15 days 
     * @return Ttl Retention time of unconsumed messages in milliseconds. Value range: 60 seconds–15 days
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set Retention time of unconsumed messages in milliseconds. Value range: 60 seconds–15 days
     * @param Ttl Retention time of unconsumed messages in milliseconds. Value range: 60 seconds–15 days
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Retention time of persisted messages in milliseconds 
     * @return RetentionTime Retention time of persisted messages in milliseconds
     */
    public Long getRetentionTime() {
        return this.RetentionTime;
    }

    /**
     * Set Retention time of persisted messages in milliseconds
     * @param RetentionTime Retention time of persisted messages in milliseconds
     */
    public void setRetentionTime(Long RetentionTime) {
        this.RetentionTime = RetentionTime;
    }

    /**
     * Get Remarks (up to 128 characters) 
     * @return Remark Remarks (up to 128 characters)
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters)
     * @param Remark Remarks (up to 128 characters)
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public CreateRocketMQNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQNamespaceRequest(CreateRocketMQNamespaceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Ttl != null) {
            this.Ttl = new Long(source.Ttl);
        }
        if (source.RetentionTime != null) {
            this.RetentionTime = new Long(source.RetentionTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "RetentionTime", this.RetentionTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

