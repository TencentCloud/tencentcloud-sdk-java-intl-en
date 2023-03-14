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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionInfo extends AbstractModel{

    /**
    * Function namespace
    */
    @SerializedName("FunctionNamespace")
    @Expose
    private String FunctionNamespace;

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function version name or alias
    */
    @SerializedName("FunctionQualifier")
    @Expose
    private String FunctionQualifier;

    /**
    * Function qualifier type. Values: `VERSION`, `ALIAS`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FunctionQualifierType")
    @Expose
    private String FunctionQualifierType;

    /**
     * Get Function namespace 
     * @return FunctionNamespace Function namespace
     */
    public String getFunctionNamespace() {
        return this.FunctionNamespace;
    }

    /**
     * Set Function namespace
     * @param FunctionNamespace Function namespace
     */
    public void setFunctionNamespace(String FunctionNamespace) {
        this.FunctionNamespace = FunctionNamespace;
    }

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function version name or alias 
     * @return FunctionQualifier Function version name or alias
     */
    public String getFunctionQualifier() {
        return this.FunctionQualifier;
    }

    /**
     * Set Function version name or alias
     * @param FunctionQualifier Function version name or alias
     */
    public void setFunctionQualifier(String FunctionQualifier) {
        this.FunctionQualifier = FunctionQualifier;
    }

    /**
     * Get Function qualifier type. Values: `VERSION`, `ALIAS`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return FunctionQualifierType Function qualifier type. Values: `VERSION`, `ALIAS`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getFunctionQualifierType() {
        return this.FunctionQualifierType;
    }

    /**
     * Set Function qualifier type. Values: `VERSION`, `ALIAS`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param FunctionQualifierType Function qualifier type. Values: `VERSION`, `ALIAS`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFunctionQualifierType(String FunctionQualifierType) {
        this.FunctionQualifierType = FunctionQualifierType;
    }

    public FunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionInfo(FunctionInfo source) {
        if (source.FunctionNamespace != null) {
            this.FunctionNamespace = new String(source.FunctionNamespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionQualifier != null) {
            this.FunctionQualifier = new String(source.FunctionQualifier);
        }
        if (source.FunctionQualifierType != null) {
            this.FunctionQualifierType = new String(source.FunctionQualifierType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionNamespace", this.FunctionNamespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionQualifier", this.FunctionQualifier);
        this.setParamSimple(map, prefix + "FunctionQualifierType", this.FunctionQualifierType);

    }
}

