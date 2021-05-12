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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExistedInstance extends AbstractModel{

    /**
    * Whether the instance supports being added to the cluster (TRUE: support; FALSE: not support).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Usable")
    @Expose
    private Boolean Usable;

    /**
    * Reason that the instance does not support being added.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnusableReason")
    @Expose
    private String UnusableReason;

    /**
    * ID of the cluster in which the instance currently resides.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlreadyInCluster")
    @Expose
    private String AlreadyInCluster;

    /**
    * Instance ID, in the format of ins-xxxxxxxx.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * List of private IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Creation time, which follows the ISO8601 standard and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Instance's number of CPU cores. Unit: cores.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Instance's memory capacity. Unit: GB.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Operating system name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Instance model.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Auto scaling group ID
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
     * Get Whether the instance supports being added to the cluster (TRUE: support; FALSE: not support).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Usable Whether the instance supports being added to the cluster (TRUE: support; FALSE: not support).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getUsable() {
        return this.Usable;
    }

    /**
     * Set Whether the instance supports being added to the cluster (TRUE: support; FALSE: not support).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Usable Whether the instance supports being added to the cluster (TRUE: support; FALSE: not support).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsable(Boolean Usable) {
        this.Usable = Usable;
    }

    /**
     * Get Reason that the instance does not support being added.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnusableReason Reason that the instance does not support being added.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnusableReason() {
        return this.UnusableReason;
    }

    /**
     * Set Reason that the instance does not support being added.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnusableReason Reason that the instance does not support being added.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnusableReason(String UnusableReason) {
        this.UnusableReason = UnusableReason;
    }

    /**
     * Get ID of the cluster in which the instance currently resides.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlreadyInCluster ID of the cluster in which the instance currently resides.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlreadyInCluster() {
        return this.AlreadyInCluster;
    }

    /**
     * Set ID of the cluster in which the instance currently resides.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlreadyInCluster ID of the cluster in which the instance currently resides.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlreadyInCluster(String AlreadyInCluster) {
        this.AlreadyInCluster = AlreadyInCluster;
    }

    /**
     * Get Instance ID, in the format of ins-xxxxxxxx. 
     * @return InstanceId Instance ID, in the format of ins-xxxxxxxx.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, in the format of ins-xxxxxxxx.
     * @param InstanceId Instance ID, in the format of ins-xxxxxxxx.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get List of private IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateIpAddresses List of private IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set List of private IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateIpAddresses List of private IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicIpAddresses List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicIpAddresses List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Creation time, which follows the ISO8601 standard and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time, which follows the ISO8601 standard and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time, which follows the ISO8601 standard and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time, which follows the ISO8601 standard and uses UTC time. Format: YYYY-MM-DDThh:mm:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Instance's number of CPU cores. Unit: cores.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CPU Instance's number of CPU cores. Unit: cores.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Instance's number of CPU cores. Unit: cores.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CPU Instance's number of CPU cores. Unit: cores.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Instance's memory capacity. Unit: GB.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Memory Instance's memory capacity. Unit: GB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance's memory capacity. Unit: GB.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Memory Instance's memory capacity. Unit: GB.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Operating system name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OsName Operating system name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Operating system name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OsName Operating system name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Instance model.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceType Instance model.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceType Instance model.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Auto scaling group ID
Note: This field may return null, indicating that no valid value was found. 
     * @return AutoscalingGroupId Auto scaling group ID
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set Auto scaling group ID
Note: This field may return null, indicating that no valid value was found.
     * @param AutoscalingGroupId Auto scaling group ID
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceChargeType Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
Note: This field may return null, indicating that no valid value was found.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceChargeType Instance billing method. Valid values: POSTPAID_BY_HOUR (pay-as-you-go hourly); CDHPAID (billed based on CDH, i.e., only CDH is billed but not the instances on CDH)
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    public ExistedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExistedInstance(ExistedInstance source) {
        if (source.Usable != null) {
            this.Usable = new Boolean(source.Usable);
        }
        if (source.UnusableReason != null) {
            this.UnusableReason = new String(source.UnusableReason);
        }
        if (source.AlreadyInCluster != null) {
            this.AlreadyInCluster = new String(source.AlreadyInCluster);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new String[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new String(source.PrivateIpAddresses[i]);
            }
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Usable", this.Usable);
        this.setParamSimple(map, prefix + "UnusableReason", this.UnusableReason);
        this.setParamSimple(map, prefix + "AlreadyInCluster", this.AlreadyInCluster);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

