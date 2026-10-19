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

public class CosIdentifyCategoryDetail extends AbstractModel {

    /**
    * <p>Category id</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * <p>Category name</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>Data item collection.</p>
    */
    @SerializedName("RuleSet")
    @Expose
    private CosIdentifyRuleDetail [] RuleSet;

    /**
     * Get <p>Category id</p> 
     * @return CategoryId <p>Category id</p>
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>Category id</p>
     * @param CategoryId <p>Category id</p>
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>Category name</p> 
     * @return CategoryName <p>Category name</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>Category name</p>
     * @param CategoryName <p>Category name</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>Data item collection.</p> 
     * @return RuleSet <p>Data item collection.</p>
     * @deprecated
     */
    @Deprecated
    public CosIdentifyRuleDetail [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * Set <p>Data item collection.</p>
     * @param RuleSet <p>Data item collection.</p>
     * @deprecated
     */
    @Deprecated
    public void setRuleSet(CosIdentifyRuleDetail [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    public CosIdentifyCategoryDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosIdentifyCategoryDetail(CosIdentifyCategoryDetail source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.RuleSet != null) {
            this.RuleSet = new CosIdentifyRuleDetail[source.RuleSet.length];
            for (int i = 0; i < source.RuleSet.length; i++) {
                this.RuleSet[i] = new CosIdentifyRuleDetail(source.RuleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);

    }
}

