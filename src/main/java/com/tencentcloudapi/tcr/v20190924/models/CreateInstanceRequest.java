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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceRequest extends AbstractModel{

    /**
    * Enterprise Edition instance name
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * Enterprise Edition instance type. Valid values: basic: Basic; standard: Standard; premium: Premium.
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
    * Cloud tag description
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * Instance billing mode. Valid values: 0: Pay-as-you-go billing; 1: Prepaid. Default value: 0.
    */
    @SerializedName("RegistryChargeType")
    @Expose
    private Long RegistryChargeType;

    /**
    * Auto-renewal setting and purchase period
    */
    @SerializedName("RegistryChargePrepaid")
    @Expose
    private RegistryChargePrepaid RegistryChargePrepaid;

    /**
    * Whether to sync TCR cloud tags to the COS bucket
    */
    @SerializedName("SyncTag")
    @Expose
    private Boolean SyncTag;

    /**
    * Whether to enable the COS Multi-AZ feature
    */
    @SerializedName("EnableCosMAZ")
    @Expose
    private Boolean EnableCosMAZ;

    /**
    * Whether to enable deletion protection
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
     * Get Enterprise Edition instance name 
     * @return RegistryName Enterprise Edition instance name
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set Enterprise Edition instance name
     * @param RegistryName Enterprise Edition instance name
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get Enterprise Edition instance type. Valid values: basic: Basic; standard: Standard; premium: Premium. 
     * @return RegistryType Enterprise Edition instance type. Valid values: basic: Basic; standard: Standard; premium: Premium.
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set Enterprise Edition instance type. Valid values: basic: Basic; standard: Standard; premium: Premium.
     * @param RegistryType Enterprise Edition instance type. Valid values: basic: Basic; standard: Standard; premium: Premium.
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    /**
     * Get Cloud tag description 
     * @return TagSpecification Cloud tag description
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Cloud tag description
     * @param TagSpecification Cloud tag description
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Instance billing mode. Valid values: 0: Pay-as-you-go billing; 1: Prepaid. Default value: 0. 
     * @return RegistryChargeType Instance billing mode. Valid values: 0: Pay-as-you-go billing; 1: Prepaid. Default value: 0.
     */
    public Long getRegistryChargeType() {
        return this.RegistryChargeType;
    }

    /**
     * Set Instance billing mode. Valid values: 0: Pay-as-you-go billing; 1: Prepaid. Default value: 0.
     * @param RegistryChargeType Instance billing mode. Valid values: 0: Pay-as-you-go billing; 1: Prepaid. Default value: 0.
     */
    public void setRegistryChargeType(Long RegistryChargeType) {
        this.RegistryChargeType = RegistryChargeType;
    }

    /**
     * Get Auto-renewal setting and purchase period 
     * @return RegistryChargePrepaid Auto-renewal setting and purchase period
     */
    public RegistryChargePrepaid getRegistryChargePrepaid() {
        return this.RegistryChargePrepaid;
    }

    /**
     * Set Auto-renewal setting and purchase period
     * @param RegistryChargePrepaid Auto-renewal setting and purchase period
     */
    public void setRegistryChargePrepaid(RegistryChargePrepaid RegistryChargePrepaid) {
        this.RegistryChargePrepaid = RegistryChargePrepaid;
    }

    /**
     * Get Whether to sync TCR cloud tags to the COS bucket 
     * @return SyncTag Whether to sync TCR cloud tags to the COS bucket
     */
    public Boolean getSyncTag() {
        return this.SyncTag;
    }

    /**
     * Set Whether to sync TCR cloud tags to the COS bucket
     * @param SyncTag Whether to sync TCR cloud tags to the COS bucket
     */
    public void setSyncTag(Boolean SyncTag) {
        this.SyncTag = SyncTag;
    }

    /**
     * Get Whether to enable the COS Multi-AZ feature 
     * @return EnableCosMAZ Whether to enable the COS Multi-AZ feature
     */
    public Boolean getEnableCosMAZ() {
        return this.EnableCosMAZ;
    }

    /**
     * Set Whether to enable the COS Multi-AZ feature
     * @param EnableCosMAZ Whether to enable the COS Multi-AZ feature
     */
    public void setEnableCosMAZ(Boolean EnableCosMAZ) {
        this.EnableCosMAZ = EnableCosMAZ;
    }

    /**
     * Get Whether to enable deletion protection 
     * @return DeletionProtection Whether to enable deletion protection
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Whether to enable deletion protection
     * @param DeletionProtection Whether to enable deletion protection
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.RegistryChargeType != null) {
            this.RegistryChargeType = new Long(source.RegistryChargeType);
        }
        if (source.RegistryChargePrepaid != null) {
            this.RegistryChargePrepaid = new RegistryChargePrepaid(source.RegistryChargePrepaid);
        }
        if (source.SyncTag != null) {
            this.SyncTag = new Boolean(source.SyncTag);
        }
        if (source.EnableCosMAZ != null) {
            this.EnableCosMAZ = new Boolean(source.EnableCosMAZ);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "RegistryChargeType", this.RegistryChargeType);
        this.setParamObj(map, prefix + "RegistryChargePrepaid.", this.RegistryChargePrepaid);
        this.setParamSimple(map, prefix + "SyncTag", this.SyncTag);
        this.setParamSimple(map, prefix + "EnableCosMAZ", this.EnableCosMAZ);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);

    }
}

