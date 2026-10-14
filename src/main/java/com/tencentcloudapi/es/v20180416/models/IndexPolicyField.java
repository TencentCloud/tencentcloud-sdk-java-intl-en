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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndexPolicyField extends AbstractModel {

    /**
    * Whether the warm phase is enabled
    */
    @SerializedName("WarmEnable")
    @Expose
    private String WarmEnable;

    /**
    * Transfer time to the warm phase
    */
    @SerializedName("WarmMinAge")
    @Expose
    private String WarmMinAge;

    /**
    * Whether the cold phase is enabled
    */
    @SerializedName("ColdEnable")
    @Expose
    private String ColdEnable;

    /**
    * Transfer time to the cold phase
    */
    @SerializedName("ColdMinAge")
    @Expose
    private String ColdMinAge;

    /**
    * Whether the frozen phase is enabled
    */
    @SerializedName("FrozenEnable")
    @Expose
    private String FrozenEnable;

    /**
    * Time of transfer to the frozen stage
    */
    @SerializedName("FrozenMinAge")
    @Expose
    private String FrozenMinAge;

    /**
    * /
    */
    @SerializedName("ColdAction")
    @Expose
    private String ColdAction;

    /**
     * Get Whether the warm phase is enabled 
     * @return WarmEnable Whether the warm phase is enabled
     */
    public String getWarmEnable() {
        return this.WarmEnable;
    }

    /**
     * Set Whether the warm phase is enabled
     * @param WarmEnable Whether the warm phase is enabled
     */
    public void setWarmEnable(String WarmEnable) {
        this.WarmEnable = WarmEnable;
    }

    /**
     * Get Transfer time to the warm phase 
     * @return WarmMinAge Transfer time to the warm phase
     */
    public String getWarmMinAge() {
        return this.WarmMinAge;
    }

    /**
     * Set Transfer time to the warm phase
     * @param WarmMinAge Transfer time to the warm phase
     */
    public void setWarmMinAge(String WarmMinAge) {
        this.WarmMinAge = WarmMinAge;
    }

    /**
     * Get Whether the cold phase is enabled 
     * @return ColdEnable Whether the cold phase is enabled
     */
    public String getColdEnable() {
        return this.ColdEnable;
    }

    /**
     * Set Whether the cold phase is enabled
     * @param ColdEnable Whether the cold phase is enabled
     */
    public void setColdEnable(String ColdEnable) {
        this.ColdEnable = ColdEnable;
    }

    /**
     * Get Transfer time to the cold phase 
     * @return ColdMinAge Transfer time to the cold phase
     */
    public String getColdMinAge() {
        return this.ColdMinAge;
    }

    /**
     * Set Transfer time to the cold phase
     * @param ColdMinAge Transfer time to the cold phase
     */
    public void setColdMinAge(String ColdMinAge) {
        this.ColdMinAge = ColdMinAge;
    }

    /**
     * Get Whether the frozen phase is enabled 
     * @return FrozenEnable Whether the frozen phase is enabled
     */
    public String getFrozenEnable() {
        return this.FrozenEnable;
    }

    /**
     * Set Whether the frozen phase is enabled
     * @param FrozenEnable Whether the frozen phase is enabled
     */
    public void setFrozenEnable(String FrozenEnable) {
        this.FrozenEnable = FrozenEnable;
    }

    /**
     * Get Time of transfer to the frozen stage 
     * @return FrozenMinAge Time of transfer to the frozen stage
     */
    public String getFrozenMinAge() {
        return this.FrozenMinAge;
    }

    /**
     * Set Time of transfer to the frozen stage
     * @param FrozenMinAge Time of transfer to the frozen stage
     */
    public void setFrozenMinAge(String FrozenMinAge) {
        this.FrozenMinAge = FrozenMinAge;
    }

    /**
     * Get / 
     * @return ColdAction /
     */
    public String getColdAction() {
        return this.ColdAction;
    }

    /**
     * Set /
     * @param ColdAction /
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

