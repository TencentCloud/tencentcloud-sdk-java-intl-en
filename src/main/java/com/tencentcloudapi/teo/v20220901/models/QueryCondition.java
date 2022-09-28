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

public class QueryCondition extends AbstractModel{

    /**
    * The key of QueryCondition.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * The conditional operator. Values:
<li>`equals`: Equal to;</li>
<li>`notEquals`: Not equal to;</li>
<li>`include`: Contain;</li>
<li>`notInclude`: Not contain;</li>
<li>`startWith`: Start with;</li>
<li>`notStartWith`: Not start with;</li>
<li>`endWith`: End with;</li>
<li>`notEndWith`: Not end with.</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The value of QueryCondition.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get The key of QueryCondition. 
     * @return Key The key of QueryCondition.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set The key of QueryCondition.
     * @param Key The key of QueryCondition.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get The conditional operator. Values:
<li>`equals`: Equal to;</li>
<li>`notEquals`: Not equal to;</li>
<li>`include`: Contain;</li>
<li>`notInclude`: Not contain;</li>
<li>`startWith`: Start with;</li>
<li>`notStartWith`: Not start with;</li>
<li>`endWith`: End with;</li>
<li>`notEndWith`: Not end with.</li> 
     * @return Operator The conditional operator. Values:
<li>`equals`: Equal to;</li>
<li>`notEquals`: Not equal to;</li>
<li>`include`: Contain;</li>
<li>`notInclude`: Not contain;</li>
<li>`startWith`: Start with;</li>
<li>`notStartWith`: Not start with;</li>
<li>`endWith`: End with;</li>
<li>`notEndWith`: Not end with.</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The conditional operator. Values:
<li>`equals`: Equal to;</li>
<li>`notEquals`: Not equal to;</li>
<li>`include`: Contain;</li>
<li>`notInclude`: Not contain;</li>
<li>`startWith`: Start with;</li>
<li>`notStartWith`: Not start with;</li>
<li>`endWith`: End with;</li>
<li>`notEndWith`: Not end with.</li>
     * @param Operator The conditional operator. Values:
<li>`equals`: Equal to;</li>
<li>`notEquals`: Not equal to;</li>
<li>`include`: Contain;</li>
<li>`notInclude`: Not contain;</li>
<li>`startWith`: Start with;</li>
<li>`notStartWith`: Not start with;</li>
<li>`endWith`: End with;</li>
<li>`notEndWith`: Not end with.</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The value of QueryCondition. 
     * @return Value The value of QueryCondition.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set The value of QueryCondition.
     * @param Value The value of QueryCondition.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public QueryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCondition(QueryCondition source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

