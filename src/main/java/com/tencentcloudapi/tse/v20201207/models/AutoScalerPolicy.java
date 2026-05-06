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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalerPolicy extends AbstractModel {

    /**
    * Type, Pods
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Quantity.
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * Expansion cycle
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
     * Get Type, Pods 
     * @return Type Type, Pods
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type, Pods
     * @param Type Type, Pods
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Quantity. 
     * @return Value Quantity.
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set Quantity.
     * @param Value Quantity.
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get Expansion cycle 
     * @return PeriodSeconds Expansion cycle
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set Expansion cycle
     * @param PeriodSeconds Expansion cycle
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    public AutoScalerPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalerPolicy(AutoScalerPolicy source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);

    }
}

