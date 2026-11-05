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

public class SkillReferenceGroup extends AbstractModel {

    /**
    * <p>Reference detail list under this type</p>
    */
    @SerializedName("ReferenceSummaryList")
    @Expose
    private SkillReferenceSummary [] ReferenceSummaryList;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>SKILL_REF_UNKNOWN</td> <td>0</td> <td>Placeholder</td> </tr> <tr> <td>SKILL_REF_OPENCLAW</td> <td>1</td> <td>openclaw</td> </tr> <tr> <td>SKILL_REF_AGENT</td> <td>2</td> <td>agent</td> </tr> <tr> <td>SKILL_REF_CORP_ASSISTANT</td> <td>3</td> <td>Business assistant</td> </tr> </tbody> </table>
    */
    @SerializedName("ReferenceType")
    @Expose
    private Long ReferenceType;

    /**
    * <p>Total number of references of this type</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get <p>Reference detail list under this type</p> 
     * @return ReferenceSummaryList <p>Reference detail list under this type</p>
     */
    public SkillReferenceSummary [] getReferenceSummaryList() {
        return this.ReferenceSummaryList;
    }

    /**
     * Set <p>Reference detail list under this type</p>
     * @param ReferenceSummaryList <p>Reference detail list under this type</p>
     */
    public void setReferenceSummaryList(SkillReferenceSummary [] ReferenceSummaryList) {
        this.ReferenceSummaryList = ReferenceSummaryList;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>SKILL_REF_UNKNOWN</td> <td>0</td> <td>Placeholder</td> </tr> <tr> <td>SKILL_REF_OPENCLAW</td> <td>1</td> <td>openclaw</td> </tr> <tr> <td>SKILL_REF_AGENT</td> <td>2</td> <td>agent</td> </tr> <tr> <td>SKILL_REF_CORP_ASSISTANT</td> <td>3</td> <td>Business assistant</td> </tr> </tbody> </table> 
     * @return ReferenceType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>SKILL_REF_UNKNOWN</td> <td>0</td> <td>Placeholder</td> </tr> <tr> <td>SKILL_REF_OPENCLAW</td> <td>1</td> <td>openclaw</td> </tr> <tr> <td>SKILL_REF_AGENT</td> <td>2</td> <td>agent</td> </tr> <tr> <td>SKILL_REF_CORP_ASSISTANT</td> <td>3</td> <td>Business assistant</td> </tr> </tbody> </table>
     */
    public Long getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>SKILL_REF_UNKNOWN</td> <td>0</td> <td>Placeholder</td> </tr> <tr> <td>SKILL_REF_OPENCLAW</td> <td>1</td> <td>openclaw</td> </tr> <tr> <td>SKILL_REF_AGENT</td> <td>2</td> <td>agent</td> </tr> <tr> <td>SKILL_REF_CORP_ASSISTANT</td> <td>3</td> <td>Business assistant</td> </tr> </tbody> </table>
     * @param ReferenceType <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>SKILL_REF_UNKNOWN</td> <td>0</td> <td>Placeholder</td> </tr> <tr> <td>SKILL_REF_OPENCLAW</td> <td>1</td> <td>openclaw</td> </tr> <tr> <td>SKILL_REF_AGENT</td> <td>2</td> <td>agent</td> </tr> <tr> <td>SKILL_REF_CORP_ASSISTANT</td> <td>3</td> <td>Business assistant</td> </tr> </tbody> </table>
     */
    public void setReferenceType(Long ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>Total number of references of this type</p> 
     * @return TotalCount <p>Total number of references of this type</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of references of this type</p>
     * @param TotalCount <p>Total number of references of this type</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public SkillReferenceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillReferenceGroup(SkillReferenceGroup source) {
        if (source.ReferenceSummaryList != null) {
            this.ReferenceSummaryList = new SkillReferenceSummary[source.ReferenceSummaryList.length];
            for (int i = 0; i < source.ReferenceSummaryList.length; i++) {
                this.ReferenceSummaryList[i] = new SkillReferenceSummary(source.ReferenceSummaryList[i]);
            }
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new Long(source.ReferenceType);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReferenceSummaryList.", this.ReferenceSummaryList);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

