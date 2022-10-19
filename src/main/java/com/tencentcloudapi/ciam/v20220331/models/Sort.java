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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel{

    /**
    * Key for sorting. See custom attributes
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * `ASC` or `DESC`
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Key for sorting. See custom attributes 
     * @return PropertyKey Key for sorting. See custom attributes
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set Key for sorting. See custom attributes
     * @param PropertyKey Key for sorting. See custom attributes
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get `ASC` or `DESC` 
     * @return Order `ASC` or `DESC`
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set `ASC` or `DESC`
     * @param Order `ASC` or `DESC`
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

