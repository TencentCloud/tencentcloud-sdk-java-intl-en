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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAggregateConfigRuleEvaluationResultsRequest extends AbstractModel {

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("ConfigRuleId")
    @Expose
    private String ConfigRuleId;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Current page.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Account group ID.</p>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * <p>Type.</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * <p>Evaluation result. Valid values: COMPLIANT and NON_COMPLIANT.</p>
    */
    @SerializedName("ComplianceType")
    @Expose
    private String [] ComplianceType;

    /**
    * <p>Resource owner ID.</p>
    */
    @SerializedName("ResourceOwnerId")
    @Expose
    private Long ResourceOwnerId;

    /**
    * <p>Filtered resource owner UIN collection.</p>
    */
    @SerializedName("ResourceOwnerIds")
    @Expose
    private Long [] ResourceOwnerIds;

    /**
     * Get <p>Rule ID.</p> 
     * @return ConfigRuleId <p>Rule ID.</p>
     */
    public String getConfigRuleId() {
        return this.ConfigRuleId;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param ConfigRuleId <p>Rule ID.</p>
     */
    public void setConfigRuleId(String ConfigRuleId) {
        this.ConfigRuleId = ConfigRuleId;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Limit <p>Offset.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Offset.</p>
     * @param Limit <p>Offset.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Current page.</p> 
     * @return Offset <p>Current page.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Current page.</p>
     * @param Offset <p>Current page.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Account group ID.</p> 
     * @return AccountGroupId <p>Account group ID.</p>
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>Account group ID.</p>
     * @param AccountGroupId <p>Account group ID.</p>
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>Type.</p> 
     * @return ResourceType <p>Type.</p>
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Type.</p>
     * @param ResourceType <p>Type.</p>
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Evaluation result. Valid values: COMPLIANT and NON_COMPLIANT.</p> 
     * @return ComplianceType <p>Evaluation result. Valid values: COMPLIANT and NON_COMPLIANT.</p>
     */
    public String [] getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set <p>Evaluation result. Valid values: COMPLIANT and NON_COMPLIANT.</p>
     * @param ComplianceType <p>Evaluation result. Valid values: COMPLIANT and NON_COMPLIANT.</p>
     */
    public void setComplianceType(String [] ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get <p>Resource owner ID.</p> 
     * @return ResourceOwnerId <p>Resource owner ID.</p>
     */
    public Long getResourceOwnerId() {
        return this.ResourceOwnerId;
    }

    /**
     * Set <p>Resource owner ID.</p>
     * @param ResourceOwnerId <p>Resource owner ID.</p>
     */
    public void setResourceOwnerId(Long ResourceOwnerId) {
        this.ResourceOwnerId = ResourceOwnerId;
    }

    /**
     * Get <p>Filtered resource owner UIN collection.</p> 
     * @return ResourceOwnerIds <p>Filtered resource owner UIN collection.</p>
     */
    public Long [] getResourceOwnerIds() {
        return this.ResourceOwnerIds;
    }

    /**
     * Set <p>Filtered resource owner UIN collection.</p>
     * @param ResourceOwnerIds <p>Filtered resource owner UIN collection.</p>
     */
    public void setResourceOwnerIds(Long [] ResourceOwnerIds) {
        this.ResourceOwnerIds = ResourceOwnerIds;
    }

    public ListAggregateConfigRuleEvaluationResultsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateConfigRuleEvaluationResultsRequest(ListAggregateConfigRuleEvaluationResultsRequest source) {
        if (source.ConfigRuleId != null) {
            this.ConfigRuleId = new String(source.ConfigRuleId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String[source.ComplianceType.length];
            for (int i = 0; i < source.ComplianceType.length; i++) {
                this.ComplianceType[i] = new String(source.ComplianceType[i]);
            }
        }
        if (source.ResourceOwnerId != null) {
            this.ResourceOwnerId = new Long(source.ResourceOwnerId);
        }
        if (source.ResourceOwnerIds != null) {
            this.ResourceOwnerIds = new Long[source.ResourceOwnerIds.length];
            for (int i = 0; i < source.ResourceOwnerIds.length; i++) {
                this.ResourceOwnerIds[i] = new Long(source.ResourceOwnerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigRuleId", this.ConfigRuleId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ComplianceType.", this.ComplianceType);
        this.setParamSimple(map, prefix + "ResourceOwnerId", this.ResourceOwnerId);
        this.setParamArraySimple(map, prefix + "ResourceOwnerIds.", this.ResourceOwnerIds);

    }
}

