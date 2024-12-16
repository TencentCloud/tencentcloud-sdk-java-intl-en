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

public class QueryPolicyProductListByCodeRequest extends AbstractModel {

    /**
    * Policy code
    */
    @SerializedName("PolicyCode")
    @Expose
    private String PolicyCode;

    /**
    * Product code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Subproduct code
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * Subproduct name
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
     * Get Policy code 
     * @return PolicyCode Policy code
     */
    public String getPolicyCode() {
        return this.PolicyCode;
    }

    /**
     * Set Policy code
     * @param PolicyCode Policy code
     */
    public void setPolicyCode(String PolicyCode) {
        this.PolicyCode = PolicyCode;
    }

    /**
     * Get Product code 
     * @return ProductCode Product code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set Product code
     * @param ProductCode Product code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Subproduct code 
     * @return SubProductCode Subproduct code
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set Subproduct code
     * @param SubProductCode Subproduct code
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get Subproduct name 
     * @return SubProductName Subproduct name
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set Subproduct name
     * @param SubProductName Subproduct name
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    public QueryPolicyProductListByCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryPolicyProductListByCodeRequest(QueryPolicyProductListByCodeRequest source) {
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

    }
}

