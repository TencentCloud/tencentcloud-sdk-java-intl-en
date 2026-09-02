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

public class DescribeDspmIdentifyRuleTestResultRequest extends AbstractModel {

    /**
    * <p>Rule type</p><p>Enumeration values:</p><ul><li>structured: Structured rule</li><li>unstructrued: Unstructured rule</li></ul>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>Rule content</p>
    */
    @SerializedName("RuleContent")
    @Expose
    private String RuleContent;

    /**
    * <p>Data item id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Structured test content</p>
    */
    @SerializedName("StructuredTestContent")
    @Expose
    private DspmIdentifyRuleStructuredTestItem [] StructuredTestContent;

    /**
    * <p>Unstructured test content</p>
    */
    @SerializedName("UnStructuredTestContent")
    @Expose
    private String UnStructuredTestContent;

    /**
    * <p>Operation source: empty/dspm=database risk monitoring entry, cos=object storage risk monitoring entry</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
     * Get <p>Rule type</p><p>Enumeration values:</p><ul><li>structured: Structured rule</li><li>unstructrued: Unstructured rule</li></ul> 
     * @return RuleType <p>Rule type</p><p>Enumeration values:</p><ul><li>structured: Structured rule</li><li>unstructrued: Unstructured rule</li></ul>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>Rule type</p><p>Enumeration values:</p><ul><li>structured: Structured rule</li><li>unstructrued: Unstructured rule</li></ul>
     * @param RuleType <p>Rule type</p><p>Enumeration values:</p><ul><li>structured: Structured rule</li><li>unstructrued: Unstructured rule</li></ul>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>Rule content</p> 
     * @return RuleContent <p>Rule content</p>
     */
    public String getRuleContent() {
        return this.RuleContent;
    }

    /**
     * Set <p>Rule content</p>
     * @param RuleContent <p>Rule content</p>
     */
    public void setRuleContent(String RuleContent) {
        this.RuleContent = RuleContent;
    }

    /**
     * Get <p>Data item id</p> 
     * @return RuleId <p>Data item id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Data item id</p>
     * @param RuleId <p>Data item id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get <p>Structured test content</p> 
     * @return StructuredTestContent <p>Structured test content</p>
     */
    public DspmIdentifyRuleStructuredTestItem [] getStructuredTestContent() {
        return this.StructuredTestContent;
    }

    /**
     * Set <p>Structured test content</p>
     * @param StructuredTestContent <p>Structured test content</p>
     */
    public void setStructuredTestContent(DspmIdentifyRuleStructuredTestItem [] StructuredTestContent) {
        this.StructuredTestContent = StructuredTestContent;
    }

    /**
     * Get <p>Unstructured test content</p> 
     * @return UnStructuredTestContent <p>Unstructured test content</p>
     */
    public String getUnStructuredTestContent() {
        return this.UnStructuredTestContent;
    }

    /**
     * Set <p>Unstructured test content</p>
     * @param UnStructuredTestContent <p>Unstructured test content</p>
     */
    public void setUnStructuredTestContent(String UnStructuredTestContent) {
        this.UnStructuredTestContent = UnStructuredTestContent;
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

    public DescribeDspmIdentifyRuleTestResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyRuleTestResultRequest(DescribeDspmIdentifyRuleTestResultRequest source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleContent != null) {
            this.RuleContent = new String(source.RuleContent);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.StructuredTestContent != null) {
            this.StructuredTestContent = new DspmIdentifyRuleStructuredTestItem[source.StructuredTestContent.length];
            for (int i = 0; i < source.StructuredTestContent.length; i++) {
                this.StructuredTestContent[i] = new DspmIdentifyRuleStructuredTestItem(source.StructuredTestContent[i]);
            }
        }
        if (source.UnStructuredTestContent != null) {
            this.UnStructuredTestContent = new String(source.UnStructuredTestContent);
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "RuleContent", this.RuleContent);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "StructuredTestContent.", this.StructuredTestContent);
        this.setParamSimple(map, prefix + "UnStructuredTestContent", this.UnStructuredTestContent);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);

    }
}

