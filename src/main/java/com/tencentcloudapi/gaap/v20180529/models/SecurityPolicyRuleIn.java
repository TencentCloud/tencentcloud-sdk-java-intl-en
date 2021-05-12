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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyRuleIn extends AbstractModel{

    /**
    * Source IP or IP range of the request.
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * Policy: Allow (ACCEPT) or reject (DROP).
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Rule alias
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * Protocol: TCP or UDP. ALL indicates all protocols.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Target port. Formatting examples:
Single port: 80
Multiple ports: 80, 443
Consecutive ports: 3306-20000
All ports: ALL
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
     * Get Source IP or IP range of the request. 
     * @return SourceCidr Source IP or IP range of the request.
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set Source IP or IP range of the request.
     * @param SourceCidr Source IP or IP range of the request.
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get Policy: Allow (ACCEPT) or reject (DROP). 
     * @return Action Policy: Allow (ACCEPT) or reject (DROP).
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Policy: Allow (ACCEPT) or reject (DROP).
     * @param Action Policy: Allow (ACCEPT) or reject (DROP).
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Rule alias 
     * @return AliasName Rule alias
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Rule alias
     * @param AliasName Rule alias
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get Protocol: TCP or UDP. ALL indicates all protocols. 
     * @return Protocol Protocol: TCP or UDP. ALL indicates all protocols.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol: TCP or UDP. ALL indicates all protocols.
     * @param Protocol Protocol: TCP or UDP. ALL indicates all protocols.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Target port. Formatting examples:
Single port: 80
Multiple ports: 80, 443
Consecutive ports: 3306-20000
All ports: ALL 
     * @return DestPortRange Target port. Formatting examples:
Single port: 80
Multiple ports: 80, 443
Consecutive ports: 3306-20000
All ports: ALL
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set Target port. Formatting examples:
Single port: 80
Multiple ports: 80, 443
Consecutive ports: 3306-20000
All ports: ALL
     * @param DestPortRange Target port. Formatting examples:
Single port: 80
Multiple ports: 80, 443
Consecutive ports: 3306-20000
All ports: ALL
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

    public SecurityPolicyRuleIn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyRuleIn(SecurityPolicyRuleIn source) {
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DestPortRange != null) {
            this.DestPortRange = new String(source.DestPortRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);

    }
}

