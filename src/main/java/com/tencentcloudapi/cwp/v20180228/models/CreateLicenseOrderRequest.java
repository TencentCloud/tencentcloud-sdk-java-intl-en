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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLicenseOrderRequest extends AbstractModel {

    /**
    * Tag array. Leaving it blank indicates no tags need to be bound.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2 - Ultimate Edition-monthly subscriptionThe default is 0.
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Authorization quantity: the number of units that need to be purchased
The default is 1.
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * Region of purchase order. In this case, only 1 - Guangzhou and 9 - Singapore are supported. Guangzhou is recommended. Singapore region is reserved for allowlisted users.
The default is 1.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Project ID
The default is 0.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Purchase duration, with a default value of 1. The optional values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36
This parameter is only valid for monthly subscription.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Whether to auto-renew. The default is not to auto-renew.
This parameter is only valid for monthly subscription.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * This field is deprecated.
    */
    @SerializedName("AutoProtectOpenConfig")
    @Expose
    private String AutoProtectOpenConfig;

    /**
    * Reconfiguration Parameters
    */
    @SerializedName("ModifyConfig")
    @Expose
    private OrderModifyObject ModifyConfig;

    /**
     * Get Tag array. Leaving it blank indicates no tags need to be bound. 
     * @return Tags Tag array. Leaving it blank indicates no tags need to be bound.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array. Leaving it blank indicates no tags need to be bound.
     * @param Tags Tag array. Leaving it blank indicates no tags need to be bound.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2 - Ultimate Edition-monthly subscriptionThe default is 0. 
     * @return LicenseType Authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2 - Ultimate Edition-monthly subscriptionThe default is 0.
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2 - Ultimate Edition-monthly subscriptionThe default is 0.
     * @param LicenseType Authorization type. 0: Pro Edition-pay-as-you-go; 1: Pro Edition-monthly subscription; 2 - Ultimate Edition-monthly subscriptionThe default is 0.
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Authorization quantity: the number of units that need to be purchased
The default is 1. 
     * @return LicenseNum Authorization quantity: the number of units that need to be purchased
The default is 1.
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set Authorization quantity: the number of units that need to be purchased
The default is 1.
     * @param LicenseNum Authorization quantity: the number of units that need to be purchased
The default is 1.
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get Region of purchase order. In this case, only 1 - Guangzhou and 9 - Singapore are supported. Guangzhou is recommended. Singapore region is reserved for allowlisted users.
The default is 1. 
     * @return RegionId Region of purchase order. In this case, only 1 - Guangzhou and 9 - Singapore are supported. Guangzhou is recommended. Singapore region is reserved for allowlisted users.
The default is 1.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region of purchase order. In this case, only 1 - Guangzhou and 9 - Singapore are supported. Guangzhou is recommended. Singapore region is reserved for allowlisted users.
The default is 1.
     * @param RegionId Region of purchase order. In this case, only 1 - Guangzhou and 9 - Singapore are supported. Guangzhou is recommended. Singapore region is reserved for allowlisted users.
The default is 1.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Project ID
The default is 0. 
     * @return ProjectId Project ID
The default is 0.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
The default is 0.
     * @param ProjectId Project ID
The default is 0.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Purchase duration, with a default value of 1. The optional values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36
This parameter is only valid for monthly subscription. 
     * @return TimeSpan Purchase duration, with a default value of 1. The optional values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36
This parameter is only valid for monthly subscription.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration, with a default value of 1. The optional values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36
This parameter is only valid for monthly subscription.
     * @param TimeSpan Purchase duration, with a default value of 1. The optional values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36
This parameter is only valid for monthly subscription.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Whether to auto-renew. The default is not to auto-renew.
This parameter is only valid for monthly subscription. 
     * @return AutoRenewFlag Whether to auto-renew. The default is not to auto-renew.
This parameter is only valid for monthly subscription.
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to auto-renew. The default is not to auto-renew.
This parameter is only valid for monthly subscription.
     * @param AutoRenewFlag Whether to auto-renew. The default is not to auto-renew.
This parameter is only valid for monthly subscription.
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get This field is deprecated. 
     * @return AutoProtectOpenConfig This field is deprecated.
     */
    public String getAutoProtectOpenConfig() {
        return this.AutoProtectOpenConfig;
    }

    /**
     * Set This field is deprecated.
     * @param AutoProtectOpenConfig This field is deprecated.
     */
    public void setAutoProtectOpenConfig(String AutoProtectOpenConfig) {
        this.AutoProtectOpenConfig = AutoProtectOpenConfig;
    }

    /**
     * Get Reconfiguration Parameters 
     * @return ModifyConfig Reconfiguration Parameters
     */
    public OrderModifyObject getModifyConfig() {
        return this.ModifyConfig;
    }

    /**
     * Set Reconfiguration Parameters
     * @param ModifyConfig Reconfiguration Parameters
     */
    public void setModifyConfig(OrderModifyObject ModifyConfig) {
        this.ModifyConfig = ModifyConfig;
    }

    public CreateLicenseOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLicenseOrderRequest(CreateLicenseOrderRequest source) {
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.AutoProtectOpenConfig != null) {
            this.AutoProtectOpenConfig = new String(source.AutoProtectOpenConfig);
        }
        if (source.ModifyConfig != null) {
            this.ModifyConfig = new OrderModifyObject(source.ModifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoProtectOpenConfig", this.AutoProtectOpenConfig);
        this.setParamObj(map, prefix + "ModifyConfig.", this.ModifyConfig);

    }
}

