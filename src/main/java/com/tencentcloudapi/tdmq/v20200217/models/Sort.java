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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel {

    /**
    * Sorting field.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Ascending order: `ASC`; descending order: `DESC`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Sorting field. 
     * @return Name Sorting field.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sorting field.
     * @param Name Sorting field.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Ascending order: `ASC`; descending order: `DESC`. 
     * @return Order Ascending order: `ASC`; descending order: `DESC`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Ascending order: `ASC`; descending order: `DESC`.
     * @param Order Ascending order: `ASC`; descending order: `DESC`.
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

