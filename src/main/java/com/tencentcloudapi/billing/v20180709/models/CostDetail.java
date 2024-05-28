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

public class CostDetail extends AbstractModel {

    /**
    * Payer UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Product name
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Subproduct name
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Billing mode name
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Project name
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region Name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Zone name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource name
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Type nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * Order ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Transaction ID
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * Start time of fees
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * End time of fees
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Component details
    */
    @SerializedName("ComponentSet")
    @Expose
    private CostComponentSet [] ComponentSet;

    /**
    * Subproduct name code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
     * Get Payer UIN 
     * @return PayerUin Payer UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer UIN
     * @param PayerUin Payer UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get Product name 
     * @return BusinessCodeName Product name
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name
     * @param BusinessCodeName Product name
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Subproduct name 
     * @return ProductCodeName Subproduct name
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Subproduct name
     * @param ProductCodeName Subproduct name
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Billing mode name 
     * @return PayModeName Billing mode name
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode name
     * @param PayModeName Billing mode name
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Project name 
     * @return ProjectName Project name
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
     * @param ProjectName Project name
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Region Name 
     * @return RegionName Region Name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region Name
     * @param RegionName Region Name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Zone name 
     * @return ZoneName Zone name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Zone name
     * @param ZoneName Zone name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource name 
     * @return ResourceName Resource name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name
     * @param ResourceName Resource name
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Type nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionTypeName Type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Type nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param ActionTypeName Type nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get Order ID 
     * @return OrderId Order ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order ID
     * @param OrderId Order ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Transaction ID 
     * @return BillId Transaction ID
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * Set Transaction ID
     * @param BillId Transaction ID
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * Get Start time of fees 
     * @return FeeBeginTime Start time of fees
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Start time of fees
     * @param FeeBeginTime Start time of fees
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get End time of fees 
     * @return FeeEndTime End time of fees
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set End time of fees
     * @param FeeEndTime End time of fees
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Component details 
     * @return ComponentSet Component details
     */
    public CostComponentSet [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set Component details
     * @param ComponentSet Component details
     */
    public void setComponentSet(CostComponentSet [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get Subproduct name code 
     * @return ProductCode Subproduct name code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Subproduct name code
     * @param ProductCode Subproduct name code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public CostDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostDetail(CostDetail source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.BillId != null) {
            this.BillId = new String(source.BillId);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.ComponentSet != null) {
            this.ComponentSet = new CostComponentSet[source.ComponentSet.length];
            for (int i = 0; i < source.ComponentSet.length; i++) {
                this.ComponentSet[i] = new CostComponentSet(source.ComponentSet[i]);
            }
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);

    }
}

