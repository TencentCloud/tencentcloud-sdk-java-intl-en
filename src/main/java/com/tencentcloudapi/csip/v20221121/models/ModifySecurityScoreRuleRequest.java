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

public class ModifySecurityScoreRuleRequest extends AbstractModel {

    /**
    * <p>Complete rule list, which must contain rules of ALL dimensions, sub-items, and levels</p>
    */
    @SerializedName("Rules")
    @Expose
    private ModifyRuleItem [] Rules;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Complete rule list, which must contain rules of ALL dimensions, sub-items, and levels</p> 
     * @return Rules <p>Complete rule list, which must contain rules of ALL dimensions, sub-items, and levels</p>
     */
    public ModifyRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>Complete rule list, which must contain rules of ALL dimensions, sub-items, and levels</p>
     * @param Rules <p>Complete rule list, which must contain rules of ALL dimensions, sub-items, and levels</p>
     */
    public void setRules(ModifyRuleItem [] Rules) {
        this.Rules = Rules;
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

    public ModifySecurityScoreRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityScoreRuleRequest(ModifySecurityScoreRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new ModifyRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new ModifyRuleItem(source.Rules[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

