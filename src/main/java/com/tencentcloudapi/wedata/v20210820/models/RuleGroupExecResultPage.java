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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupExecResultPage extends AbstractModel {

    /**
    * Record CountNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Rule Group Execution ResultNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Items")
    @Expose
    private RuleGroupExecResult [] Items;

    /**
     * Get Record CountNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TotalCount Record CountNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Record CountNote: This field may return null, indicating that no valid value can be obtained.
     * @param TotalCount Record CountNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Rule Group Execution ResultNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Items Rule Group Execution ResultNote: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupExecResult [] getItems() {
        return this.Items;
    }

    /**
     * Set Rule Group Execution ResultNote: This field may return null, indicating that no valid value can be obtained.
     * @param Items Rule Group Execution ResultNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setItems(RuleGroupExecResult [] Items) {
        this.Items = Items;
    }

    public RuleGroupExecResultPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupExecResultPage(RuleGroupExecResultPage source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new RuleGroupExecResult[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RuleGroupExecResult(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

