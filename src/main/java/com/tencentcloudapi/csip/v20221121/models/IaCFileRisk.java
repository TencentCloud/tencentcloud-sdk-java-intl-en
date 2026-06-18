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

public class IaCFileRisk extends AbstractModel {

    /**
    * <p>Risk level (0: low-risk, 1: medium-risk, 2: high-risk, 3: critical)</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>Row count of risk location</p>
    */
    @SerializedName("Line")
    @Expose
    private Long Line;

    /**
    * <p>rule name</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Problem description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Repair recommendation</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get <p>Risk level (0: low-risk, 1: medium-risk, 2: high-risk, 3: critical)</p> 
     * @return Level <p>Risk level (0: low-risk, 1: medium-risk, 2: high-risk, 3: critical)</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Risk level (0: low-risk, 1: medium-risk, 2: high-risk, 3: critical)</p>
     * @param Level <p>Risk level (0: low-risk, 1: medium-risk, 2: high-risk, 3: critical)</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Row count of risk location</p> 
     * @return Line <p>Row count of risk location</p>
     */
    public Long getLine() {
        return this.Line;
    }

    /**
     * Set <p>Row count of risk location</p>
     * @param Line <p>Row count of risk location</p>
     */
    public void setLine(Long Line) {
        this.Line = Line;
    }

    /**
     * Get <p>rule name</p> 
     * @return RuleName <p>rule name</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>rule name</p>
     * @param RuleName <p>rule name</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Problem description</p> 
     * @return Description <p>Problem description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Problem description</p>
     * @param Description <p>Problem description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Repair recommendation</p> 
     * @return Suggestion <p>Repair recommendation</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>Repair recommendation</p>
     * @param Suggestion <p>Repair recommendation</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public IaCFileRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IaCFileRisk(IaCFileRisk source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Line != null) {
            this.Line = new Long(source.Line);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

