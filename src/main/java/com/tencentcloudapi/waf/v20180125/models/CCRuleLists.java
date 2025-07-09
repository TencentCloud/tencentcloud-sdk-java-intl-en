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

public class CCRuleLists extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Rule

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Res")
    @Expose
    private CCRuleItems [] Res;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Rule

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Res Rule

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CCRuleItems [] getRes() {
        return this.Res;
    }

    /**
     * Set Rule

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Res Rule

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRes(CCRuleItems [] Res) {
        this.Res = Res;
    }

    public CCRuleLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleLists(CCRuleLists source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Res != null) {
            this.Res = new CCRuleItems[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new CCRuleItems(source.Res[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Res.", this.Res);

    }
}

