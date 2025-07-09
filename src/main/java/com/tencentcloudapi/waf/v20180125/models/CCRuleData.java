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

public class CCRuleData extends AbstractModel {

    /**
    * CC rules
    */
    @SerializedName("Res")
    @Expose
    private CCRuleItem [] Res;

    /**
    * Number of Rules
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get CC rules 
     * @return Res CC rules
     */
    public CCRuleItem [] getRes() {
        return this.Res;
    }

    /**
     * Set CC rules
     * @param Res CC rules
     */
    public void setRes(CCRuleItem [] Res) {
        this.Res = Res;
    }

    /**
     * Get Number of Rules 
     * @return TotalCount Number of Rules
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of Rules
     * @param TotalCount Number of Rules
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public CCRuleData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCRuleData(CCRuleData source) {
        if (source.Res != null) {
            this.Res = new CCRuleItem[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new CCRuleItem(source.Res[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Res.", this.Res);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

