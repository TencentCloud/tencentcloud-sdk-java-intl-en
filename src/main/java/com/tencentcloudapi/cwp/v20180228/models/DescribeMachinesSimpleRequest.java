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

public class DescribeMachinesSimpleRequest extends AbstractModel {

    /**
    * Type of the machine's zone
CVM: Cloud Virtual Machine
BM: BM
ECM: Edge Computing Machine
LH: Lighthouse
Other: Hybrid Cloud Zone
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Machine region. For example, ap-guangzhou and ap-shanghai.
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Number of entries to be returned. Default value: 10. Maximum value: 100.
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
    * Filtering criteria
<li>Keywords - String - required: no - keywords for querying </li>
<li>Version - String required: no - current protection edition ( PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition | Flagship: Ultimate Edition | ProtectedMachines: Pro + Ultimate Editions | UnFlagship: Non-Ultimate Edition | PRO_POST_PAY: Pro Edition in pay-as-you-go mode | PRO_PRE_PAY: Pro Edition in monthly subscription mode)</li>
<li>TagId - String - required: no - tag ID </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * ID list of businesses to which machines belong
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
     * Get Type of the machine's zone
CVM: Cloud Virtual Machine
BM: BM
ECM: Edge Computing Machine
LH: Lighthouse
Other: Hybrid Cloud Zone 
     * @return MachineType Type of the machine's zone
CVM: Cloud Virtual Machine
BM: BM
ECM: Edge Computing Machine
LH: Lighthouse
Other: Hybrid Cloud Zone
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Type of the machine's zone
CVM: Cloud Virtual Machine
BM: BM
ECM: Edge Computing Machine
LH: Lighthouse
Other: Hybrid Cloud Zone
     * @param MachineType Type of the machine's zone
CVM: Cloud Virtual Machine
BM: BM
ECM: Edge Computing Machine
LH: Lighthouse
Other: Hybrid Cloud Zone
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Machine region. For example, ap-guangzhou and ap-shanghai. 
     * @return MachineRegion Machine region. For example, ap-guangzhou and ap-shanghai.
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Machine region. For example, ap-guangzhou and ap-shanghai.
     * @param MachineRegion Machine region. For example, ap-guangzhou and ap-shanghai.
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Number of entries to be returned. Default value: 10. Maximum value: 100. 
     * @return Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries to be returned. Default value: 10. Maximum value: 100.
     * @param Limit Number of entries to be returned. Default value: 10. Maximum value: 100.
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
     * Get Filtering criteria
<li>Keywords - String - required: no - keywords for querying </li>
<li>Version - String required: no - current protection edition ( PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition | Flagship: Ultimate Edition | ProtectedMachines: Pro + Ultimate Editions | UnFlagship: Non-Ultimate Edition | PRO_POST_PAY: Pro Edition in pay-as-you-go mode | PRO_PRE_PAY: Pro Edition in monthly subscription mode)</li>
<li>TagId - String - required: no - tag ID </li> 
     * @return Filters Filtering criteria
<li>Keywords - String - required: no - keywords for querying </li>
<li>Version - String required: no - current protection edition ( PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition | Flagship: Ultimate Edition | ProtectedMachines: Pro + Ultimate Editions | UnFlagship: Non-Ultimate Edition | PRO_POST_PAY: Pro Edition in pay-as-you-go mode | PRO_PRE_PAY: Pro Edition in monthly subscription mode)</li>
<li>TagId - String - required: no - tag ID </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria
<li>Keywords - String - required: no - keywords for querying </li>
<li>Version - String required: no - current protection edition ( PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition | Flagship: Ultimate Edition | ProtectedMachines: Pro + Ultimate Editions | UnFlagship: Non-Ultimate Edition | PRO_POST_PAY: Pro Edition in pay-as-you-go mode | PRO_PRE_PAY: Pro Edition in monthly subscription mode)</li>
<li>TagId - String - required: no - tag ID </li>
     * @param Filters Filtering criteria
<li>Keywords - String - required: no - keywords for querying </li>
<li>Version - String required: no - current protection edition ( PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Edition | Flagship: Ultimate Edition | ProtectedMachines: Pro + Ultimate Editions | UnFlagship: Non-Ultimate Edition | PRO_POST_PAY: Pro Edition in pay-as-you-go mode | PRO_PRE_PAY: Pro Edition in monthly subscription mode)</li>
<li>TagId - String - required: no - tag ID </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get ID list of businesses to which machines belong 
     * @return ProjectIds ID list of businesses to which machines belong
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set ID list of businesses to which machines belong
     * @param ProjectIds ID list of businesses to which machines belong
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeMachinesSimpleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesSimpleRequest(DescribeMachinesSimpleRequest source) {
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

