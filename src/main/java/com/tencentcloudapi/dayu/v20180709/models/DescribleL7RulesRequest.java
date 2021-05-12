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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribleL7RulesRequest extends AbstractModel{

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Anti-DDoS instance ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Rule ID, which is optional. If this field is entered, the specified rule will be obtained
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

    /**
    * Number of entries per page. A value of 0 means no pagination
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Page start offset, whose value is (page number - 1) * number of entries per page
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Domain name search, which is optional. Enter it if you need to search for domain names
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Forwarding protocol search, which is optional. Valid values: [http, https, http/https]
    */
    @SerializedName("ProtocolList")
    @Expose
    private String [] ProtocolList;

    /**
    * Status search, which is optional. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Anti-DDoS instance ID 
     * @return Id Anti-DDoS instance ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Anti-DDoS instance ID
     * @param Id Anti-DDoS instance ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Rule ID, which is optional. If this field is entered, the specified rule will be obtained 
     * @return RuleIdList Rule ID, which is optional. If this field is entered, the specified rule will be obtained
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set Rule ID, which is optional. If this field is entered, the specified rule will be obtained
     * @param RuleIdList Rule ID, which is optional. If this field is entered, the specified rule will be obtained
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get Number of entries per page. A value of 0 means no pagination 
     * @return Limit Number of entries per page. A value of 0 means no pagination
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. A value of 0 means no pagination
     * @param Limit Number of entries per page. A value of 0 means no pagination
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Page start offset, whose value is (page number - 1) * number of entries per page 
     * @return Offset Page start offset, whose value is (page number - 1) * number of entries per page
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page start offset, whose value is (page number - 1) * number of entries per page
     * @param Offset Page start offset, whose value is (page number - 1) * number of entries per page
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Domain name search, which is optional. Enter it if you need to search for domain names 
     * @return Domain Domain name search, which is optional. Enter it if you need to search for domain names
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name search, which is optional. Enter it if you need to search for domain names
     * @param Domain Domain name search, which is optional. Enter it if you need to search for domain names
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Forwarding protocol search, which is optional. Valid values: [http, https, http/https] 
     * @return ProtocolList Forwarding protocol search, which is optional. Valid values: [http, https, http/https]
     */
    public String [] getProtocolList() {
        return this.ProtocolList;
    }

    /**
     * Set Forwarding protocol search, which is optional. Valid values: [http, https, http/https]
     * @param ProtocolList Forwarding protocol search, which is optional. Valid values: [http, https, http/https]
     */
    public void setProtocolList(String [] ProtocolList) {
        this.ProtocolList = ProtocolList;
    }

    /**
     * Get Status search, which is optional. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)] 
     * @return StatusList Status search, which is optional. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Status search, which is optional. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     * @param StatusList Status search, which is optional. Valid values: [0 (successfully configured rule), 1 (rule configuration taking effect), 2 (rule configuration failed), 3 (rule deletion taking effect), 5 (rule deletion failed), 6 (rule waiting for configuration), 7 (rule waiting for deletion), 8 (rule waiting for certificate configuration)]
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribleL7RulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribleL7RulesRequest(DescribleL7RulesRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new String[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new String(source.RuleIdList[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ProtocolList != null) {
            this.ProtocolList = new String[source.ProtocolList.length];
            for (int i = 0; i < source.ProtocolList.length; i++) {
                this.ProtocolList[i] = new String(source.ProtocolList[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new Long[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new Long(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "ProtocolList.", this.ProtocolList);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

