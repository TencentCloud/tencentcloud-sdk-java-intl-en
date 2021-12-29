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

public class CreateClusterRequest extends AbstractModel{

    /**
    * Cluster name, which can contain up to 16 letters, digits, hyphens, and underscores.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * ID of your dedicated physical cluster. If it is not passed in, cluster resources will be created in a public cluster by default.
    */
    @SerializedName("BindClusterId")
    @Expose
    private Long BindClusterId;

    /**
    * Remarks (up to 128 characters).
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * List of cluster tags
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
    */
    @SerializedName("PublicAccessEnabled")
    @Expose
    private Boolean PublicAccessEnabled;

    /**
     * Get Cluster name, which can contain up to 16 letters, digits, hyphens, and underscores. 
     * @return ClusterName Cluster name, which can contain up to 16 letters, digits, hyphens, and underscores.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name, which can contain up to 16 letters, digits, hyphens, and underscores.
     * @param ClusterName Cluster name, which can contain up to 16 letters, digits, hyphens, and underscores.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get ID of your dedicated physical cluster. If it is not passed in, cluster resources will be created in a public cluster by default. 
     * @return BindClusterId ID of your dedicated physical cluster. If it is not passed in, cluster resources will be created in a public cluster by default.
     */
    public Long getBindClusterId() {
        return this.BindClusterId;
    }

    /**
     * Set ID of your dedicated physical cluster. If it is not passed in, cluster resources will be created in a public cluster by default.
     * @param BindClusterId ID of your dedicated physical cluster. If it is not passed in, cluster resources will be created in a public cluster by default.
     */
    public void setBindClusterId(Long BindClusterId) {
        this.BindClusterId = BindClusterId;
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
     * Get List of cluster tags 
     * @return Tags List of cluster tags
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of cluster tags
     * @param Tags List of cluster tags
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default 
     * @return PublicAccessEnabled Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
     */
    public Boolean getPublicAccessEnabled() {
        return this.PublicAccessEnabled;
    }

    /**
     * Set Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
     * @param PublicAccessEnabled Whether to enable public network access. If this parameter is left empty, the feature will be enabled by default
     */
    public void setPublicAccessEnabled(Boolean PublicAccessEnabled) {
        this.PublicAccessEnabled = PublicAccessEnabled;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.BindClusterId != null) {
            this.BindClusterId = new Long(source.BindClusterId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PublicAccessEnabled != null) {
            this.PublicAccessEnabled = new Boolean(source.PublicAccessEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "BindClusterId", this.BindClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PublicAccessEnabled", this.PublicAccessEnabled);

    }
}

