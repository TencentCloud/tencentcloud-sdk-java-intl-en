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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeRequest extends AbstractModel {

    /**
    * Specifies the service area.
`mainland`: Queries billing methods available in the Chinese mainland.
`overseas`: Queries billing methods available in the regions outside the Chinese mainland.
`Global`: Queries billing methods available across the globe.
If it is not specified, it defaults to `mainland`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specifies the product to query, either `cdn` (default) or `ecdn`.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Specifies resources.
`flux`: Traffic package
`https`: HTTPS requests
It defaults to `flux` if not specified. 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Specifies the service area.
`mainland`: Queries billing methods available in the Chinese mainland.
`overseas`: Queries billing methods available in the regions outside the Chinese mainland.
`Global`: Queries billing methods available across the globe.
If it is not specified, it defaults to `mainland`. 
     * @return Area Specifies the service area.
`mainland`: Queries billing methods available in the Chinese mainland.
`overseas`: Queries billing methods available in the regions outside the Chinese mainland.
`Global`: Queries billing methods available across the globe.
If it is not specified, it defaults to `mainland`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies the service area.
`mainland`: Queries billing methods available in the Chinese mainland.
`overseas`: Queries billing methods available in the regions outside the Chinese mainland.
`Global`: Queries billing methods available across the globe.
If it is not specified, it defaults to `mainland`.
     * @param Area Specifies the service area.
`mainland`: Queries billing methods available in the Chinese mainland.
`overseas`: Queries billing methods available in the regions outside the Chinese mainland.
`Global`: Queries billing methods available across the globe.
If it is not specified, it defaults to `mainland`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specifies the product to query, either `cdn` (default) or `ecdn`. 
     * @return Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Specifies the product to query, either `cdn` (default) or `ecdn`.
     * @param Product Specifies the product to query, either `cdn` (default) or `ecdn`.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Specifies resources.
`flux`: Traffic package
`https`: HTTPS requests
It defaults to `flux` if not specified.  
     * @return Type Specifies resources.
`flux`: Traffic package
`https`: HTTPS requests
It defaults to `flux` if not specified. 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies resources.
`flux`: Traffic package
`https`: HTTPS requests
It defaults to `flux` if not specified. 
     * @param Type Specifies resources.
`flux`: Traffic package
`https`: HTTPS requests
It defaults to `flux` if not specified. 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribePayTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayTypeRequest(DescribePayTypeRequest source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

