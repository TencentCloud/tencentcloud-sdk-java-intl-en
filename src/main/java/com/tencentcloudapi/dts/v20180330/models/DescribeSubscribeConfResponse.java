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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscribeConfResponse extends AbstractModel {

    /**
    * Subscription instance ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * Subscription instance name
    */
    @SerializedName("SubscribeName")
    @Expose
    private String SubscribeName;

    /**
    * Subscription channel
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Subscribed database type
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Subscribed instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Subscribed instance status. Valid values: running, offline, isolate
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Subscription instance status. Valid values: unconfigure, configuring, configured
    */
    @SerializedName("SubsStatus")
    @Expose
    private String SubsStatus;

    /**
    * Subscription instance lifecycle status. Valid values: normal, isolating, isolated, offlining
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Subscription instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Subscription instance isolation time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Subscription instance expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Subscription instance deactivation time
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Consumption starting time point of subscription instance
    */
    @SerializedName("ConsumeStartTime")
    @Expose
    private String ConsumeStartTime;

    /**
    * Subscription instance billing mode. 1: hourly billing
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * Subscription channel VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Subscription channel port
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Subscription channel `VpcId`
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Subscription channel `SubnetId`
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Current SDK consumption time point
    */
    @SerializedName("SdkConsumedTime")
    @Expose
    private String SdkConsumedTime;

    /**
    * Subscription SDK IP address
    */
    @SerializedName("SdkHost")
    @Expose
    private String SdkHost;

    /**
    * Subscription object type. 0: full instance subscription, 1: DDL data subscription, 2: DML structure subscription, 3: DDL data subscription + DML structure subscription
    */
    @SerializedName("SubscribeObjectType")
    @Expose
    private Long SubscribeObjectType;

    /**
    * Subscription object, which is an empty array if `SubscribeObjectType` is 0
    */
    @SerializedName("SubscribeObjects")
    @Expose
    private SubscribeObject [] SubscribeObjects;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Tags of the subscription
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * Whether auto-renewal is enabled. 0: do not enable, 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Data subscription edition. `txdts`: Legacy edition; `kafka`: Kafka edition.
    */
    @SerializedName("SubscribeVersion")
    @Expose
    private String SubscribeVersion;

    /**
    * Error message.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Errors")
    @Expose
    private SubsErr [] Errors;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Subscription instance ID 
     * @return SubscribeId Subscription instance ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set Subscription instance ID
     * @param SubscribeId Subscription instance ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get Subscription instance name 
     * @return SubscribeName Subscription instance name
     */
    public String getSubscribeName() {
        return this.SubscribeName;
    }

    /**
     * Set Subscription instance name
     * @param SubscribeName Subscription instance name
     */
    public void setSubscribeName(String SubscribeName) {
        this.SubscribeName = SubscribeName;
    }

    /**
     * Get Subscription channel 
     * @return ChannelId Subscription channel
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Subscription channel
     * @param ChannelId Subscription channel
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Subscribed database type 
     * @return Product Subscribed database type
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Subscribed database type
     * @param Product Subscribed database type
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Subscribed instance 
     * @return InstanceId Subscribed instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Subscribed instance
     * @param InstanceId Subscribed instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Subscribed instance status. Valid values: running, offline, isolate 
     * @return InstanceStatus Subscribed instance status. Valid values: running, offline, isolate
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Subscribed instance status. Valid values: running, offline, isolate
     * @param InstanceStatus Subscribed instance status. Valid values: running, offline, isolate
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Subscription instance status. Valid values: unconfigure, configuring, configured 
     * @return SubsStatus Subscription instance status. Valid values: unconfigure, configuring, configured
     */
    public String getSubsStatus() {
        return this.SubsStatus;
    }

    /**
     * Set Subscription instance status. Valid values: unconfigure, configuring, configured
     * @param SubsStatus Subscription instance status. Valid values: unconfigure, configuring, configured
     */
    public void setSubsStatus(String SubsStatus) {
        this.SubsStatus = SubsStatus;
    }

    /**
     * Get Subscription instance lifecycle status. Valid values: normal, isolating, isolated, offlining 
     * @return Status Subscription instance lifecycle status. Valid values: normal, isolating, isolated, offlining
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Subscription instance lifecycle status. Valid values: normal, isolating, isolated, offlining
     * @param Status Subscription instance lifecycle status. Valid values: normal, isolating, isolated, offlining
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Subscription instance creation time 
     * @return CreateTime Subscription instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Subscription instance creation time
     * @param CreateTime Subscription instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Subscription instance isolation time 
     * @return IsolateTime Subscription instance isolation time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Subscription instance isolation time
     * @param IsolateTime Subscription instance isolation time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Subscription instance expiration time 
     * @return ExpireTime Subscription instance expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Subscription instance expiration time
     * @param ExpireTime Subscription instance expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Subscription instance deactivation time 
     * @return OfflineTime Subscription instance deactivation time
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Subscription instance deactivation time
     * @param OfflineTime Subscription instance deactivation time
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Consumption starting time point of subscription instance 
     * @return ConsumeStartTime Consumption starting time point of subscription instance
     */
    public String getConsumeStartTime() {
        return this.ConsumeStartTime;
    }

    /**
     * Set Consumption starting time point of subscription instance
     * @param ConsumeStartTime Consumption starting time point of subscription instance
     */
    public void setConsumeStartTime(String ConsumeStartTime) {
        this.ConsumeStartTime = ConsumeStartTime;
    }

    /**
     * Get Subscription instance billing mode. 1: hourly billing 
     * @return PayType Subscription instance billing mode. 1: hourly billing
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set Subscription instance billing mode. 1: hourly billing
     * @param PayType Subscription instance billing mode. 1: hourly billing
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Subscription channel VIP 
     * @return Vip Subscription channel VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Subscription channel VIP
     * @param Vip Subscription channel VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Subscription channel port 
     * @return Vport Subscription channel port
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Subscription channel port
     * @param Vport Subscription channel port
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Subscription channel `VpcId` 
     * @return UniqVpcId Subscription channel `VpcId`
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set Subscription channel `VpcId`
     * @param UniqVpcId Subscription channel `VpcId`
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Subscription channel `SubnetId` 
     * @return UniqSubnetId Subscription channel `SubnetId`
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Subscription channel `SubnetId`
     * @param UniqSubnetId Subscription channel `SubnetId`
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Current SDK consumption time point 
     * @return SdkConsumedTime Current SDK consumption time point
     */
    public String getSdkConsumedTime() {
        return this.SdkConsumedTime;
    }

    /**
     * Set Current SDK consumption time point
     * @param SdkConsumedTime Current SDK consumption time point
     */
    public void setSdkConsumedTime(String SdkConsumedTime) {
        this.SdkConsumedTime = SdkConsumedTime;
    }

    /**
     * Get Subscription SDK IP address 
     * @return SdkHost Subscription SDK IP address
     */
    public String getSdkHost() {
        return this.SdkHost;
    }

    /**
     * Set Subscription SDK IP address
     * @param SdkHost Subscription SDK IP address
     */
    public void setSdkHost(String SdkHost) {
        this.SdkHost = SdkHost;
    }

    /**
     * Get Subscription object type. 0: full instance subscription, 1: DDL data subscription, 2: DML structure subscription, 3: DDL data subscription + DML structure subscription 
     * @return SubscribeObjectType Subscription object type. 0: full instance subscription, 1: DDL data subscription, 2: DML structure subscription, 3: DDL data subscription + DML structure subscription
     */
    public Long getSubscribeObjectType() {
        return this.SubscribeObjectType;
    }

    /**
     * Set Subscription object type. 0: full instance subscription, 1: DDL data subscription, 2: DML structure subscription, 3: DDL data subscription + DML structure subscription
     * @param SubscribeObjectType Subscription object type. 0: full instance subscription, 1: DDL data subscription, 2: DML structure subscription, 3: DDL data subscription + DML structure subscription
     */
    public void setSubscribeObjectType(Long SubscribeObjectType) {
        this.SubscribeObjectType = SubscribeObjectType;
    }

    /**
     * Get Subscription object, which is an empty array if `SubscribeObjectType` is 0 
     * @return SubscribeObjects Subscription object, which is an empty array if `SubscribeObjectType` is 0
     */
    public SubscribeObject [] getSubscribeObjects() {
        return this.SubscribeObjects;
    }

    /**
     * Set Subscription object, which is an empty array if `SubscribeObjectType` is 0
     * @param SubscribeObjects Subscription object, which is an empty array if `SubscribeObjectType` is 0
     */
    public void setSubscribeObjects(SubscribeObject [] SubscribeObjects) {
        this.SubscribeObjects = SubscribeObjects;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Tags of the subscription
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Tags Tags of the subscription
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags of the subscription
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Tags Tags of the subscription
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether auto-renewal is enabled. 0: do not enable, 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AutoRenewFlag Whether auto-renewal is enabled. 0: do not enable, 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled. 0: do not enable, 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AutoRenewFlag Whether auto-renewal is enabled. 0: do not enable, 1: enable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Data subscription edition. `txdts`: Legacy edition; `kafka`: Kafka edition. 
     * @return SubscribeVersion Data subscription edition. `txdts`: Legacy edition; `kafka`: Kafka edition.
     */
    public String getSubscribeVersion() {
        return this.SubscribeVersion;
    }

    /**
     * Set Data subscription edition. `txdts`: Legacy edition; `kafka`: Kafka edition.
     * @param SubscribeVersion Data subscription edition. `txdts`: Legacy edition; `kafka`: Kafka edition.
     */
    public void setSubscribeVersion(String SubscribeVersion) {
        this.SubscribeVersion = SubscribeVersion;
    }

    /**
     * Get Error message.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Errors Error message.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public SubsErr [] getErrors() {
        return this.Errors;
    }

    /**
     * Set Error message.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Errors Error message.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setErrors(SubsErr [] Errors) {
        this.Errors = Errors;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSubscribeConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubscribeConfResponse(DescribeSubscribeConfResponse source) {
        if (source.SubscribeId != null) {
            this.SubscribeId = new String(source.SubscribeId);
        }
        if (source.SubscribeName != null) {
            this.SubscribeName = new String(source.SubscribeName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SubsStatus != null) {
            this.SubsStatus = new String(source.SubsStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
        if (source.ConsumeStartTime != null) {
            this.ConsumeStartTime = new String(source.ConsumeStartTime);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.SdkConsumedTime != null) {
            this.SdkConsumedTime = new String(source.SdkConsumedTime);
        }
        if (source.SdkHost != null) {
            this.SdkHost = new String(source.SdkHost);
        }
        if (source.SubscribeObjectType != null) {
            this.SubscribeObjectType = new Long(source.SubscribeObjectType);
        }
        if (source.SubscribeObjects != null) {
            this.SubscribeObjects = new SubscribeObject[source.SubscribeObjects.length];
            for (int i = 0; i < source.SubscribeObjects.length; i++) {
                this.SubscribeObjects[i] = new SubscribeObject(source.SubscribeObjects[i]);
            }
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SubscribeVersion != null) {
            this.SubscribeVersion = new String(source.SubscribeVersion);
        }
        if (source.Errors != null) {
            this.Errors = new SubsErr[source.Errors.length];
            for (int i = 0; i < source.Errors.length; i++) {
                this.Errors[i] = new SubsErr(source.Errors[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "ConsumeStartTime", this.ConsumeStartTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "SdkConsumedTime", this.SdkConsumedTime);
        this.setParamSimple(map, prefix + "SdkHost", this.SdkHost);
        this.setParamSimple(map, prefix + "SubscribeObjectType", this.SubscribeObjectType);
        this.setParamArrayObj(map, prefix + "SubscribeObjects.", this.SubscribeObjects);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SubscribeVersion", this.SubscribeVersion);
        this.setParamArrayObj(map, prefix + "Errors.", this.Errors);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

