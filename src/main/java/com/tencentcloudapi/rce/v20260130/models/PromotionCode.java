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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromotionCode extends AbstractModel {

    /**
    * <p>The ID of the promotion code</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>The type of the promotion code, for example: qrcode, barcode, miniprogram code</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>The url or hyperlink to the image</p>
    */
    @SerializedName("ImageLink")
    @Expose
    private String ImageLink;

    /**
    * <p>The address where the promotion code worked</p>
    */
    @SerializedName("Address")
    @Expose
    private Address Address;

    /**
    * <p>The item(s) associated with the promotion code</p>
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
     * Get <p>The ID of the promotion code</p> 
     * @return Id <p>The ID of the promotion code</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>The ID of the promotion code</p>
     * @param Id <p>The ID of the promotion code</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>The type of the promotion code, for example: qrcode, barcode, miniprogram code</p> 
     * @return Type <p>The type of the promotion code, for example: qrcode, barcode, miniprogram code</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>The type of the promotion code, for example: qrcode, barcode, miniprogram code</p>
     * @param Type <p>The type of the promotion code, for example: qrcode, barcode, miniprogram code</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>The url or hyperlink to the image</p> 
     * @return ImageLink <p>The url or hyperlink to the image</p>
     */
    public String getImageLink() {
        return this.ImageLink;
    }

    /**
     * Set <p>The url or hyperlink to the image</p>
     * @param ImageLink <p>The url or hyperlink to the image</p>
     */
    public void setImageLink(String ImageLink) {
        this.ImageLink = ImageLink;
    }

    /**
     * Get <p>The address where the promotion code worked</p> 
     * @return Address <p>The address where the promotion code worked</p>
     */
    public Address getAddress() {
        return this.Address;
    }

    /**
     * Set <p>The address where the promotion code worked</p>
     * @param Address <p>The address where the promotion code worked</p>
     */
    public void setAddress(Address Address) {
        this.Address = Address;
    }

    /**
     * Get <p>The item(s) associated with the promotion code</p> 
     * @return Items <p>The item(s) associated with the promotion code</p>
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>The item(s) associated with the promotion code</p>
     * @param Items <p>The item(s) associated with the promotion code</p>
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    public PromotionCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromotionCode(PromotionCode source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImageLink != null) {
            this.ImageLink = new String(source.ImageLink);
        }
        if (source.Address != null) {
            this.Address = new Address(source.Address);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ImageLink", this.ImageLink);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

