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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceItemExtraInfo extends AbstractModel {

    /**
    * Whether it is a vip.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * Specifies the dedicated cluster status of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VipInstanceStatus")
    @Expose
    private Long VipInstanceStatus;

    /**
    * Specifies the peak bandwidth of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Exclusive cluster specification.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Specifies the quantity of exclusive cluster nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Specifies the maximum storage of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Specifies the maximum retention time of the dedicated cluster. the unit is hour.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * Special project cluster maximum retention time, unit: hr.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinRetention")
    @Expose
    private Long MinRetention;

    /**
    * Status of 4.0 shared cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Whether it is frozen.
    */
    @SerializedName("IsFrozen")
    @Expose
    private Boolean IsFrozen;

    /**
     * Get Whether it is a vip.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsVip Whether it is a vip.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set Whether it is a vip.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsVip Whether it is a vip.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get Specifies the dedicated cluster status of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VipInstanceStatus Specifies the dedicated cluster status of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVipInstanceStatus() {
        return this.VipInstanceStatus;
    }

    /**
     * Set Specifies the dedicated cluster status of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VipInstanceStatus Specifies the dedicated cluster status of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVipInstanceStatus(Long VipInstanceStatus) {
        this.VipInstanceStatus = VipInstanceStatus;
    }

    /**
     * Get Specifies the peak bandwidth of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxBandWidth Specifies the peak bandwidth of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Specifies the peak bandwidth of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxBandWidth Specifies the peak bandwidth of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Exclusive cluster specification.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Exclusive cluster specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Exclusive cluster specification.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Exclusive cluster specification.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Specifies the quantity of exclusive cluster nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeCount Specifies the quantity of exclusive cluster nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Specifies the quantity of exclusive cluster nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeCount Specifies the quantity of exclusive cluster nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Specifies the maximum storage of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxStorage Specifies the maximum storage of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Specifies the maximum storage of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxStorage Specifies the maximum storage of the dedicated cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Specifies the maximum retention time of the dedicated cluster. the unit is hour.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MaxRetention Specifies the maximum retention time of the dedicated cluster. the unit is hour.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set Specifies the maximum retention time of the dedicated cluster. the unit is hour.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MaxRetention Specifies the maximum retention time of the dedicated cluster. the unit is hour.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get Special project cluster maximum retention time, unit: hr.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MinRetention Special project cluster maximum retention time, unit: hr.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinRetention() {
        return this.MinRetention;
    }

    /**
     * Set Special project cluster maximum retention time, unit: hr.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MinRetention Special project cluster maximum retention time, unit: hr.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMinRetention(Long MinRetention) {
        this.MinRetention = MinRetention;
    }

    /**
     * Get Status of 4.0 shared cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStatus Status of 4.0 shared cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Status of 4.0 shared cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStatus Status of 4.0 shared cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Whether it is frozen. 
     * @return IsFrozen Whether it is frozen.
     */
    public Boolean getIsFrozen() {
        return this.IsFrozen;
    }

    /**
     * Set Whether it is frozen.
     * @param IsFrozen Whether it is frozen.
     */
    public void setIsFrozen(Boolean IsFrozen) {
        this.IsFrozen = IsFrozen;
    }

    public InstanceItemExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceItemExtraInfo(InstanceItemExtraInfo source) {
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.VipInstanceStatus != null) {
            this.VipInstanceStatus = new Long(source.VipInstanceStatus);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.MinRetention != null) {
            this.MinRetention = new Long(source.MinRetention);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.IsFrozen != null) {
            this.IsFrozen = new Boolean(source.IsFrozen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "VipInstanceStatus", this.VipInstanceStatus);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "MinRetention", this.MinRetention);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "IsFrozen", this.IsFrozen);

    }
}

