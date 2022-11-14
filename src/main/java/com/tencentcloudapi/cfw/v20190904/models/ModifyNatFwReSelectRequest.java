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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatFwReSelectRequest extends AbstractModel{

    /**
    * Mode. 1: use existing; 0: create new
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Firewall instance ID
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * List of NAT gateways reconnected for the Using Existing mode. Only one of NatGwList and VpcList can be passed.
    */
    @SerializedName("NatGwList")
    @Expose
    private String [] NatGwList;

    /**
    * List of VPCs reconnected for the Create New mode. Only one of NatGwList and VpcList can be passed.
    */
    @SerializedName("VpcList")
    @Expose
    private String [] VpcList;

    /**
     * Get Mode. 1: use existing; 0: create new 
     * @return Mode Mode. 1: use existing; 0: create new
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Mode. 1: use existing; 0: create new
     * @param Mode Mode. 1: use existing; 0: create new
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Firewall instance ID 
     * @return CfwInstance Firewall instance ID
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set Firewall instance ID
     * @param CfwInstance Firewall instance ID
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get List of NAT gateways reconnected for the Using Existing mode. Only one of NatGwList and VpcList can be passed. 
     * @return NatGwList List of NAT gateways reconnected for the Using Existing mode. Only one of NatGwList and VpcList can be passed.
     */
    public String [] getNatGwList() {
        return this.NatGwList;
    }

    /**
     * Set List of NAT gateways reconnected for the Using Existing mode. Only one of NatGwList and VpcList can be passed.
     * @param NatGwList List of NAT gateways reconnected for the Using Existing mode. Only one of NatGwList and VpcList can be passed.
     */
    public void setNatGwList(String [] NatGwList) {
        this.NatGwList = NatGwList;
    }

    /**
     * Get List of VPCs reconnected for the Create New mode. Only one of NatGwList and VpcList can be passed. 
     * @return VpcList List of VPCs reconnected for the Create New mode. Only one of NatGwList and VpcList can be passed.
     */
    public String [] getVpcList() {
        return this.VpcList;
    }

    /**
     * Set List of VPCs reconnected for the Create New mode. Only one of NatGwList and VpcList can be passed.
     * @param VpcList List of VPCs reconnected for the Create New mode. Only one of NatGwList and VpcList can be passed.
     */
    public void setVpcList(String [] VpcList) {
        this.VpcList = VpcList;
    }

    public ModifyNatFwReSelectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwReSelectRequest(ModifyNatFwReSelectRequest source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.NatGwList != null) {
            this.NatGwList = new String[source.NatGwList.length];
            for (int i = 0; i < source.NatGwList.length; i++) {
                this.NatGwList[i] = new String(source.NatGwList[i]);
            }
        }
        if (source.VpcList != null) {
            this.VpcList = new String[source.VpcList.length];
            for (int i = 0; i < source.VpcList.length; i++) {
                this.VpcList[i] = new String(source.VpcList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArraySimple(map, prefix + "NatGwList.", this.NatGwList);
        this.setParamArraySimple(map, prefix + "VpcList.", this.VpcList);

    }
}

