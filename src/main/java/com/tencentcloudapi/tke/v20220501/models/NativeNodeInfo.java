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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeNodeInfo extends AbstractModel {

    /**
    * Node name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Machine status
    */
    @SerializedName("MachineState")
    @Expose
    private String MachineState;

    /**
    * Machine availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Machine login status
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("LoginStatus")
    @Expose
    private String LoginStatus;

    /**
    * Whether to enable scale-in protection
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("IsProtectedFromScaleIn")
    @Expose
    private Boolean IsProtectedFromScaleIn;

    /**
    * Machine name
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Number of CPU cores (unit: cores)
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Number of GPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("GPU")
    @Expose
    private Long GPU;

    /**
    * Auto-renewal label
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Node billing mode (deprecated)
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Node memory capacity (unit: `GB`)
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Public network bandwidth configuration
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Model family
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Node private network IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * Model
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Billing expiration time of monthly subscription nodes
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("SecurityGroupIDs")
    @Expose
    private String [] SecurityGroupIDs;

    /**
    * VPC unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * OS name
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("OsImage")
    @Expose
    private String OsImage;

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Node name 
     * @return MachineName Node name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Node name
     * @param MachineName Node name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Machine status 
     * @return MachineState Machine status
     */
    public String getMachineState() {
        return this.MachineState;
    }

    /**
     * Set Machine status
     * @param MachineState Machine status
     */
    public void setMachineState(String MachineState) {
        this.MachineState = MachineState;
    }

    /**
     * Get Machine availability zone 
     * @return Zone Machine availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Machine availability zone
     * @param Zone Machine availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default); 
     * @return InstanceChargeType Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     * @param InstanceChargeType Node billing type. PREPAID: Monthly subscription; POSTPAID_BY_HOUR: Pay-as-you-go (default);
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Machine login status
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return LoginStatus Machine login status
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getLoginStatus() {
        return this.LoginStatus;
    }

    /**
     * Set Machine login status
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param LoginStatus Machine login status
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setLoginStatus(String LoginStatus) {
        this.LoginStatus = LoginStatus;
    }

    /**
     * Get Whether to enable scale-in protection
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return IsProtectedFromScaleIn Whether to enable scale-in protection
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Boolean getIsProtectedFromScaleIn() {
        return this.IsProtectedFromScaleIn;
    }

    /**
     * Set Whether to enable scale-in protection
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param IsProtectedFromScaleIn Whether to enable scale-in protection
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setIsProtectedFromScaleIn(Boolean IsProtectedFromScaleIn) {
        this.IsProtectedFromScaleIn = IsProtectedFromScaleIn;
    }

    /**
     * Get Machine name
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return DisplayName Machine name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Machine name
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param DisplayName Machine name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Number of CPU cores (unit: cores) 
     * @return CPU Number of CPU cores (unit: cores)
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores (unit: cores)
     * @param CPU Number of CPU cores (unit: cores)
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Number of GPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return GPU Number of GPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public Long getGPU() {
        return this.GPU;
    }

    /**
     * Set Number of GPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param GPU Number of GPU cores (unit: cores)
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setGPU(Long GPU) {
        this.GPU = GPU;
    }

    /**
     * Get Auto-renewal label 
     * @return RenewFlag Auto-renewal label
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal label
     * @param RenewFlag Auto-renewal label
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Node billing mode (deprecated) 
     * @return PayMode Node billing mode (deprecated)
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Node billing mode (deprecated)
     * @param PayMode Node billing mode (deprecated)
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Node memory capacity (unit: `GB`) 
     * @return Memory Node memory capacity (unit: `GB`)
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Node memory capacity (unit: `GB`)
     * @param Memory Node memory capacity (unit: `GB`)
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Public network bandwidth configuration 
     * @return InternetAccessible Public network bandwidth configuration
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration
     * @param InternetAccessible Public network bandwidth configuration
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Model family 
     * @return InstanceFamily Model family
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set Model family
     * @param InstanceFamily Model family
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get Node private network IP 
     * @return LanIp Node private network IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set Node private network IP
     * @param LanIp Node private network IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get Model 
     * @return InstanceType Model
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Model
     * @param InstanceType Model
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Billing expiration time of monthly subscription nodes
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return ExpiredTime Billing expiration time of monthly subscription nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Billing expiration time of monthly subscription nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param ExpiredTime Billing expiration time of monthly subscription nodes
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Security group list
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return SecurityGroupIDs Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String [] getSecurityGroupIDs() {
        return this.SecurityGroupIDs;
    }

    /**
     * Set Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param SecurityGroupIDs Security group list
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSecurityGroupIDs(String [] SecurityGroupIDs) {
        this.SecurityGroupIDs = SecurityGroupIDs;
    }

    /**
     * Get VPC unique ID
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return VpcId VPC unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param VpcId VPC unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return SubnetId Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param SubnetId Subnet unique ID
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get OS name
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return OsImage OS name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getOsImage() {
        return this.OsImage;
    }

    /**
     * Set OS name
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param OsImage OS name
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setOsImage(String OsImage) {
        this.OsImage = OsImage;
    }

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public NativeNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeNodeInfo(NativeNodeInfo source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineState != null) {
            this.MachineState = new String(source.MachineState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LoginStatus != null) {
            this.LoginStatus = new String(source.LoginStatus);
        }
        if (source.IsProtectedFromScaleIn != null) {
            this.IsProtectedFromScaleIn = new Boolean(source.IsProtectedFromScaleIn);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.GPU != null) {
            this.GPU = new Long(source.GPU);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.LanIp != null) {
            this.LanIp = new String(source.LanIp);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.SecurityGroupIDs != null) {
            this.SecurityGroupIDs = new String[source.SecurityGroupIDs.length];
            for (int i = 0; i < source.SecurityGroupIDs.length; i++) {
                this.SecurityGroupIDs[i] = new String(source.SecurityGroupIDs[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.OsImage != null) {
            this.OsImage = new String(source.OsImage);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineState", this.MachineState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LoginStatus", this.LoginStatus);
        this.setParamSimple(map, prefix + "IsProtectedFromScaleIn", this.IsProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "SecurityGroupIDs.", this.SecurityGroupIDs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OsImage", this.OsImage);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

