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

public class DescribeScreenMachinesRequest extends AbstractModel {

    /**
    * Host region
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Private IP address or host alias
    */
    @SerializedName("MachineIpOrAlias")
    @Expose
    private String MachineIpOrAlias;

    /**
    * Risky host type. 0: all types; 1: risky host; 2: host with potential risks; 3: host that is shut down or offline; 4: host with no risk.
    */
    @SerializedName("SecurityStatus")
    @Expose
    private Long SecurityStatus;

    /**
     * Get Host region 
     * @return MachineRegion Host region
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Host region
     * @param MachineRegion Host region
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Private IP address or host alias 
     * @return MachineIpOrAlias Private IP address or host alias
     */
    public String getMachineIpOrAlias() {
        return this.MachineIpOrAlias;
    }

    /**
     * Set Private IP address or host alias
     * @param MachineIpOrAlias Private IP address or host alias
     */
    public void setMachineIpOrAlias(String MachineIpOrAlias) {
        this.MachineIpOrAlias = MachineIpOrAlias;
    }

    /**
     * Get Risky host type. 0: all types; 1: risky host; 2: host with potential risks; 3: host that is shut down or offline; 4: host with no risk. 
     * @return SecurityStatus Risky host type. 0: all types; 1: risky host; 2: host with potential risks; 3: host that is shut down or offline; 4: host with no risk.
     */
    public Long getSecurityStatus() {
        return this.SecurityStatus;
    }

    /**
     * Set Risky host type. 0: all types; 1: risky host; 2: host with potential risks; 3: host that is shut down or offline; 4: host with no risk.
     * @param SecurityStatus Risky host type. 0: all types; 1: risky host; 2: host with potential risks; 3: host that is shut down or offline; 4: host with no risk.
     */
    public void setSecurityStatus(Long SecurityStatus) {
        this.SecurityStatus = SecurityStatus;
    }

    public DescribeScreenMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenMachinesRequest(DescribeScreenMachinesRequest source) {
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.MachineIpOrAlias != null) {
            this.MachineIpOrAlias = new String(source.MachineIpOrAlias);
        }
        if (source.SecurityStatus != null) {
            this.SecurityStatus = new Long(source.SecurityStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineIpOrAlias", this.MachineIpOrAlias);
        this.setParamSimple(map, prefix + "SecurityStatus", this.SecurityStatus);

    }
}

