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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Package ID.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Image ID.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * Number of instance CPU cores.
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Instance memory capacity in GB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing mode. Valid values: 
PREPAID: prepaid (i.e., monthly subscription).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Instance system disk information.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Private IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateAddresses")
    @Expose
    private String [] PrivateAddresses;

    /**
    * Public IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicAddresses")
    @Expose
    private String [] PublicAddresses;

    /**
    * Instance bandwidth information.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Auto-Renewal flag. Valid values: 
NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically  
NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Instance login settings.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Instance status. Valid values: 
<li>PENDING: Creating</li><li>LAUNCH_FAILED: Failed to create</li><li>RUNNING: Running</li><li>STOPPED: Shut down</li><li>STARTING: Starting up</li><li>STOPPING: Shutting down</li><li>REBOOTING: Restarting</li><li>SHUTDOWN: Shutdown and to be terminated</li><li>TERMINATING: Terminating</li><li>DELETING: Deleting</li><li>FREEZING: Frozen</li><li>ENTER_RESCUE_MODE: Entering the rescue mode</li><li>RESCUE_MODE: Rescue mode</li><li>EXIT_RESCUE_MODE: Exiting from the rescue mode</li>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Globally unique ID of instance.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Last instance operation, such as `StopInstances` and `ResetInstance`. Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * Last instance operation status. Valid values: 
SUCCESS: operation succeeded 
OPERATING: the operation is being executed 
FAILED: operation failed 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * Unique request ID for the last operation of the instance. 
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * Isolation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * OS type, such as LINUX_UNIX and WINDOWS.
    */
    @SerializedName("PlatformType")
    @Expose
    private String PlatformType;

    /**
    * OS type.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * OS name.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The list of tags associated with the instance
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Obtain instance status
<li>NORMAL: The instance is normal</li><li>NETWORK_RESTRICT: The instance is blocked from the network.</li>
    */
    @SerializedName("InstanceRestrictState")
    @Expose
    private String InstanceRestrictState;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Package ID. 
     * @return BundleId Package ID.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Package ID.
     * @param BundleId Package ID.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Image ID. 
     * @return BlueprintId Image ID.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID.
     * @param BlueprintId Image ID.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get Number of instance CPU cores. 
     * @return CPU Number of instance CPU cores.
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of instance CPU cores.
     * @param CPU Number of instance CPU cores.
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Instance memory capacity in GB. 
     * @return Memory Instance memory capacity in GB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory capacity in GB.
     * @param Memory Instance memory capacity in GB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance billing mode. Valid values: 
PREPAID: prepaid (i.e., monthly subscription). 
     * @return InstanceChargeType Instance billing mode. Valid values: 
PREPAID: prepaid (i.e., monthly subscription).
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. Valid values: 
PREPAID: prepaid (i.e., monthly subscription).
     * @param InstanceChargeType Instance billing mode. Valid values: 
PREPAID: prepaid (i.e., monthly subscription).
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Instance system disk information. 
     * @return SystemDisk Instance system disk information.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Instance system disk information.
     * @param SystemDisk Instance system disk information.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Private IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PrivateAddresses Private IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPrivateAddresses() {
        return this.PrivateAddresses;
    }

    /**
     * Set Private IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PrivateAddresses Private IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateAddresses(String [] PrivateAddresses) {
        this.PrivateAddresses = PrivateAddresses;
    }

    /**
     * Get Public IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PublicAddresses Public IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPublicAddresses() {
        return this.PublicAddresses;
    }

    /**
     * Set Public IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PublicAddresses Public IP of instance primary ENI. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicAddresses(String [] PublicAddresses) {
        this.PublicAddresses = PublicAddresses;
    }

    /**
     * Get Instance bandwidth information. 
     * @return InternetAccessible Instance bandwidth information.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Instance bandwidth information.
     * @param InternetAccessible Instance bandwidth information.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Auto-Renewal flag. Valid values: 
NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically  
NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically. 
     * @return RenewFlag Auto-Renewal flag. Valid values: 
NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically  
NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-Renewal flag. Valid values: 
NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically  
NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically.
     * @param RenewFlag Auto-Renewal flag. Valid values: 
NOTIFY_AND_MANUAL_RENEW: notify upon expiration but do not renew automatically  
NOTIFY_AND_AUTO_RENEW: notify upon expiration and renew automatically.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Instance login settings. 
     * @return LoginSettings Instance login settings.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login settings.
     * @param LoginSettings Instance login settings.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Instance status. Valid values: 
<li>PENDING: Creating</li><li>LAUNCH_FAILED: Failed to create</li><li>RUNNING: Running</li><li>STOPPED: Shut down</li><li>STARTING: Starting up</li><li>STOPPING: Shutting down</li><li>REBOOTING: Restarting</li><li>SHUTDOWN: Shutdown and to be terminated</li><li>TERMINATING: Terminating</li><li>DELETING: Deleting</li><li>FREEZING: Frozen</li><li>ENTER_RESCUE_MODE: Entering the rescue mode</li><li>RESCUE_MODE: Rescue mode</li><li>EXIT_RESCUE_MODE: Exiting from the rescue mode</li> 
     * @return InstanceState Instance status. Valid values: 
<li>PENDING: Creating</li><li>LAUNCH_FAILED: Failed to create</li><li>RUNNING: Running</li><li>STOPPED: Shut down</li><li>STARTING: Starting up</li><li>STOPPING: Shutting down</li><li>REBOOTING: Restarting</li><li>SHUTDOWN: Shutdown and to be terminated</li><li>TERMINATING: Terminating</li><li>DELETING: Deleting</li><li>FREEZING: Frozen</li><li>ENTER_RESCUE_MODE: Entering the rescue mode</li><li>RESCUE_MODE: Rescue mode</li><li>EXIT_RESCUE_MODE: Exiting from the rescue mode</li>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. Valid values: 
<li>PENDING: Creating</li><li>LAUNCH_FAILED: Failed to create</li><li>RUNNING: Running</li><li>STOPPED: Shut down</li><li>STARTING: Starting up</li><li>STOPPING: Shutting down</li><li>REBOOTING: Restarting</li><li>SHUTDOWN: Shutdown and to be terminated</li><li>TERMINATING: Terminating</li><li>DELETING: Deleting</li><li>FREEZING: Frozen</li><li>ENTER_RESCUE_MODE: Entering the rescue mode</li><li>RESCUE_MODE: Rescue mode</li><li>EXIT_RESCUE_MODE: Exiting from the rescue mode</li>
     * @param InstanceState Instance status. Valid values: 
<li>PENDING: Creating</li><li>LAUNCH_FAILED: Failed to create</li><li>RUNNING: Running</li><li>STOPPED: Shut down</li><li>STARTING: Starting up</li><li>STOPPING: Shutting down</li><li>REBOOTING: Restarting</li><li>SHUTDOWN: Shutdown and to be terminated</li><li>TERMINATING: Terminating</li><li>DELETING: Deleting</li><li>FREEZING: Frozen</li><li>ENTER_RESCUE_MODE: Entering the rescue mode</li><li>RESCUE_MODE: Rescue mode</li><li>EXIT_RESCUE_MODE: Exiting from the rescue mode</li>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Globally unique ID of instance. 
     * @return Uuid Globally unique ID of instance.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Globally unique ID of instance.
     * @param Uuid Globally unique ID of instance.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Last instance operation, such as `StopInstances` and `ResetInstance`. Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperation Last instance operation, such as `StopInstances` and `ResetInstance`. Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set Last instance operation, such as `StopInstances` and `ResetInstance`. Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperation Last instance operation, such as `StopInstances` and `ResetInstance`. Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get Last instance operation status. Valid values: 
SUCCESS: operation succeeded 
OPERATING: the operation is being executed 
FAILED: operation failed 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperationState Last instance operation status. Valid values: 
SUCCESS: operation succeeded 
OPERATING: the operation is being executed 
FAILED: operation failed 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set Last instance operation status. Valid values: 
SUCCESS: operation succeeded 
OPERATING: the operation is being executed 
FAILED: operation failed 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperationState Last instance operation status. Valid values: 
SUCCESS: operation succeeded 
OPERATING: the operation is being executed 
FAILED: operation failed 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get Unique request ID for the last operation of the instance. 
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperationRequestId Unique request ID for the last operation of the instance. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set Unique request ID for the last operation of the instance. 
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperationRequestId Unique request ID for the last operation of the instance. 
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get Isolation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedTime Isolation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsolatedTime Isolation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Creation time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime Expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime Expiration time according to ISO 8601 standard. UTC time is used. 
Format: YYYY-MM-DDThh:mm:ssZ.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get OS type, such as LINUX_UNIX and WINDOWS. 
     * @return PlatformType OS type, such as LINUX_UNIX and WINDOWS.
     */
    public String getPlatformType() {
        return this.PlatformType;
    }

    /**
     * Set OS type, such as LINUX_UNIX and WINDOWS.
     * @param PlatformType OS type, such as LINUX_UNIX and WINDOWS.
     */
    public void setPlatformType(String PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * Get OS type. 
     * @return Platform OS type.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set OS type.
     * @param Platform OS type.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get OS name. 
     * @return OsName OS name.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set OS name.
     * @param OsName OS name.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get AZ. 
     * @return Zone AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ.
     * @param Zone AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The list of tags associated with the instance 
     * @return Tags The list of tags associated with the instance
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set The list of tags associated with the instance
     * @param Tags The list of tags associated with the instance
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Obtain instance status
<li>NORMAL: The instance is normal</li><li>NETWORK_RESTRICT: The instance is blocked from the network.</li> 
     * @return InstanceRestrictState Obtain instance status
<li>NORMAL: The instance is normal</li><li>NETWORK_RESTRICT: The instance is blocked from the network.</li>
     */
    public String getInstanceRestrictState() {
        return this.InstanceRestrictState;
    }

    /**
     * Set Obtain instance status
<li>NORMAL: The instance is normal</li><li>NETWORK_RESTRICT: The instance is blocked from the network.</li>
     * @param InstanceRestrictState Obtain instance status
<li>NORMAL: The instance is normal</li><li>NETWORK_RESTRICT: The instance is blocked from the network.</li>
     */
    public void setInstanceRestrictState(String InstanceRestrictState) {
        this.InstanceRestrictState = InstanceRestrictState;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.PrivateAddresses != null) {
            this.PrivateAddresses = new String[source.PrivateAddresses.length];
            for (int i = 0; i < source.PrivateAddresses.length; i++) {
                this.PrivateAddresses[i] = new String(source.PrivateAddresses[i]);
            }
        }
        if (source.PublicAddresses != null) {
            this.PublicAddresses = new String[source.PublicAddresses.length];
            for (int i = 0; i < source.PublicAddresses.length; i++) {
                this.PublicAddresses[i] = new String(source.PublicAddresses[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.LatestOperationRequestId != null) {
            this.LatestOperationRequestId = new String(source.LatestOperationRequestId);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.PlatformType != null) {
            this.PlatformType = new String(source.PlatformType);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceRestrictState != null) {
            this.InstanceRestrictState = new String(source.InstanceRestrictState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArraySimple(map, prefix + "PrivateAddresses.", this.PrivateAddresses);
        this.setParamArraySimple(map, prefix + "PublicAddresses.", this.PublicAddresses);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceRestrictState", this.InstanceRestrictState);

    }
}

