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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnWafRule extends AbstractModel {

    /**
    * Attack type
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * Defense action. Valid value: `observe`.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * Get Attack type 
     * @return AttackType Attack type
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set Attack type
     * @param AttackType Attack type
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get Defense action. Valid value: `observe`. 
     * @return Operate Defense action. Valid value: `observe`.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set Defense action. Valid value: `observe`.
     * @param Operate Defense action. Valid value: `observe`.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    public ScdnWafRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnWafRule(ScdnWafRule source) {
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

