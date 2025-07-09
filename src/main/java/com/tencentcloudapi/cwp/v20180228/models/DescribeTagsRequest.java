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

public class DescribeTagsRequest extends AbstractModel {

    /**
    * CVM type
<li>CVM: indicates Cloud Virtual Machine</li>
<li>BM: indicates Blackstone Physical Machine</li>
<li>ECM: indicates Edge Computing Server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: indicates hybrid CVMs</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Region where the machine is located, such as ap-guangzhou.
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Filter criteria
<li>Keywords - String - required: no - query by keywords (machine name/machine IP)</li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: uninstalled | SHUTDOWN: shut down)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Professional edition | BASIC_VERSION: Basic edition)</li>
<li>Risk - String - required: no - risky host (yes)</li>
<li>Os - String - required: no - operating system (DescribeMachineOsList API value)</li>
Each filtering criterion supports only one value; queries of multiple values with OR relationship are not supported.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get CVM type
<li>CVM: indicates Cloud Virtual Machine</li>
<li>BM: indicates Blackstone Physical Machine</li>
<li>ECM: indicates Edge Computing Server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: indicates hybrid CVMs</li> 
     * @return MachineType CVM type
<li>CVM: indicates Cloud Virtual Machine</li>
<li>BM: indicates Blackstone Physical Machine</li>
<li>ECM: indicates Edge Computing Server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: indicates hybrid CVMs</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set CVM type
<li>CVM: indicates Cloud Virtual Machine</li>
<li>BM: indicates Blackstone Physical Machine</li>
<li>ECM: indicates Edge Computing Server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: indicates hybrid CVMs</li>
     * @param MachineType CVM type
<li>CVM: indicates Cloud Virtual Machine</li>
<li>BM: indicates Blackstone Physical Machine</li>
<li>ECM: indicates Edge Computing Server</li>
<li>LH: indicates Tencent Cloud Lighthouse</li>
<li>Other: indicates hybrid CVMs</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Region where the machine is located, such as ap-guangzhou. 
     * @return MachineRegion Region where the machine is located, such as ap-guangzhou.
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Region where the machine is located, such as ap-guangzhou.
     * @param MachineRegion Region where the machine is located, such as ap-guangzhou.
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Filter criteria
<li>Keywords - String - required: no - query by keywords (machine name/machine IP)</li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: uninstalled | SHUTDOWN: shut down)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Professional edition | BASIC_VERSION: Basic edition)</li>
<li>Risk - String - required: no - risky host (yes)</li>
<li>Os - String - required: no - operating system (DescribeMachineOsList API value)</li>
Each filtering criterion supports only one value; queries of multiple values with OR relationship are not supported.</li> 
     * @return Filters Filter criteria
<li>Keywords - String - required: no - query by keywords (machine name/machine IP)</li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: uninstalled | SHUTDOWN: shut down)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Professional edition | BASIC_VERSION: Basic edition)</li>
<li>Risk - String - required: no - risky host (yes)</li>
<li>Os - String - required: no - operating system (DescribeMachineOsList API value)</li>
Each filtering criterion supports only one value; queries of multiple values with OR relationship are not supported.</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria
<li>Keywords - String - required: no - query by keywords (machine name/machine IP)</li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: uninstalled | SHUTDOWN: shut down)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Professional edition | BASIC_VERSION: Basic edition)</li>
<li>Risk - String - required: no - risky host (yes)</li>
<li>Os - String - required: no - operating system (DescribeMachineOsList API value)</li>
Each filtering criterion supports only one value; queries of multiple values with OR relationship are not supported.</li>
     * @param Filters Filter criteria
<li>Keywords - String - required: no - query by keywords (machine name/machine IP)</li>
<li>Status - String - required: no - client online status (OFFLINE: offline | ONLINE: online | UNINSTALLED: uninstalled | SHUTDOWN: shut down)</li>
<li>Version - String - required: no - current protection version (PRO_VERSION: Professional edition | BASIC_VERSION: Basic edition)</li>
<li>Risk - String - required: no - risky host (yes)</li>
<li>Os - String - required: no - operating system (DescribeMachineOsList API value)</li>
Each filtering criterion supports only one value; queries of multiple values with OR relationship are not supported.</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagsRequest(DescribeTagsRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

