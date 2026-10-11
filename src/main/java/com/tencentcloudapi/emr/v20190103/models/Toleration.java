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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Toleration extends AbstractModel {

    /**
    * Key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Operator.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Taint repel effect.
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * Eviction wait time.
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get Key. 
     * @return Key Key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key.
     * @param Key Key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value. 
     * @return Value Value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value.
     * @param Value Value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Operator. 
     * @return Operator Operator.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator.
     * @param Operator Operator.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Taint repel effect. 
     * @return Effect Taint repel effect.
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Taint repel effect.
     * @param Effect Taint repel effect.
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get Eviction wait time. 
     * @return TolerationSeconds Eviction wait time.
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set Eviction wait time.
     * @param TolerationSeconds Eviction wait time.
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public Toleration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Toleration(Toleration source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.TolerationSeconds != null) {
            this.TolerationSeconds = new Long(source.TolerationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

