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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanBaselineRequest extends AbstractModel {

    /**
    * Policy ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
    */
    @SerializedName("StrategyIdList")
    @Expose
    private Long [] StrategyIdList;

    /**
    * Baseline ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
    */
    @SerializedName("CategoryIdList")
    @Expose
    private Long [] CategoryIdList;

    /**
    * Detection item ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
    */
    @SerializedName("RuleIdList")
    @Expose
    private Long [] RuleIdList;

    /**
    * Not required when StrategyIdList is selected, but required in other cases.
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * Host UUID array
    */
    @SerializedName("UuidList")
    @Expose
    private String [] UuidList;

    /**
     * Get Policy ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.) 
     * @return StrategyIdList Policy ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public Long [] getStrategyIdList() {
        return this.StrategyIdList;
    }

    /**
     * Set Policy ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     * @param StrategyIdList Policy ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public void setStrategyIdList(Long [] StrategyIdList) {
        this.StrategyIdList = StrategyIdList;
    }

    /**
     * Get Baseline ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.) 
     * @return CategoryIdList Baseline ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public Long [] getCategoryIdList() {
        return this.CategoryIdList;
    }

    /**
     * Set Baseline ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     * @param CategoryIdList Baseline ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public void setCategoryIdList(Long [] CategoryIdList) {
        this.CategoryIdList = CategoryIdList;
    }

    /**
     * Get Detection item ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.) 
     * @return RuleIdList Detection item ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public Long [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set Detection item ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     * @param RuleIdList Detection item ID array (Either StrategyIdList, CategoryIdList, or RuleIdList must be selected.)
     */
    public void setRuleIdList(Long [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Get Not required when StrategyIdList is selected, but required in other cases. 
     * @return QuuidList Not required when StrategyIdList is selected, but required in other cases.
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set Not required when StrategyIdList is selected, but required in other cases.
     * @param QuuidList Not required when StrategyIdList is selected, but required in other cases.
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get Host UUID array 
     * @return UuidList Host UUID array
     */
    public String [] getUuidList() {
        return this.UuidList;
    }

    /**
     * Set Host UUID array
     * @param UuidList Host UUID array
     */
    public void setUuidList(String [] UuidList) {
        this.UuidList = UuidList;
    }

    public ScanBaselineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselineRequest(ScanBaselineRequest source) {
        if (source.StrategyIdList != null) {
            this.StrategyIdList = new Long[source.StrategyIdList.length];
            for (int i = 0; i < source.StrategyIdList.length; i++) {
                this.StrategyIdList[i] = new Long(source.StrategyIdList[i]);
            }
        }
        if (source.CategoryIdList != null) {
            this.CategoryIdList = new Long[source.CategoryIdList.length];
            for (int i = 0; i < source.CategoryIdList.length; i++) {
                this.CategoryIdList[i] = new Long(source.CategoryIdList[i]);
            }
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new Long[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new Long(source.RuleIdList[i]);
            }
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.UuidList != null) {
            this.UuidList = new String[source.UuidList.length];
            for (int i = 0; i < source.UuidList.length; i++) {
                this.UuidList[i] = new String(source.UuidList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StrategyIdList.", this.StrategyIdList);
        this.setParamArraySimple(map, prefix + "CategoryIdList.", this.CategoryIdList);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamArraySimple(map, prefix + "UuidList.", this.UuidList);

    }
}

