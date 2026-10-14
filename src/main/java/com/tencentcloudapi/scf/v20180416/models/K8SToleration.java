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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8SToleration extends AbstractModel {

    /**
    * Matched taint name
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Match mode. Default value: Equal.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Execution policy
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * Taint value to match. Required when Operator is Equal.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * How long a Pod can still run on a node when the taint is not tolerated
    */
    @SerializedName("TolerationSeconds")
    @Expose
    private Long TolerationSeconds;

    /**
     * Get Matched taint name 
     * @return Key Matched taint name
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Matched taint name
     * @param Key Matched taint name
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Match mode. Default value: Equal. 
     * @return Operator Match mode. Default value: Equal.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Match mode. Default value: Equal.
     * @param Operator Match mode. Default value: Equal.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Execution policy 
     * @return Effect Execution policy
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Execution policy
     * @param Effect Execution policy
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get Taint value to match. Required when Operator is Equal. 
     * @return Value Taint value to match. Required when Operator is Equal.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Taint value to match. Required when Operator is Equal.
     * @param Value Taint value to match. Required when Operator is Equal.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get How long a Pod can still run on a node when the taint is not tolerated 
     * @return TolerationSeconds How long a Pod can still run on a node when the taint is not tolerated
     */
    public Long getTolerationSeconds() {
        return this.TolerationSeconds;
    }

    /**
     * Set How long a Pod can still run on a node when the taint is not tolerated
     * @param TolerationSeconds How long a Pod can still run on a node when the taint is not tolerated
     */
    public void setTolerationSeconds(Long TolerationSeconds) {
        this.TolerationSeconds = TolerationSeconds;
    }

    public K8SToleration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8SToleration(K8SToleration source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
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
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TolerationSeconds", this.TolerationSeconds);

    }
}

