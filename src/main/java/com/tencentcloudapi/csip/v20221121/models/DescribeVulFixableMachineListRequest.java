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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixableMachineListRequest extends AbstractModel {

    /**
    * <p>Vulnerability ID list, a maximum of 100</p>
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Filtering Conditions<br>Supported Filter.Name:<br>Keyword - fuzzy matching, search by asset ID, asset name<br>ComponentName - fuzzy matching, search by associated component name<br>InstanceId - exact match, filter by host instance ID<br>MachineName - fuzzy matching, search by host name<br>MachineIp - fuzzy matching, search by host IP<br>OsType - exact match, filter by OS type: linux/windows<br>SupportAutoFix - exact match, filter by whether automatic fixing is supported: 0-unsupported 1-supported<br>Tag - exact match, filter by asset tag<br>AppId - exact match, filter by associated account</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Vulnerability ID list, a maximum of 100</p> 
     * @return VulIds <p>Vulnerability ID list, a maximum of 100</p>
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set <p>Vulnerability ID list, a maximum of 100</p>
     * @param VulIds <p>Vulnerability ID list, a maximum of 100</p>
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p> 
     * @return Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     * @param Offset <p>Paging offset<br>Value ranges from 0 to +∞<br>Default value: 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p> 
     * @return Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     * @param Limit <p>Number of results per page<br>Value ranges from 1 to 100<br>Default value: 10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Filtering Conditions<br>Supported Filter.Name:<br>Keyword - fuzzy matching, search by asset ID, asset name<br>ComponentName - fuzzy matching, search by associated component name<br>InstanceId - exact match, filter by host instance ID<br>MachineName - fuzzy matching, search by host name<br>MachineIp - fuzzy matching, search by host IP<br>OsType - exact match, filter by OS type: linux/windows<br>SupportAutoFix - exact match, filter by whether automatic fixing is supported: 0-unsupported 1-supported<br>Tag - exact match, filter by asset tag<br>AppId - exact match, filter by associated account</p> 
     * @return Filters <p>Filtering Conditions<br>Supported Filter.Name:<br>Keyword - fuzzy matching, search by asset ID, asset name<br>ComponentName - fuzzy matching, search by associated component name<br>InstanceId - exact match, filter by host instance ID<br>MachineName - fuzzy matching, search by host name<br>MachineIp - fuzzy matching, search by host IP<br>OsType - exact match, filter by OS type: linux/windows<br>SupportAutoFix - exact match, filter by whether automatic fixing is supported: 0-unsupported 1-supported<br>Tag - exact match, filter by asset tag<br>AppId - exact match, filter by associated account</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filtering Conditions<br>Supported Filter.Name:<br>Keyword - fuzzy matching, search by asset ID, asset name<br>ComponentName - fuzzy matching, search by associated component name<br>InstanceId - exact match, filter by host instance ID<br>MachineName - fuzzy matching, search by host name<br>MachineIp - fuzzy matching, search by host IP<br>OsType - exact match, filter by OS type: linux/windows<br>SupportAutoFix - exact match, filter by whether automatic fixing is supported: 0-unsupported 1-supported<br>Tag - exact match, filter by asset tag<br>AppId - exact match, filter by associated account</p>
     * @param Filters <p>Filtering Conditions<br>Supported Filter.Name:<br>Keyword - fuzzy matching, search by asset ID, asset name<br>ComponentName - fuzzy matching, search by associated component name<br>InstanceId - exact match, filter by host instance ID<br>MachineName - fuzzy matching, search by host name<br>MachineIp - fuzzy matching, search by host IP<br>OsType - exact match, filter by OS type: linux/windows<br>SupportAutoFix - exact match, filter by whether automatic fixing is supported: 0-unsupported 1-supported<br>Tag - exact match, filter by asset tag<br>AppId - exact match, filter by associated account</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeVulFixableMachineListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixableMachineListRequest(DescribeVulFixableMachineListRequest source) {
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

