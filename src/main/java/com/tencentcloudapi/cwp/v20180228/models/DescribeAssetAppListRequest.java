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

public class DescribeAssetAppListRequest extends AbstractModel {

    /**
    * Query information of a specified QUUID host
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>AppName - string - required: no - application name for search</li>
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Type - int - required: no - type : Linux only	
0: all
1: operations
2: database
3: Security
4: suspicious application
5: system architecture
6: system application
7: web service
99: other</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Number of items to be returned. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which defaults to 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field: [FirstTime|ProcessCount]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Query information of a specified QUUID host 
     * @return Quuid Query information of a specified QUUID host
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Query information of a specified QUUID host
     * @param Quuid Query information of a specified QUUID host
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criteria
<li>AppName - string - required: no - application name for search</li>
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Type - int - required: no - type : Linux only	
0: all
1: operations
2: database
3: Security
4: suspicious application
5: system architecture
6: system application
7: web service
99: other</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li> 
     * @return Filters Filter criteria
<li>AppName - string - required: no - application name for search</li>
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Type - int - required: no - type : Linux only	
0: all
1: operations
2: database
3: Security
4: suspicious application
5: system architecture
6: system application
7: web service
99: other</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>AppName - string - required: no - application name for search</li>
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Type - int - required: no - type : Linux only	
0: all
1: operations
2: database
3: Security
4: suspicious application
5: system architecture
6: system application
7: web service
99: other</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     * @param Filters Filter criteria
<li>AppName - string - required: no - application name for search</li>
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Type - int - required: no - type : Linux only	
0: all
1: operations
2: database
3: Security
4: suspicious application
5: system architecture
6: system application
7: web service
99: other</li>
<li>OsType - uint64 - required: no - Windows/Linux</li>
<li>Os - String required: no - operating system (value of DescribeMachineOsList)</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of items to be returned. It is 10 by default, and the maximum value is 100. 
     * @return Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items to be returned. It is 10 by default, and the maximum value is 100.
     * @param Limit Number of items to be returned. It is 10 by default, and the maximum value is 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which defaults to 0 
     * @return Offset Offset, which defaults to 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which defaults to 0
     * @param Offset Offset, which defaults to 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sorting method: asc for ascending order or desc for descending order 
     * @return Order Sorting method: asc for ascending order or desc for descending order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: asc for ascending order or desc for descending order
     * @param Order Sorting method: asc for ascending order or desc for descending order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field: [FirstTime|ProcessCount] 
     * @return By Sorting field: [FirstTime|ProcessCount]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field: [FirstTime|ProcessCount]
     * @param By Sorting field: [FirstTime|ProcessCount]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetAppListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetAppListRequest(DescribeAssetAppListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

