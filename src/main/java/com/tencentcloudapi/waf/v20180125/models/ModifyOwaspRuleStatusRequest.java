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

public class ModifyOwaspRuleStatusRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * Specifies whether to select all.
    */
    @SerializedName("SelectAll")
    @Expose
    private Boolean SelectAll;

    /**
    * Rule ID list
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * If reverse requires the input of data type.
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Reason for modification. valid values: 0: none (compatibility record is empty). 1: avoid false positives due to business characteristics. 2: reporting of rule-based false positives. 3: gray release of core business rules. 4: others.
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

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
     * Get Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only). 
     * @return RuleStatus Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     * @param RuleStatus Rule switch. valid values: 0 (disabled), 1 (enabled), 2 (observation only).
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get Specifies whether to select all. 
     * @return SelectAll Specifies whether to select all.
     */
    public Boolean getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set Specifies whether to select all.
     * @param SelectAll Specifies whether to select all.
     */
    public void setSelectAll(Boolean SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get Rule ID list 
     * @return RuleIDs Rule ID list
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set Rule ID list
     * @param RuleIDs Rule ID list
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get If reverse requires the input of data type. 
     * @return TypeId If reverse requires the input of data type.
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set If reverse requires the input of data type.
     * @param TypeId If reverse requires the input of data type.
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Reason for modification. valid values: 0: none (compatibility record is empty). 1: avoid false positives due to business characteristics. 2: reporting of rule-based false positives. 3: gray release of core business rules. 4: others. 
     * @return Reason Reason for modification. valid values: 0: none (compatibility record is empty). 1: avoid false positives due to business characteristics. 2: reporting of rule-based false positives. 3: gray release of core business rules. 4: others.
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for modification. valid values: 0: none (compatibility record is empty). 1: avoid false positives due to business characteristics. 2: reporting of rule-based false positives. 3: gray release of core business rules. 4: others.
     * @param Reason Reason for modification. valid values: 0: none (compatibility record is empty). 1: avoid false positives due to business characteristics. 2: reporting of rule-based false positives. 3: gray release of core business rules. 4: others.
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public ModifyOwaspRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspRuleStatusRequest(ModifyOwaspRuleStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Boolean(source.SelectAll);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

