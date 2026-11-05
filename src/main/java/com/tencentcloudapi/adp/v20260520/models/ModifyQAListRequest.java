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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQAListRequest extends AbstractModel {

    /**
    * <p>ID of the knowledge base it belongs to</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>List of QA IDs to be modified (quantity: 1-20)</p>
    */
    @SerializedName("QaIdList")
    @Expose
    private String [] QaIdList;

    /**
    * <p>Category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>Expiration policy (validity time and behavior after the validity period expires)</p>
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>Whether to adopt (verification passed)</p>
    */
    @SerializedName("IsAccepted")
    @Expose
    private Boolean IsAccepted;

    /**
    * <p>Applicable scope (tag condition list).</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentityList LabelRefList;

    /**
     * Get <p>ID of the knowledge base it belongs to</p> 
     * @return KbId <p>ID of the knowledge base it belongs to</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>ID of the knowledge base it belongs to</p>
     * @param KbId <p>ID of the knowledge base it belongs to</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>List of QA IDs to be modified (quantity: 1-20)</p> 
     * @return QaIdList <p>List of QA IDs to be modified (quantity: 1-20)</p>
     */
    public String [] getQaIdList() {
        return this.QaIdList;
    }

    /**
     * Set <p>List of QA IDs to be modified (quantity: 1-20)</p>
     * @param QaIdList <p>List of QA IDs to be modified (quantity: 1-20)</p>
     */
    public void setQaIdList(String [] QaIdList) {
        this.QaIdList = QaIdList;
    }

    /**
     * Get <p>Category ID</p> 
     * @return CategoryId <p>Category ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category ID</p>
     * @param CategoryId <p>Category ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>Effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>Effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>Effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>Expiration policy (validity time and behavior after the validity period expires)</p> 
     * @return ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     * @param ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>Whether to adopt (verification passed)</p> 
     * @return IsAccepted <p>Whether to adopt (verification passed)</p>
     */
    public Boolean getIsAccepted() {
        return this.IsAccepted;
    }

    /**
     * Set <p>Whether to adopt (verification passed)</p>
     * @param IsAccepted <p>Whether to adopt (verification passed)</p>
     */
    public void setIsAccepted(Boolean IsAccepted) {
        this.IsAccepted = IsAccepted;
    }

    /**
     * Get <p>Applicable scope (tag condition list).</p> 
     * @return LabelRefList <p>Applicable scope (tag condition list).</p>
     */
    public LabelRefIdentityList getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>Applicable scope (tag condition list).</p>
     * @param LabelRefList <p>Applicable scope (tag condition list).</p>
     */
    public void setLabelRefList(LabelRefIdentityList LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    public ModifyQAListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQAListRequest(ModifyQAListRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.QaIdList != null) {
            this.QaIdList = new String[source.QaIdList.length];
            for (int i = 0; i < source.QaIdList.length; i++) {
                this.QaIdList[i] = new String(source.QaIdList[i]);
            }
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.IsAccepted != null) {
            this.IsAccepted = new Boolean(source.IsAccepted);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentityList(source.LabelRefList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamArraySimple(map, prefix + "QaIdList.", this.QaIdList);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamSimple(map, prefix + "IsAccepted", this.IsAccepted);
        this.setParamObj(map, prefix + "LabelRefList.", this.LabelRefList);

    }
}

