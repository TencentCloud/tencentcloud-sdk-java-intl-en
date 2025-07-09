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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatFwVpcDnsSwitchRequest extends AbstractModel {

    /**
    * NAT firewall ID
    */
    @SerializedName("NatFwInsId")
    @Expose
    private String NatFwInsId;

    /**
    * DNS toggle list
    */
    @SerializedName("DnsVpcSwitchLst")
    @Expose
    private DnsVpcSwitch [] DnsVpcSwitchLst;

    /**
     * Get NAT firewall ID 
     * @return NatFwInsId NAT firewall ID
     */
    public String getNatFwInsId() {
        return this.NatFwInsId;
    }

    /**
     * Set NAT firewall ID
     * @param NatFwInsId NAT firewall ID
     */
    public void setNatFwInsId(String NatFwInsId) {
        this.NatFwInsId = NatFwInsId;
    }

    /**
     * Get DNS toggle list 
     * @return DnsVpcSwitchLst DNS toggle list
     */
    public DnsVpcSwitch [] getDnsVpcSwitchLst() {
        return this.DnsVpcSwitchLst;
    }

    /**
     * Set DNS toggle list
     * @param DnsVpcSwitchLst DNS toggle list
     */
    public void setDnsVpcSwitchLst(DnsVpcSwitch [] DnsVpcSwitchLst) {
        this.DnsVpcSwitchLst = DnsVpcSwitchLst;
    }

    public ModifyNatFwVpcDnsSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwVpcDnsSwitchRequest(ModifyNatFwVpcDnsSwitchRequest source) {
        if (source.NatFwInsId != null) {
            this.NatFwInsId = new String(source.NatFwInsId);
        }
        if (source.DnsVpcSwitchLst != null) {
            this.DnsVpcSwitchLst = new DnsVpcSwitch[source.DnsVpcSwitchLst.length];
            for (int i = 0; i < source.DnsVpcSwitchLst.length; i++) {
                this.DnsVpcSwitchLst[i] = new DnsVpcSwitch(source.DnsVpcSwitchLst[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatFwInsId", this.NatFwInsId);
        this.setParamArrayObj(map, prefix + "DnsVpcSwitchLst.", this.DnsVpcSwitchLst);

    }
}

