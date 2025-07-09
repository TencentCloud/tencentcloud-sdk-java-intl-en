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

public class FunctionEnvironmentVariable extends AbstractModel {

    /**
    * Variable name, which should be unique and can only contain uppercase and lowercase letters, digits, and special characters including at signs (@), periods (.), hyphens (-), and underscores (_). Its maximum size is 64 bytes.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Variable value. Its maximum size is 5000 bytes. The default value is empty.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Variable type. Valid values:
<li>string: string type;</li>
<li>json: JSON object type.</li>Default value: string.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Variable name, which should be unique and can only contain uppercase and lowercase letters, digits, and special characters including at signs (@), periods (.), hyphens (-), and underscores (_). Its maximum size is 64 bytes. 
     * @return Key Variable name, which should be unique and can only contain uppercase and lowercase letters, digits, and special characters including at signs (@), periods (.), hyphens (-), and underscores (_). Its maximum size is 64 bytes.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Variable name, which should be unique and can only contain uppercase and lowercase letters, digits, and special characters including at signs (@), periods (.), hyphens (-), and underscores (_). Its maximum size is 64 bytes.
     * @param Key Variable name, which should be unique and can only contain uppercase and lowercase letters, digits, and special characters including at signs (@), periods (.), hyphens (-), and underscores (_). Its maximum size is 64 bytes.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Variable value. Its maximum size is 5000 bytes. The default value is empty. 
     * @return Value Variable value. Its maximum size is 5000 bytes. The default value is empty.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Variable value. Its maximum size is 5000 bytes. The default value is empty.
     * @param Value Variable value. Its maximum size is 5000 bytes. The default value is empty.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Variable type. Valid values:
<li>string: string type;</li>
<li>json: JSON object type.</li>Default value: string. 
     * @return Type Variable type. Valid values:
<li>string: string type;</li>
<li>json: JSON object type.</li>Default value: string.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Variable type. Valid values:
<li>string: string type;</li>
<li>json: JSON object type.</li>Default value: string.
     * @param Type Variable type. Valid values:
<li>string: string type;</li>
<li>json: JSON object type.</li>Default value: string.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public FunctionEnvironmentVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionEnvironmentVariable(FunctionEnvironmentVariable source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

