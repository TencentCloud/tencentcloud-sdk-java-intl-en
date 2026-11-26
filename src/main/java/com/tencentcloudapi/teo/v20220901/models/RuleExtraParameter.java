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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExtraParameter extends AbstractModel {

    /**
    * Parameter name. Valid values:
<li> Action: Parameters required to modify HTTP header. Select RewirteAction for RuleAction;</li>
<li> StatusCode: Parameters required for status code related features. Select CodeAction for RuleAction.</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Parameter value type.
<li> CHOICE: The parameter value can only be selected from Values; </li>
<li> CUSTOM_NUM: The parameter value is user-customized, int type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Optional parameter values.
Note: When the value of Id is StatusCode, the values in the array are integers. Fill in the parameter value as an integer in string format.
    */
    @SerializedName("Choices")
    @Expose
    private String [] Choices;

    /**
     * Get Parameter name. Valid values:
<li> Action: Parameters required to modify HTTP header. Select RewirteAction for RuleAction;</li>
<li> StatusCode: Parameters required for status code related features. Select CodeAction for RuleAction.</li> 
     * @return Id Parameter name. Valid values:
<li> Action: Parameters required to modify HTTP header. Select RewirteAction for RuleAction;</li>
<li> StatusCode: Parameters required for status code related features. Select CodeAction for RuleAction.</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Parameter name. Valid values:
<li> Action: Parameters required to modify HTTP header. Select RewirteAction for RuleAction;</li>
<li> StatusCode: Parameters required for status code related features. Select CodeAction for RuleAction.</li>
     * @param Id Parameter name. Valid values:
<li> Action: Parameters required to modify HTTP header. Select RewirteAction for RuleAction;</li>
<li> StatusCode: Parameters required for status code related features. Select CodeAction for RuleAction.</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Parameter value type.
<li> CHOICE: The parameter value can only be selected from Values; </li>
<li> CUSTOM_NUM: The parameter value is user-customized, int type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li> 
     * @return Type Parameter value type.
<li> CHOICE: The parameter value can only be selected from Values; </li>
<li> CUSTOM_NUM: The parameter value is user-customized, int type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Parameter value type.
<li> CHOICE: The parameter value can only be selected from Values; </li>
<li> CUSTOM_NUM: The parameter value is user-customized, int type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>
     * @param Type Parameter value type.
<li> CHOICE: The parameter value can only be selected from Values; </li>
<li> CUSTOM_NUM: The parameter value is user-customized, int type;</li>
<li>CUSTOM_STRING: The parameter value is user-customized, string type.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Optional parameter values.
Note: When the value of Id is StatusCode, the values in the array are integers. Fill in the parameter value as an integer in string format. 
     * @return Choices Optional parameter values.
Note: When the value of Id is StatusCode, the values in the array are integers. Fill in the parameter value as an integer in string format.
     */
    public String [] getChoices() {
        return this.Choices;
    }

    /**
     * Set Optional parameter values.
Note: When the value of Id is StatusCode, the values in the array are integers. Fill in the parameter value as an integer in string format.
     * @param Choices Optional parameter values.
Note: When the value of Id is StatusCode, the values in the array are integers. Fill in the parameter value as an integer in string format.
     */
    public void setChoices(String [] Choices) {
        this.Choices = Choices;
    }

    public RuleExtraParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExtraParameter(RuleExtraParameter source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Choices != null) {
            this.Choices = new String[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new String(source.Choices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Choices.", this.Choices);

    }
}

