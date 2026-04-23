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
package com.tencentcloudapi.quota.v20241204.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserQuotaRequest extends AbstractModel {

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Quota id
    */
    @SerializedName("QuotaId")
    @Expose
    private Sort QuotaId;

    /**
    * Quota ID of each product
    */
    @SerializedName("QuotaInstanceId")
    @Expose
    private String QuotaInstanceId;

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
     * Get Quota id 
     * @return QuotaId Quota id
     */
    public Sort getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set Quota id
     * @param QuotaId Quota id
     */
    public void setQuotaId(Sort QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get Quota ID of each product 
     * @return QuotaInstanceId Quota ID of each product
     */
    public String getQuotaInstanceId() {
        return this.QuotaInstanceId;
    }

    /**
     * Set Quota ID of each product
     * @param QuotaInstanceId Quota ID of each product
     */
    public void setQuotaInstanceId(String QuotaInstanceId) {
        this.QuotaInstanceId = QuotaInstanceId;
    }

    public DescribeUserQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserQuotaRequest(DescribeUserQuotaRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.QuotaId != null) {
            this.QuotaId = new Sort(source.QuotaId);
        }
        if (source.QuotaInstanceId != null) {
            this.QuotaInstanceId = new String(source.QuotaInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "QuotaId.", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaInstanceId", this.QuotaInstanceId);

    }
}

