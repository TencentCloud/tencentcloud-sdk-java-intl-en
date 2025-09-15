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

public class DescribeZonesRequest extends AbstractModel {

    /**
    * Field on which the AZ list is sorted. value range:.
<Li>ZONE: sorted based on availability zone.</li>.
INSTANCE_DISPLAY_LABEL: specifies the Tag DISPLAY sorting order based on availability zone. valid values: HIDDEN (hide), NORMAL (ordinary), SELECTED (chosen by default). defaults to ascending order: ['HIDDEN', 'NORMAL', 'SELECTED'].
Specifies the default sorting order by availability zone.
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Outputs the sorting order of the availability zone list. value range:.
<Li>ASC: ascending order.</li>.
<Li>DESC: sort in descending order.</li>.
Specifies the default ascending order.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get Field on which the AZ list is sorted. value range:.
<Li>ZONE: sorted based on availability zone.</li>.
INSTANCE_DISPLAY_LABEL: specifies the Tag DISPLAY sorting order based on availability zone. valid values: HIDDEN (hide), NORMAL (ordinary), SELECTED (chosen by default). defaults to ascending order: ['HIDDEN', 'NORMAL', 'SELECTED'].
Specifies the default sorting order by availability zone. 
     * @return OrderField Field on which the AZ list is sorted. value range:.
<Li>ZONE: sorted based on availability zone.</li>.
INSTANCE_DISPLAY_LABEL: specifies the Tag DISPLAY sorting order based on availability zone. valid values: HIDDEN (hide), NORMAL (ordinary), SELECTED (chosen by default). defaults to ascending order: ['HIDDEN', 'NORMAL', 'SELECTED'].
Specifies the default sorting order by availability zone.
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Field on which the AZ list is sorted. value range:.
<Li>ZONE: sorted based on availability zone.</li>.
INSTANCE_DISPLAY_LABEL: specifies the Tag DISPLAY sorting order based on availability zone. valid values: HIDDEN (hide), NORMAL (ordinary), SELECTED (chosen by default). defaults to ascending order: ['HIDDEN', 'NORMAL', 'SELECTED'].
Specifies the default sorting order by availability zone.
     * @param OrderField Field on which the AZ list is sorted. value range:.
<Li>ZONE: sorted based on availability zone.</li>.
INSTANCE_DISPLAY_LABEL: specifies the Tag DISPLAY sorting order based on availability zone. valid values: HIDDEN (hide), NORMAL (ordinary), SELECTED (chosen by default). defaults to ascending order: ['HIDDEN', 'NORMAL', 'SELECTED'].
Specifies the default sorting order by availability zone.
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Outputs the sorting order of the availability zone list. value range:.
<Li>ASC: ascending order.</li>.
<Li>DESC: sort in descending order.</li>.
Specifies the default ascending order. 
     * @return Order Outputs the sorting order of the availability zone list. value range:.
<Li>ASC: ascending order.</li>.
<Li>DESC: sort in descending order.</li>.
Specifies the default ascending order.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Outputs the sorting order of the availability zone list. value range:.
<Li>ASC: ascending order.</li>.
<Li>DESC: sort in descending order.</li>.
Specifies the default ascending order.
     * @param Order Outputs the sorting order of the availability zone list. value range:.
<Li>ASC: ascending order.</li>.
<Li>DESC: sort in descending order.</li>.
Specifies the default ascending order.
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

