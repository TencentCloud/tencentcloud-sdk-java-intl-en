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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoginTypeHostRequest extends AbstractModel {

    /**
    * <li>Name - string - Required: No - Host name</li> <li>InstanceId - string - Required: No - Instance ID</li> <li>PublicIp - string - Required: No - Public IP address</li> <li>PrivateIp - string - Required: No - Private IP</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Limit Entries, 10 by default, up to 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is 0 by default.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting column: [Id].
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <li>Name - string - Required: No - Host name</li> <li>InstanceId - string - Required: No - Instance ID</li> <li>PublicIp - string - Required: No - Public IP address</li> <li>PrivateIp - string - Required: No - Private IP</li> 
     * @return Filters <li>Name - string - Required: No - Host name</li> <li>InstanceId - string - Required: No - Instance ID</li> <li>PublicIp - string - Required: No - Public IP address</li> <li>PrivateIp - string - Required: No - Private IP</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>Name - string - Required: No - Host name</li> <li>InstanceId - string - Required: No - Instance ID</li> <li>PublicIp - string - Required: No - Public IP address</li> <li>PrivateIp - string - Required: No - Private IP</li>
     * @param Filters <li>Name - string - Required: No - Host name</li> <li>InstanceId - string - Required: No - Instance ID</li> <li>PublicIp - string - Required: No - Public IP address</li> <li>PrivateIp - string - Required: No - Private IP</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Limit Entries, 10 by default, up to 100 
     * @return Limit Limit Entries, 10 by default, up to 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit Entries, 10 by default, up to 100
     * @param Limit Limit Entries, 10 by default, up to 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is 0 by default. 
     * @return Offset Offset, which is 0 by default.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
     * @param Offset Offset, which is 0 by default.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting Method: [ASC: Ascending Order, DESC: Descending Order] 
     * @return Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     * @param Order Sorting Method: [ASC: Ascending Order, DESC: Descending Order]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting column: [Id]. 
     * @return By Sorting column: [Id].
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting column: [Id].
     * @param By Sorting column: [Id].
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeLoginTypeHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginTypeHostRequest(DescribeLoginTypeHostRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

