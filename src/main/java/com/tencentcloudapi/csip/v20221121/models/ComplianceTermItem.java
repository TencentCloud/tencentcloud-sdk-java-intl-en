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

public class ComplianceTermItem extends AbstractModel {

    /**
    * <p>Clause ID</p>
    */
    @SerializedName("TermID")
    @Expose
    private Long TermID;

    /**
    * <p>Clause description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Term name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Number of association rules</p>
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * <p>Clause principle</p>
    */
    @SerializedName("Rationale")
    @Expose
    private String Rationale;

    /**
    * <p>No.</p>
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
     * Get <p>Clause ID</p> 
     * @return TermID <p>Clause ID</p>
     */
    public Long getTermID() {
        return this.TermID;
    }

    /**
     * Set <p>Clause ID</p>
     * @param TermID <p>Clause ID</p>
     */
    public void setTermID(Long TermID) {
        this.TermID = TermID;
    }

    /**
     * Get <p>Clause description.</p> 
     * @return Description <p>Clause description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Clause description.</p>
     * @param Description <p>Clause description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Term name</p> 
     * @return Name <p>Term name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Term name</p>
     * @param Name <p>Term name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Number of association rules</p> 
     * @return RuleCount <p>Number of association rules</p>
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set <p>Number of association rules</p>
     * @param RuleCount <p>Number of association rules</p>
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get <p>Clause principle</p> 
     * @return Rationale <p>Clause principle</p>
     */
    public String getRationale() {
        return this.Rationale;
    }

    /**
     * Set <p>Clause principle</p>
     * @param Rationale <p>Clause principle</p>
     */
    public void setRationale(String Rationale) {
        this.Rationale = Rationale;
    }

    /**
     * Get <p>No.</p> 
     * @return Sn <p>No.</p>
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set <p>No.</p>
     * @param Sn <p>No.</p>
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    public ComplianceTermItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceTermItem(ComplianceTermItem source) {
        if (source.TermID != null) {
            this.TermID = new Long(source.TermID);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.Rationale != null) {
            this.Rationale = new String(source.Rationale);
        }
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TermID", this.TermID);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "Rationale", this.Rationale);
        this.setParamSimple(map, prefix + "Sn", this.Sn);

    }
}

