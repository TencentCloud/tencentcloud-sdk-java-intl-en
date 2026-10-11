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

public class NodeSelectorRequirement extends AbstractModel {

    /**
    * Key of the node selector requirement.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Operator value of the node selector requirement. Supported operators: In, NotIn, Exists, DoesNotExist, Gt, and Lt.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Values of the node selector requirement.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Key of the node selector requirement. 
     * @return Key Key of the node selector requirement.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the node selector requirement.
     * @param Key Key of the node selector requirement.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Operator value of the node selector requirement. Supported operators: In, NotIn, Exists, DoesNotExist, Gt, and Lt. 
     * @return Operator Operator value of the node selector requirement. Supported operators: In, NotIn, Exists, DoesNotExist, Gt, and Lt.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator value of the node selector requirement. Supported operators: In, NotIn, Exists, DoesNotExist, Gt, and Lt.
     * @param Operator Operator value of the node selector requirement. Supported operators: In, NotIn, Exists, DoesNotExist, Gt, and Lt.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Values of the node selector requirement. 
     * @return Values Values of the node selector requirement.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Values of the node selector requirement.
     * @param Values Values of the node selector requirement.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public NodeSelectorRequirement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSelectorRequirement(NodeSelectorRequirement source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
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
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

