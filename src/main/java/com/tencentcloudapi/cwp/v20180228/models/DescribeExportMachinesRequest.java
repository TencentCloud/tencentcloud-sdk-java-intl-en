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

public class DescribeExportMachinesRequest extends AbstractModel {

    /**
    * CVM type
<li>CVM: Represent a virtual machine</li>
<li>BM: Represent a physical machine</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Machine region. Example: ap-guangzhou, ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Quantity of returns. It is 10 by default, and the maximum value is 100.
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
    * Filter criteria
<li>Keywords - String - required: no - keyword for query </li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: not installed)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition)</li>
Only one value is allowed for each filter criterion. Multiple values with the OR relationship are not supported for queries.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * ID List of Businesses to which machines belong
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
     * Get CVM type
<li>CVM: Represent a virtual machine</li>
<li>BM: Represent a physical machine</li> 
     * @return MachineType CVM type
<li>CVM: Represent a virtual machine</li>
<li>BM: Represent a physical machine</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set CVM type
<li>CVM: Represent a virtual machine</li>
<li>BM: Represent a physical machine</li>
     * @param MachineType CVM type
<li>CVM: Represent a virtual machine</li>
<li>BM: Represent a physical machine</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Machine region. Example: ap-guangzhou, ap-shanghai 
     * @return MachineRegion Machine region. Example: ap-guangzhou, ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Machine region. Example: ap-guangzhou, ap-shanghai
     * @param MachineRegion Machine region. Example: ap-guangzhou, ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Quantity of returns. It is 10 by default, and the maximum value is 100. 
     * @return Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity of returns. It is 10 by default, and the maximum value is 100.
     * @param Limit Quantity of returns. It is 10 by default, and the maximum value is 100.
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
     * Get Filter criteria
<li>Keywords - String - required: no - keyword for query </li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: not installed)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition)</li>
Only one value is allowed for each filter criterion. Multiple values with the OR relationship are not supported for queries. 
     * @return Filters Filter criteria
<li>Keywords - String - required: no - keyword for query </li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: not installed)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition)</li>
Only one value is allowed for each filter criterion. Multiple values with the OR relationship are not supported for queries.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Keywords - String - required: no - keyword for query </li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: not installed)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition)</li>
Only one value is allowed for each filter criterion. Multiple values with the OR relationship are not supported for queries.
     * @param Filters Filter criteria
<li>Keywords - String - required: no - keyword for query </li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: not installed)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition)</li>
Only one value is allowed for each filter criterion. Multiple values with the OR relationship are not supported for queries.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get ID List of Businesses to which machines belong 
     * @return ProjectIds ID List of Businesses to which machines belong
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set ID List of Businesses to which machines belong
     * @param ProjectIds ID List of Businesses to which machines belong
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeExportMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportMachinesRequest(DescribeExportMachinesRequest source) {
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
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
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
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

