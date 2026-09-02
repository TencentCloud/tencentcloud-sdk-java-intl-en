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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpiringProduct extends AbstractModel {

    /**
    * <p>Product ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>Product name.</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>Days until expiration<br>Unit: day</p>
    */
    @SerializedName("DaysToExpire")
    @Expose
    private Long DaysToExpire;

    /**
    * <p>Expiration time</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get <p>Product ID</p> 
     * @return ProductId <p>Product ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>Product ID</p>
     * @param ProductId <p>Product ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>Product name.</p> 
     * @return ProductName <p>Product name.</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>Product name.</p>
     * @param ProductName <p>Product name.</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>Days until expiration<br>Unit: day</p> 
     * @return DaysToExpire <p>Days until expiration<br>Unit: day</p>
     */
    public Long getDaysToExpire() {
        return this.DaysToExpire;
    }

    /**
     * Set <p>Days until expiration<br>Unit: day</p>
     * @param DaysToExpire <p>Days until expiration<br>Unit: day</p>
     */
    public void setDaysToExpire(Long DaysToExpire) {
        this.DaysToExpire = DaysToExpire;
    }

    /**
     * Get <p>Expiration time</p> 
     * @return ExpireTime <p>Expiration time</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Expiration time</p>
     * @param ExpireTime <p>Expiration time</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public ExpiringProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpiringProduct(ExpiringProduct source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.DaysToExpire != null) {
            this.DaysToExpire = new Long(source.DaysToExpire);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "DaysToExpire", this.DaysToExpire);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

