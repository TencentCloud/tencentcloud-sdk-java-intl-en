/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexPolicyField extends AbstractModel {

    /**
    * Whether to enable the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WarmEnable")
    @Expose
    private String WarmEnable;

    /**
    * Min age before data transitions to the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WarmMinAge")
    @Expose
    private String WarmMinAge;

    /**
    * Whether to enable the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ColdEnable")
    @Expose
    private String ColdEnable;

    /**
    * Min age before data transitions to the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ColdMinAge")
    @Expose
    private String ColdMinAge;

    /**
    * Whether to enable the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FrozenEnable")
    @Expose
    private String FrozenEnable;

    /**
    * Min age before data transitions to the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FrozenMinAge")
    @Expose
    private String FrozenMinAge;

    /**
    * /
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColdAction")
    @Expose
    private String ColdAction;

    /**
     * Get Whether to enable the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WarmEnable Whether to enable the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getWarmEnable() {
        return this.WarmEnable;
    }

    /**
     * Set Whether to enable the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WarmEnable Whether to enable the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWarmEnable(String WarmEnable) {
        this.WarmEnable = WarmEnable;
    }

    /**
     * Get Min age before data transitions to the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WarmMinAge Min age before data transitions to the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getWarmMinAge() {
        return this.WarmMinAge;
    }

    /**
     * Set Min age before data transitions to the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WarmMinAge Min age before data transitions to the warm phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWarmMinAge(String WarmMinAge) {
        this.WarmMinAge = WarmMinAge;
    }

    /**
     * Get Whether to enable the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ColdEnable Whether to enable the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getColdEnable() {
        return this.ColdEnable;
    }

    /**
     * Set Whether to enable the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ColdEnable Whether to enable the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setColdEnable(String ColdEnable) {
        this.ColdEnable = ColdEnable;
    }

    /**
     * Get Min age before data transitions to the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ColdMinAge Min age before data transitions to the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getColdMinAge() {
        return this.ColdMinAge;
    }

    /**
     * Set Min age before data transitions to the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ColdMinAge Min age before data transitions to the cold phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setColdMinAge(String ColdMinAge) {
        this.ColdMinAge = ColdMinAge;
    }

    /**
     * Get Whether to enable the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FrozenEnable Whether to enable the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getFrozenEnable() {
        return this.FrozenEnable;
    }

    /**
     * Set Whether to enable the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FrozenEnable Whether to enable the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFrozenEnable(String FrozenEnable) {
        this.FrozenEnable = FrozenEnable;
    }

    /**
     * Get Min age before data transitions to the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FrozenMinAge Min age before data transitions to the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getFrozenMinAge() {
        return this.FrozenMinAge;
    }

    /**
     * Set Min age before data transitions to the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FrozenMinAge Min age before data transitions to the frozen phase
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFrozenMinAge(String FrozenMinAge) {
        this.FrozenMinAge = FrozenMinAge;
    }

    /**
     * Get /
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColdAction /
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColdAction() {
        return this.ColdAction;
    }

    /**
     * Set /
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColdAction /
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColdAction(String ColdAction) {
        this.ColdAction = ColdAction;
    }

    public IndexPolicyField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndexPolicyField(IndexPolicyField source) {
        if (source.WarmEnable != null) {
            this.WarmEnable = new String(source.WarmEnable);
        }
        if (source.WarmMinAge != null) {
            this.WarmMinAge = new String(source.WarmMinAge);
        }
        if (source.ColdEnable != null) {
            this.ColdEnable = new String(source.ColdEnable);
        }
        if (source.ColdMinAge != null) {
            this.ColdMinAge = new String(source.ColdMinAge);
        }
        if (source.FrozenEnable != null) {
            this.FrozenEnable = new String(source.FrozenEnable);
        }
        if (source.FrozenMinAge != null) {
            this.FrozenMinAge = new String(source.FrozenMinAge);
        }
        if (source.ColdAction != null) {
            this.ColdAction = new String(source.ColdAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarmEnable", this.WarmEnable);
        this.setParamSimple(map, prefix + "WarmMinAge", this.WarmMinAge);
        this.setParamSimple(map, prefix + "ColdEnable", this.ColdEnable);
        this.setParamSimple(map, prefix + "ColdMinAge", this.ColdMinAge);
        this.setParamSimple(map, prefix + "FrozenEnable", this.FrozenEnable);
        this.setParamSimple(map, prefix + "FrozenMinAge", this.FrozenMinAge);
        this.setParamSimple(map, prefix + "ColdAction", this.ColdAction);

    }
}

