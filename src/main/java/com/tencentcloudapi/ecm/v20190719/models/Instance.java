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
package com.tencentcloudapi.ecm.v20190719.models;

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
    * Instance name, such as `ens-34241f3s`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance status. Valid values:
PENDING: creating
LAUNCH_FAILED: failed to create
RUNNING: running
STOPPED: shut down
STARTING: starting
STOPPING: shutting down
REBOOTING: restarting
SHUTDOWN: to be terminated
TERMINATING: terminating.
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Information of the image currently used by the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Image")
    @Expose
    private Image Image;

    /**
    * Basic information of the current module of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SimpleModule")
    @Expose
    private SimpleModule SimpleModule;

    /**
    * Location information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Position Position;

    /**
    * Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Internet")
    @Expose
    private Internet Internet;

    /**
    * Configuration information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTypeConfig")
    @Expose
    private InstanceTypeConfig InstanceTypeConfig;

    /**
    * Instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperation")
    @Expose
    private String LatestOperation;

    /**
    * Result of the last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LatestOperationState")
    @Expose
    private String LatestOperationState;

    /**
    * Instance business status. Valid values:
NORMAL: normal
EXPIRED: expired
PROTECTIVELY_ISOLATED: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * System disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDiskSize")
    @Expose
    private Long SystemDiskSize;

    /**
    * Data disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDiskSize")
    @Expose
    private Long DataDiskSize;

    /**
    * Instance UUID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * Billing mode.
    0: postpaid.
    1: prepaid.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Expiration time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Isolation time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * Auto-Renewal flag.
      0: no.
      1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Expiration status.
    NORMAL: normal.
    WILL_EXPIRE: about to expire.
    EXPIRED: expired.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpireState")
    @Expose
    private String ExpireState;

    /**
    * System disk information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDisk")
    @Expose
    private DiskInfo SystemDisk;

    /**
    * Data disk information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisks")
    @Expose
    private DiskInfo [] DataDisks;

    /**
    * New instance flag
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NewFlag")
    @Expose
    private Long NewFlag;

    /**
    * Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * VPC attribute
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * ISP field of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * Physical location information. Note that this field is currently a reserved field and null.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhysicalPosition")
    @Expose
    private PhysicalPosition PhysicalPosition;

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
     * Get Instance name, such as `ens-34241f3s`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name, such as `ens-34241f3s`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name, such as `ens-34241f3s`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name, such as `ens-34241f3s`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance status. Valid values:
PENDING: creating
LAUNCH_FAILED: failed to create
RUNNING: running
STOPPED: shut down
STARTING: starting
STOPPING: shutting down
REBOOTING: restarting
SHUTDOWN: to be terminated
TERMINATING: terminating. 
     * @return InstanceState Instance status. Valid values:
PENDING: creating
LAUNCH_FAILED: failed to create
RUNNING: running
STOPPED: shut down
STARTING: starting
STOPPING: shutting down
REBOOTING: restarting
SHUTDOWN: to be terminated
TERMINATING: terminating.
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. Valid values:
PENDING: creating
LAUNCH_FAILED: failed to create
RUNNING: running
STOPPED: shut down
STARTING: starting
STOPPING: shutting down
REBOOTING: restarting
SHUTDOWN: to be terminated
TERMINATING: terminating.
     * @param InstanceState Instance status. Valid values:
PENDING: creating
LAUNCH_FAILED: failed to create
RUNNING: running
STOPPED: shut down
STARTING: starting
STOPPING: shutting down
REBOOTING: restarting
SHUTDOWN: to be terminated
TERMINATING: terminating.
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get Information of the image currently used by the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Image Information of the image currently used by the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * Set Information of the image currently used by the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Image Information of the image currently used by the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImage(Image Image) {
        this.Image = Image;
    }

    /**
     * Get Basic information of the current module of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SimpleModule Basic information of the current module of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SimpleModule getSimpleModule() {
        return this.SimpleModule;
    }

    /**
     * Set Basic information of the current module of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SimpleModule Basic information of the current module of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSimpleModule(SimpleModule SimpleModule) {
        this.SimpleModule = SimpleModule;
    }

    /**
     * Get Location information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Position Location information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Position getPosition() {
        return this.Position;
    }

    /**
     * Set Location information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Position Location information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Position Position) {
        this.Position = Position;
    }

    /**
     * Get Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Internet Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Internet getInternet() {
        return this.Internet;
    }

    /**
     * Set Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Internet Network information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInternet(Internet Internet) {
        this.Internet = Internet;
    }

    /**
     * Get Configuration information of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTypeConfig Configuration information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public InstanceTypeConfig getInstanceTypeConfig() {
        return this.InstanceTypeConfig;
    }

    /**
     * Set Configuration information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceTypeConfig Configuration information of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTypeConfig(InstanceTypeConfig InstanceTypeConfig) {
        this.InstanceTypeConfig = InstanceTypeConfig;
    }

    /**
     * Get Instance creation time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Instance creation time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance tag information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Instance tag information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperation Last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperation() {
        return this.LatestOperation;
    }

    /**
     * Set Last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperation Last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperation(String LatestOperation) {
        this.LatestOperation = LatestOperation;
    }

    /**
     * Get Result of the last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LatestOperationState Result of the last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLatestOperationState() {
        return this.LatestOperationState;
    }

    /**
     * Set Result of the last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LatestOperationState Result of the last operation on the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLatestOperationState(String LatestOperationState) {
        this.LatestOperationState = LatestOperationState;
    }

    /**
     * Get Instance business status. Valid values:
NORMAL: normal
EXPIRED: expired
PROTECTIVELY_ISOLATED: isolated.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RestrictState Instance business status. Valid values:
NORMAL: normal
EXPIRED: expired
PROTECTIVELY_ISOLATED: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set Instance business status. Valid values:
NORMAL: normal
EXPIRED: expired
PROTECTIVELY_ISOLATED: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RestrictState Instance business status. Valid values:
NORMAL: normal
EXPIRED: expired
PROTECTIVELY_ISOLATED: isolated.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get System disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SystemDiskSize System disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSystemDiskSize() {
        return this.SystemDiskSize;
    }

    /**
     * Set System disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SystemDiskSize System disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDiskSize(Long SystemDiskSize) {
        this.SystemDiskSize = SystemDiskSize;
    }

    /**
     * Get Data disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataDiskSize Data disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataDiskSize() {
        return this.DataDiskSize;
    }

    /**
     * Set Data disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataDiskSize Data disk size in GB.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDiskSize(Long DataDiskSize) {
        this.DataDiskSize = DataDiskSize;
    }

    /**
     * Get Instance UUID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UUID Instance UUID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set Instance UUID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UUID Instance UUID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get Billing mode.
    0: postpaid.
    1: prepaid.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PayMode Billing mode.
    0: postpaid.
    1: prepaid.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode.
    0: postpaid.
    1: prepaid.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PayMode Billing mode.
    0: postpaid.
    1: prepaid.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiration time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireTime Expiration time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireTime Expiration time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Isolation time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsolatedTime Isolation time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Isolation time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsolatedTime Isolation time in the format of `yyyy-mm-dd HH:mm:ss`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Auto-Renewal flag.
      0: no.
      1: yes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Auto-Renewal flag.
      0: no.
      1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-Renewal flag.
      0: no.
      1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Auto-Renewal flag.
      0: no.
      1: yes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Expiration status.
    NORMAL: normal.
    WILL_EXPIRE: about to expire.
    EXPIRED: expired.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ExpireState Expiration status.
    NORMAL: normal.
    WILL_EXPIRE: about to expire.
    EXPIRED: expired.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getExpireState() {
        return this.ExpireState;
    }

    /**
     * Set Expiration status.
    NORMAL: normal.
    WILL_EXPIRE: about to expire.
    EXPIRED: expired.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ExpireState Expiration status.
    NORMAL: normal.
    WILL_EXPIRE: about to expire.
    EXPIRED: expired.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setExpireState(String ExpireState) {
        this.ExpireState = ExpireState;
    }

    /**
     * Get System disk information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SystemDisk System disk information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DiskInfo getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set System disk information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SystemDisk System disk information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDisk(DiskInfo SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Data disk information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DataDisks Data disk information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public DiskInfo [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Data disk information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DataDisks Data disk information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisks(DiskInfo [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get New instance flag
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NewFlag New instance flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNewFlag() {
        return this.NewFlag;
    }

    /**
     * Set New instance flag
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NewFlag New instance flag
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNewFlag(Long NewFlag) {
        this.NewFlag = NewFlag;
    }

    /**
     * Get Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroupIds Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroupIds Security group of the instance, which can be obtained from the `sgId` field in the returned value of the `DescribeSecurityGroups` API.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get VPC attribute
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VirtualPrivateCloud VPC attribute
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set VPC attribute
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VirtualPrivateCloud VPC attribute
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get ISP field of the instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ISP ISP field of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set ISP field of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ISP ISP field of the instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get Physical location information. Note that this field is currently a reserved field and null.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PhysicalPosition Physical location information. Note that this field is currently a reserved field and null.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PhysicalPosition getPhysicalPosition() {
        return this.PhysicalPosition;
    }

    /**
     * Set Physical location information. Note that this field is currently a reserved field and null.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PhysicalPosition Physical location information. Note that this field is currently a reserved field and null.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPhysicalPosition(PhysicalPosition PhysicalPosition) {
        this.PhysicalPosition = PhysicalPosition;
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
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.Image != null) {
            this.Image = new Image(source.Image);
        }
        if (source.SimpleModule != null) {
            this.SimpleModule = new SimpleModule(source.SimpleModule);
        }
        if (source.Position != null) {
            this.Position = new Position(source.Position);
        }
        if (source.Internet != null) {
            this.Internet = new Internet(source.Internet);
        }
        if (source.InstanceTypeConfig != null) {
            this.InstanceTypeConfig = new InstanceTypeConfig(source.InstanceTypeConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.LatestOperation != null) {
            this.LatestOperation = new String(source.LatestOperation);
        }
        if (source.LatestOperationState != null) {
            this.LatestOperationState = new String(source.LatestOperationState);
        }
        if (source.RestrictState != null) {
            this.RestrictState = new String(source.RestrictState);
        }
        if (source.SystemDiskSize != null) {
            this.SystemDiskSize = new Long(source.SystemDiskSize);
        }
        if (source.DataDiskSize != null) {
            this.DataDiskSize = new Long(source.DataDiskSize);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ExpireState != null) {
            this.ExpireState = new String(source.ExpireState);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new DiskInfo(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DiskInfo[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DiskInfo(source.DataDisks[i]);
            }
        }
        if (source.NewFlag != null) {
            this.NewFlag = new Long(source.NewFlag);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.PhysicalPosition != null) {
            this.PhysicalPosition = new PhysicalPosition(source.PhysicalPosition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "SimpleModule.", this.SimpleModule);
        this.setParamObj(map, prefix + "Position.", this.Position);
        this.setParamObj(map, prefix + "Internet.", this.Internet);
        this.setParamObj(map, prefix + "InstanceTypeConfig.", this.InstanceTypeConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "LatestOperation", this.LatestOperation);
        this.setParamSimple(map, prefix + "LatestOperationState", this.LatestOperationState);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "SystemDiskSize", this.SystemDiskSize);
        this.setParamSimple(map, prefix + "DataDiskSize", this.DataDiskSize);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireState", this.ExpireState);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "NewFlag", this.NewFlag);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamObj(map, prefix + "PhysicalPosition.", this.PhysicalPosition);

    }
}

