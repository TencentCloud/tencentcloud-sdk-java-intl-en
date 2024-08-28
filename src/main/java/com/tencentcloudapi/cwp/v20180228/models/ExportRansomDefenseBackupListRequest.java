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

public class ExportRansomDefenseBackupListRequest extends AbstractModel {

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Filter criteria
<li>Status - Int - required: no - query by ransom status: 0 - not ransomed; 1 - ransomed</li>
<li>CreateTimeBegin - string - required: no - start of creation time</li>
<li>CreateTimeEnd - string - required: no - end of creation time</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Sorting method: ASC / DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field, supporting CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

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
<li>Status - Int - required: no - query by ransom status: 0 - not ransomed; 1 - ransomed</li>
<li>CreateTimeBegin - string - required: no - start of creation time</li>
<li>CreateTimeEnd - string - required: no - end of creation time</li> 
     * @return Filters Filter criteria
<li>Status - Int - required: no - query by ransom status: 0 - not ransomed; 1 - ransomed</li>
<li>CreateTimeBegin - string - required: no - start of creation time</li>
<li>CreateTimeEnd - string - required: no - end of creation time</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Status - Int - required: no - query by ransom status: 0 - not ransomed; 1 - ransomed</li>
<li>CreateTimeBegin - string - required: no - start of creation time</li>
<li>CreateTimeEnd - string - required: no - end of creation time</li>
     * @param Filters Filter criteria
<li>Status - Int - required: no - query by ransom status: 0 - not ransomed; 1 - ransomed</li>
<li>CreateTimeBegin - string - required: no - start of creation time</li>
<li>CreateTimeEnd - string - required: no - end of creation time</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting method: ASC / DESC 
     * @return Order Sorting method: ASC / DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method: ASC / DESC
     * @param Order Sorting method: ASC / DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field, supporting CreateTime 
     * @return By Sorting field, supporting CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field, supporting CreateTime
     * @param By Sorting field, supporting CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRansomDefenseBackupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRansomDefenseBackupListRequest(ExportRansomDefenseBackupListRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

