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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReadOnlyDBInstancesRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupType")
    @Expose
    private Long ReadOnlyGroupType;

    /**
    * 
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupForcedUpgrade")
    @Expose
    private Long ReadOnlyGroupForcedUpgrade;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupId")
    @Expose
    private String ReadOnlyGroupId;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupName")
    @Expose
    private String ReadOnlyGroupName;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupIsOfflineDelay")
    @Expose
    private Long ReadOnlyGroupIsOfflineDelay;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupMaxDelayTime")
    @Expose
    private Long ReadOnlyGroupMaxDelayTime;

    /**
    * 
    */
    @SerializedName("ReadOnlyGroupMinInGroup")
    @Expose
    private Long ReadOnlyGroupMinInGroup;

    /**
    * 
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 
    */
    @SerializedName("SecurityGroupList")
    @Expose
    private String [] SecurityGroupList;

    /**
    * 
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * 
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * 
    */
    @SerializedName("Collation")
    @Expose
    private String Collation;

    /**
    * 
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

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

    /**
     * Get  
     * @return Zone 
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 
     * @param Zone 
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get  
     * @return ReadOnlyGroupType 
     */
    public Long getReadOnlyGroupType() {
        return this.ReadOnlyGroupType;
    }

    /**
     * Set 
     * @param ReadOnlyGroupType 
     */
    public void setReadOnlyGroupType(Long ReadOnlyGroupType) {
        this.ReadOnlyGroupType = ReadOnlyGroupType;
    }

    /**
     * Get  
     * @return Memory 
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 
     * @param Memory 
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  
     * @return Storage 
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 
     * @param Storage 
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get  
     * @return ReadOnlyGroupForcedUpgrade 
     */
    public Long getReadOnlyGroupForcedUpgrade() {
        return this.ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Set 
     * @param ReadOnlyGroupForcedUpgrade 
     */
    public void setReadOnlyGroupForcedUpgrade(Long ReadOnlyGroupForcedUpgrade) {
        this.ReadOnlyGroupForcedUpgrade = ReadOnlyGroupForcedUpgrade;
    }

    /**
     * Get  
     * @return ReadOnlyGroupId 
     */
    public String getReadOnlyGroupId() {
        return this.ReadOnlyGroupId;
    }

    /**
     * Set 
     * @param ReadOnlyGroupId 
     */
    public void setReadOnlyGroupId(String ReadOnlyGroupId) {
        this.ReadOnlyGroupId = ReadOnlyGroupId;
    }

    /**
     * Get  
     * @return ReadOnlyGroupName 
     */
    public String getReadOnlyGroupName() {
        return this.ReadOnlyGroupName;
    }

    /**
     * Set 
     * @param ReadOnlyGroupName 
     */
    public void setReadOnlyGroupName(String ReadOnlyGroupName) {
        this.ReadOnlyGroupName = ReadOnlyGroupName;
    }

    /**
     * Get  
     * @return ReadOnlyGroupIsOfflineDelay 
     */
    public Long getReadOnlyGroupIsOfflineDelay() {
        return this.ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Set 
     * @param ReadOnlyGroupIsOfflineDelay 
     */
    public void setReadOnlyGroupIsOfflineDelay(Long ReadOnlyGroupIsOfflineDelay) {
        this.ReadOnlyGroupIsOfflineDelay = ReadOnlyGroupIsOfflineDelay;
    }

    /**
     * Get  
     * @return ReadOnlyGroupMaxDelayTime 
     */
    public Long getReadOnlyGroupMaxDelayTime() {
        return this.ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Set 
     * @param ReadOnlyGroupMaxDelayTime 
     */
    public void setReadOnlyGroupMaxDelayTime(Long ReadOnlyGroupMaxDelayTime) {
        this.ReadOnlyGroupMaxDelayTime = ReadOnlyGroupMaxDelayTime;
    }

    /**
     * Get  
     * @return ReadOnlyGroupMinInGroup 
     */
    public Long getReadOnlyGroupMinInGroup() {
        return this.ReadOnlyGroupMinInGroup;
    }

    /**
     * Set 
     * @param ReadOnlyGroupMinInGroup 
     */
    public void setReadOnlyGroupMinInGroup(Long ReadOnlyGroupMinInGroup) {
        this.ReadOnlyGroupMinInGroup = ReadOnlyGroupMinInGroup;
    }

    /**
     * Get  
     * @return InstanceChargeType 
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 
     * @param InstanceChargeType 
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get  
     * @return GoodsNum 
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 
     * @param GoodsNum 
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get  
     * @return SubnetId 
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 
     * @param SubnetId 
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get  
     * @return Period 
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 
     * @param Period 
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get  
     * @return SecurityGroupList 
     */
    public String [] getSecurityGroupList() {
        return this.SecurityGroupList;
    }

    /**
     * Set 
     * @param SecurityGroupList 
     */
    public void setSecurityGroupList(String [] SecurityGroupList) {
        this.SecurityGroupList = SecurityGroupList;
    }

    /**
     * Get  
     * @return AutoVoucher 
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 
     * @param AutoVoucher 
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get  
     * @return VoucherIds 
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 
     * @param VoucherIds 
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get  
     * @return ResourceTags 
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 
     * @param ResourceTags 
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get  
     * @return Collation 
     */
    public String getCollation() {
        return this.Collation;
    }

    /**
     * Set 
     * @param Collation 
     */
    public void setCollation(String Collation) {
        this.Collation = Collation;
    }

    /**
     * Get  
     * @return TimeZone 
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 
     * @param TimeZone 
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public CreateReadOnlyDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReadOnlyDBInstancesRequest(CreateReadOnlyDBInstancesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ReadOnlyGroupType != null) {
            this.ReadOnlyGroupType = new Long(source.ReadOnlyGroupType);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.ReadOnlyGroupForcedUpgrade != null) {
            this.ReadOnlyGroupForcedUpgrade = new Long(source.ReadOnlyGroupForcedUpgrade);
        }
        if (source.ReadOnlyGroupId != null) {
            this.ReadOnlyGroupId = new String(source.ReadOnlyGroupId);
        }
        if (source.ReadOnlyGroupName != null) {
            this.ReadOnlyGroupName = new String(source.ReadOnlyGroupName);
        }
        if (source.ReadOnlyGroupIsOfflineDelay != null) {
            this.ReadOnlyGroupIsOfflineDelay = new Long(source.ReadOnlyGroupIsOfflineDelay);
        }
        if (source.ReadOnlyGroupMaxDelayTime != null) {
            this.ReadOnlyGroupMaxDelayTime = new Long(source.ReadOnlyGroupMaxDelayTime);
        }
        if (source.ReadOnlyGroupMinInGroup != null) {
            this.ReadOnlyGroupMinInGroup = new Long(source.ReadOnlyGroupMinInGroup);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.SecurityGroupList != null) {
            this.SecurityGroupList = new String[source.SecurityGroupList.length];
            for (int i = 0; i < source.SecurityGroupList.length; i++) {
                this.SecurityGroupList[i] = new String(source.SecurityGroupList[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.Collation != null) {
            this.Collation = new String(source.Collation);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ReadOnlyGroupType", this.ReadOnlyGroupType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "ReadOnlyGroupForcedUpgrade", this.ReadOnlyGroupForcedUpgrade);
        this.setParamSimple(map, prefix + "ReadOnlyGroupId", this.ReadOnlyGroupId);
        this.setParamSimple(map, prefix + "ReadOnlyGroupName", this.ReadOnlyGroupName);
        this.setParamSimple(map, prefix + "ReadOnlyGroupIsOfflineDelay", this.ReadOnlyGroupIsOfflineDelay);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMaxDelayTime", this.ReadOnlyGroupMaxDelayTime);
        this.setParamSimple(map, prefix + "ReadOnlyGroupMinInGroup", this.ReadOnlyGroupMinInGroup);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "SecurityGroupList.", this.SecurityGroupList);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Collation", this.Collation);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

