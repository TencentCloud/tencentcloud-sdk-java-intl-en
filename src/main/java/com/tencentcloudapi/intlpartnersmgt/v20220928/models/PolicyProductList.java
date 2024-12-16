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
    * Policy code.
    */
    @SerializedName("PolicyCode")
    @Expose
    private String PolicyCode;

    /**
    * Product code, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Product name, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * SubProduct code, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * SubProduct name, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Component type code, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ComponentTypeCode")
    @Expose
    private String ComponentTypeCode;

    /**
    * Component type name, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ComponentTypeName")
    @Expose
    private String ComponentTypeName;

    /**
    * Component code, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * Component name, if the return is *, any item under this level is included in the policy product scope.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Policy effective date.
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * Policy expiration date.
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
     * Get Policy code. 
     * @return PolicyCode Policy code.
     */
    public String getPolicyCode() {
        return this.PolicyCode;
    }

    /**
     * Set Policy code.
     * @param PolicyCode Policy code.
     */
    public void setPolicyCode(String PolicyCode) {
        this.PolicyCode = PolicyCode;
    }

    /**
     * Get Product code, if the return is *, any item under this level is included in the policy product scope. 
     * @return ProductCode Product code, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code, if the return is *, any item under this level is included in the policy product scope.
     * @param ProductCode Product code, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Product name, if the return is *, any item under this level is included in the policy product scope. 
     * @return ProductName Product name, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name, if the return is *, any item under this level is included in the policy product scope.
     * @param ProductName Product name, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get SubProduct code, if the return is *, any item under this level is included in the policy product scope. 
     * @return SubProductCode SubProduct code, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set SubProduct code, if the return is *, any item under this level is included in the policy product scope.
     * @param SubProductCode SubProduct code, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get SubProduct name, if the return is *, any item under this level is included in the policy product scope. 
     * @return SubProductName SubProduct name, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set SubProduct name, if the return is *, any item under this level is included in the policy product scope.
     * @param SubProductName SubProduct name, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Component type code, if the return is *, any item under this level is included in the policy product scope. 
     * @return ComponentTypeCode Component type code, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getComponentTypeCode() {
        return this.ComponentTypeCode;
    }

    /**
     * Set Component type code, if the return is *, any item under this level is included in the policy product scope.
     * @param ComponentTypeCode Component type code, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setComponentTypeCode(String ComponentTypeCode) {
        this.ComponentTypeCode = ComponentTypeCode;
    }

    /**
     * Get Component type name, if the return is *, any item under this level is included in the policy product scope. 
     * @return ComponentTypeName Component type name, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getComponentTypeName() {
        return this.ComponentTypeName;
    }

    /**
     * Set Component type name, if the return is *, any item under this level is included in the policy product scope.
     * @param ComponentTypeName Component type name, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setComponentTypeName(String ComponentTypeName) {
        this.ComponentTypeName = ComponentTypeName;
    }

    /**
     * Get Component code, if the return is *, any item under this level is included in the policy product scope. 
     * @return ComponentCode Component code, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set Component code, if the return is *, any item under this level is included in the policy product scope.
     * @param ComponentCode Component code, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get Component name, if the return is *, any item under this level is included in the policy product scope. 
     * @return ComponentName Component name, if the return is *, any item under this level is included in the policy product scope.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name, if the return is *, any item under this level is included in the policy product scope.
     * @param ComponentName Component name, if the return is *, any item under this level is included in the policy product scope.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Policy effective date. 
     * @return StartDate Policy effective date.
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set Policy effective date.
     * @param StartDate Policy effective date.
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get Policy expiration date. 
     * @return EndDate Policy expiration date.
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set Policy expiration date.
     * @param EndDate Policy expiration date.
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

