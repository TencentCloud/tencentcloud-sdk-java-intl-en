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

public class DeleteIpAccessControlV2Request extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule ID list. Batch deletion is supported. This parameter does not need to be specified when DeleteAll is true.
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * Whether to delete all IP blocklists/allowlists under the corresponding domain name. true: delete all lists; false: delete only the specified lists. Batch protection is not supported.
    */
    @SerializedName("DeleteAll")
    @Expose
    private Boolean DeleteAll;

    /**
    * batch: indicates batch protection IP allowlists/blocklists.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * IP blocklist/allowlist type. 40: IP allowlist; 42: IP blocklist. This parameter should be passed in when DeleteAll is true.
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

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
     * Get Rule ID list. Batch deletion is supported. This parameter does not need to be specified when DeleteAll is true. 
     * @return RuleIds Rule ID list. Batch deletion is supported. This parameter does not need to be specified when DeleteAll is true.
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set Rule ID list. Batch deletion is supported. This parameter does not need to be specified when DeleteAll is true.
     * @param RuleIds Rule ID list. Batch deletion is supported. This parameter does not need to be specified when DeleteAll is true.
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get Whether to delete all IP blocklists/allowlists under the corresponding domain name. true: delete all lists; false: delete only the specified lists. Batch protection is not supported. 
     * @return DeleteAll Whether to delete all IP blocklists/allowlists under the corresponding domain name. true: delete all lists; false: delete only the specified lists. Batch protection is not supported.
     */
    public Boolean getDeleteAll() {
        return this.DeleteAll;
    }

    /**
     * Set Whether to delete all IP blocklists/allowlists under the corresponding domain name. true: delete all lists; false: delete only the specified lists. Batch protection is not supported.
     * @param DeleteAll Whether to delete all IP blocklists/allowlists under the corresponding domain name. true: delete all lists; false: delete only the specified lists. Batch protection is not supported.
     */
    public void setDeleteAll(Boolean DeleteAll) {
        this.DeleteAll = DeleteAll;
    }

    /**
     * Get batch: indicates batch protection IP allowlists/blocklists. 
     * @return SourceType batch: indicates batch protection IP allowlists/blocklists.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set batch: indicates batch protection IP allowlists/blocklists.
     * @param SourceType batch: indicates batch protection IP allowlists/blocklists.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get IP blocklist/allowlist type. 40: IP allowlist; 42: IP blocklist. This parameter should be passed in when DeleteAll is true. 
     * @return ActionType IP blocklist/allowlist type. 40: IP allowlist; 42: IP blocklist. This parameter should be passed in when DeleteAll is true.
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set IP blocklist/allowlist type. 40: IP allowlist; 42: IP blocklist. This parameter should be passed in when DeleteAll is true.
     * @param ActionType IP blocklist/allowlist type. 40: IP allowlist; 42: IP blocklist. This parameter should be passed in when DeleteAll is true.
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    public DeleteIpAccessControlV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIpAccessControlV2Request(DeleteIpAccessControlV2Request source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.DeleteAll != null) {
            this.DeleteAll = new Boolean(source.DeleteAll);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "DeleteAll", this.DeleteAll);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

