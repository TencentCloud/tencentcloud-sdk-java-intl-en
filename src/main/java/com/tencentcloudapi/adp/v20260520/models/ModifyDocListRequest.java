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

public class ModifyDocListRequest extends AbstractModel {

    /**
    * <p>Document ID list to be modified (quantity: 1-20)</p>
    */
    @SerializedName("DocIdList")
    @Expose
    private String [] DocIdList;

    /**
    * <p>Knowledge base ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>Ownership category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>Application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
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
    * <p>External link</p>
    */
    @SerializedName("ExternalLink")
    @Expose
    private DocExternalLink ExternalLink;

    /**
    * <p>Tag list.</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentityList LabelRefList;

    /**
    * <p>Switch configuration</p>
    */
    @SerializedName("Switch")
    @Expose
    private DocSwitch Switch;

    /**
     * Get <p>Document ID list to be modified (quantity: 1-20)</p> 
     * @return DocIdList <p>Document ID list to be modified (quantity: 1-20)</p>
     */
    public String [] getDocIdList() {
        return this.DocIdList;
    }

    /**
     * Set <p>Document ID list to be modified (quantity: 1-20)</p>
     * @param DocIdList <p>Document ID list to be modified (quantity: 1-20)</p>
     */
    public void setDocIdList(String [] DocIdList) {
        this.DocIdList = DocIdList;
    }

    /**
     * Get <p>Knowledge base ID</p> 
     * @return KbId <p>Knowledge base ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>Knowledge base ID</p>
     * @param KbId <p>Knowledge base ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>Ownership category ID</p> 
     * @return CategoryId <p>Ownership category ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Ownership category ID</p>
     * @param CategoryId <p>Ownership category ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>Application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>Application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>Application scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
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
     * Get <p>External link</p> 
     * @return ExternalLink <p>External link</p>
     */
    public DocExternalLink getExternalLink() {
        return this.ExternalLink;
    }

    /**
     * Set <p>External link</p>
     * @param ExternalLink <p>External link</p>
     */
    public void setExternalLink(DocExternalLink ExternalLink) {
        this.ExternalLink = ExternalLink;
    }

    /**
     * Get <p>Tag list.</p> 
     * @return LabelRefList <p>Tag list.</p>
     */
    public LabelRefIdentityList getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>Tag list.</p>
     * @param LabelRefList <p>Tag list.</p>
     */
    public void setLabelRefList(LabelRefIdentityList LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>Switch configuration</p> 
     * @return Switch <p>Switch configuration</p>
     */
    public DocSwitch getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Switch configuration</p>
     * @param Switch <p>Switch configuration</p>
     */
    public void setSwitch(DocSwitch Switch) {
        this.Switch = Switch;
    }

    public ModifyDocListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDocListRequest(ModifyDocListRequest source) {
        if (source.DocIdList != null) {
            this.DocIdList = new String[source.DocIdList.length];
            for (int i = 0; i < source.DocIdList.length; i++) {
                this.DocIdList[i] = new String(source.DocIdList[i]);
            }
        }
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
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
        if (source.ExternalLink != null) {
            this.ExternalLink = new DocExternalLink(source.ExternalLink);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentityList(source.LabelRefList);
        }
        if (source.Switch != null) {
            this.Switch = new DocSwitch(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DocIdList.", this.DocIdList);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamObj(map, prefix + "ExternalLink.", this.ExternalLink);
        this.setParamObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamObj(map, prefix + "Switch.", this.Switch);

    }
}

