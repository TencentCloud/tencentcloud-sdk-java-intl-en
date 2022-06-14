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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateScdnDomainRequest extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * WAF configuration
    */
    @SerializedName("Waf")
    @Expose
    private ScdnWafConfig Waf;

    /**
    * Custom defense policy configuration
    */
    @SerializedName("Acl")
    @Expose
    private ScdnAclConfig Acl;

    /**
    * CC attack defense configurations. CC attack defense is enabled by default.
    */
    @SerializedName("CC")
    @Expose
    private ScdnConfig CC;

    /**
    * DDoS defense configuration. DDoS defense is enabled by default.
    */
    @SerializedName("Ddos")
    @Expose
    private ScdnDdosConfig Ddos;

    /**
    * Bot defense configuration
    */
    @SerializedName("Bot")
    @Expose
    private ScdnBotConfig Bot;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get WAF configuration 
     * @return Waf WAF configuration
     */
    public ScdnWafConfig getWaf() {
        return this.Waf;
    }

    /**
     * Set WAF configuration
     * @param Waf WAF configuration
     */
    public void setWaf(ScdnWafConfig Waf) {
        this.Waf = Waf;
    }

    /**
     * Get Custom defense policy configuration 
     * @return Acl Custom defense policy configuration
     */
    public ScdnAclConfig getAcl() {
        return this.Acl;
    }

    /**
     * Set Custom defense policy configuration
     * @param Acl Custom defense policy configuration
     */
    public void setAcl(ScdnAclConfig Acl) {
        this.Acl = Acl;
    }

    /**
     * Get CC attack defense configurations. CC attack defense is enabled by default. 
     * @return CC CC attack defense configurations. CC attack defense is enabled by default.
     */
    public ScdnConfig getCC() {
        return this.CC;
    }

    /**
     * Set CC attack defense configurations. CC attack defense is enabled by default.
     * @param CC CC attack defense configurations. CC attack defense is enabled by default.
     */
    public void setCC(ScdnConfig CC) {
        this.CC = CC;
    }

    /**
     * Get DDoS defense configuration. DDoS defense is enabled by default. 
     * @return Ddos DDoS defense configuration. DDoS defense is enabled by default.
     */
    public ScdnDdosConfig getDdos() {
        return this.Ddos;
    }

    /**
     * Set DDoS defense configuration. DDoS defense is enabled by default.
     * @param Ddos DDoS defense configuration. DDoS defense is enabled by default.
     */
    public void setDdos(ScdnDdosConfig Ddos) {
        this.Ddos = Ddos;
    }

    /**
     * Get Bot defense configuration 
     * @return Bot Bot defense configuration
     */
    public ScdnBotConfig getBot() {
        return this.Bot;
    }

    /**
     * Set Bot defense configuration
     * @param Bot Bot defense configuration
     */
    public void setBot(ScdnBotConfig Bot) {
        this.Bot = Bot;
    }

    public UpdateScdnDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateScdnDomainRequest(UpdateScdnDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Waf != null) {
            this.Waf = new ScdnWafConfig(source.Waf);
        }
        if (source.Acl != null) {
            this.Acl = new ScdnAclConfig(source.Acl);
        }
        if (source.CC != null) {
            this.CC = new ScdnConfig(source.CC);
        }
        if (source.Ddos != null) {
            this.Ddos = new ScdnDdosConfig(source.Ddos);
        }
        if (source.Bot != null) {
            this.Bot = new ScdnBotConfig(source.Bot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "Acl.", this.Acl);
        this.setParamObj(map, prefix + "CC.", this.CC);
        this.setParamObj(map, prefix + "Ddos.", this.Ddos);
        this.setParamObj(map, prefix + "Bot.", this.Bot);

    }
}

