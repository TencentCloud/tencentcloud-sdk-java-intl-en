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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Conditions extends AbstractModel {

    /**
    * Only supports two values: 6 and 12.
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * Product name code
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Payment mode. Options include prePay and postPay.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Resource keyword
    */
    @SerializedName("ResourceKeyword")
    @Expose
    private String ResourceKeyword;

    /**
    * Product name code
    */
    @SerializedName("BusinessCodes")
    @Expose
    private String [] BusinessCodes;

    /**
    * Subproduct name code
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * Region ID
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * Project ID
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Payment mode. Options include prePay and postPay.
    */
    @SerializedName("PayModes")
    @Expose
    private String [] PayModes;

    /**
    * Transaction type
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * Whether to hide zero-amount transactions
    */
    @SerializedName("HideFreeCost")
    @Expose
    private Long HideFreeCost;

    /**
    * Sorting rule. Options include desc and asc.
    */
    @SerializedName("OrderByCost")
    @Expose
    private String OrderByCost;

    /**
    * Transaction ID
    */
    @SerializedName("BillIds")
    @Expose
    private String [] BillIds;

    /**
    * Component code
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * File ID
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * File type
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get Only supports two values: 6 and 12. 
     * @return TimeRange Only supports two values: 6 and 12.
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Only supports two values: 6 and 12.
     * @param TimeRange Only supports two values: 6 and 12.
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Product name code 
     * @return BusinessCode Product name code
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product name code
     * @param BusinessCode Product name code
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Payment mode. Options include prePay and postPay. 
     * @return PayMode Payment mode. Options include prePay and postPay.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode. Options include prePay and postPay.
     * @param PayMode Payment mode. Options include prePay and postPay.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Resource keyword 
     * @return ResourceKeyword Resource keyword
     */
    public String getResourceKeyword() {
        return this.ResourceKeyword;
    }

    /**
     * Set Resource keyword
     * @param ResourceKeyword Resource keyword
     */
    public void setResourceKeyword(String ResourceKeyword) {
        this.ResourceKeyword = ResourceKeyword;
    }

    /**
     * Get Product name code 
     * @return BusinessCodes Product name code
     */
    public String [] getBusinessCodes() {
        return this.BusinessCodes;
    }

    /**
     * Set Product name code
     * @param BusinessCodes Product name code
     */
    public void setBusinessCodes(String [] BusinessCodes) {
        this.BusinessCodes = BusinessCodes;
    }

    /**
     * Get Subproduct name code 
     * @return ProductCodes Subproduct name code
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set Subproduct name code
     * @param ProductCodes Subproduct name code
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get Region ID 
     * @return RegionIds Region ID
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set Region ID
     * @param RegionIds Region ID
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get Project ID 
     * @return ProjectIds Project ID
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID
     * @param ProjectIds Project ID
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Payment mode. Options include prePay and postPay. 
     * @return PayModes Payment mode. Options include prePay and postPay.
     */
    public String [] getPayModes() {
        return this.PayModes;
    }

    /**
     * Set Payment mode. Options include prePay and postPay.
     * @param PayModes Payment mode. Options include prePay and postPay.
     */
    public void setPayModes(String [] PayModes) {
        this.PayModes = PayModes;
    }

    /**
     * Get Transaction type 
     * @return ActionTypes Transaction type
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set Transaction type
     * @param ActionTypes Transaction type
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get Whether to hide zero-amount transactions 
     * @return HideFreeCost Whether to hide zero-amount transactions
     */
    public Long getHideFreeCost() {
        return this.HideFreeCost;
    }

    /**
     * Set Whether to hide zero-amount transactions
     * @param HideFreeCost Whether to hide zero-amount transactions
     */
    public void setHideFreeCost(Long HideFreeCost) {
        this.HideFreeCost = HideFreeCost;
    }

    /**
     * Get Sorting rule. Options include desc and asc. 
     * @return OrderByCost Sorting rule. Options include desc and asc.
     */
    public String getOrderByCost() {
        return this.OrderByCost;
    }

    /**
     * Set Sorting rule. Options include desc and asc.
     * @param OrderByCost Sorting rule. Options include desc and asc.
     */
    public void setOrderByCost(String OrderByCost) {
        this.OrderByCost = OrderByCost;
    }

    /**
     * Get Transaction ID 
     * @return BillIds Transaction ID
     */
    public String [] getBillIds() {
        return this.BillIds;
    }

    /**
     * Set Transaction ID
     * @param BillIds Transaction ID
     */
    public void setBillIds(String [] BillIds) {
        this.BillIds = BillIds;
    }

    /**
     * Get Component code 
     * @return ComponentCodes Component code
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set Component code
     * @param ComponentCodes Component code
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get File ID 
     * @return FileIds File ID
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set File ID
     * @param FileIds File ID
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get File type 
     * @return FileTypes File type
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set File type
     * @param FileTypes File type
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public Conditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Conditions(Conditions source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ResourceKeyword != null) {
            this.ResourceKeyword = new String(source.ResourceKeyword);
        }
        if (source.BusinessCodes != null) {
            this.BusinessCodes = new String[source.BusinessCodes.length];
            for (int i = 0; i < source.BusinessCodes.length; i++) {
                this.BusinessCodes[i] = new String(source.BusinessCodes[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.PayModes != null) {
            this.PayModes = new String[source.PayModes.length];
            for (int i = 0; i < source.PayModes.length; i++) {
                this.PayModes[i] = new String(source.PayModes[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
            }
        }
        if (source.HideFreeCost != null) {
            this.HideFreeCost = new Long(source.HideFreeCost);
        }
        if (source.OrderByCost != null) {
            this.OrderByCost = new String(source.OrderByCost);
        }
        if (source.BillIds != null) {
            this.BillIds = new String[source.BillIds.length];
            for (int i = 0; i < source.BillIds.length; i++) {
                this.BillIds[i] = new String(source.BillIds[i]);
            }
        }
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ResourceKeyword", this.ResourceKeyword);
        this.setParamArraySimple(map, prefix + "BusinessCodes.", this.BusinessCodes);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "PayModes.", this.PayModes);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamSimple(map, prefix + "HideFreeCost", this.HideFreeCost);
        this.setParamSimple(map, prefix + "OrderByCost", this.OrderByCost);
        this.setParamArraySimple(map, prefix + "BillIds.", this.BillIds);
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

