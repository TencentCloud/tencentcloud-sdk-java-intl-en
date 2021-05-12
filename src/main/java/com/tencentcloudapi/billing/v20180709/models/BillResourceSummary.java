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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillResourceSummary extends AbstractModel{

    /**
    * Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1; if no subproduct name is obtained, '-' is returned.
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * Billing mode
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * Project
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Availability zone
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Instance ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource instance namDeduction timee
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Transaction type
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
    * Payment time
    */
    @SerializedName("PayTime")
    @Expose
    private String PayTime;

    /**
    * Service start time
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * Service end time
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * Configuration description
    */
    @SerializedName("ConfigDesc")
    @Expose
    private String ConfigDesc;

    /**
    * Extension field 1
    */
    @SerializedName("ExtendField1")
    @Expose
    private String ExtendField1;

    /**
    * Extension field 2
    */
    @SerializedName("ExtendField2")
    @Expose
    private String ExtendField2;

    /**
    * Cost, in USD
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * Discount rate
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * Offer type
    */
    @SerializedName("ReduceType")
    @Expose
    private String ReduceType;

    /**
    * Total cost after discount, in USD
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * Amount paid in voucher, in USD
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * Amount paid in cash, in USD
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * Amount paid in trial credit, in USD
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * Extension field 3
    */
    @SerializedName("ExtendField3")
    @Expose
    private String ExtendField3;

    /**
    * Extension field 4
    */
    @SerializedName("ExtendField4")
    @Expose
    private String ExtendField4;

    /**
    * Extension field 5
    */
    @SerializedName("ExtendField5")
    @Expose
    private String ExtendField5;

    /**
    * Tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

    /**
    * Payer UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * Resource owner UIN; '-' is returned if no value is obtained
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Operator UIN; '-' is returned if no value is obtained
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL 
     * @return BusinessCodeName Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     * @param BusinessCodeName Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1; if no subproduct name is obtained, '-' is returned. 
     * @return ProductCodeName Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1; if no subproduct name is obtained, '-' is returned.
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1; if no subproduct name is obtained, '-' is returned.
     * @param ProductCodeName Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1; if no subproduct name is obtained, '-' is returned.
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get Billing mode 
     * @return PayModeName Billing mode
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set Billing mode
     * @param PayModeName Billing mode
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get Project 
     * @return ProjectName Project
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project
     * @param ProjectName Project
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Region 
     * @return RegionName Region
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region
     * @param RegionName Region
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Availability zone 
     * @return ZoneName Availability zone
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone
     * @param ZoneName Availability zone
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Instance ID 
     * @return ResourceId Instance ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Instance ID
     * @param ResourceId Instance ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource instance namDeduction timee 
     * @return ResourceName Resource instance namDeduction timee
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource instance namDeduction timee
     * @param ResourceName Resource instance namDeduction timee
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Transaction type 
     * @return ActionTypeName Transaction type
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set Transaction type
     * @param ActionTypeName Transaction type
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
     * Get Payment time 
     * @return PayTime Payment time
     */
    public String getPayTime() {
        return this.PayTime;
    }

    /**
     * Set Payment time
     * @param PayTime Payment time
     */
    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }

    /**
     * Get Service start time 
     * @return FeeBeginTime Service start time
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set Service start time
     * @param FeeBeginTime Service start time
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get Service end time 
     * @return FeeEndTime Service end time
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set Service end time
     * @param FeeEndTime Service end time
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get Configuration description 
     * @return ConfigDesc Configuration description
     */
    public String getConfigDesc() {
        return this.ConfigDesc;
    }

    /**
     * Set Configuration description
     * @param ConfigDesc Configuration description
     */
    public void setConfigDesc(String ConfigDesc) {
        this.ConfigDesc = ConfigDesc;
    }

    /**
     * Get Extension field 1 
     * @return ExtendField1 Extension field 1
     */
    public String getExtendField1() {
        return this.ExtendField1;
    }

    /**
     * Set Extension field 1
     * @param ExtendField1 Extension field 1
     */
    public void setExtendField1(String ExtendField1) {
        this.ExtendField1 = ExtendField1;
    }

    /**
     * Get Extension field 2 
     * @return ExtendField2 Extension field 2
     */
    public String getExtendField2() {
        return this.ExtendField2;
    }

    /**
     * Set Extension field 2
     * @param ExtendField2 Extension field 2
     */
    public void setExtendField2(String ExtendField2) {
        this.ExtendField2 = ExtendField2;
    }

    /**
     * Get Cost, in USD 
     * @return TotalCost Cost, in USD
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set Cost, in USD
     * @param TotalCost Cost, in USD
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get Discount rate 
     * @return Discount Discount rate
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount rate
     * @param Discount Discount rate
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Offer type 
     * @return ReduceType Offer type
     */
    public String getReduceType() {
        return this.ReduceType;
    }

    /**
     * Set Offer type
     * @param ReduceType Offer type
     */
    public void setReduceType(String ReduceType) {
        this.ReduceType = ReduceType;
    }

    /**
     * Get Total cost after discount, in USD 
     * @return RealTotalCost Total cost after discount, in USD
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set Total cost after discount, in USD
     * @param RealTotalCost Total cost after discount, in USD
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get Amount paid in voucher, in USD 
     * @return VoucherPayAmount Amount paid in voucher, in USD
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set Amount paid in voucher, in USD
     * @param VoucherPayAmount Amount paid in voucher, in USD
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get Amount paid in cash, in USD 
     * @return CashPayAmount Amount paid in cash, in USD
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set Amount paid in cash, in USD
     * @param CashPayAmount Amount paid in cash, in USD
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get Amount paid in trial credit, in USD 
     * @return IncentivePayAmount Amount paid in trial credit, in USD
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set Amount paid in trial credit, in USD
     * @param IncentivePayAmount Amount paid in trial credit, in USD
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get Extension field 3 
     * @return ExtendField3 Extension field 3
     */
    public String getExtendField3() {
        return this.ExtendField3;
    }

    /**
     * Set Extension field 3
     * @param ExtendField3 Extension field 3
     */
    public void setExtendField3(String ExtendField3) {
        this.ExtendField3 = ExtendField3;
    }

    /**
     * Get Extension field 4 
     * @return ExtendField4 Extension field 4
     */
    public String getExtendField4() {
        return this.ExtendField4;
    }

    /**
     * Set Extension field 4
     * @param ExtendField4 Extension field 4
     */
    public void setExtendField4(String ExtendField4) {
        this.ExtendField4 = ExtendField4;
    }

    /**
     * Get Extension field 5 
     * @return ExtendField5 Extension field 5
     */
    public String getExtendField5() {
        return this.ExtendField5;
    }

    /**
     * Set Extension field 5
     * @param ExtendField5 Extension field 5
     */
    public void setExtendField5(String ExtendField5) {
        this.ExtendField5 = ExtendField5;
    }

    /**
     * Get Tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BillTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(BillTagInfo [] Tags) {
        this.Tags = Tags;
    }

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
     * Get Resource owner UIN; '-' is returned if no value is obtained 
     * @return OwnerUin Resource owner UIN; '-' is returned if no value is obtained
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set Resource owner UIN; '-' is returned if no value is obtained
     * @param OwnerUin Resource owner UIN; '-' is returned if no value is obtained
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operator UIN; '-' is returned if no value is obtained 
     * @return OperateUin Operator UIN; '-' is returned if no value is obtained
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator UIN; '-' is returned if no value is obtained
     * @param OperateUin Operator UIN; '-' is returned if no value is obtained
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get  
     * @return BusinessCode 
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 
     * @param BusinessCode 
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get  
     * @return ProductCode 
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 
     * @param ProductCode 
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get  
     * @return RegionId 
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 
     * @param RegionId 
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public BillResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillResourceSummary(BillResourceSummary source) {
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
        if (source.PayTime != null) {
            this.PayTime = new String(source.PayTime);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.ConfigDesc != null) {
            this.ConfigDesc = new String(source.ConfigDesc);
        }
        if (source.ExtendField1 != null) {
            this.ExtendField1 = new String(source.ExtendField1);
        }
        if (source.ExtendField2 != null) {
            this.ExtendField2 = new String(source.ExtendField2);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.ReduceType != null) {
            this.ReduceType = new String(source.ReduceType);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.ExtendField3 != null) {
            this.ExtendField3 = new String(source.ExtendField3);
        }
        if (source.ExtendField4 != null) {
            this.ExtendField4 = new String(source.ExtendField4);
        }
        if (source.ExtendField5 != null) {
            this.ExtendField5 = new String(source.ExtendField5);
        }
        if (source.Tags != null) {
            this.Tags = new BillTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new BillTagInfo(source.Tags[i]);
            }
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "ConfigDesc", this.ConfigDesc);
        this.setParamSimple(map, prefix + "ExtendField1", this.ExtendField1);
        this.setParamSimple(map, prefix + "ExtendField2", this.ExtendField2);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "ReduceType", this.ReduceType);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "ExtendField3", this.ExtendField3);
        this.setParamSimple(map, prefix + "ExtendField4", this.ExtendField4);
        this.setParamSimple(map, prefix + "ExtendField5", this.ExtendField5);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

