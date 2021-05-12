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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListNamespacesRequest extends AbstractModel{

    /**
    * Return data length. The default value is `20`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Data offset. The default value is `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * It specifies the sorting order of the results according to a specified field, such as `Name` and `Updatetime`.
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Return data length. The default value is `20`. 
     * @return Limit Return data length. The default value is `20`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Return data length. The default value is `20`.
     * @param Limit Return data length. The default value is `20`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Data offset. The default value is `0`. 
     * @return Offset Data offset. The default value is `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. The default value is `0`.
     * @param Offset Data offset. The default value is `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get It specifies the sorting order of the results according to a specified field, such as `Name` and `Updatetime`. 
     * @return Orderby It specifies the sorting order of the results according to a specified field, such as `Name` and `Updatetime`.
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set It specifies the sorting order of the results according to a specified field, such as `Name` and `Updatetime`.
     * @param Orderby It specifies the sorting order of the results according to a specified field, such as `Name` and `Updatetime`.
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`. 
     * @return Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     * @param Order It specifies whether to return the results in ascending or descending order. The value is `ASC` or `DESC`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public ListNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListNamespacesRequest(ListNamespacesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

