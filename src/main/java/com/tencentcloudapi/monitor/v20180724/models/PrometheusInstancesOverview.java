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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusInstancesOverview extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Running status. Valid values: `1` (creating); `2` (running); `3` (abnormal); `4` (restarting); `5` (terminating); `6` (stopped); `7` (deleted).
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Billing status. Valid values: `1` (normal); `2` (expired); `3` (terminated); `4` (assigning); `5` (failed to assign)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeStatus")
    @Expose
    private Long ChargeStatus;

    /**
    * Whether Grafana is enabled. Valid values: `0` (no); `1` (yes).
    */
    @SerializedName("EnableGrafana")
    @Expose
    private Long EnableGrafana;

    /**
    * Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
    * Instance payment type. Valid values: `1` (trial edition); `2` (prepaid)
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * Specification name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Storage period
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataRetentionTime")
    @Expose
    private Long DataRetentionTime;

    /**
    * Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Auto-renewal flag. Valid values: `0` (auto-renewal not enabled); `1` (auto-renewal enabled); `2` (auto-renewal prohibited); `-1` (invalid).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Total number of bound clusters
    */
    @SerializedName("BoundTotal")
    @Expose
    private Long BoundTotal;

    /**
    * Total number of bound clusters in the normal status
    */
    @SerializedName("BoundNormal")
    @Expose
    private Long BoundNormal;

    /**
    * Resource pack status (`0`: Unavailable; `1`: Available)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackageStatus")
    @Expose
    private Long ResourcePackageStatus;

    /**
    * Resource pack specification name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourcePackageSpecName")
    @Expose
    private String ResourcePackageSpecName;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Running status. Valid values: `1` (creating); `2` (running); `3` (abnormal); `4` (restarting); `5` (terminating); `6` (stopped); `7` (deleted). 
     * @return InstanceStatus Running status. Valid values: `1` (creating); `2` (running); `3` (abnormal); `4` (restarting); `5` (terminating); `6` (stopped); `7` (deleted).
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Running status. Valid values: `1` (creating); `2` (running); `3` (abnormal); `4` (restarting); `5` (terminating); `6` (stopped); `7` (deleted).
     * @param InstanceStatus Running status. Valid values: `1` (creating); `2` (running); `3` (abnormal); `4` (restarting); `5` (terminating); `6` (stopped); `7` (deleted).
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Billing status. Valid values: `1` (normal); `2` (expired); `3` (terminated); `4` (assigning); `5` (failed to assign)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeStatus Billing status. Valid values: `1` (normal); `2` (expired); `3` (terminated); `4` (assigning); `5` (failed to assign)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set Billing status. Valid values: `1` (normal); `2` (expired); `3` (terminated); `4` (assigning); `5` (failed to assign)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeStatus Billing status. Valid values: `1` (normal); `2` (expired); `3` (terminated); `4` (assigning); `5` (failed to assign)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeStatus(Long ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get Whether Grafana is enabled. Valid values: `0` (no); `1` (yes). 
     * @return EnableGrafana Whether Grafana is enabled. Valid values: `0` (no); `1` (yes).
     */
    public Long getEnableGrafana() {
        return this.EnableGrafana;
    }

    /**
     * Set Whether Grafana is enabled. Valid values: `0` (no); `1` (yes).
     * @param EnableGrafana Whether Grafana is enabled. Valid values: `0` (no); `1` (yes).
     */
    public void setEnableGrafana(Long EnableGrafana) {
        this.EnableGrafana = EnableGrafana;
    }

    /**
     * Get Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GrafanaURL Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GrafanaURL Grafana dashboard URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    /**
     * Get Instance payment type. Valid values: `1` (trial edition); `2` (prepaid) 
     * @return InstanceChargeType Instance payment type. Valid values: `1` (trial edition); `2` (prepaid)
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance payment type. Valid values: `1` (trial edition); `2` (prepaid)
     * @param InstanceChargeType Instance payment type. Valid values: `1` (trial edition); `2` (prepaid)
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Specification name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Storage period
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataRetentionTime Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataRetentionTime() {
        return this.DataRetentionTime;
    }

    /**
     * Set Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataRetentionTime Storage period
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataRetentionTime(Long DataRetentionTime) {
        this.DataRetentionTime = DataRetentionTime;
    }

    /**
     * Get Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time of the purchased instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Auto-renewal flag. Valid values: `0` (auto-renewal not enabled); `1` (auto-renewal enabled); `2` (auto-renewal prohibited); `-1` (invalid).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag Auto-renewal flag. Valid values: `0` (auto-renewal not enabled); `1` (auto-renewal enabled); `2` (auto-renewal prohibited); `-1` (invalid).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values: `0` (auto-renewal not enabled); `1` (auto-renewal enabled); `2` (auto-renewal prohibited); `-1` (invalid).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRenewFlag Auto-renewal flag. Valid values: `0` (auto-renewal not enabled); `1` (auto-renewal enabled); `2` (auto-renewal prohibited); `-1` (invalid).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Total number of bound clusters 
     * @return BoundTotal Total number of bound clusters
     */
    public Long getBoundTotal() {
        return this.BoundTotal;
    }

    /**
     * Set Total number of bound clusters
     * @param BoundTotal Total number of bound clusters
     */
    public void setBoundTotal(Long BoundTotal) {
        this.BoundTotal = BoundTotal;
    }

    /**
     * Get Total number of bound clusters in the normal status 
     * @return BoundNormal Total number of bound clusters in the normal status
     */
    public Long getBoundNormal() {
        return this.BoundNormal;
    }

    /**
     * Set Total number of bound clusters in the normal status
     * @param BoundNormal Total number of bound clusters in the normal status
     */
    public void setBoundNormal(Long BoundNormal) {
        this.BoundNormal = BoundNormal;
    }

    /**
     * Get Resource pack status (`0`: Unavailable; `1`: Available)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackageStatus Resource pack status (`0`: Unavailable; `1`: Available)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResourcePackageStatus() {
        return this.ResourcePackageStatus;
    }

    /**
     * Set Resource pack status (`0`: Unavailable; `1`: Available)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackageStatus Resource pack status (`0`: Unavailable; `1`: Available)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackageStatus(Long ResourcePackageStatus) {
        this.ResourcePackageStatus = ResourcePackageStatus;
    }

    /**
     * Get Resource pack specification name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourcePackageSpecName Resource pack specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourcePackageSpecName() {
        return this.ResourcePackageSpecName;
    }

    /**
     * Set Resource pack specification name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourcePackageSpecName Resource pack specification name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourcePackageSpecName(String ResourcePackageSpecName) {
        this.ResourcePackageSpecName = ResourcePackageSpecName;
    }

    public PrometheusInstancesOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstancesOverview(PrometheusInstancesOverview source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new Long(source.ChargeStatus);
        }
        if (source.EnableGrafana != null) {
            this.EnableGrafana = new Long(source.EnableGrafana);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.DataRetentionTime != null) {
            this.DataRetentionTime = new Long(source.DataRetentionTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.BoundTotal != null) {
            this.BoundTotal = new Long(source.BoundTotal);
        }
        if (source.BoundNormal != null) {
            this.BoundNormal = new Long(source.BoundNormal);
        }
        if (source.ResourcePackageStatus != null) {
            this.ResourcePackageStatus = new Long(source.ResourcePackageStatus);
        }
        if (source.ResourcePackageSpecName != null) {
            this.ResourcePackageSpecName = new String(source.ResourcePackageSpecName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "EnableGrafana", this.EnableGrafana);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "DataRetentionTime", this.DataRetentionTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "BoundTotal", this.BoundTotal);
        this.setParamSimple(map, prefix + "BoundNormal", this.BoundNormal);
        this.setParamSimple(map, prefix + "ResourcePackageStatus", this.ResourcePackageStatus);
        this.setParamSimple(map, prefix + "ResourcePackageSpecName", this.ResourcePackageSpecName);

    }
}

