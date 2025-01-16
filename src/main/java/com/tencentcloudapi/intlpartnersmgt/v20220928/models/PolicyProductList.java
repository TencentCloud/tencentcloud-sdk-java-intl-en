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
    * Dealer policy code.
    */
    @SerializedName("PolicyCode")
    @Expose
    private String PolicyCode;

    /**
    * Product level 1 code. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Product level 1 name. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Product level 2 code. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Product level 2 name. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Product level 3 code. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentTypeCode")
    @Expose
    private String ComponentTypeCode;

    /**
    * Product level 3 name. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentTypeName")
    @Expose
    private String ComponentTypeName;

    /**
    * Product level 4 code. If the return value is *, any item at this level is included in the policy product range.
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Product fourth-level name. If the return value is *, any item under this level is included in the policy product scope.
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
     * Get Dealer policy code. 
     * @return PolicyCode Dealer policy code.
     */
    public String getPolicyCode() {
        return this.PolicyCode;
    }

    /**
     * Set Dealer policy code.
     * @param PolicyCode Dealer policy code.
     */
    public void setPolicyCode(String PolicyCode) {
        this.PolicyCode = PolicyCode;
    }

    /**
     * Get Product level 1 code. If the return value is *, any item at this level is included in the policy product range. 
     * @return ProductCode Product level 1 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product level 1 code. If the return value is *, any item at this level is included in the policy product range.
     * @param ProductCode Product level 1 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Product level 1 name. If the return value is *, any item at this level is included in the policy product range. 
     * @return ProductName Product level 1 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product level 1 name. If the return value is *, any item at this level is included in the policy product range.
     * @param ProductName Product level 1 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Product level 2 code. If the return value is *, any item at this level is included in the policy product range. 
     * @return SubProductCode Product level 2 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Product level 2 code. If the return value is *, any item at this level is included in the policy product range.
     * @param SubProductCode Product level 2 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Product level 2 name. If the return value is *, any item at this level is included in the policy product range. 
     * @return SubProductName Product level 2 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set Product level 2 name. If the return value is *, any item at this level is included in the policy product range.
     * @param SubProductName Product level 2 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Product level 3 code. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentTypeCode Product level 3 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentTypeCode() {
        return this.ComponentTypeCode;
    }

    /**
     * Set Product level 3 code. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentTypeCode Product level 3 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentTypeCode(String ComponentTypeCode) {
        this.ComponentTypeCode = ComponentTypeCode;
    }

    /**
     * Get Product level 3 name. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentTypeName Product level 3 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentTypeName() {
        return this.ComponentTypeName;
    }

    /**
     * Set Product level 3 name. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentTypeName Product level 3 name. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentTypeName(String ComponentTypeName) {
        this.ComponentTypeName = ComponentTypeName;
    }

    /**
     * Get Product level 4 code. If the return value is *, any item at this level is included in the policy product range. 
     * @return ComponentCode Product level 4 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Product level 4 code. If the return value is *, any item at this level is included in the policy product range.
     * @param ComponentCode Product level 4 code. If the return value is *, any item at this level is included in the policy product range.
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Product fourth-level name. If the return value is *, any item under this level is included in the policy product scope. 
     * @return ComponentName Product fourth-level name. If the return value is *, any item under this level is included in the policy product scope.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Product fourth-level name. If the return value is *, any item under this level is included in the policy product scope.
     * @param ComponentName Product fourth-level name. If the return value is *, any item under this level is included in the policy product scope.
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

