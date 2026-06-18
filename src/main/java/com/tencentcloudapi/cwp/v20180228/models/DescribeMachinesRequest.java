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

public class DescribeMachinesRequest extends AbstractModel {

    /**
    * <p>Machine zone type<br>CVM: Cloud Virtual Machine<br>BM: Blackstone<br>ECM: Edge Computing Machine<br>LH: Lighthouse<br>Other: Hybrid cloud zone</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>Machine region, for example, ap-guangzhou or ap-shanghai. For non-Tencent Cloud hosts, use ap-others.</p>
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * <p>Number of returned results. The default number is 10, and the maximum value is 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Filter criteria.</p><li>Ips - String - Required: No - Query by IP</li><li>Names - String - Required: No - Query by instance name</li><li>InstanceIds - String - Required: No - Query by instance id</li><li>Version - String - Required: No - Current protection edition (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Version | Flagship: Ultimate Edition | ProtectedMachines: Pro Edition + Ultimate Edition)</li><li>Risk - String - Required: No - Risk host (yes)</li><li>Os - String - Required: No - Operating system (DescribeMachineOsList API value). Each filter criterion only supports one value and does not support multiple values or relationship query.</li><li>Quuid - String - Required: No - Cloud server UUID. Maximum 100 entries.</li><li>AddedOnTheFifteen - String - Required: No - Query only hosts added within the last 15 days (1: yes)</li><li>TagId - String - Required: No - Query host list associated with the specified tag</li><li>AgentStatus - String - Required: No - ALL: All; ONLINE: Under protection; OFFLINE: Offline; UNINSTALLED: Not installed</li><li>MachineStatus - String - Required: No - ALL: All; RUNNING: Running; STOPPED: Shut down; EXPIRED: Pending recycling</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>List of business IDs to which the machines belong</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>APPID of the machine</p>
    */
    @SerializedName("MachineAppId")
    @Expose
    private Long MachineAppId;

    /**
     * Get <p>Machine zone type<br>CVM: Cloud Virtual Machine<br>BM: Blackstone<br>ECM: Edge Computing Machine<br>LH: Lighthouse<br>Other: Hybrid cloud zone</p> 
     * @return MachineType <p>Machine zone type<br>CVM: Cloud Virtual Machine<br>BM: Blackstone<br>ECM: Edge Computing Machine<br>LH: Lighthouse<br>Other: Hybrid cloud zone</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>Machine zone type<br>CVM: Cloud Virtual Machine<br>BM: Blackstone<br>ECM: Edge Computing Machine<br>LH: Lighthouse<br>Other: Hybrid cloud zone</p>
     * @param MachineType <p>Machine zone type<br>CVM: Cloud Virtual Machine<br>BM: Blackstone<br>ECM: Edge Computing Machine<br>LH: Lighthouse<br>Other: Hybrid cloud zone</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>Machine region, for example, ap-guangzhou or ap-shanghai. For non-Tencent Cloud hosts, use ap-others.</p> 
     * @return MachineRegion <p>Machine region, for example, ap-guangzhou or ap-shanghai. For non-Tencent Cloud hosts, use ap-others.</p>
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set <p>Machine region, for example, ap-guangzhou or ap-shanghai. For non-Tencent Cloud hosts, use ap-others.</p>
     * @param MachineRegion <p>Machine region, for example, ap-guangzhou or ap-shanghai. For non-Tencent Cloud hosts, use ap-others.</p>
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get <p>Number of returned results. The default number is 10, and the maximum value is 100.</p> 
     * @return Limit <p>Number of returned results. The default number is 10, and the maximum value is 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of returned results. The default number is 10, and the maximum value is 100.</p>
     * @param Limit <p>Number of returned results. The default number is 10, and the maximum value is 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Filter criteria.</p><li>Ips - String - Required: No - Query by IP</li><li>Names - String - Required: No - Query by instance name</li><li>InstanceIds - String - Required: No - Query by instance id</li><li>Version - String - Required: No - Current protection edition (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Version | Flagship: Ultimate Edition | ProtectedMachines: Pro Edition + Ultimate Edition)</li><li>Risk - String - Required: No - Risk host (yes)</li><li>Os - String - Required: No - Operating system (DescribeMachineOsList API value). Each filter criterion only supports one value and does not support multiple values or relationship query.</li><li>Quuid - String - Required: No - Cloud server UUID. Maximum 100 entries.</li><li>AddedOnTheFifteen - String - Required: No - Query only hosts added within the last 15 days (1: yes)</li><li>TagId - String - Required: No - Query host list associated with the specified tag</li><li>AgentStatus - String - Required: No - ALL: All; ONLINE: Under protection; OFFLINE: Offline; UNINSTALLED: Not installed</li><li>MachineStatus - String - Required: No - ALL: All; RUNNING: Running; STOPPED: Shut down; EXPIRED: Pending recycling</li> 
     * @return Filters <p>Filter criteria.</p><li>Ips - String - Required: No - Query by IP</li><li>Names - String - Required: No - Query by instance name</li><li>InstanceIds - String - Required: No - Query by instance id</li><li>Version - String - Required: No - Current protection edition (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Version | Flagship: Ultimate Edition | ProtectedMachines: Pro Edition + Ultimate Edition)</li><li>Risk - String - Required: No - Risk host (yes)</li><li>Os - String - Required: No - Operating system (DescribeMachineOsList API value). Each filter criterion only supports one value and does not support multiple values or relationship query.</li><li>Quuid - String - Required: No - Cloud server UUID. Maximum 100 entries.</li><li>AddedOnTheFifteen - String - Required: No - Query only hosts added within the last 15 days (1: yes)</li><li>TagId - String - Required: No - Query host list associated with the specified tag</li><li>AgentStatus - String - Required: No - ALL: All; ONLINE: Under protection; OFFLINE: Offline; UNINSTALLED: Not installed</li><li>MachineStatus - String - Required: No - ALL: All; RUNNING: Running; STOPPED: Shut down; EXPIRED: Pending recycling</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter criteria.</p><li>Ips - String - Required: No - Query by IP</li><li>Names - String - Required: No - Query by instance name</li><li>InstanceIds - String - Required: No - Query by instance id</li><li>Version - String - Required: No - Current protection edition (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Version | Flagship: Ultimate Edition | ProtectedMachines: Pro Edition + Ultimate Edition)</li><li>Risk - String - Required: No - Risk host (yes)</li><li>Os - String - Required: No - Operating system (DescribeMachineOsList API value). Each filter criterion only supports one value and does not support multiple values or relationship query.</li><li>Quuid - String - Required: No - Cloud server UUID. Maximum 100 entries.</li><li>AddedOnTheFifteen - String - Required: No - Query only hosts added within the last 15 days (1: yes)</li><li>TagId - String - Required: No - Query host list associated with the specified tag</li><li>AgentStatus - String - Required: No - ALL: All; ONLINE: Under protection; OFFLINE: Offline; UNINSTALLED: Not installed</li><li>MachineStatus - String - Required: No - ALL: All; RUNNING: Running; STOPPED: Shut down; EXPIRED: Pending recycling</li>
     * @param Filters <p>Filter criteria.</p><li>Ips - String - Required: No - Query by IP</li><li>Names - String - Required: No - Query by instance name</li><li>InstanceIds - String - Required: No - Query by instance id</li><li>Version - String - Required: No - Current protection edition (PRO_VERSION: Pro Edition | BASIC_VERSION: Basic Version | Flagship: Ultimate Edition | ProtectedMachines: Pro Edition + Ultimate Edition)</li><li>Risk - String - Required: No - Risk host (yes)</li><li>Os - String - Required: No - Operating system (DescribeMachineOsList API value). Each filter criterion only supports one value and does not support multiple values or relationship query.</li><li>Quuid - String - Required: No - Cloud server UUID. Maximum 100 entries.</li><li>AddedOnTheFifteen - String - Required: No - Query only hosts added within the last 15 days (1: yes)</li><li>TagId - String - Required: No - Query host list associated with the specified tag</li><li>AgentStatus - String - Required: No - ALL: All; ONLINE: Under protection; OFFLINE: Offline; UNINSTALLED: Not installed</li><li>MachineStatus - String - Required: No - ALL: All; RUNNING: Running; STOPPED: Shut down; EXPIRED: Pending recycling</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>List of business IDs to which the machines belong</p> 
     * @return ProjectIds <p>List of business IDs to which the machines belong</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>List of business IDs to which the machines belong</p>
     * @param ProjectIds <p>List of business IDs to which the machines belong</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>APPID of the machine</p> 
     * @return MachineAppId <p>APPID of the machine</p>
     */
    public Long getMachineAppId() {
        return this.MachineAppId;
    }

    /**
     * Set <p>APPID of the machine</p>
     * @param MachineAppId <p>APPID of the machine</p>
     */
    public void setMachineAppId(Long MachineAppId) {
        this.MachineAppId = MachineAppId;
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
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.MachineAppId != null) {
            this.MachineAppId = new Long(source.MachineAppId);
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
        this.setParamSimple(map, prefix + "MachineAppId", this.MachineAppId);

    }
}

