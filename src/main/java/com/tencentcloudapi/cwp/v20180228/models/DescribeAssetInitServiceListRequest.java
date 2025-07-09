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

public class DescribeAssetInitServiceListRequest extends AbstractModel {

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name- string - required: no - package name</li>
<li>User- string - required: no - user</li>
<li>IsAutoRun - string - required: no - whether it starts at boot: 0: no; 1: yes</li>
<li>Status- string - required: no - default enabling status: 0: unenabled; 1: enabled (Linux only)</li>
<li>Type- string - required: no - type: type (Windows only)
1: Encoder
2: IE plugin
3: Network provider
4: Mirror hijacking
5: LSA provider
6:KnownDLLs
7: Start execution
8:WMI
9: Scheduled task
10: Winsock provider
11: Printing monitor
12: Resource manager
13: Driver service
14: Log-in </li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items to be returned. It is 10 by default, and the maximum value is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting method: [FirstTime]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name- string - required: no - package name</li>
<li>User- string - required: no - user</li>
<li>IsAutoRun - string - required: no - whether it starts at boot: 0: no; 1: yes</li>
<li>Status- string - required: no - default enabling status: 0: unenabled; 1: enabled (Linux only)</li>
<li>Type- string - required: no - type: type (Windows only)
1: Encoder
2: IE plugin
3: Network provider
4: Mirror hijacking
5: LSA provider
6:KnownDLLs
7: Start execution
8:WMI
9: Scheduled task
10: Winsock provider
11: Printing monitor
12: Resource manager
13: Driver service
14: Log-in </li> 
     * @return Filters Filter criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name- string - required: no - package name</li>
<li>User- string - required: no - user</li>
<li>IsAutoRun - string - required: no - whether it starts at boot: 0: no; 1: yes</li>
<li>Status- string - required: no - default enabling status: 0: unenabled; 1: enabled (Linux only)</li>
<li>Type- string - required: no - type: type (Windows only)
1: Encoder
2: IE plugin
3: Network provider
4: Mirror hijacking
5: LSA provider
6:KnownDLLs
7: Start execution
8:WMI
9: Scheduled task
10: Winsock provider
11: Printing monitor
12: Resource manager
13: Driver service
14: Log-in </li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name- string - required: no - package name</li>
<li>User- string - required: no - user</li>
<li>IsAutoRun - string - required: no - whether it starts at boot: 0: no; 1: yes</li>
<li>Status- string - required: no - default enabling status: 0: unenabled; 1: enabled (Linux only)</li>
<li>Type- string - required: no - type: type (Windows only)
1: Encoder
2: IE plugin
3: Network provider
4: Mirror hijacking
5: LSA provider
6:KnownDLLs
7: Start execution
8:WMI
9: Scheduled task
10: Winsock provider
11: Printing monitor
12: Resource manager
13: Driver service
14: Log-in </li>
     * @param Filters Filter criteria
<li>IP - String - required: no - host IP address</li>
<li>MachineName - String - required: no - host name</li>
<li>InstanceID - string - required: no - instance ID</li>
<li>Name- string - required: no - package name</li>
<li>User- string - required: no - user</li>
<li>IsAutoRun - string - required: no - whether it starts at boot: 0: no; 1: yes</li>
<li>Status- string - required: no - default enabling status: 0: unenabled; 1: enabled (Linux only)</li>
<li>Type- string - required: no - type: type (Windows only)
1: Encoder
2: IE plugin
3: Network provider
4: Mirror hijacking
5: LSA provider
6:KnownDLLs
7: Start execution
8:WMI
9: Scheduled task
10: Winsock provider
11: Printing monitor
12: Resource manager
13: Driver service
14: Log-in </li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default value: 0. 
     * @return Offset Offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0.
     * @param Offset Offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
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
     * Get Sorting method: [FirstTime] 
     * @return By Sorting method: [FirstTime]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting method: [FirstTime]
     * @param By Sorting method: [FirstTime]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetInitServiceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetInitServiceListRequest(DescribeAssetInitServiceListRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

