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

public class DeleteLogConfigsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Name of the collection rule to be deleted. For multiple collection rules, they are separated by ",".
    */
    @SerializedName("LogConfigNames")
    @Expose
    private String LogConfigNames;

    /**
    * Cluster type: tke/eks. The default is tke cluster.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
     * Get Name of the collection rule to be deleted. For multiple collection rules, they are separated by ",". 
     * @return LogConfigNames Name of the collection rule to be deleted. For multiple collection rules, they are separated by ",".
     */
    public String getLogConfigNames() {
        return this.LogConfigNames;
    }

    /**
     * Set Name of the collection rule to be deleted. For multiple collection rules, they are separated by ",".
     * @param LogConfigNames Name of the collection rule to be deleted. For multiple collection rules, they are separated by ",".
     */
    public void setLogConfigNames(String LogConfigNames) {
        this.LogConfigNames = LogConfigNames;
    }

    /**
     * Get Cluster type: tke/eks. The default is tke cluster. 
     * @return ClusterType Cluster type: tke/eks. The default is tke cluster.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type: tke/eks. The default is tke cluster.
     * @param ClusterType Cluster type: tke/eks. The default is tke cluster.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public DeleteLogConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLogConfigsRequest(DeleteLogConfigsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LogConfigNames != null) {
            this.LogConfigNames = new String(source.LogConfigNames);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LogConfigNames", this.LogConfigNames);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

