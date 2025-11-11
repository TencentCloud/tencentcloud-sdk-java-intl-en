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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInfo extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Maximum disk of the cluster (unit: GB).
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * Maximum bandwidth of the cluster. unit: MB/s.
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Current availability of cluster disk (unit: GB).
    */
    @SerializedName("AvailableDiskSize")
    @Expose
    private Long AvailableDiskSize;

    /**
    * Available bandwidth of the cluster. unit: MB/s.
    */
    @SerializedName("AvailableBandWidth")
    @Expose
    private Long AvailableBandWidth;

    /**
    * Indicates the AZ to which the cluster belongs.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get Maximum disk of the cluster (unit: GB). 
     * @return MaxDiskSize Maximum disk of the cluster (unit: GB).
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Maximum disk of the cluster (unit: GB).
     * @param MaxDiskSize Maximum disk of the cluster (unit: GB).
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get Maximum bandwidth of the cluster. unit: MB/s. 
     * @return MaxBandWidth Maximum bandwidth of the cluster. unit: MB/s.
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Maximum bandwidth of the cluster. unit: MB/s.
     * @param MaxBandWidth Maximum bandwidth of the cluster. unit: MB/s.
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Current availability of cluster disk (unit: GB). 
     * @return AvailableDiskSize Current availability of cluster disk (unit: GB).
     */
    public Long getAvailableDiskSize() {
        return this.AvailableDiskSize;
    }

    /**
     * Set Current availability of cluster disk (unit: GB).
     * @param AvailableDiskSize Current availability of cluster disk (unit: GB).
     */
    public void setAvailableDiskSize(Long AvailableDiskSize) {
        this.AvailableDiskSize = AvailableDiskSize;
    }

    /**
     * Get Available bandwidth of the cluster. unit: MB/s. 
     * @return AvailableBandWidth Available bandwidth of the cluster. unit: MB/s.
     */
    public Long getAvailableBandWidth() {
        return this.AvailableBandWidth;
    }

    /**
     * Set Available bandwidth of the cluster. unit: MB/s.
     * @param AvailableBandWidth Available bandwidth of the cluster. unit: MB/s.
     */
    public void setAvailableBandWidth(Long AvailableBandWidth) {
        this.AvailableBandWidth = AvailableBandWidth;
    }

    /**
     * Get Indicates the AZ to which the cluster belongs. 
     * @return ZoneId Indicates the AZ to which the cluster belongs.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Indicates the AZ to which the cluster belongs.
     * @param ZoneId Indicates the AZ to which the cluster belongs.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located. 
     * @return ZoneIds The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
     * @param ZoneIds The AZ where the cluster nodes are located. If the cluster is a cross-AZ cluster, it includes multiple AZs where the cluster nodes are located.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    public ClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInfo(ClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.AvailableDiskSize != null) {
            this.AvailableDiskSize = new Long(source.AvailableDiskSize);
        }
        if (source.AvailableBandWidth != null) {
            this.AvailableBandWidth = new Long(source.AvailableBandWidth);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "AvailableDiskSize", this.AvailableDiskSize);
        this.setParamSimple(map, prefix + "AvailableBandWidth", this.AvailableBandWidth);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);

    }
}

