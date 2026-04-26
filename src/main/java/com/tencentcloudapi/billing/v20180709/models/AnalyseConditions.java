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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseConditions extends AbstractModel {

    /**
    * Product name code
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String BusinessCodes;

    /**
    * Subproduct name code
    */
    @SerializedName("ProductCodes")
    @Expose
    private String ProductCodes;

    /**
    * Component type code
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Availability zone ID: The availability zone ID where the resource is located.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String ZoneIds;

    /**
    * Region ID: Resource region ID
    */
    @SerializedName("RegionIds")
    @Expose
    private String RegionIds;

    /**
    * Project ID: Project ID of the resource
    */
    @SerializedName("ProjectIds")
    @Expose
    private String ProjectIds;

    /**
    * Billing mode prePay (monthly subscription)/postPay (pay-as-you-go billing)
    */
    @SerializedName("PayModes")
    @Expose
    private String PayModes;

    /**
    * Transaction type. Query transaction type (please use transaction type code as input parameter).
    */
    @SerializedName("ActionTypes")
    @Expose
    private String ActionTypes;

    /**
    * Cost allocation tag key
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * Fee type. Query fee type (please use fee type code input parameter). The input parameter enumeration is as follows:
cashPayAmount: Cash 
incentivePayAmount: Bonus 
voucherPayAmount: Coupon 
tax: tax. 
costBeforeTax: pre-tax price
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * User UIN for querying cost analysis data
    */
    @SerializedName("PayerUins")
    @Expose
    private String PayerUins;

    /**
    * User UIN for using resources
    */
    @SerializedName("OwnerUins")
    @Expose
    private String OwnerUins;

    /**
    * Consumption type. Query consumption type (please use consumption type code input parameter).
    */
    @SerializedName("ConsumptionTypes")
    @Expose
    private String ConsumptionTypes;

    /**
     * Get Product name code 
     * @return BusinessCodes Product name code
     */
    public String getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set Product name code
     * @param BusinessCodes Product name code
     */
    public void setBusinessCodes(String BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get Subproduct name code 
     * @return ProductCodes Subproduct name code
     */
    public String getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set Subproduct name code
     * @param ProductCodes Subproduct name code
     */
    public void setProductCodes(String ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get Component type code 
     * @return ComponentCode Component type code
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component type code
     * @param ComponentCode Component type code
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Availability zone ID: The availability zone ID where the resource is located. 
     * @return ZoneIds Availability zone ID: The availability zone ID where the resource is located.
     */
    public String getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set Availability zone ID: The availability zone ID where the resource is located.
     * @param ZoneIds Availability zone ID: The availability zone ID where the resource is located.
     */
    public void setZoneIds(String ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Region ID: Resource region ID 
     * @return RegionIds Region ID: Resource region ID
     */
    public String getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID: Resource region ID
     * @param RegionIds Region ID: Resource region ID
     */
    public void setRegionIds(String RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get Project ID: Project ID of the resource 
     * @return ProjectIds Project ID: Project ID of the resource
     */
    public String getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID: Project ID of the resource
     * @param ProjectIds Project ID: Project ID of the resource
     */
    public void setProjectIds(String ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Billing mode prePay (monthly subscription)/postPay (pay-as-you-go billing) 
     * @return PayModes Billing mode prePay (monthly subscription)/postPay (pay-as-you-go billing)
     */
    public String getPayModes() {
        return this.PayModes;
    }

    /**
     * Set Billing mode prePay (monthly subscription)/postPay (pay-as-you-go billing)
     * @param PayModes Billing mode prePay (monthly subscription)/postPay (pay-as-you-go billing)
     */
    public void setPayModes(String PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get Transaction type. Query transaction type (please use transaction type code as input parameter). 
     * @return ActionTypes Transaction type. Query transaction type (please use transaction type code as input parameter).
     */
    public String getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set Transaction type. Query transaction type (please use transaction type code as input parameter).
     * @param ActionTypes Transaction type. Query transaction type (please use transaction type code as input parameter).
     */
    public void setActionTypes(String ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get Cost allocation tag key 
     * @return Tags Cost allocation tag key
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set Cost allocation tag key
     * @param Tags Cost allocation tag key
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Fee type. Query fee type (please use fee type code input parameter). The input parameter enumeration is as follows:
cashPayAmount: Cash 
incentivePayAmount: Bonus 
voucherPayAmount: Coupon 
tax: tax. 
costBeforeTax: pre-tax price 
     * @return FeeType Fee type. Query fee type (please use fee type code input parameter). The input parameter enumeration is as follows:
cashPayAmount: Cash 
incentivePayAmount: Bonus 
voucherPayAmount: Coupon 
tax: tax. 
costBeforeTax: pre-tax price
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set Fee type. Query fee type (please use fee type code input parameter). The input parameter enumeration is as follows:
cashPayAmount: Cash 
incentivePayAmount: Bonus 
voucherPayAmount: Coupon 
tax: tax. 
costBeforeTax: pre-tax price
     * @param FeeType Fee type. Query fee type (please use fee type code input parameter). The input parameter enumeration is as follows:
cashPayAmount: Cash 
incentivePayAmount: Bonus 
voucherPayAmount: Coupon 
tax: tax. 
costBeforeTax: pre-tax price
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get User UIN for querying cost analysis data 
     * @return PayerUins User UIN for querying cost analysis data
     */
    public String getPayerUins() {
        return this.PayerUins;
    }

    /**
     * Set User UIN for querying cost analysis data
     * @param PayerUins User UIN for querying cost analysis data
     */
    public void setPayerUins(String PayerUins) {
        this.PayerUins = PayerUins;
    }

    /**
     * Get User UIN for using resources 
     * @return OwnerUins User UIN for using resources
     */
    public String getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set User UIN for using resources
     * @param OwnerUins User UIN for using resources
     */
    public void setOwnerUins(String OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get Consumption type. Query consumption type (please use consumption type code input parameter). 
     * @return ConsumptionTypes Consumption type. Query consumption type (please use consumption type code input parameter).
     */
    public String getConsumptionTypes() {
        return this.ConsumptionTypes;
    }

    /**
     * Set Consumption type. Query consumption type (please use consumption type code input parameter).
     * @param ConsumptionTypes Consumption type. Query consumption type (please use consumption type code input parameter).
     */
    public void setConsumptionTypes(String ConsumptionTypes) {
        this.ConsumptionTypes = ConsumptionTypes;
    }

    public AnalyseConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseConditions(AnalyseConditions source) {
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String(source.BusinessCodes);
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String(source.ProductCodes);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String(source.ZoneIds);
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String(source.RegionIds);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String(source.ProjectIds);
        }
        if (source.PayModes != null) {
            this.PayModes = new String(source.PayModes);
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String(source.ActionTypes);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PayerUins != null) {
            this.PayerUins = new String(source.PayerUins);
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String(source.OwnerUins);
        }
        if (source.ConsumptionTypes != null) {
            this.ConsumptionTypes = new String(source.ConsumptionTypes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCodes", this.BusinessCodes);
        this.setParamSimple(map, prefix + "ProductCodes", this.ProductCodes);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ZoneIds", this.ZoneIds);
        this.setParamSimple(map, prefix + "RegionIds", this.RegionIds);
        this.setParamSimple(map, prefix + "ProjectIds", this.ProjectIds);
        this.setParamSimple(map, prefix + "PayModes", this.PayModes);
        this.setParamSimple(map, prefix + "ActionTypes", this.ActionTypes);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PayerUins", this.PayerUins);
        this.setParamSimple(map, prefix + "OwnerUins", this.OwnerUins);
        this.setParamSimple(map, prefix + "ConsumptionTypes", this.ConsumptionTypes);

    }
}

