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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel{

    /**
    * Sorting field. Valid values:
<li>`ZONE`: Sort by the availability zone.
<li>`INSTANCE_DISPLAY_LABEL`: Sort by the labels of availability zones. Labels include `HIDDEN`, `NORMAL` and `SELECTED`.
The default value is `ZONE`.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Specifies how availability zones are listed. Valid values:
<li>ASC: Ascending sort. 
<li>DESC: Descending sort.
The default value is `ASC`.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Sorting field. Valid values:
<li>`ZONE`: Sort by the availability zone.
<li>`INSTANCE_DISPLAY_LABEL`: Sort by the labels of availability zones. Labels include `HIDDEN`, `NORMAL` and `SELECTED`.
The default value is `ZONE`. 
     * @return OrderField Sorting field. Valid values:
<li>`ZONE`: Sort by the availability zone.
<li>`INSTANCE_DISPLAY_LABEL`: Sort by the labels of availability zones. Labels include `HIDDEN`, `NORMAL` and `SELECTED`.
The default value is `ZONE`.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values:
<li>`ZONE`: Sort by the availability zone.
<li>`INSTANCE_DISPLAY_LABEL`: Sort by the labels of availability zones. Labels include `HIDDEN`, `NORMAL` and `SELECTED`.
The default value is `ZONE`.
     * @param OrderField Sorting field. Valid values:
<li>`ZONE`: Sort by the availability zone.
<li>`INSTANCE_DISPLAY_LABEL`: Sort by the labels of availability zones. Labels include `HIDDEN`, `NORMAL` and `SELECTED`.
The default value is `ZONE`.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Specifies how availability zones are listed. Valid values:
<li>ASC: Ascending sort. 
<li>DESC: Descending sort.
The default value is `ASC`. 
     * @return Order Specifies how availability zones are listed. Valid values:
<li>ASC: Ascending sort. 
<li>DESC: Descending sort.
The default value is `ASC`.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Specifies how availability zones are listed. Valid values:
<li>ASC: Ascending sort. 
<li>DESC: Descending sort.
The default value is `ASC`.
     * @param Order Specifies how availability zones are listed. Valid values:
<li>ASC: Ascending sort. 
<li>DESC: Descending sort.
The default value is `ASC`.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

