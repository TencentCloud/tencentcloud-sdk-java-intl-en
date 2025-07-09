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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TkeInstanceDetail extends AbstractModel {

    /**
    * The cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * The list of cluster namespaces.
    */
    @SerializedName("NamespaceList")
    @Expose
    private TkeNameSpaceDetail [] NamespaceList;

    /**
    * The cluster type.
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * The cluster version.
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
     * Get The cluster ID. 
     * @return ClusterId The cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The cluster ID.
     * @param ClusterId The cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The cluster name. 
     * @return ClusterName The cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set The cluster name.
     * @param ClusterName The cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get The list of cluster namespaces. 
     * @return NamespaceList The list of cluster namespaces.
     */
    public TkeNameSpaceDetail [] getNamespaceList() {
        return this.NamespaceList;
    }

    /**
     * Set The list of cluster namespaces.
     * @param NamespaceList The list of cluster namespaces.
     */
    public void setNamespaceList(TkeNameSpaceDetail [] NamespaceList) {
        this.NamespaceList = NamespaceList;
    }

    /**
     * Get The cluster type. 
     * @return ClusterType The cluster type.
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set The cluster type.
     * @param ClusterType The cluster type.
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get The cluster version. 
     * @return ClusterVersion The cluster version.
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set The cluster version.
     * @param ClusterVersion The cluster version.
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    public TkeInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeInstanceDetail(TkeInstanceDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NamespaceList != null) {
            this.NamespaceList = new TkeNameSpaceDetail[source.NamespaceList.length];
            for (int i = 0; i < source.NamespaceList.length; i++) {
                this.NamespaceList[i] = new TkeNameSpaceDetail(source.NamespaceList[i]);
            }
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamArrayObj(map, prefix + "NamespaceList.", this.NamespaceList);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);

    }
}

