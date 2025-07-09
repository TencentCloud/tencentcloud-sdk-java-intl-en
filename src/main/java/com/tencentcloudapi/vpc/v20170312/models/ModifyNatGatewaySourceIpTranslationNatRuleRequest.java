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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatGatewaySourceIpTranslationNatRuleRequest extends AbstractModel {

    /**
    * The ID of the NAT Gateway, such as `nat-df453454`
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * The SNAT forwarding rule of the NAT Gateway
    */
    @SerializedName("SourceIpTranslationNatRule")
    @Expose
    private SourceIpTranslationNatRule SourceIpTranslationNatRule;

    /**
     * Get The ID of the NAT Gateway, such as `nat-df453454` 
     * @return NatGatewayId The ID of the NAT Gateway, such as `nat-df453454`
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The ID of the NAT Gateway, such as `nat-df453454`
     * @param NatGatewayId The ID of the NAT Gateway, such as `nat-df453454`
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get The SNAT forwarding rule of the NAT Gateway 
     * @return SourceIpTranslationNatRule The SNAT forwarding rule of the NAT Gateway
     */
    public SourceIpTranslationNatRule getSourceIpTranslationNatRule() {
        return this.SourceIpTranslationNatRule;
    }

    /**
     * Set The SNAT forwarding rule of the NAT Gateway
     * @param SourceIpTranslationNatRule The SNAT forwarding rule of the NAT Gateway
     */
    public void setSourceIpTranslationNatRule(SourceIpTranslationNatRule SourceIpTranslationNatRule) {
        this.SourceIpTranslationNatRule = SourceIpTranslationNatRule;
    }

    public ModifyNatGatewaySourceIpTranslationNatRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatGatewaySourceIpTranslationNatRuleRequest(ModifyNatGatewaySourceIpTranslationNatRuleRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.SourceIpTranslationNatRule != null) {
            this.SourceIpTranslationNatRule = new SourceIpTranslationNatRule(source.SourceIpTranslationNatRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamObj(map, prefix + "SourceIpTranslationNatRule.", this.SourceIpTranslationNatRule);

    }
}

