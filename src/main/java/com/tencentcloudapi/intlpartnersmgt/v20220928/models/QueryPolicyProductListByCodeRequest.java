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
    * Policy code.
    */
    @SerializedName("PolicyCode")
    @Expose
    private String PolicyCode;

    /**
    * The code of the ProductName field in the  bill data.
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * The ProductName field value in the billing data.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * The code of the SubProductName field in the  bill data.
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * The SubProductName field value in the billing data.
    */
    @SerializedName("SubProductName")
    @Expose
    private String SubProductName;

    /**
    * Page parameter: current page number. The minimum value is 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Page parameter: Indicates the number of entries per page. Value range: [1, 200], default is 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get The code of the ProductName field in the  bill data. 
     * @return ProductCode The code of the ProductName field in the  bill data.
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set The code of the ProductName field in the  bill data.
     * @param ProductCode The code of the ProductName field in the  bill data.
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get The ProductName field value in the billing data. 
     * @return ProductName The ProductName field value in the billing data.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set The ProductName field value in the billing data.
     * @param ProductName The ProductName field value in the billing data.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get The code of the SubProductName field in the  bill data. 
     * @return SubProductCode The code of the SubProductName field in the  bill data.
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set The code of the SubProductName field in the  bill data.
     * @param SubProductCode The code of the SubProductName field in the  bill data.
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get The SubProductName field value in the billing data. 
     * @return SubProductName The SubProductName field value in the billing data.
     */
    public String getSubProductName() {
        return this.SubProductName;
    }

    /**
     * Set The SubProductName field value in the billing data.
     * @param SubProductName The SubProductName field value in the billing data.
     */
    public void setSubProductName(String SubProductName) {
        this.SubProductName = SubProductName;
    }

    /**
     * Get Page parameter: current page number. The minimum value is 1. 
     * @return Page Page parameter: current page number. The minimum value is 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page parameter: current page number. The minimum value is 1.
     * @param Page Page parameter: current page number. The minimum value is 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Page parameter: Indicates the number of entries per page. Value range: [1, 200], default is 200. 
     * @return PageSize Page parameter: Indicates the number of entries per page. Value range: [1, 200], default is 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page parameter: Indicates the number of entries per page. Value range: [1, 200], default is 200.
     * @param PageSize Page parameter: Indicates the number of entries per page. Value range: [1, 200], default is 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

