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

public class BillDetail extends AbstractModel{

    /**
    * Product name: major categories of Tencent Cloud services, e.g. CVM and TencentDB for MySQL
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1
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
    * Project: project of a resource
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Region: region of a resource, e.g. South China (Guangzhou)
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
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
    * Instance name
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
    * Transaction ID
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

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
    * Component list
    */
    @SerializedName("ComponentSet")
    @Expose
    private BillDetailComponent [] ComponentSet;

    /**
    * Payer’s UIN
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * User’s UIN
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * Operator's UIN
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * Tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private BillTagInfo [] Tags;

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
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

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
     * Get Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1 
     * @return ProductCodeName Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1
     * @param ProductCodeName Sub-product name: sub-categories of Tencent Cloud services, such as CVM-Standard S1
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
     * Get Project: project of a resource 
     * @return ProjectName Project: project of a resource
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project: project of a resource
     * @param ProjectName Project: project of a resource
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Region: region of a resource, e.g. South China (Guangzhou) 
     * @return RegionName Region: region of a resource, e.g. South China (Guangzhou)
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region: region of a resource, e.g. South China (Guangzhou)
     * @param RegionName Region: region of a resource, e.g. South China (Guangzhou)
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3 
     * @return ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
     * @param ZoneName Availability zone: availability zone of a resource, e.g. Guangzhou Zone 3
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
     * Get Instance name 
     * @return ResourceName Instance name
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Instance name
     * @param ResourceName Instance name
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
     * Get Component list 
     * @return ComponentSet Component list
     */
    public BillDetailComponent [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set Component list
     * @param ComponentSet Component list
     */
    public void setComponentSet(BillDetailComponent [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get Payer’s UIN 
     * @return PayerUin Payer’s UIN
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set Payer’s UIN
     * @param PayerUin Payer’s UIN
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get User’s UIN 
     * @return OwnerUin User’s UIN
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set User’s UIN
     * @param OwnerUin User’s UIN
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Operator's UIN 
     * @return OperateUin Operator's UIN
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set Operator's UIN
     * @param OperateUin Operator's UIN
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
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
     * @return ActionType 
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 
     * @param ActionType 
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
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
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "PayTime", this.PayTime);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamArrayObj(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

