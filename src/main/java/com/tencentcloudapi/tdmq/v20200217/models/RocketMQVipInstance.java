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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQVipInstance extends AbstractModel{

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
    * Instance version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceVersion")
    @Expose
    private String InstanceVersion;

    /**
    * Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of nodes
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Instance specification name
    */
    @SerializedName("ConfigDisplay")
    @Expose
    private String ConfigDisplay;

    /**
    * Peak TPS
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * Peak bandwidth in Mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Storage capacity in GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * Instance expiration time in milliseconds
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Payment mode. 0: Postpaid; 1: Prepaid.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Remarks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Instance specification ID
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * The maximum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxRetention")
    @Expose
    private Long MaxRetention;

    /**
    * The minimum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MinRetention")
    @Expose
    private Long MinRetention;

    /**
    * Instance message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Retention")
    @Expose
    private Long Retention;

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
     * Get Instance version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceVersion Instance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set Instance version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceVersion Instance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceVersion(String InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed). 
     * @return Status Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     * @param Status Instance status. Valid values: `0` (Creating), `1` (Normal), `2` (Isolated), `3` (Terminated), `4` (Abnormal), `5` (Delivery failed).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of nodes 
     * @return NodeCount Number of nodes
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes
     * @param NodeCount Number of nodes
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Instance specification name 
     * @return ConfigDisplay Instance specification name
     */
    public String getConfigDisplay() {
        return this.ConfigDisplay;
    }

    /**
     * Set Instance specification name
     * @param ConfigDisplay Instance specification name
     */
    public void setConfigDisplay(String ConfigDisplay) {
        this.ConfigDisplay = ConfigDisplay;
    }

    /**
     * Get Peak TPS 
     * @return MaxTps Peak TPS
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set Peak TPS
     * @param MaxTps Peak TPS
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get Peak bandwidth in Mbps 
     * @return MaxBandWidth Peak bandwidth in Mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Peak bandwidth in Mbps
     * @param MaxBandWidth Peak bandwidth in Mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Storage capacity in GB 
     * @return MaxStorage Storage capacity in GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set Storage capacity in GB
     * @param MaxStorage Storage capacity in GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get Instance expiration time in milliseconds 
     * @return ExpireTime Instance expiration time in milliseconds
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time in milliseconds
     * @param ExpireTime Instance expiration time in milliseconds
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users). 
     * @return AutoRenewFlag Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     * @param AutoRenewFlag Renewal mode. Valid values: `0` (Manual renewal, which is the default mode), `1` (Auto-renewal), `2` (Manual renewal, which is specified by users).
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Payment mode. 0: Postpaid; 1: Prepaid. 
     * @return PayMode Payment mode. 0: Postpaid; 1: Prepaid.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. 0: Postpaid; 1: Prepaid.
     * @param PayMode Payment mode. 0: Postpaid; 1: Prepaid.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Remarks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Instance specification ID 
     * @return SpecName Instance specification ID
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Instance specification ID
     * @param SpecName Instance specification ID
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get The maximum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MaxRetention The maximum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxRetention() {
        return this.MaxRetention;
    }

    /**
     * Set The maximum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MaxRetention The maximum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxRetention(Long MaxRetention) {
        this.MaxRetention = MaxRetention;
    }

    /**
     * Get The minimum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MinRetention The minimum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getMinRetention() {
        return this.MinRetention;
    }

    /**
     * Set The minimum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MinRetention The minimum message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMinRetention(Long MinRetention) {
        this.MinRetention = MinRetention;
    }

    /**
     * Get Instance message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return Retention Instance message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public Long getRetention() {
        return this.Retention;
    }

    /**
     * Set Instance message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param Retention Instance message retention period in hours
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setRetention(Long Retention) {
        this.Retention = Retention;
    }

    public RocketMQVipInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQVipInstance(RocketMQVipInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new String(source.InstanceVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ConfigDisplay != null) {
            this.ConfigDisplay = new String(source.ConfigDisplay);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.MaxRetention != null) {
            this.MaxRetention = new Long(source.MaxRetention);
        }
        if (source.MinRetention != null) {
            this.MinRetention = new Long(source.MinRetention);
        }
        if (source.Retention != null) {
            this.Retention = new Long(source.Retention);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "ConfigDisplay", this.ConfigDisplay);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "MaxRetention", this.MaxRetention);
        this.setParamSimple(map, prefix + "MinRetention", this.MinRetention);
        this.setParamSimple(map, prefix + "Retention", this.Retention);

    }
}

