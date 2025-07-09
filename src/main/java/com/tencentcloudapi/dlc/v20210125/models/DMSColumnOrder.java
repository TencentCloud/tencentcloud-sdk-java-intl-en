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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSColumnOrder extends AbstractModel {

    /**
    * Column name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Col")
    @Expose
    private String Col;

    /**
    * Sort
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get Column name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Col Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCol() {
        return this.Col;
    }

    /**
     * Set Column name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Col Column name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCol(String Col) {
        this.Col = Col;
    }

    /**
     * Get Sort
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Order Sort
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Sort
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Order Sort
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public DMSColumnOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSColumnOrder(DMSColumnOrder source) {
        if (source.Col != null) {
            this.Col = new String(source.Col);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Col", this.Col);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

