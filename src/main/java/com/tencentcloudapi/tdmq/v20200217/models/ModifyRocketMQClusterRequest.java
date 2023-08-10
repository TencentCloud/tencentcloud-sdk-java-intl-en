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

public class ModifyRocketMQClusterRequest extends AbstractModel{

    /**
    * RocketMQ cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 3–64 letters, digits, hyphens, and underscores
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether to enable the HTTP access over the public network
    */
    @SerializedName("PublicAccessEnabled")
    @Expose
    private Boolean PublicAccessEnabled;

    /**
     * Get RocketMQ cluster ID 
     * @return ClusterId RocketMQ cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set RocketMQ cluster ID
     * @param ClusterId RocketMQ cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 3–64 letters, digits, hyphens, and underscores 
     * @return ClusterName 3–64 letters, digits, hyphens, and underscores
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 3–64 letters, digits, hyphens, and underscores
     * @param ClusterName 3–64 letters, digits, hyphens, and underscores
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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

    /**
     * Get Whether to enable the HTTP access over the public network 
     * @return PublicAccessEnabled Whether to enable the HTTP access over the public network
     */
    public Boolean getPublicAccessEnabled() {
        return this.PublicAccessEnabled;
    }

    /**
     * Set Whether to enable the HTTP access over the public network
     * @param PublicAccessEnabled Whether to enable the HTTP access over the public network
     */
    public void setPublicAccessEnabled(Boolean PublicAccessEnabled) {
        this.PublicAccessEnabled = PublicAccessEnabled;
    }

    public ModifyRocketMQClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQClusterRequest(ModifyRocketMQClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PublicAccessEnabled != null) {
            this.PublicAccessEnabled = new Boolean(source.PublicAccessEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PublicAccessEnabled", this.PublicAccessEnabled);

    }
}

