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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetClusterListItem extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster status
`CSR_RUNNING`: Running
`CSR_EXCEPTION`: Abnormal
`CSR_DEL`: Deleted
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Bound rule name
    */
    @SerializedName("BindRuleName")
    @Expose
    private String BindRuleName;

    /**
    * Cluster type:
`CT_TKE`: TKE cluster
`CT_USER_CREATE`: External cluster
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get Cluster ID 
     * @return ClusterID Cluster ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set Cluster ID
     * @param ClusterID Cluster ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster status
`CSR_RUNNING`: Running
`CSR_EXCEPTION`: Abnormal
`CSR_DEL`: Deleted 
     * @return Status Cluster status
`CSR_RUNNING`: Running
`CSR_EXCEPTION`: Abnormal
`CSR_DEL`: Deleted
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status
`CSR_RUNNING`: Running
`CSR_EXCEPTION`: Abnormal
`CSR_DEL`: Deleted
     * @param Status Cluster status
`CSR_RUNNING`: Running
`CSR_EXCEPTION`: Abnormal
`CSR_DEL`: Deleted
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Bound rule name 
     * @return BindRuleName Bound rule name
     */
    public String getBindRuleName() {
        return this.BindRuleName;
    }

    /**
     * Set Bound rule name
     * @param BindRuleName Bound rule name
     */
    public void setBindRuleName(String BindRuleName) {
        this.BindRuleName = BindRuleName;
    }

    /**
     * Get Cluster type:
`CT_TKE`: TKE cluster
`CT_USER_CREATE`: External cluster 
     * @return ClusterType Cluster type:
`CT_TKE`: TKE cluster
`CT_USER_CREATE`: External cluster
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set Cluster type:
`CT_TKE`: TKE cluster
`CT_USER_CREATE`: External cluster
     * @param ClusterType Cluster type:
`CT_TKE`: TKE cluster
`CT_USER_CREATE`: External cluster
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public AssetClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterListItem(AssetClusterListItem source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindRuleName != null) {
            this.BindRuleName = new String(source.BindRuleName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindRuleName", this.BindRuleName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

