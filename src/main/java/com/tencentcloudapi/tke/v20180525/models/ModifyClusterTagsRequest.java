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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterTagsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster Tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to sync the subresource Tag within the cluster
    */
    @SerializedName("SyncSubresource")
    @Expose
    private Boolean SyncSubresource;

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
     * Get Cluster Tag 
     * @return Tags Cluster Tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Cluster Tag
     * @param Tags Cluster Tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to sync the subresource Tag within the cluster 
     * @return SyncSubresource Whether to sync the subresource Tag within the cluster
     */
    public Boolean getSyncSubresource() {
        return this.SyncSubresource;
    }

    /**
     * Set Whether to sync the subresource Tag within the cluster
     * @param SyncSubresource Whether to sync the subresource Tag within the cluster
     */
    public void setSyncSubresource(Boolean SyncSubresource) {
        this.SyncSubresource = SyncSubresource;
    }

    public ModifyClusterTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyClusterTagsRequest(ModifyClusterTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.SyncSubresource != null) {
            this.SyncSubresource = new Boolean(source.SyncSubresource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SyncSubresource", this.SyncSubresource);

    }
}

