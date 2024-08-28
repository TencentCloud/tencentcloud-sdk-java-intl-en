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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudProtectServiceOrderListRequest extends AbstractModel {

    /**
    * Sorting field, which currently supports BeginTime
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting method, which currently supports:
ASC for ascending order; DESC for descending order
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Sorting field, which currently supports BeginTime 
     * @return Order Sorting field, which currently supports BeginTime
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting field, which currently supports BeginTime
     * @param Order Sorting field, which currently supports BeginTime
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting method, which currently supports:
ASC for ascending order; DESC for descending order 
     * @return By Sorting method, which currently supports:
ASC for ascending order; DESC for descending order
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method, which currently supports:
ASC for ascending order; DESC for descending order
     * @param By Sorting method, which currently supports:
ASC for ascending order; DESC for descending order
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeCloudProtectServiceOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudProtectServiceOrderListRequest(DescribeCloudProtectServiceOrderListRequest source) {
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

