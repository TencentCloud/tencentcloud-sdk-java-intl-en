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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserSignatureRuleRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Main class ID
    */
    @SerializedName("MainClassID")
    @Expose
    private String MainClassID;

    /**
    * Main class switch 0=off, 1=on, 2=alarm only
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * List of rules issued for modification
    */
    @SerializedName("RuleID")
    @Expose
    private ReqUserRule [] RuleID;

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
     * Get Main class ID 
     * @return MainClassID Main class ID
     */
    public String getMainClassID() {
        return this.MainClassID;
    }

    /**
     * Set Main class ID
     * @param MainClassID Main class ID
     */
    public void setMainClassID(String MainClassID) {
        this.MainClassID = MainClassID;
    }

    /**
     * Get Main class switch 0=off, 1=on, 2=alarm only 
     * @return Status Main class switch 0=off, 1=on, 2=alarm only
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Main class switch 0=off, 1=on, 2=alarm only
     * @param Status Main class switch 0=off, 1=on, 2=alarm only
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get List of rules issued for modification 
     * @return RuleID List of rules issued for modification
     */
    public ReqUserRule [] getRuleID() {
        return this.RuleID;
    }

    /**
     * Set List of rules issued for modification
     * @param RuleID List of rules issued for modification
     */
    public void setRuleID(ReqUserRule [] RuleID) {
        this.RuleID = RuleID;
    }

    public ModifyUserSignatureRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserSignatureRuleRequest(ModifyUserSignatureRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.MainClassID != null) {
            this.MainClassID = new String(source.MainClassID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RuleID != null) {
            this.RuleID = new ReqUserRule[source.RuleID.length];
            for (int i = 0; i < source.RuleID.length; i++) {
                this.RuleID[i] = new ReqUserRule(source.RuleID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "MainClassID", this.MainClassID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "RuleID.", this.RuleID);

    }
}

