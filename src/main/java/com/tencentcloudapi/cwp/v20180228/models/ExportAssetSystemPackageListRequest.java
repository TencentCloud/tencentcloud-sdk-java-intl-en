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

public class ExportAssetSystemPackageListRequest extends AbstractModel {

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>Name - String - required: no - package name</li>
<li>StartTime - String - required: no - start time of installation</li>
<li>EndTime - String - required: no - end time of installation</li>
<li>Type- int - required: no - installation package type:
1:rpm
2:dpkg
3:java
4:system</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorting method: asc for ascending order or desc for descending order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Optional sorting method: [FistTime|InstallTime: installation time]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Filter criteria
<li>Name - String - required: no - package name</li>
<li>StartTime - String - required: no - start time of installation</li>
<li>EndTime - String - required: no - end time of installation</li>
<li>Type- int - required: no - installation package type:
1:rpm
2:dpkg
3:java
4:system</li> 
     * @return Filters Filter criteria
<li>Name - String - required: no - package name</li>
<li>StartTime - String - required: no - start time of installation</li>
<li>EndTime - String - required: no - end time of installation</li>
<li>Type- int - required: no - installation package type:
1:rpm
2:dpkg
3:java
4:system</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Name - String - required: no - package name</li>
<li>StartTime - String - required: no - start time of installation</li>
<li>EndTime - String - required: no - end time of installation</li>
<li>Type- int - required: no - installation package type:
1:rpm
2:dpkg
3:java
4:system</li>
     * @param Filters Filter criteria
<li>Name - String - required: no - package name</li>
<li>StartTime - String - required: no - start time of installation</li>
<li>EndTime - String - required: no - end time of installation</li>
<li>Type- int - required: no - installation package type:
1:rpm
2:dpkg
3:java
4:system</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get Optional sorting method: [FistTime|InstallTime: installation time] 
     * @return By Optional sorting method: [FistTime|InstallTime: installation time]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Optional sorting method: [FistTime|InstallTime: installation time]
     * @param By Optional sorting method: [FistTime|InstallTime: installation time]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportAssetSystemPackageListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetSystemPackageListRequest(ExportAssetSystemPackageListRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

