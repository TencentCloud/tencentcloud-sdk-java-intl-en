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
    * <p>Name of a billable item, current parameter.</p><li>"DiskSpace" represents the CBS space charge item.</li><li>"DiskBackupQuota" represents the data disk backup point quota charge item.</li><li>"Instance" represents the Instance charge item.</li><li>"SystemDiskBackupQuota" represents the system disk backup point quota charge item.</li>.
    */
    @SerializedName("PriceName")
    @Expose
    private String PriceName;

    /**
    * <P>Unit price per billing item dimension.</p><p>unit: usd</p>.
    */
    @SerializedName("OriginUnitPrice")
    @Expose
    private Float OriginUnitPrice;

    /**
    * <P>Total price of billing item dimension.</p><p>unit: usd</p>.
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * <P>Dimensional discount for billing items.</p>.
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * <P>Discounted total price by billing item dimension.</p><p>unit: usd</p>.
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get <p>Name of a billable item, current parameter.</p><li>"DiskSpace" represents the CBS space charge item.</li><li>"DiskBackupQuota" represents the data disk backup point quota charge item.</li><li>"Instance" represents the Instance charge item.</li><li>"SystemDiskBackupQuota" represents the system disk backup point quota charge item.</li>. 
     * @return PriceName <p>Name of a billable item, current parameter.</p><li>"DiskSpace" represents the CBS space charge item.</li><li>"DiskBackupQuota" represents the data disk backup point quota charge item.</li><li>"Instance" represents the Instance charge item.</li><li>"SystemDiskBackupQuota" represents the system disk backup point quota charge item.</li>.
     */
    public String getPriceName() {
        return this.PriceName;
    }

    /**
     * Set <p>Name of a billable item, current parameter.</p><li>"DiskSpace" represents the CBS space charge item.</li><li>"DiskBackupQuota" represents the data disk backup point quota charge item.</li><li>"Instance" represents the Instance charge item.</li><li>"SystemDiskBackupQuota" represents the system disk backup point quota charge item.</li>.
     * @param PriceName <p>Name of a billable item, current parameter.</p><li>"DiskSpace" represents the CBS space charge item.</li><li>"DiskBackupQuota" represents the data disk backup point quota charge item.</li><li>"Instance" represents the Instance charge item.</li><li>"SystemDiskBackupQuota" represents the system disk backup point quota charge item.</li>.
     */
    public void setPriceName(String PriceName) {
        this.PriceName = PriceName;
    }

    /**
     * Get <P>Unit price per billing item dimension.</p><p>unit: usd</p>. 
     * @return OriginUnitPrice <P>Unit price per billing item dimension.</p><p>unit: usd</p>.
     */
    public Float getOriginUnitPrice() {
        return this.OriginUnitPrice;
    }

    /**
     * Set <P>Unit price per billing item dimension.</p><p>unit: usd</p>.
     * @param OriginUnitPrice <P>Unit price per billing item dimension.</p><p>unit: usd</p>.
     */
    public void setOriginUnitPrice(Float OriginUnitPrice) {
        this.OriginUnitPrice = OriginUnitPrice;
    }

    /**
     * Get <P>Total price of billing item dimension.</p><p>unit: usd</p>. 
     * @return OriginalPrice <P>Total price of billing item dimension.</p><p>unit: usd</p>.
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set <P>Total price of billing item dimension.</p><p>unit: usd</p>.
     * @param OriginalPrice <P>Total price of billing item dimension.</p><p>unit: usd</p>.
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get <P>Dimensional discount for billing items.</p>. 
     * @return Discount <P>Dimensional discount for billing items.</p>.
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set <P>Dimensional discount for billing items.</p>.
     * @param Discount <P>Dimensional discount for billing items.</p>.
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get <P>Discounted total price by billing item dimension.</p><p>unit: usd</p>. 
     * @return DiscountPrice <P>Discounted total price by billing item dimension.</p><p>unit: usd</p>.
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set <P>Discounted total price by billing item dimension.</p><p>unit: usd</p>.
     * @param DiscountPrice <P>Discounted total price by billing item dimension.</p><p>unit: usd</p>.
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

