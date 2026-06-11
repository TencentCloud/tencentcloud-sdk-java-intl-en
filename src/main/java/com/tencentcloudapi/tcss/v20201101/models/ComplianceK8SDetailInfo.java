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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceK8SDetailInfo extends AbstractModel {

    /**
    * Name of the K8S cluster.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Kubernetes Cluster Version
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
     * Get Name of the K8S cluster. 
     * @return ClusterName Name of the K8S cluster.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Name of the K8S cluster.
     * @param ClusterName Name of the K8S cluster.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Kubernetes Cluster Version 
     * @return ClusterVersion Kubernetes Cluster Version
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set Kubernetes Cluster Version
     * @param ClusterVersion Kubernetes Cluster Version
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    public ComplianceK8SDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceK8SDetailInfo(ComplianceK8SDetailInfo source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);

    }
}

