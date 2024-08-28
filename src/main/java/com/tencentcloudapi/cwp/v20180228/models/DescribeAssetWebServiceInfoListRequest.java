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

public class DescribeAssetWebServiceInfoListRequest extends AbstractModel {

    /**
    * Query the information on the host with the specified QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>User - string - required: no - running user</li>
<li>Name - string - required: no - Web service name:</li>
1:Tomcat
2:Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - string - required: no - Windows/Linux</li>
<li>Os -String required: no - operating system (the value of DescribeMachineOsList API)</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * Offset, which is 0 by default.
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
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
    * Optional sorting method: [FirstTime|ProcessCount]
    */
    @SerializedName("By")
    @Expose
    private String By;

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
     * Get Filter criteria
<li>User - string - required: no - running user</li>
<li>Name - string - required: no - Web service name:</li>
1:Tomcat
2:Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - string - required: no - Windows/Linux</li>
<li>Os -String required: no - operating system (the value of DescribeMachineOsList API)</li> 
     * @return Filters Filter criteria
<li>User - string - required: no - running user</li>
<li>Name - string - required: no - Web service name:</li>
1:Tomcat
2:Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - string - required: no - Windows/Linux</li>
<li>Os -String required: no - operating system (the value of DescribeMachineOsList API)</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>User - string - required: no - running user</li>
<li>Name - string - required: no - Web service name:</li>
1:Tomcat
2:Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - string - required: no - Windows/Linux</li>
<li>Os -String required: no - operating system (the value of DescribeMachineOsList API)</li>
     * @param Filters Filter criteria
<li>User - string - required: no - running user</li>
<li>Name - string - required: no - Web service name:</li>
1:Tomcat
2:Apache
3:Nginx
4:WebLogic
5:Websphere
6:JBoss
7:WildFly
8:Jetty
9:IHS
10:Tengine</li>
<li>OsType - string - required: no - Windows/Linux</li>
<li>Os -String required: no - operating system (the value of DescribeMachineOsList API)</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset, which is 0 by default.
<li>IpOrAlias - String - required: no - filter by host IP or alias</li> 
     * @return Offset Offset, which is 0 by default.
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is 0 by default.
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
     * @param Offset Offset, which is 0 by default.
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
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
     * Get Optional sorting method: [FirstTime|ProcessCount] 
     * @return By Optional sorting method: [FirstTime|ProcessCount]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting method: [FirstTime|ProcessCount]
     * @param By Optional sorting method: [FirstTime|ProcessCount]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeAssetWebServiceInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetWebServiceInfoListRequest(DescribeAssetWebServiceInfoListRequest source) {
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

