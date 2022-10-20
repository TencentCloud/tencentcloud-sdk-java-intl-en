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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupCondition extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get  
     * @return Target 
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 
     * @param Target 
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get  
     * @return Operator 
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 
     * @param Operator 
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get  
     * @return Values 
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 
     * @param Values 
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public OriginGroupCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupCondition(OriginGroupCondition source) {
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

