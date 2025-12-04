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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMongoDBParamType extends AbstractModel {

    /**
    * Parameter name to be modified. Strictly refer to the parameter names supported by the current instance, which are obtained through DescribeInstanceParams.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Corresponding value of the parameter name to be modified. Strictly refer to the value ranges corresponding to the parameters obtained through DescribeInstanceParams.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Parameter name to be modified. Strictly refer to the parameter names supported by the current instance, which are obtained through DescribeInstanceParams. 
     * @return Key Parameter name to be modified. Strictly refer to the parameter names supported by the current instance, which are obtained through DescribeInstanceParams.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Parameter name to be modified. Strictly refer to the parameter names supported by the current instance, which are obtained through DescribeInstanceParams.
     * @param Key Parameter name to be modified. Strictly refer to the parameter names supported by the current instance, which are obtained through DescribeInstanceParams.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Corresponding value of the parameter name to be modified. Strictly refer to the value ranges corresponding to the parameters obtained through DescribeInstanceParams. 
     * @return Value Corresponding value of the parameter name to be modified. Strictly refer to the value ranges corresponding to the parameters obtained through DescribeInstanceParams.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Corresponding value of the parameter name to be modified. Strictly refer to the value ranges corresponding to the parameters obtained through DescribeInstanceParams.
     * @param Value Corresponding value of the parameter name to be modified. Strictly refer to the value ranges corresponding to the parameters obtained through DescribeInstanceParams.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ModifyMongoDBParamType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMongoDBParamType(ModifyMongoDBParamType source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

