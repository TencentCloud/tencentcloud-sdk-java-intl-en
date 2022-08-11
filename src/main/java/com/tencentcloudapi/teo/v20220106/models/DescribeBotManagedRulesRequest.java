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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotManagedRulesRequest extends AbstractModel{

    /**
    * Top-level domain name
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Subdomain name/layer-4 proxy
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Total number of pages
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of rules per page
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * Rule type. Values: `idcid`, `sipbot` and `uabot`. All rules will be returned if this field is not specified.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get Top-level domain name 
     * @return ZoneId Top-level domain name
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Top-level domain name
     * @param ZoneId Top-level domain name
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Subdomain name/layer-4 proxy 
     * @return Entity Subdomain name/layer-4 proxy
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Subdomain name/layer-4 proxy
     * @param Entity Subdomain name/layer-4 proxy
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Total number of pages 
     * @return Page Total number of pages
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Total number of pages
     * @param Page Total number of pages
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of rules per page 
     * @return PerPage Number of rules per page
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set Number of rules per page
     * @param PerPage Number of rules per page
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get Rule type. Values: `idcid`, `sipbot` and `uabot`. All rules will be returned if this field is not specified. 
     * @return RuleType Rule type. Values: `idcid`, `sipbot` and `uabot`. All rules will be returned if this field is not specified.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule type. Values: `idcid`, `sipbot` and `uabot`. All rules will be returned if this field is not specified.
     * @param RuleType Rule type. Values: `idcid`, `sipbot` and `uabot`. All rules will be returned if this field is not specified.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    public DescribeBotManagedRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotManagedRulesRequest(DescribeBotManagedRulesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

