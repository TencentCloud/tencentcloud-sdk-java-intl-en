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

public class DocImportSpec extends AbstractModel {

    /**
    * <p>File ID (file identifier obtained through the file management service, required)</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>Ownership category ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>List of rules regarding repeated files</p>
    */
    @SerializedName("DeDuplicateStrategyList")
    @Expose
    private DeDuplicateStrategy [] DeDuplicateStrategyList;

    /**
    * <p>Knowledge effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
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
    * <p>Applicable scope (tag condition).</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentity [] LabelRefList;

    /**
    * <p>Parsing configuration (split rules, content filtering, etc.)</p>
    */
    @SerializedName("ParseConfig")
    @Expose
    private DocParseConfig ParseConfig;

    /**
    * <p>Switch configuration</p>
    */
    @SerializedName("Switch")
    @Expose
    private DocSwitch Switch;

    /**
    * <p>Update cycle</p>
    */
    @SerializedName("UpdatePeriod")
    @Expose
    private DocUpdatePeriod UpdatePeriod;

    /**
    * <p>User access configuration</p>
    */
    @SerializedName("UserAccessConfig")
    @Expose
    private UserAccessConfig UserAccessConfig;

    /**
     * Get <p>File ID (file identifier obtained through the file management service, required)</p> 
     * @return FileId <p>File ID (file identifier obtained through the file management service, required)</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>File ID (file identifier obtained through the file management service, required)</p>
     * @param FileId <p>File ID (file identifier obtained through the file management service, required)</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
     * Get <p>List of rules regarding repeated files</p> 
     * @return DeDuplicateStrategyList <p>List of rules regarding repeated files</p>
     */
    public DeDuplicateStrategy [] getDeDuplicateStrategyList() {
        return this.DeDuplicateStrategyList;
    }

    /**
     * Set <p>List of rules regarding repeated files</p>
     * @param DeDuplicateStrategyList <p>List of rules regarding repeated files</p>
     */
    public void setDeDuplicateStrategyList(DeDuplicateStrategy [] DeDuplicateStrategyList) {
        this.DeDuplicateStrategyList = DeDuplicateStrategyList;
    }

    /**
     * Get <p>Knowledge effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>Knowledge effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>Knowledge effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>Knowledge effective scope<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>Disabled</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>Development domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>Release domain only</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>Global</td></tr></tbody></table></p>
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
     * Get <p>Applicable scope (tag condition).</p> 
     * @return LabelRefList <p>Applicable scope (tag condition).</p>
     */
    public LabelRefIdentity [] getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>Applicable scope (tag condition).</p>
     * @param LabelRefList <p>Applicable scope (tag condition).</p>
     */
    public void setLabelRefList(LabelRefIdentity [] LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>Parsing configuration (split rules, content filtering, etc.)</p> 
     * @return ParseConfig <p>Parsing configuration (split rules, content filtering, etc.)</p>
     */
    public DocParseConfig getParseConfig() {
        return this.ParseConfig;
    }

    /**
     * Set <p>Parsing configuration (split rules, content filtering, etc.)</p>
     * @param ParseConfig <p>Parsing configuration (split rules, content filtering, etc.)</p>
     */
    public void setParseConfig(DocParseConfig ParseConfig) {
        this.ParseConfig = ParseConfig;
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

    /**
     * Get <p>Update cycle</p> 
     * @return UpdatePeriod <p>Update cycle</p>
     */
    public DocUpdatePeriod getUpdatePeriod() {
        return this.UpdatePeriod;
    }

    /**
     * Set <p>Update cycle</p>
     * @param UpdatePeriod <p>Update cycle</p>
     */
    public void setUpdatePeriod(DocUpdatePeriod UpdatePeriod) {
        this.UpdatePeriod = UpdatePeriod;
    }

    /**
     * Get <p>User access configuration</p> 
     * @return UserAccessConfig <p>User access configuration</p>
     */
    public UserAccessConfig getUserAccessConfig() {
        return this.UserAccessConfig;
    }

    /**
     * Set <p>User access configuration</p>
     * @param UserAccessConfig <p>User access configuration</p>
     */
    public void setUserAccessConfig(UserAccessConfig UserAccessConfig) {
        this.UserAccessConfig = UserAccessConfig;
    }

    public DocImportSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocImportSpec(DocImportSpec source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.DeDuplicateStrategyList != null) {
            this.DeDuplicateStrategyList = new DeDuplicateStrategy[source.DeDuplicateStrategyList.length];
            for (int i = 0; i < source.DeDuplicateStrategyList.length; i++) {
                this.DeDuplicateStrategyList[i] = new DeDuplicateStrategy(source.DeDuplicateStrategyList[i]);
            }
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
            this.LabelRefList = new LabelRefIdentity[source.LabelRefList.length];
            for (int i = 0; i < source.LabelRefList.length; i++) {
                this.LabelRefList[i] = new LabelRefIdentity(source.LabelRefList[i]);
            }
        }
        if (source.ParseConfig != null) {
            this.ParseConfig = new DocParseConfig(source.ParseConfig);
        }
        if (source.Switch != null) {
            this.Switch = new DocSwitch(source.Switch);
        }
        if (source.UpdatePeriod != null) {
            this.UpdatePeriod = new DocUpdatePeriod(source.UpdatePeriod);
        }
        if (source.UserAccessConfig != null) {
            this.UserAccessConfig = new UserAccessConfig(source.UserAccessConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamArrayObj(map, prefix + "DeDuplicateStrategyList.", this.DeDuplicateStrategyList);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamObj(map, prefix + "ExternalLink.", this.ExternalLink);
        this.setParamArrayObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamObj(map, prefix + "ParseConfig.", this.ParseConfig);
        this.setParamObj(map, prefix + "Switch.", this.Switch);
        this.setParamObj(map, prefix + "UpdatePeriod.", this.UpdatePeriod);
        this.setParamObj(map, prefix + "UserAccessConfig.", this.UserAccessConfig);

    }
}

