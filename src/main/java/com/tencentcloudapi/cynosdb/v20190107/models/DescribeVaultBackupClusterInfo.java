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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVaultBackupClusterInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * cluster region
    */
    @SerializedName("ClusterRegion")
    @Expose
    private String ClusterRegion;

    /**
    * AZ of the cluster
    */
    @SerializedName("ClusterZone")
    @Expose
    private String ClusterZone;

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
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster status 
     * @return ClusterStatus Cluster status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Cluster status
     * @param ClusterStatus Cluster status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get cluster region 
     * @return ClusterRegion cluster region
     */
    public String getClusterRegion() {
        return this.ClusterRegion;
    }

    /**
     * Set cluster region
     * @param ClusterRegion cluster region
     */
    public void setClusterRegion(String ClusterRegion) {
        this.ClusterRegion = ClusterRegion;
    }

    /**
     * Get AZ of the cluster 
     * @return ClusterZone AZ of the cluster
     */
    public String getClusterZone() {
        return this.ClusterZone;
    }

    /**
     * Set AZ of the cluster
     * @param ClusterZone AZ of the cluster
     */
    public void setClusterZone(String ClusterZone) {
        this.ClusterZone = ClusterZone;
    }

    public DescribeVaultBackupClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVaultBackupClusterInfo(DescribeVaultBackupClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.ClusterRegion != null) {
            this.ClusterRegion = new String(source.ClusterRegion);
        }
        if (source.ClusterZone != null) {
            this.ClusterZone = new String(source.ClusterZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterRegion", this.ClusterRegion);
        this.setParamSimple(map, prefix + "ClusterZone", this.ClusterZone);

    }
}

