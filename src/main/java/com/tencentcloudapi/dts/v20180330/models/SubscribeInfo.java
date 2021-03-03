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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubscribeInfo extends AbstractModel{

    /**
    * Data subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Data subscription instance name
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * ID of channel bound to data subscription instance
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Name of product bound to data subscription instance
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * ID of database instance bound to data subscription instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Status of database instance bound to data subscription instance
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * Last modified time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Isolation time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Deactivation time
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Last modified consumption starting time point. If it has never been modified, this field is 0
    */
    @SerializedName("ConsumeStartTime")
    @Expose
    private String ConsumeStartTime;

    /**
    * Data subscription instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Billing mode. 1: pay-as-you-go
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Data subscription instance VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Data subscription instance Vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Unique ID of the VPC where the data subscription instance VIP resides
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Unique ID of the subnet where the data subscription instance VIP resides
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining, offline
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Timestamp of the last message confirmed by the SDK. If the SDK keeps consuming, this field can also be used as the current consumption time point of the SDK
    */
    @SerializedName("SdkConsumedTime")
    @Expose
    private String SdkConsumedTime;

    /**
    * Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Whether auto-renewal is enabled. 0: do not enable; 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Subscription instance edition. ·`txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
     * Get Data subscription instance ID 
     * @return SubscribeId Data subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Data subscription instance ID
     * @param SubscribeId Data subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Data subscription instance name 
     * @return SubscribeName Data subscription instance name
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set Data subscription instance name
     * @param SubscribeName Data subscription instance name
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get ID of channel bound to data subscription instance 
     * @return ChannelId ID of channel bound to data subscription instance
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set ID of channel bound to data subscription instance
     * @param ChannelId ID of channel bound to data subscription instance
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Name of product bound to data subscription instance 
     * @return Product Name of product bound to data subscription instance
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Name of product bound to data subscription instance
     * @param Product Name of product bound to data subscription instance
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get ID of database instance bound to data subscription instance 
     * @return InstanceId ID of database instance bound to data subscription instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of database instance bound to data subscription instance
     * @param InstanceId ID of database instance bound to data subscription instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Status of database instance bound to data subscription instance 
     * @return InstanceStatus Status of database instance bound to data subscription instance
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Status of database instance bound to data subscription instance
     * @param InstanceStatus Status of database instance bound to data subscription instance
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Data subscription instance configuration status. Valid values: unconfigure, configuring, configured 
     * @return SubsStatus Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     * @param SubsStatus Data subscription instance configuration status. Valid values: unconfigure, configuring, configured
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get Last modified time 
     * @return ModifyTime Last modified time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last modified time
     * @param ModifyTime Last modified time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Isolation time 
     * @return IsolateTime Isolation time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolation time
     * @param IsolateTime Isolation time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Expiration time 
     * @return ExpireTime Expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time
     * @param ExpireTime Expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Deactivation time 
     * @return OfflineTime Deactivation time
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Deactivation time
     * @param OfflineTime Deactivation time
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Last modified consumption starting time point. If it has never been modified, this field is 0 
     * @return ConsumeStartTime Last modified consumption starting time point. If it has never been modified, this field is 0
     */
    public String getConsumeStartTime() {
        return this.ConsumeStartTime;
    }

    /**
     * Set Last modified consumption starting time point. If it has never been modified, this field is 0
     * @param ConsumeStartTime Last modified consumption starting time point. If it has never been modified, this field is 0
     */
    public void setConsumeStartTime(String ConsumeStartTime) {
        this.ConsumeStartTime = ConsumeStartTime;
    }

    /**
     * Get Data subscription instance region 
     * @return Region Data subscription instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Data subscription instance region
     * @param Region Data subscription instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Billing mode. 1: pay-as-you-go 
     * @return PayType Billing mode. 1: pay-as-you-go
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing mode. 1: pay-as-you-go
     * @param PayType Billing mode. 1: pay-as-you-go
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Data subscription instance VIP 
     * @return Vip Data subscription instance VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Data subscription instance VIP
     * @param Vip Data subscription instance VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Data subscription instance Vport 
     * @return Vport Data subscription instance Vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Data subscription instance Vport
     * @param Vport Data subscription instance Vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Unique ID of the VPC where the data subscription instance VIP resides 
     * @return UniqVpcId Unique ID of the VPC where the data subscription instance VIP resides
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Unique ID of the VPC where the data subscription instance VIP resides
     * @param UniqVpcId Unique ID of the VPC where the data subscription instance VIP resides
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Unique ID of the subnet where the data subscription instance VIP resides 
     * @return UniqSubnetId Unique ID of the subnet where the data subscription instance VIP resides
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Unique ID of the subnet where the data subscription instance VIP resides
     * @param UniqSubnetId Unique ID of the subnet where the data subscription instance VIP resides
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining, offline 
     * @return Status Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining, offline
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining, offline
     * @param Status Data subscription instance status. Valid values: creating, normal, isolating, isolated, offlining, offline
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Timestamp of the last message confirmed by the SDK. If the SDK keeps consuming, this field can also be used as the current consumption time point of the SDK 
     * @return SdkConsumedTime Timestamp of the last message confirmed by the SDK. If the SDK keeps consuming, this field can also be used as the current consumption time point of the SDK
     */
    public String getSdkConsumedTime() {
        return this.SdkConsumedTime;
    }

    /**
     * Set Timestamp of the last message confirmed by the SDK. If the SDK keeps consuming, this field can also be used as the current consumption time point of the SDK
     * @param SdkConsumedTime Timestamp of the last message confirmed by the SDK. If the SDK keeps consuming, this field can also be used as the current consumption time point of the SDK
     */
    public void setSdkConsumedTime(String SdkConsumedTime) {
        this.SdkConsumedTime = SdkConsumedTime;
    }

    /**
     * Get Tag
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tag
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether auto-renewal is enabled. 0: do not enable; 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag Whether auto-renewal is enabled. 0: do not enable; 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled. 0: do not enable; 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoRenewFlag Whether auto-renewal is enabled. 0: do not enable; 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Subscription instance edition. ·`txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SubscribeVersion Subscription instance edition. ·`txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set Subscription instance edition. ·`txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SubscribeVersion Subscription instance edition. ·`txdts`: legacy data subscription; `kafka`: data subscription in Kafka edition
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "SubscribeName", this.SubscribeName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SubsStatus", this.SubsStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "ConsumeStartTime", this.ConsumeStartTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SdkConsumedTime", this.SdkConsumedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);

    }
}

