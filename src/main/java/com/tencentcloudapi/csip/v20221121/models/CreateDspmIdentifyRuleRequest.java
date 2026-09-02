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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDspmIdentifyRuleRequest extends AbstractModel {

    /**
    * <p>Data item name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Data item description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Data item enablement status</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Structured rule</p>
    */
    @SerializedName("StructuredRule")
    @Expose
    private String StructuredRule;

    /**
    * <p>Unstructured rule</p>
    */
    @SerializedName("UnStructuredRule")
    @Expose
    private String UnStructuredRule;

    /**
    * <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
     * Get <p>Data item name.</p> 
     * @return Name <p>Data item name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Data item name.</p>
     * @param Name <p>Data item name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Data item description.</p> 
     * @return Description <p>Data item description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Data item description.</p>
     * @param Description <p>Data item description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Data item enablement status</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul> 
     * @return Status <p>Data item enablement status</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Data item enablement status</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     * @param Status <p>Data item enablement status</p><p>Enumeration values:</p><ul><li>0: disabled</li><li>1: enabled</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Structured rule</p> 
     * @return StructuredRule <p>Structured rule</p>
     */
    public String getStructuredRule() {
        return this.StructuredRule;
    }

    /**
     * Set <p>Structured rule</p>
     * @param StructuredRule <p>Structured rule</p>
     */
    public void setStructuredRule(String StructuredRule) {
        this.StructuredRule = StructuredRule;
    }

    /**
     * Get <p>Unstructured rule</p> 
     * @return UnStructuredRule <p>Unstructured rule</p>
     */
    public String getUnStructuredRule() {
        return this.UnStructuredRule;
    }

    /**
     * Set <p>Unstructured rule</p>
     * @param UnStructuredRule <p>Unstructured rule</p>
     */
    public void setUnStructuredRule(String UnStructuredRule) {
        this.UnStructuredRule = UnStructuredRule;
    }

    /**
     * Get <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p> 
     * @return OperationSource <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     */
    public String getOperationSource() {
        return this.OperationSource;
    }

    /**
     * Set <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     * @param OperationSource <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
     */
    public void setOperationSource(String OperationSource) {
        this.OperationSource = OperationSource;
    }

    public CreateDspmIdentifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmIdentifyRuleRequest(CreateDspmIdentifyRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StructuredRule != null) {
            this.StructuredRule = new String(source.StructuredRule);
        }
        if (source.UnStructuredRule != null) {
            this.UnStructuredRule = new String(source.UnStructuredRule);
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StructuredRule", this.StructuredRule);
        this.setParamSimple(map, prefix + "UnStructuredRule", this.UnStructuredRule);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);

    }
}

