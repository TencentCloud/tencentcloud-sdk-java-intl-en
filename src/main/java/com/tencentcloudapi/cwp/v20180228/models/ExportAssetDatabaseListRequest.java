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

public class ExportAssetDatabaseListRequest extends AbstractModel {

    /**
    * Filtering criteria
<li>User- string - required: no - running user</li>
<li>Ip - String - required: no - bound IP address</li>
<li>Port - Int - required: no - port</li>
<li>Name - Int - required: no - database name
0: all
1:MySQL
2:Redis
3:Oracle
4:MongoDB
5:MemCache
6:PostgreSQL
7:HBase
8:DB2
9:Sybase
10:TiDB</li>
<li>Proto - String - required: no - protocol: 1: TCP; 2: UDP; 3: unknown</li>
<li>OsType - String - required: no - operating system: Linux/Windows</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Query the information on the host with the specified QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Sorting order: asc for ascending or desc for descending
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
     * Get Filtering criteria
<li>User- string - required: no - running user</li>
<li>Ip - String - required: no - bound IP address</li>
<li>Port - Int - required: no - port</li>
<li>Name - Int - required: no - database name
0: all
1:MySQL
2:Redis
3:Oracle
4:MongoDB
5:MemCache
6:PostgreSQL
7:HBase
8:DB2
9:Sybase
10:TiDB</li>
<li>Proto - String - required: no - protocol: 1: TCP; 2: UDP; 3: unknown</li>
<li>OsType - String - required: no - operating system: Linux/Windows</li> 
     * @return Filters Filtering criteria
<li>User- string - required: no - running user</li>
<li>Ip - String - required: no - bound IP address</li>
<li>Port - Int - required: no - port</li>
<li>Name - Int - required: no - database name
0: all
1:MySQL
2:Redis
3:Oracle
4:MongoDB
5:MemCache
6:PostgreSQL
7:HBase
8:DB2
9:Sybase
10:TiDB</li>
<li>Proto - String - required: no - protocol: 1: TCP; 2: UDP; 3: unknown</li>
<li>OsType - String - required: no - operating system: Linux/Windows</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>User- string - required: no - running user</li>
<li>Ip - String - required: no - bound IP address</li>
<li>Port - Int - required: no - port</li>
<li>Name - Int - required: no - database name
0: all
1:MySQL
2:Redis
3:Oracle
4:MongoDB
5:MemCache
6:PostgreSQL
7:HBase
8:DB2
9:Sybase
10:TiDB</li>
<li>Proto - String - required: no - protocol: 1: TCP; 2: UDP; 3: unknown</li>
<li>OsType - String - required: no - operating system: Linux/Windows</li>
     * @param Filters Filtering criteria
<li>User- string - required: no - running user</li>
<li>Ip - String - required: no - bound IP address</li>
<li>Port - Int - required: no - port</li>
<li>Name - Int - required: no - database name
0: all
1:MySQL
2:Redis
3:Oracle
4:MongoDB
5:MemCache
6:PostgreSQL
7:HBase
8:DB2
9:Sybase
10:TiDB</li>
<li>Proto - String - required: no - protocol: 1: TCP; 2: UDP; 3: unknown</li>
<li>OsType - String - required: no - operating system: Linux/Windows</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Query the information on the host with the specified QUUID 
     * @return Quuid Query the information on the host with the specified QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Query the information on the host with the specified QUUID
     * @param Quuid Query the information on the host with the specified QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Sorting order: asc for ascending or desc for descending 
     * @return Order Sorting order: asc for ascending or desc for descending
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting order: asc for ascending or desc for descending
     * @param Order Sorting order: asc for ascending or desc for descending
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

    public ExportAssetDatabaseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetDatabaseListRequest(ExportAssetDatabaseListRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

