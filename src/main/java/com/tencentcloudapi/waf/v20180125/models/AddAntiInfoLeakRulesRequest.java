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

public class AddAntiInfoLeakRulesRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Actions: 0 (alarm), 1 (replace), 2 (only display the first four digits), 3 (only display the last four digits), 4 (block)
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * Policy details
    */
    @SerializedName("Strategies")
    @Expose
    private StrategyForAntiInfoLeak [] Strategies;

    /**
    * URL
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

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
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Actions: 0 (alarm), 1 (replace), 2 (only display the first four digits), 3 (only display the last four digits), 4 (block) 
     * @return ActionType Actions: 0 (alarm), 1 (replace), 2 (only display the first four digits), 3 (only display the last four digits), 4 (block)
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set Actions: 0 (alarm), 1 (replace), 2 (only display the first four digits), 3 (only display the last four digits), 4 (block)
     * @param ActionType Actions: 0 (alarm), 1 (replace), 2 (only display the first four digits), 3 (only display the last four digits), 4 (block)
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Policy details 
     * @return Strategies Policy details
     */
    public StrategyForAntiInfoLeak [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set Policy details
     * @param Strategies Policy details
     */
    public void setStrategies(StrategyForAntiInfoLeak [] Strategies) {
        this.Strategies = Strategies;
    }

    /**
     * Get URL 
     * @return Uri URL
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set URL
     * @param Uri URL
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    public AddAntiInfoLeakRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAntiInfoLeakRulesRequest(AddAntiInfoLeakRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.Strategies != null) {
            this.Strategies = new StrategyForAntiInfoLeak[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new StrategyForAntiInfoLeak(source.Strategies[i]);
            }
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);
        this.setParamSimple(map, prefix + "Uri", this.Uri);

    }
}

