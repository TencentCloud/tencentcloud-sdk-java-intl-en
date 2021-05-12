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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest extends AbstractModel{

    /**
    * The ID of the NAT gateway, such as `nat-df45454`.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The port forwarding rule of the source NAT gateway.
    */
    @SerializedName("SourceNatRule")
    @Expose
    private DestinationIpPortTranslationNatRule SourceNatRule;

    /**
    * The port forwarding rule of the destination NAT gateway.
    */
    @SerializedName("DestinationNatRule")
    @Expose
    private DestinationIpPortTranslationNatRule DestinationNatRule;

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
     * Get The port forwarding rule of the source NAT gateway. 
     * @return SourceNatRule The port forwarding rule of the source NAT gateway.
     */
    public DestinationIpPortTranslationNatRule getSourceNatRule() {
        return this.SourceNatRule;
    }

    /**
     * Set The port forwarding rule of the source NAT gateway.
     * @param SourceNatRule The port forwarding rule of the source NAT gateway.
     */
    public void setSourceNatRule(DestinationIpPortTranslationNatRule SourceNatRule) {
        this.SourceNatRule = SourceNatRule;
    }

    /**
     * Get The port forwarding rule of the destination NAT gateway. 
     * @return DestinationNatRule The port forwarding rule of the destination NAT gateway.
     */
    public DestinationIpPortTranslationNatRule getDestinationNatRule() {
        return this.DestinationNatRule;
    }

    /**
     * Set The port forwarding rule of the destination NAT gateway.
     * @param DestinationNatRule The port forwarding rule of the destination NAT gateway.
     */
    public void setDestinationNatRule(DestinationIpPortTranslationNatRule DestinationNatRule) {
        this.DestinationNatRule = DestinationNatRule;
    }

    public ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.SourceNatRule != null) {
            this.SourceNatRule = new DestinationIpPortTranslationNatRule(source.SourceNatRule);
        }
        if (source.DestinationNatRule != null) {
            this.DestinationNatRule = new DestinationIpPortTranslationNatRule(source.DestinationNatRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamObj(map, prefix + "SourceNatRule.", this.SourceNatRule);
        this.setParamObj(map, prefix + "DestinationNatRule.", this.DestinationNatRule);

    }
}

