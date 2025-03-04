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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyProductList extends AbstractModel {

    /**
    *  Policy code.
    */
    @SerializedName("PolicyCode")
    @Expose
    private String PolicyCode;

    /**
    * The code of the ProductName field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * The ProductName field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * The code of the SubProduct field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * The SubProduct field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * The code of the ComponentType field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentTypeCode")
    @Expose
    private String ComponentTypeCode;

    /**
    * The ComponentType field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentTypeName")
    @Expose
    private String ComponentTypeName;

    /**
    * The code of the Component field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * The Component field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Policy effective time.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * Policy expiration time.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get  Policy code. 
     * @return PolicyCode  Policy code.
     */
    public String getPolicyCode() {
        return this.PolicyCode;
    }

    /**
     * Set  Policy code.
     * @param PolicyCode  Policy code.
     */
    public void setPolicyCode(String PolicyCode) {
        this.PolicyCode = PolicyCode;
    }

    /**
     * Get The code of the ProductName field in the  bill data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ProductCode The code of the ProductName field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set The code of the ProductName field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     * @param ProductCode The code of the ProductName field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get The ProductName field value in the billing data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ProductName The ProductName field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set The ProductName field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     * @param ProductName The ProductName field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get The code of the SubProduct field in the  bill data. If the return value is *, any item at this level is included in the policy product range. 
     * @return SubProductCode The code of the SubProduct field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set The code of the SubProduct field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     * @param SubProductCode The code of the SubProduct field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get The SubProduct field value in the billing data. If the return value is *, any item at this level is included in the policy product range. 
     * @return SubProductName The SubProduct field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set The SubProduct field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     * @param SubProductName The SubProduct field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get The code of the ComponentType field in the  bill data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentTypeCode The code of the ComponentType field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentTypeCode() {
        return this.ComponentTypeCode;
    }

    /**
     * Set The code of the ComponentType field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentTypeCode The code of the ComponentType field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentTypeCode(String ComponentTypeCode) {
        this.ComponentTypeCode = ComponentTypeCode;
    }

    /**
     * Get The ComponentType field value in the billing data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentTypeName The ComponentType field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentTypeName() {
        return this.ComponentTypeName;
    }

    /**
     * Set The ComponentType field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentTypeName The ComponentType field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentTypeName(String ComponentTypeName) {
        this.ComponentTypeName = ComponentTypeName;
    }

    /**
     * Get The code of the Component field in the  bill data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentCode The code of the Component field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set The code of the Component field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentCode The code of the Component field in the  bill data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get The Component field value in the billing data. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentName The Component field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set The Component field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentName The Component field value in the billing data. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Policy effective time. 
     * @return StartDate Policy effective time.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Policy effective time.
     * @param StartDate Policy effective time.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get Policy expiration time. 
     * @return EndDate Policy expiration time.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Policy expiration time.
     * @param EndDate Policy expiration time.
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public PolicyProductList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyProductList(PolicyProductList source) {
        if (source.PolicyCode != null) {
            this.PolicyCode = new String(source.PolicyCode);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.SubProductName != null) {
            this.SubProductName = new String(source.SubProductName);
        }
        if (source.ComponentTypeCode != null) {
            this.ComponentTypeCode = new String(source.ComponentTypeCode);
        }
        if (source.ComponentTypeName != null) {
            this.ComponentTypeName = new String(source.ComponentTypeName);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyCode", this.PolicyCode);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "SubProductName", this.SubProductName);
        this.setParamSimple(map, prefix + "ComponentTypeCode", this.ComponentTypeCode);
        this.setParamSimple(map, prefix + "ComponentTypeName", this.ComponentTypeName);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);

    }
}

