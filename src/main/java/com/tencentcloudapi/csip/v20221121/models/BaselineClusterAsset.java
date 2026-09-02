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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineClusterAsset extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster type.</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Total nodes in the cluster.</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>Number of online nodes in the cluster.</p>
    */
    @SerializedName("OnlineNodeCount")
    @Expose
    private Long OnlineNodeCount;

    /**
    * <p>Appid of the tenant associated with the cluster.</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * <p>Cluster sub-asset name (Pod name/Node name/Container name/Namespace name; cluster name for CLUSTER type).</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster type.</p> 
     * @return ClusterType <p>Cluster type.</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type.</p>
     * @param ClusterType <p>Cluster type.</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Total nodes in the cluster.</p> 
     * @return NodeCount <p>Total nodes in the cluster.</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>Total nodes in the cluster.</p>
     * @param NodeCount <p>Total nodes in the cluster.</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>Number of online nodes in the cluster.</p> 
     * @return OnlineNodeCount <p>Number of online nodes in the cluster.</p>
     */
    public Long getOnlineNodeCount() {
        return this.OnlineNodeCount;
    }

    /**
     * Set <p>Number of online nodes in the cluster.</p>
     * @param OnlineNodeCount <p>Number of online nodes in the cluster.</p>
     */
    public void setOnlineNodeCount(Long OnlineNodeCount) {
        this.OnlineNodeCount = OnlineNodeCount;
    }

    /**
     * Get <p>Appid of the tenant associated with the cluster.</p> 
     * @return Appid <p>Appid of the tenant associated with the cluster.</p>
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>Appid of the tenant associated with the cluster.</p>
     * @param Appid <p>Appid of the tenant associated with the cluster.</p>
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>Cluster sub-asset name (Pod name/Node name/Container name/Namespace name; cluster name for CLUSTER type).</p> 
     * @return AssetName <p>Cluster sub-asset name (Pod name/Node name/Container name/Namespace name; cluster name for CLUSTER type).</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>Cluster sub-asset name (Pod name/Node name/Container name/Namespace name; cluster name for CLUSTER type).</p>
     * @param AssetName <p>Cluster sub-asset name (Pod name/Node name/Container name/Namespace name; cluster name for CLUSTER type).</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    public BaselineClusterAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineClusterAsset(BaselineClusterAsset source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.OnlineNodeCount != null) {
            this.OnlineNodeCount = new Long(source.OnlineNodeCount);
        }
        if (source.Appid != null) {
            this.Appid = new Long(source.Appid);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "OnlineNodeCount", this.OnlineNodeCount);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);

    }
}

