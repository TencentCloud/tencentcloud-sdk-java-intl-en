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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailPrice extends AbstractModel {

    /**
    * Values: 
<li>"DiskSpace": Cloud disk space</li>
<li>"DiskBackupQuota": Cloud disk backups</li>
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * Official unit price of the billable item
    */
    @SerializedName("OriginUnitPrice")
    @Expose
    private Float OriginUnitPrice;

    /**
    * Official total price of the billable item
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * Discount of the billable item
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * Discounted total price of the billable item
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get Values: 
<li>"DiskSpace": Cloud disk space</li>
<li>"DiskBackupQuota": Cloud disk backups</li> 
     * @return PriceName Values: 
<li>"DiskSpace": Cloud disk space</li>
<li>"DiskBackupQuota": Cloud disk backups</li>
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set Values: 
<li>"DiskSpace": Cloud disk space</li>
<li>"DiskBackupQuota": Cloud disk backups</li>
     * @param PriceName Values: 
<li>"DiskSpace": Cloud disk space</li>
<li>"DiskBackupQuota": Cloud disk backups</li>
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get Official unit price of the billable item 
     * @return OriginUnitPrice Official unit price of the billable item
     */
    public Float getOriginUnitPrice() {
        return this.OriginUnitPrice;
    }

    /**
     * Set Official unit price of the billable item
     * @param OriginUnitPrice Official unit price of the billable item
     */
    public void setOriginUnitPrice(Float OriginUnitPrice) {
        this.OriginUnitPrice = OriginUnitPrice;
    }

    /**
     * Get Official total price of the billable item 
     * @return OriginalPrice Official total price of the billable item
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set Official total price of the billable item
     * @param OriginalPrice Official total price of the billable item
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get Discount of the billable item 
     * @return Discount Discount of the billable item
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set Discount of the billable item
     * @param Discount Discount of the billable item
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get Discounted total price of the billable item 
     * @return DiscountPrice Discounted total price of the billable item
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set Discounted total price of the billable item
     * @param DiscountPrice Discounted total price of the billable item
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public DetailPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailPrice(DetailPrice source) {
        if (source.PriceName != null) {
            this.PriceName = new String(source.PriceName);
        }
        if (source.OriginUnitPrice != null) {
            this.OriginUnitPrice = new Float(source.OriginUnitPrice);
        }
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PriceName", this.PriceName);
        this.setParamSimple(map, prefix + "OriginUnitPrice", this.OriginUnitPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

