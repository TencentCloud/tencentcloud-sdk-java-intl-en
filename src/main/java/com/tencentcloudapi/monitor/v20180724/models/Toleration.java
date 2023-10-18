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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Toleration extends AbstractModel {

    /**
    * Key of the taint to which the toleration is applied
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * The key-value relationship
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The taint effect to be matched
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
     * Get Key of the taint to which the toleration is applied 
     * @return Key Key of the taint to which the toleration is applied
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the taint to which the toleration is applied
     * @param Key Key of the taint to which the toleration is applied
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get The key-value relationship 
     * @return Operator The key-value relationship
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The key-value relationship
     * @param Operator The key-value relationship
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The taint effect to be matched 
     * @return Effect The taint effect to be matched
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set The taint effect to be matched
     * @param Effect The taint effect to be matched
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Effect", this.Effect);

    }
}

