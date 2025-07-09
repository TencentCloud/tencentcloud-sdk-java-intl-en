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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTawInstanceRequest extends AbstractModel {

    /**
    * Region ID (at least greater than 0)
    */
    @SerializedName("AreaId")
    @Expose
    private Long AreaId;

    /**
    * Billing type (1: Pay-as-you-go).
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Data retention period (at least greater than 0)
    */
    @SerializedName("DataRetentionDays")
    @Expose
    private Long DataRetentionDays;

    /**
    * Instance name (up to 255 bytes)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Instance description (up to 1,024 bytes)
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

    /**
    * Number of data entries reported per day
    */
    @SerializedName("CountNum")
    @Expose
    private String CountNum;

    /**
    * Billing for data storage
    */
    @SerializedName("PeriodRetain")
    @Expose
    private String PeriodRetain;

    /**
    * Instance purchase channel. Valid value: `cdn`.
    */
    @SerializedName("BuyingChannel")
    @Expose
    private String BuyingChannel;

    /**
    * Type of prepaid resource pack (only required for prepaid mode)
    */
    @SerializedName("ResourcePackageType")
    @Expose
    private Long ResourcePackageType;

    /**
    * The number of prepaid resource packs (only required for prepaid mode)
    */
    @SerializedName("ResourcePackageNum")
    @Expose
    private Long ResourcePackageNum;

    /**
    * Instance type. `1`: Web; `2`: Application
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get Region ID (at least greater than 0) 
     * @return AreaId Region ID (at least greater than 0)
     */
    public Long getAreaId() {
        return this.AreaId;
    }

    /**
     * Set Region ID (at least greater than 0)
     * @param AreaId Region ID (at least greater than 0)
     */
    public void setAreaId(Long AreaId) {
        this.AreaId = AreaId;
    }

    /**
     * Get Billing type (1: Pay-as-you-go). 
     * @return ChargeType Billing type (1: Pay-as-you-go).
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing type (1: Pay-as-you-go).
     * @param ChargeType Billing type (1: Pay-as-you-go).
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Data retention period (at least greater than 0) 
     * @return DataRetentionDays Data retention period (at least greater than 0)
     */
    public Long getDataRetentionDays() {
        return this.DataRetentionDays;
    }

    /**
     * Set Data retention period (at least greater than 0)
     * @param DataRetentionDays Data retention period (at least greater than 0)
     */
    public void setDataRetentionDays(Long DataRetentionDays) {
        this.DataRetentionDays = DataRetentionDays;
    }

    /**
     * Get Instance name (up to 255 bytes) 
     * @return InstanceName Instance name (up to 255 bytes)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name (up to 255 bytes)
     * @param InstanceName Instance name (up to 255 bytes)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance description (up to 1,024 bytes) 
     * @return InstanceDesc Instance description (up to 1,024 bytes)
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set Instance description (up to 1,024 bytes)
     * @param InstanceDesc Instance description (up to 1,024 bytes)
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get Number of data entries reported per day 
     * @return CountNum Number of data entries reported per day
     */
    public String getCountNum() {
        return this.CountNum;
    }

    /**
     * Set Number of data entries reported per day
     * @param CountNum Number of data entries reported per day
     */
    public void setCountNum(String CountNum) {
        this.CountNum = CountNum;
    }

    /**
     * Get Billing for data storage 
     * @return PeriodRetain Billing for data storage
     */
    public String getPeriodRetain() {
        return this.PeriodRetain;
    }

    /**
     * Set Billing for data storage
     * @param PeriodRetain Billing for data storage
     */
    public void setPeriodRetain(String PeriodRetain) {
        this.PeriodRetain = PeriodRetain;
    }

    /**
     * Get Instance purchase channel. Valid value: `cdn`. 
     * @return BuyingChannel Instance purchase channel. Valid value: `cdn`.
     */
    public String getBuyingChannel() {
        return this.BuyingChannel;
    }

    /**
     * Set Instance purchase channel. Valid value: `cdn`.
     * @param BuyingChannel Instance purchase channel. Valid value: `cdn`.
     */
    public void setBuyingChannel(String BuyingChannel) {
        this.BuyingChannel = BuyingChannel;
    }

    /**
     * Get Type of prepaid resource pack (only required for prepaid mode) 
     * @return ResourcePackageType Type of prepaid resource pack (only required for prepaid mode)
     */
    public Long getResourcePackageType() {
        return this.ResourcePackageType;
    }

    /**
     * Set Type of prepaid resource pack (only required for prepaid mode)
     * @param ResourcePackageType Type of prepaid resource pack (only required for prepaid mode)
     */
    public void setResourcePackageType(Long ResourcePackageType) {
        this.ResourcePackageType = ResourcePackageType;
    }

    /**
     * Get The number of prepaid resource packs (only required for prepaid mode) 
     * @return ResourcePackageNum The number of prepaid resource packs (only required for prepaid mode)
     */
    public Long getResourcePackageNum() {
        return this.ResourcePackageNum;
    }

    /**
     * Set The number of prepaid resource packs (only required for prepaid mode)
     * @param ResourcePackageNum The number of prepaid resource packs (only required for prepaid mode)
     */
    public void setResourcePackageNum(Long ResourcePackageNum) {
        this.ResourcePackageNum = ResourcePackageNum;
    }

    /**
     * Get Instance type. `1`: Web; `2`: Application 
     * @return InstanceType Instance type. `1`: Web; `2`: Application
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. `1`: Web; `2`: Application
     * @param InstanceType Instance type. `1`: Web; `2`: Application
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreateTawInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTawInstanceRequest(CreateTawInstanceRequest source) {
        if (source.AreaId != null) {
            this.AreaId = new Long(source.AreaId);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.DataRetentionDays != null) {
            this.DataRetentionDays = new Long(source.DataRetentionDays);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.InstanceDesc != null) {
            this.InstanceDesc = new String(source.InstanceDesc);
        }
        if (source.CountNum != null) {
            this.CountNum = new String(source.CountNum);
        }
        if (source.PeriodRetain != null) {
            this.PeriodRetain = new String(source.PeriodRetain);
        }
        if (source.BuyingChannel != null) {
            this.BuyingChannel = new String(source.BuyingChannel);
        }
        if (source.ResourcePackageType != null) {
            this.ResourcePackageType = new Long(source.ResourcePackageType);
        }
        if (source.ResourcePackageNum != null) {
            this.ResourcePackageNum = new Long(source.ResourcePackageNum);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AreaId", this.AreaId);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "DataRetentionDays", this.DataRetentionDays);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "CountNum", this.CountNum);
        this.setParamSimple(map, prefix + "PeriodRetain", this.PeriodRetain);
        this.setParamSimple(map, prefix + "BuyingChannel", this.BuyingChannel);
        this.setParamSimple(map, prefix + "ResourcePackageType", this.ResourcePackageType);
        this.setParamSimple(map, prefix + "ResourcePackageNum", this.ResourcePackageNum);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

