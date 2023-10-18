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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesRequest extends AbstractModel {

    /**
    * Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Server region, such as ap-guangzhou or ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Number of results to be returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Filter.
<li>Keywords - String - Required: no - Query keywords </li>
<li>Status - String - Required: no - CWP client status (valid values: OFFLINE, ONLINE, UNINSTALLED)</li>
<li>Version - String - Required: no - Current CWP version (valid values: PRO_VERSION, BASIC_VERSION)</li>
Each filter can have only one value but does not support "OR" queries with multiple values
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Server type.
<li>CVM: CVM</li>
<li>BM: BM</li> 
     * @return MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     * @param MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Server region, such as ap-guangzhou or ap-shanghai 
     * @return MachineRegion Server region, such as ap-guangzhou or ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region, such as ap-guangzhou or ap-shanghai
     * @param MachineRegion Server region, such as ap-guangzhou or ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Number of results to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of results to be returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get Filter.
<li>Keywords - String - Required: no - Query keywords </li>
<li>Status - String - Required: no - CWP client status (valid values: OFFLINE, ONLINE, UNINSTALLED)</li>
<li>Version - String - Required: no - Current CWP version (valid values: PRO_VERSION, BASIC_VERSION)</li>
Each filter can have only one value but does not support "OR" queries with multiple values 
     * @return Filters Filter.
<li>Keywords - String - Required: no - Query keywords </li>
<li>Status - String - Required: no - CWP client status (valid values: OFFLINE, ONLINE, UNINSTALLED)</li>
<li>Version - String - Required: no - Current CWP version (valid values: PRO_VERSION, BASIC_VERSION)</li>
Each filter can have only one value but does not support "OR" queries with multiple values
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
<li>Keywords - String - Required: no - Query keywords </li>
<li>Status - String - Required: no - CWP client status (valid values: OFFLINE, ONLINE, UNINSTALLED)</li>
<li>Version - String - Required: no - Current CWP version (valid values: PRO_VERSION, BASIC_VERSION)</li>
Each filter can have only one value but does not support "OR" queries with multiple values
     * @param Filters Filter.
<li>Keywords - String - Required: no - Query keywords </li>
<li>Status - String - Required: no - CWP client status (valid values: OFFLINE, ONLINE, UNINSTALLED)</li>
<li>Version - String - Required: no - Current CWP version (valid values: PRO_VERSION, BASIC_VERSION)</li>
Each filter can have only one value but does not support "OR" queries with multiple values
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesRequest(DescribeMachinesRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

