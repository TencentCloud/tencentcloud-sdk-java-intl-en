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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationRequest extends AbstractModel {

    /**
    * Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * Abbreviation of the trusted service, which is required during querying the trusted service admin.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud). 
     * @return Lang Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     * @param Lang Valid values: `en` (Tencent Cloud International); `zh` (Tencent Cloud).
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get Abbreviation of the trusted service, which is required during querying the trusted service admin. 
     * @return Product Abbreviation of the trusted service, which is required during querying the trusted service admin.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Abbreviation of the trusted service, which is required during querying the trusted service admin.
     * @param Product Abbreviation of the trusted service, which is required during querying the trusted service admin.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeOrganizationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationRequest(DescribeOrganizationRequest source) {
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

