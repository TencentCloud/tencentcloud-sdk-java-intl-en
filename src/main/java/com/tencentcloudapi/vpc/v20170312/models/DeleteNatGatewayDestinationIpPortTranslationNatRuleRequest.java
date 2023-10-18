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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest extends AbstractModel {

    /**
    * The ID of the NAT gateway, such as `nat-df45454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The port forwarding rules of the NAT gateway.
    */
    @SerializedName("DestinationIpPortTranslationNatRules")
    @Expose
    private DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRules;

    /**
     * Get The ID of the NAT gateway, such as `nat-df45454`. 
     * @return NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The ID of the NAT gateway, such as `nat-df45454`.
     * @param NatGatewayId The ID of the NAT gateway, such as `nat-df45454`.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get The port forwarding rules of the NAT gateway. 
     * @return DestinationIpPortTranslationNatRules The port forwarding rules of the NAT gateway.
     */
    public DestinationIpPortTranslationNatRule [] getDestinationIpPortTranslationNatRules() {
        return this.DestinationIpPortTranslationNatRules;
    }

    /**
     * Set The port forwarding rules of the NAT gateway.
     * @param DestinationIpPortTranslationNatRules The port forwarding rules of the NAT gateway.
     */
    public void setDestinationIpPortTranslationNatRules(DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRules) {
        this.DestinationIpPortTranslationNatRules = DestinationIpPortTranslationNatRules;
    }

    public DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.DestinationIpPortTranslationNatRules != null) {
            this.DestinationIpPortTranslationNatRules = new DestinationIpPortTranslationNatRule[source.DestinationIpPortTranslationNatRules.length];
            for (int i = 0; i < source.DestinationIpPortTranslationNatRules.length; i++) {
                this.DestinationIpPortTranslationNatRules[i] = new DestinationIpPortTranslationNatRule(source.DestinationIpPortTranslationNatRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamArrayObj(map, prefix + "DestinationIpPortTranslationNatRules.", this.DestinationIpPortTranslationNatRules);

    }
}

