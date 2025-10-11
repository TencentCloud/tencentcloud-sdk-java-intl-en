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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * Location of the instance
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Instance `ID`
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance model
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Number of CPU cores of the instance; unit: core
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * Instance memory capacity. unit: GiB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance business status. valid values:<br><li>NORMAL: indicates an instance in the NORMAL state</li><li>EXPIRED: indicates an EXPIRED instance</li><li>PROTECTIVELY_ISOLATED: PROTECTIVELY ISOLATED instance</li>.
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing plan. Valid values:<br><li>`POSTPAID_BY_HOUR`: pay after use. You are billed by the hour, by traffic.<br><li>`CDHPAID`: `CDH` billing plan. Applicable to `CDH` only, not the instances on the host.<br>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Information on the system disk of the instance
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Information of the instance data disks.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * List of private IPs of the instance's primary ENI.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * Information on instance bandwidth.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Information on the VPC where the instance resides.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * `ID` of the image used to create the instance.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * AUTO-Renewal flag. valid values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: indicates that a notification of impending expiration is made but AUTO-renewal is not performed</li><li>`NOTIFY_AND_AUTO_RENEW`: indicates that a notification of impending expiration is made AND AUTO-renewal is performed</li><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: indicates that notification that it is about to expire is not made AND AUTO-renewal is not performed.
Note: this field is null in postpaid mode.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Creation time following the `ISO8601` standard and using `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration time in UTC format following the `ISO8601` standard: `YYYY-MM-DDThh:mm:ssZ`. Note: this parameter is `null` for postpaid instances.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Operating system name.
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Security groups to which the instance belongs. To obtain the security group IDs, you can call [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) and look for the `sgld` fields in the response.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Login settings of the instance. Currently only the key associated with the instance is returned.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Instance status. for specific status types, see the instance status table (https://www.tencentcloud.comom/document/api/213/15753?from_cn_redirect=1#InstanceStatus).
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * List of tags associated with the instance.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Shutdown billing mode of an instance.

Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown</li><li>STOP_CHARGING: billing stops after shutdown</li><li>NOT_APPLICABLE: the instance is NOT shut down or stopping billing after shutdown is NOT APPLICABLE to the instance</li>.
    */
    @SerializedName("StopChargingMode")
    @Expose
    private String StopChargingMode;

    /**
    * Globally unique ID of the instance.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Last operation of the instance, such as StopInstances or ResetInstance.
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * The latest operation status of the instance. valid values:<br><li>SUCCESS: indicates that the operation succeeded</li><li>OPERATING: indicates that the operation is in progress</li><li>FAILED: indicates that the operation FAILED</li>.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * Unique request ID for the last operation of the instance.
    */
    @SerializedName("LatestOperationRequestId")
    @Expose
    private String LatestOperationRequestId;

    /**
    * Spread placement group ID.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * IPv6 address of the instance.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("IPv6Addresses")
    @Expose
    private String [] IPv6Addresses;

    /**
    * CAM role name.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * High-performance computing cluster ID.
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * IP list of HPC cluster.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("RdmaIpAddresses")
    @Expose
    private String [] RdmaIpAddresses;

    /**
    * Dedicated cluster ID where the instance is located.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * Instance isolation type. valid values:<br><li>ARREAR: indicates arrears isolation<br></li><li>EXPIRE: indicates isolation upon expiration<br></li><li>MANMADE: indicates voluntarily refunded isolation<br></li><li>NOTISOLATED: indicates unisolated<br></li>.
    */
    @SerializedName("IsolatedSource")
    @Expose
    private String IsolatedSource;

    /**
    * GPU information. if it is a gpu type instance, this value will be returned. for other type instances, it does not return.
    */
    @SerializedName("GPUInfo")
    @Expose
    private GPUInfo GPUInfo;

    /**
    * Instance OS license type. Default value: `TencentCloud`
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * Instance destruction protection flag indicates whether an instance is allowed to be deleted through an api. value ranges from:<br><li>true: indicates that instance protection is enabled, deletion through apis is not allowed</li><li>false: indicates that instance protection is disabled, allow passage</li><br>default value: false.
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * Default login user
    */
    @SerializedName("DefaultLoginUser")
    @Expose
    private String DefaultLoginUser;

    /**
    * Default login port
    */
    @SerializedName("DefaultLoginPort")
    @Expose
    private Long DefaultLoginPort;

    /**
    * Latest operation errors of the instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationErrorMsg")
    @Expose
    private String LatestOperationErrorMsg;

    /**
    * Custom metadata. this parameter corresponds to the metadata information specified when creating a CVM. **note: in beta test**.
    */
    @SerializedName("Metadata")
    @Expose
    private Metadata Metadata;

    /**
    * Specifies the public IPv6 address bound to the instance.
    */
    @SerializedName("PublicIPv6Addresses")
    @Expose
    private String [] PublicIPv6Addresses;

    /**
     * Get Location of the instance 
     * @return Placement Location of the instance
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance
     * @param Placement Location of the instance
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Instance `ID` 
     * @return InstanceId Instance `ID`
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance `ID`
     * @param InstanceId Instance `ID`
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance model 
     * @return InstanceType Instance model
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model
     * @param InstanceType Instance model
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Number of CPU cores of the instance; unit: core 
     * @return CPU Number of CPU cores of the instance; unit: core
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set Number of CPU cores of the instance; unit: core
     * @param CPU Number of CPU cores of the instance; unit: core
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get Instance memory capacity. unit: GiB. 
     * @return Memory Instance memory capacity. unit: GiB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory capacity. unit: GiB.
     * @param Memory Instance memory capacity. unit: GiB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance business status. valid values:<br><li>NORMAL: indicates an instance in the NORMAL state</li><li>EXPIRED: indicates an EXPIRED instance</li><li>PROTECTIVELY_ISOLATED: PROTECTIVELY ISOLATED instance</li>. 
     * @return RestrictState Instance business status. valid values:<br><li>NORMAL: indicates an instance in the NORMAL state</li><li>EXPIRED: indicates an EXPIRED instance</li><li>PROTECTIVELY_ISOLATED: PROTECTIVELY ISOLATED instance</li>.
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set Instance business status. valid values:<br><li>NORMAL: indicates an instance in the NORMAL state</li><li>EXPIRED: indicates an EXPIRED instance</li><li>PROTECTIVELY_ISOLATED: PROTECTIVELY ISOLATED instance</li>.
     * @param RestrictState Instance business status. valid values:<br><li>NORMAL: indicates an instance in the NORMAL state</li><li>EXPIRED: indicates an EXPIRED instance</li><li>PROTECTIVELY_ISOLATED: PROTECTIVELY ISOLATED instance</li>.
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
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
     * Get Instance billing plan. Valid values:<br><li>`POSTPAID_BY_HOUR`: pay after use. You are billed by the hour, by traffic.<br><li>`CDHPAID`: `CDH` billing plan. Applicable to `CDH` only, not the instances on the host.<br> 
     * @return InstanceChargeType Instance billing plan. Valid values:<br><li>`POSTPAID_BY_HOUR`: pay after use. You are billed by the hour, by traffic.<br><li>`CDHPAID`: `CDH` billing plan. Applicable to `CDH` only, not the instances on the host.<br>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing plan. Valid values:<br><li>`POSTPAID_BY_HOUR`: pay after use. You are billed by the hour, by traffic.<br><li>`CDHPAID`: `CDH` billing plan. Applicable to `CDH` only, not the instances on the host.<br>
     * @param InstanceChargeType Instance billing plan. Valid values:<br><li>`POSTPAID_BY_HOUR`: pay after use. You are billed by the hour, by traffic.<br><li>`CDHPAID`: `CDH` billing plan. Applicable to `CDH` only, not the instances on the host.<br>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Information on the system disk of the instance 
     * @return SystemDisk Information on the system disk of the instance
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Information on the system disk of the instance
     * @param SystemDisk Information on the system disk of the instance
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Information of the instance data disks. 
     * @return DataDisks Information of the instance data disks.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Information of the instance data disks.
     * @param DataDisks Information of the instance data disks.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get List of private IPs of the instance's primary ENI. 
     * @return PrivateIpAddresses List of private IPs of the instance's primary ENI.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set List of private IPs of the instance's primary ENI.
     * @param PrivateIpAddresses List of private IPs of the instance's primary ENI.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid value is found. 
     * @return PublicIpAddresses List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid value is found.
     * @param PublicIpAddresses List of public IPs of the instance's primary ENI.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get Information on instance bandwidth. 
     * @return InternetAccessible Information on instance bandwidth.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Information on instance bandwidth.
     * @param InternetAccessible Information on instance bandwidth.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Information on the VPC where the instance resides. 
     * @return VirtualPrivateCloud Information on the VPC where the instance resides.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set Information on the VPC where the instance resides.
     * @param VirtualPrivateCloud Information on the VPC where the instance resides.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get `ID` of the image used to create the instance. 
     * @return ImageId `ID` of the image used to create the instance.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set `ID` of the image used to create the instance.
     * @param ImageId `ID` of the image used to create the instance.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get AUTO-Renewal flag. valid values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: indicates that a notification of impending expiration is made but AUTO-renewal is not performed</li><li>`NOTIFY_AND_AUTO_RENEW`: indicates that a notification of impending expiration is made AND AUTO-renewal is performed</li><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: indicates that notification that it is about to expire is not made AND AUTO-renewal is not performed.
Note: this field is null in postpaid mode. 
     * @return RenewFlag AUTO-Renewal flag. valid values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: indicates that a notification of impending expiration is made but AUTO-renewal is not performed</li><li>`NOTIFY_AND_AUTO_RENEW`: indicates that a notification of impending expiration is made AND AUTO-renewal is performed</li><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: indicates that notification that it is about to expire is not made AND AUTO-renewal is not performed.
Note: this field is null in postpaid mode.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set AUTO-Renewal flag. valid values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: indicates that a notification of impending expiration is made but AUTO-renewal is not performed</li><li>`NOTIFY_AND_AUTO_RENEW`: indicates that a notification of impending expiration is made AND AUTO-renewal is performed</li><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: indicates that notification that it is about to expire is not made AND AUTO-renewal is not performed.
Note: this field is null in postpaid mode.
     * @param RenewFlag AUTO-Renewal flag. valid values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: indicates that a notification of impending expiration is made but AUTO-renewal is not performed</li><li>`NOTIFY_AND_AUTO_RENEW`: indicates that a notification of impending expiration is made AND AUTO-renewal is performed</li><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: indicates that notification that it is about to expire is not made AND AUTO-renewal is not performed.
Note: this field is null in postpaid mode.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Creation time following the `ISO8601` standard and using `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`. 
     * @return CreatedTime Creation time following the `ISO8601` standard and using `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time following the `ISO8601` standard and using `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime Creation time following the `ISO8601` standard and using `UTC` time in the format of `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Expiration time in UTC format following the `ISO8601` standard: `YYYY-MM-DDThh:mm:ssZ`. Note: this parameter is `null` for postpaid instances. 
     * @return ExpiredTime Expiration time in UTC format following the `ISO8601` standard: `YYYY-MM-DDThh:mm:ssZ`. Note: this parameter is `null` for postpaid instances.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time in UTC format following the `ISO8601` standard: `YYYY-MM-DDThh:mm:ssZ`. Note: this parameter is `null` for postpaid instances.
     * @param ExpiredTime Expiration time in UTC format following the `ISO8601` standard: `YYYY-MM-DDThh:mm:ssZ`. Note: this parameter is `null` for postpaid instances.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Operating system name. 
     * @return OsName Operating system name.
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Operating system name.
     * @param OsName Operating system name.
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Security groups to which the instance belongs. To obtain the security group IDs, you can call [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) and look for the `sgld` fields in the response. 
     * @return SecurityGroupIds Security groups to which the instance belongs. To obtain the security group IDs, you can call [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) and look for the `sgld` fields in the response.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security groups to which the instance belongs. To obtain the security group IDs, you can call [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) and look for the `sgld` fields in the response.
     * @param SecurityGroupIds Security groups to which the instance belongs. To obtain the security group IDs, you can call [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808) and look for the `sgld` fields in the response.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Login settings of the instance. Currently only the key associated with the instance is returned. 
     * @return LoginSettings Login settings of the instance. Currently only the key associated with the instance is returned.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Login settings of the instance. Currently only the key associated with the instance is returned.
     * @param LoginSettings Login settings of the instance. Currently only the key associated with the instance is returned.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get Instance status. for specific status types, see the instance status table (https://www.tencentcloud.comom/document/api/213/15753?from_cn_redirect=1#InstanceStatus). 
     * @return InstanceState Instance status. for specific status types, see the instance status table (https://www.tencentcloud.comom/document/api/213/15753?from_cn_redirect=1#InstanceStatus).
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. for specific status types, see the instance status table (https://www.tencentcloud.comom/document/api/213/15753?from_cn_redirect=1#InstanceStatus).
     * @param InstanceState Instance status. for specific status types, see the instance status table (https://www.tencentcloud.comom/document/api/213/15753?from_cn_redirect=1#InstanceStatus).
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get List of tags associated with the instance. 
     * @return Tags List of tags associated with the instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags associated with the instance.
     * @param Tags List of tags associated with the instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Shutdown billing mode of an instance.

Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown</li><li>STOP_CHARGING: billing stops after shutdown</li><li>NOT_APPLICABLE: the instance is NOT shut down or stopping billing after shutdown is NOT APPLICABLE to the instance</li>. 
     * @return StopChargingMode Shutdown billing mode of an instance.

Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown</li><li>STOP_CHARGING: billing stops after shutdown</li><li>NOT_APPLICABLE: the instance is NOT shut down or stopping billing after shutdown is NOT APPLICABLE to the instance</li>.
     */
    public String getStopChargingMode() {
        return this.StopChargingMode;
    }

    /**
     * Set Shutdown billing mode of an instance.

Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown</li><li>STOP_CHARGING: billing stops after shutdown</li><li>NOT_APPLICABLE: the instance is NOT shut down or stopping billing after shutdown is NOT APPLICABLE to the instance</li>.
     * @param StopChargingMode Shutdown billing mode of an instance.

Valid values: <br><li>KEEP_CHARGING: billing continues after shutdown</li><li>STOP_CHARGING: billing stops after shutdown</li><li>NOT_APPLICABLE: the instance is NOT shut down or stopping billing after shutdown is NOT APPLICABLE to the instance</li>.
     */
    public void setStopChargingMode(String StopChargingMode) {
        this.StopChargingMode = StopChargingMode;
    }

    /**
     * Get Globally unique ID of the instance. 
     * @return Uuid Globally unique ID of the instance.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Globally unique ID of the instance.
     * @param Uuid Globally unique ID of the instance.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Last operation of the instance, such as StopInstances or ResetInstance. 
     * @return LatestOperation Last operation of the instance, such as StopInstances or ResetInstance.
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set Last operation of the instance, such as StopInstances or ResetInstance.
     * @param LatestOperation Last operation of the instance, such as StopInstances or ResetInstance.
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get The latest operation status of the instance. valid values:<br><li>SUCCESS: indicates that the operation succeeded</li><li>OPERATING: indicates that the operation is in progress</li><li>FAILED: indicates that the operation FAILED</li>.
Note: This field may return null, indicating that no valid value is found. 
     * @return LatestOperationState The latest operation status of the instance. valid values:<br><li>SUCCESS: indicates that the operation succeeded</li><li>OPERATING: indicates that the operation is in progress</li><li>FAILED: indicates that the operation FAILED</li>.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set The latest operation status of the instance. valid values:<br><li>SUCCESS: indicates that the operation succeeded</li><li>OPERATING: indicates that the operation is in progress</li><li>FAILED: indicates that the operation FAILED</li>.
Note: This field may return null, indicating that no valid value is found.
     * @param LatestOperationState The latest operation status of the instance. valid values:<br><li>SUCCESS: indicates that the operation succeeded</li><li>OPERATING: indicates that the operation is in progress</li><li>FAILED: indicates that the operation FAILED</li>.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get Unique request ID for the last operation of the instance. 
     * @return LatestOperationRequestId Unique request ID for the last operation of the instance.
     */
    public String getLatestOperationRequestId() {
        return this.LatestOperationRequestId;
    }

    /**
     * Set Unique request ID for the last operation of the instance.
     * @param LatestOperationRequestId Unique request ID for the last operation of the instance.
     */
    public void setLatestOperationRequestId(String LatestOperationRequestId) {
        this.LatestOperationRequestId = LatestOperationRequestId;
    }

    /**
     * Get Spread placement group ID. 
     * @return DisasterRecoverGroupId Spread placement group ID.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set Spread placement group ID.
     * @param DisasterRecoverGroupId Spread placement group ID.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get IPv6 address of the instance.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return IPv6Addresses IPv6 address of the instance.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String [] getIPv6Addresses() {
        return this.IPv6Addresses;
    }

    /**
     * Set IPv6 address of the instance.
Note: this field may return null, indicating that no valid value is obtained.
     * @param IPv6Addresses IPv6 address of the instance.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setIPv6Addresses(String [] IPv6Addresses) {
        this.IPv6Addresses = IPv6Addresses;
    }

    /**
     * Get CAM role name.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return CamRoleName CAM role name.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set CAM role name.
Note: this field may return null, indicating that no valid value is obtained.
     * @param CamRoleName CAM role name.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get High-performance computing cluster ID. 
     * @return HpcClusterId High-performance computing cluster ID.
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set High-performance computing cluster ID.
     * @param HpcClusterId High-performance computing cluster ID.
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get IP list of HPC cluster.
Note: this field may return null, indicating that no valid value was found. 
     * @return RdmaIpAddresses IP list of HPC cluster.
Note: this field may return null, indicating that no valid value was found.
     */
    public String [] getRdmaIpAddresses() {
        return this.RdmaIpAddresses;
    }

    /**
     * Set IP list of HPC cluster.
Note: this field may return null, indicating that no valid value was found.
     * @param RdmaIpAddresses IP list of HPC cluster.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setRdmaIpAddresses(String [] RdmaIpAddresses) {
        this.RdmaIpAddresses = RdmaIpAddresses;
    }

    /**
     * Get Dedicated cluster ID where the instance is located. 
     * @return DedicatedClusterId Dedicated cluster ID where the instance is located.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Dedicated cluster ID where the instance is located.
     * @param DedicatedClusterId Dedicated cluster ID where the instance is located.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get Instance isolation type. valid values:<br><li>ARREAR: indicates arrears isolation<br></li><li>EXPIRE: indicates isolation upon expiration<br></li><li>MANMADE: indicates voluntarily refunded isolation<br></li><li>NOTISOLATED: indicates unisolated<br></li>. 
     * @return IsolatedSource Instance isolation type. valid values:<br><li>ARREAR: indicates arrears isolation<br></li><li>EXPIRE: indicates isolation upon expiration<br></li><li>MANMADE: indicates voluntarily refunded isolation<br></li><li>NOTISOLATED: indicates unisolated<br></li>.
     */
    public String getIsolatedSource() {
        return this.IsolatedSource;
    }

    /**
     * Set Instance isolation type. valid values:<br><li>ARREAR: indicates arrears isolation<br></li><li>EXPIRE: indicates isolation upon expiration<br></li><li>MANMADE: indicates voluntarily refunded isolation<br></li><li>NOTISOLATED: indicates unisolated<br></li>.
     * @param IsolatedSource Instance isolation type. valid values:<br><li>ARREAR: indicates arrears isolation<br></li><li>EXPIRE: indicates isolation upon expiration<br></li><li>MANMADE: indicates voluntarily refunded isolation<br></li><li>NOTISOLATED: indicates unisolated<br></li>.
     */
    public void setIsolatedSource(String IsolatedSource) {
        this.IsolatedSource = IsolatedSource;
    }

    /**
     * Get GPU information. if it is a gpu type instance, this value will be returned. for other type instances, it does not return. 
     * @return GPUInfo GPU information. if it is a gpu type instance, this value will be returned. for other type instances, it does not return.
     */
    public GPUInfo getGPUInfo() {
        return this.GPUInfo;
    }

    /**
     * Set GPU information. if it is a gpu type instance, this value will be returned. for other type instances, it does not return.
     * @param GPUInfo GPU information. if it is a gpu type instance, this value will be returned. for other type instances, it does not return.
     */
    public void setGPUInfo(GPUInfo GPUInfo) {
        this.GPUInfo = GPUInfo;
    }

    /**
     * Get Instance OS license type. Default value: `TencentCloud` 
     * @return LicenseType Instance OS license type. Default value: `TencentCloud`
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Instance OS license type. Default value: `TencentCloud`
     * @param LicenseType Instance OS license type. Default value: `TencentCloud`
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Instance destruction protection flag indicates whether an instance is allowed to be deleted through an api. value ranges from:<br><li>true: indicates that instance protection is enabled, deletion through apis is not allowed</li><li>false: indicates that instance protection is disabled, allow passage</li><br>default value: false. 
     * @return DisableApiTermination Instance destruction protection flag indicates whether an instance is allowed to be deleted through an api. value ranges from:<br><li>true: indicates that instance protection is enabled, deletion through apis is not allowed</li><li>false: indicates that instance protection is disabled, allow passage</li><br>default value: false.
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set Instance destruction protection flag indicates whether an instance is allowed to be deleted through an api. value ranges from:<br><li>true: indicates that instance protection is enabled, deletion through apis is not allowed</li><li>false: indicates that instance protection is disabled, allow passage</li><br>default value: false.
     * @param DisableApiTermination Instance destruction protection flag indicates whether an instance is allowed to be deleted through an api. value ranges from:<br><li>true: indicates that instance protection is enabled, deletion through apis is not allowed</li><li>false: indicates that instance protection is disabled, allow passage</li><br>default value: false.
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get Default login user 
     * @return DefaultLoginUser Default login user
     */
    public String getDefaultLoginUser() {
        return this.DefaultLoginUser;
    }

    /**
     * Set Default login user
     * @param DefaultLoginUser Default login user
     */
    public void setDefaultLoginUser(String DefaultLoginUser) {
        this.DefaultLoginUser = DefaultLoginUser;
    }

    /**
     * Get Default login port 
     * @return DefaultLoginPort Default login port
     */
    public Long getDefaultLoginPort() {
        return this.DefaultLoginPort;
    }

    /**
     * Set Default login port
     * @param DefaultLoginPort Default login port
     */
    public void setDefaultLoginPort(Long DefaultLoginPort) {
        this.DefaultLoginPort = DefaultLoginPort;
    }

    /**
     * Get Latest operation errors of the instance.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return LatestOperationErrorMsg Latest operation errors of the instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLatestOperationErrorMsg() {
        return this.LatestOperationErrorMsg;
    }

    /**
     * Set Latest operation errors of the instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param LatestOperationErrorMsg Latest operation errors of the instance.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLatestOperationErrorMsg(String LatestOperationErrorMsg) {
        this.LatestOperationErrorMsg = LatestOperationErrorMsg;
    }

    /**
     * Get Custom metadata. this parameter corresponds to the metadata information specified when creating a CVM. **note: in beta test**. 
     * @return Metadata Custom metadata. this parameter corresponds to the metadata information specified when creating a CVM. **note: in beta test**.
     */
    public Metadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Custom metadata. this parameter corresponds to the metadata information specified when creating a CVM. **note: in beta test**.
     * @param Metadata Custom metadata. this parameter corresponds to the metadata information specified when creating a CVM. **note: in beta test**.
     */
    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get Specifies the public IPv6 address bound to the instance. 
     * @return PublicIPv6Addresses Specifies the public IPv6 address bound to the instance.
     */
    public String [] getPublicIPv6Addresses() {
        return this.PublicIPv6Addresses;
    }

    /**
     * Set Specifies the public IPv6 address bound to the instance.
     * @param PublicIPv6Addresses Specifies the public IPv6 address bound to the instance.
     */
    public void setPublicIPv6Addresses(String [] PublicIPv6Addresses) {
        this.PublicIPv6Addresses = PublicIPv6Addresses;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
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
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
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
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.StopChargingMode != null) {
            this.StopChargingMode = new String(source.StopChargingMode);
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
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.IPv6Addresses != null) {
            this.IPv6Addresses = new String[source.IPv6Addresses.length];
            for (int i = 0; i < source.IPv6Addresses.length; i++) {
                this.IPv6Addresses[i] = new String(source.IPv6Addresses[i]);
            }
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.RdmaIpAddresses != null) {
            this.RdmaIpAddresses = new String[source.RdmaIpAddresses.length];
            for (int i = 0; i < source.RdmaIpAddresses.length; i++) {
                this.RdmaIpAddresses[i] = new String(source.RdmaIpAddresses[i]);
            }
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.IsolatedSource != null) {
            this.IsolatedSource = new String(source.IsolatedSource);
        }
        if (source.GPUInfo != null) {
            this.GPUInfo = new GPUInfo(source.GPUInfo);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.DefaultLoginUser != null) {
            this.DefaultLoginUser = new String(source.DefaultLoginUser);
        }
        if (source.DefaultLoginPort != null) {
            this.DefaultLoginPort = new Long(source.DefaultLoginPort);
        }
        if (source.LatestOperationErrorMsg != null) {
            this.LatestOperationErrorMsg = new String(source.LatestOperationErrorMsg);
        }
        if (source.Metadata != null) {
            this.Metadata = new Metadata(source.Metadata);
        }
        if (source.PublicIPv6Addresses != null) {
            this.PublicIPv6Addresses = new String[source.PublicIPv6Addresses.length];
            for (int i = 0; i < source.PublicIPv6Addresses.length; i++) {
                this.PublicIPv6Addresses[i] = new String(source.PublicIPv6Addresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StopChargingMode", this.StopChargingMode);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "LatestOperationRequestId", this.LatestOperationRequestId);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamArraySimple(map, prefix + "IPv6Addresses.", this.IPv6Addresses);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamArraySimple(map, prefix + "RdmaIpAddresses.", this.RdmaIpAddresses);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "IsolatedSource", this.IsolatedSource);
        this.setParamObj(map, prefix + "GPUInfo.", this.GPUInfo);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "DefaultLoginUser", this.DefaultLoginUser);
        this.setParamSimple(map, prefix + "DefaultLoginPort", this.DefaultLoginPort);
        this.setParamSimple(map, prefix + "LatestOperationErrorMsg", this.LatestOperationErrorMsg);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamArraySimple(map, prefix + "PublicIPv6Addresses.", this.PublicIPv6Addresses);

    }
}

