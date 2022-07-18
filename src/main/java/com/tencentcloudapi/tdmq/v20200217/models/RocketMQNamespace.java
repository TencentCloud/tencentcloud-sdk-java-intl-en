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

public class RocketMQNamespace extends AbstractModel{

    /**
    * Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Retention period for unconsumed messages in milliseconds. Valid range: 60 seconds–15 days.
    */
    @SerializedName("Ttl")
    @Expose
    private Long Ttl;

    /**
    * Retention period for persistently stored messages in milliseconds.
    */
    @SerializedName("RetentionTime")
    @Expose
    private Long RetentionTime;

    /**
    * Description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Public network access point address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicEndpoint")
    @Expose
    private String PublicEndpoint;

    /**
    * VPC access point address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
     * Get Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores. 
     * @return NamespaceId Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores.
     * @param NamespaceId Namespace name, which can contain 3–64 letters, digits, hyphens, and underscores.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Retention period for unconsumed messages in milliseconds. Valid range: 60 seconds–15 days. 
     * @return Ttl Retention period for unconsumed messages in milliseconds. Valid range: 60 seconds–15 days.
     */
    public Long getTtl() {
        return this.Ttl;
    }

    /**
     * Set Retention period for unconsumed messages in milliseconds. Valid range: 60 seconds–15 days.
     * @param Ttl Retention period for unconsumed messages in milliseconds. Valid range: 60 seconds–15 days.
     */
    public void setTtl(Long Ttl) {
        this.Ttl = Ttl;
    }

    /**
     * Get Retention period for persistently stored messages in milliseconds. 
     * @return RetentionTime Retention period for persistently stored messages in milliseconds.
     */
    public Long getRetentionTime() {
        return this.RetentionTime;
    }

    /**
     * Set Retention period for persistently stored messages in milliseconds.
     * @param RetentionTime Retention period for persistently stored messages in milliseconds.
     */
    public void setRetentionTime(Long RetentionTime) {
        this.RetentionTime = RetentionTime;
    }

    /**
     * Get Description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Public network access point address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicEndpoint Public network access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPublicEndpoint() {
        return this.PublicEndpoint;
    }

    /**
     * Set Public network access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicEndpoint Public network access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicEndpoint(String PublicEndpoint) {
        this.PublicEndpoint = PublicEndpoint;
    }

    /**
     * Get VPC access point address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcEndpoint VPC access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set VPC access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcEndpoint VPC access point address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    public RocketMQNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQNamespace(RocketMQNamespace source) {
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
        if (source.PublicEndpoint != null) {
            this.PublicEndpoint = new String(source.PublicEndpoint);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Ttl", this.Ttl);
        this.setParamSimple(map, prefix + "RetentionTime", this.RetentionTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicEndpoint", this.PublicEndpoint);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);

    }
}

