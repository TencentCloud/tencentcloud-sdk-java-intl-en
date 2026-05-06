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

public class RuleFilter extends AbstractModel {

    /**
    * Key of throttling conditions
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Values of throttling conditions
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * name in header or query
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Key of throttling conditions 
     * @return Key Key of throttling conditions
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of throttling conditions
     * @param Key Key of throttling conditions
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Values of throttling conditions 
     * @return Values Values of throttling conditions
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Values of throttling conditions
     * @param Values Values of throttling conditions
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get operator 
     * @return Operator operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set operator
     * @param Operator operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get name in header or query 
     * @return Name name in header or query
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set name in header or query
     * @param Name name in header or query
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public RuleFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleFilter(RuleFilter source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

