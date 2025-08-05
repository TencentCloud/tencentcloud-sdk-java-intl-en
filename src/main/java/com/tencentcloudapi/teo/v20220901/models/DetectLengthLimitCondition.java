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

public class DetectLengthLimitCondition extends AbstractModel {

    /**
    * Parameter name of the matched condition. Values:.
<li>`body_depth`: detection depth of the request body packet part.</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The parameter value of the match condition. the value is used in pairs with Name.
When the Name value is body_depth, Values only support passing in a single value. valid Values:.
<li>10KB;</li>
<li>64KB;</li>
<li>128KB.</li>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Parameter name of the matched condition. Values:.
<li>`body_depth`: detection depth of the request body packet part.</li> 
     * @return Name Parameter name of the matched condition. Values:.
<li>`body_depth`: detection depth of the request body packet part.</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name of the matched condition. Values:.
<li>`body_depth`: detection depth of the request body packet part.</li>
     * @param Name Parameter name of the matched condition. Values:.
<li>`body_depth`: detection depth of the request body packet part.</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The parameter value of the match condition. the value is used in pairs with Name.
When the Name value is body_depth, Values only support passing in a single value. valid Values:.
<li>10KB;</li>
<li>64KB;</li>
<li>128KB.</li> 
     * @return Values The parameter value of the match condition. the value is used in pairs with Name.
When the Name value is body_depth, Values only support passing in a single value. valid Values:.
<li>10KB;</li>
<li>64KB;</li>
<li>128KB.</li>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set The parameter value of the match condition. the value is used in pairs with Name.
When the Name value is body_depth, Values only support passing in a single value. valid Values:.
<li>10KB;</li>
<li>64KB;</li>
<li>128KB.</li>
     * @param Values The parameter value of the match condition. the value is used in pairs with Name.
When the Name value is body_depth, Values only support passing in a single value. valid Values:.
<li>10KB;</li>
<li>64KB;</li>
<li>128KB.</li>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public DetectLengthLimitCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectLengthLimitCondition(DetectLengthLimitCondition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

