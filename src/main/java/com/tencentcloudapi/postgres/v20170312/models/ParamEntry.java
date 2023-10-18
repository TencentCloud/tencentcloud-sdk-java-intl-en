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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamEntry extends AbstractModel {

    /**
    * Parameter name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The new value to which the parameter will be modified. When this parameter is used as an input parameter, its value must be a string, such as `0.1` (decimal), `1000` (integer), and `replica` (enum).
    */
    @SerializedName("ExpectedValue")
    @Expose
    private String ExpectedValue;

    /**
     * Get Parameter name 
     * @return Name Parameter name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name
     * @param Name Parameter name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The new value to which the parameter will be modified. When this parameter is used as an input parameter, its value must be a string, such as `0.1` (decimal), `1000` (integer), and `replica` (enum). 
     * @return ExpectedValue The new value to which the parameter will be modified. When this parameter is used as an input parameter, its value must be a string, such as `0.1` (decimal), `1000` (integer), and `replica` (enum).
     */
    public String getExpectedValue() {
        return this.ExpectedValue;
    }

    /**
     * Set The new value to which the parameter will be modified. When this parameter is used as an input parameter, its value must be a string, such as `0.1` (decimal), `1000` (integer), and `replica` (enum).
     * @param ExpectedValue The new value to which the parameter will be modified. When this parameter is used as an input parameter, its value must be a string, such as `0.1` (decimal), `1000` (integer), and `replica` (enum).
     */
    public void setExpectedValue(String ExpectedValue) {
        this.ExpectedValue = ExpectedValue;
    }

    public ParamEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamEntry(ParamEntry source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExpectedValue != null) {
            this.ExpectedValue = new String(source.ExpectedValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExpectedValue", this.ExpectedValue);

    }
}

