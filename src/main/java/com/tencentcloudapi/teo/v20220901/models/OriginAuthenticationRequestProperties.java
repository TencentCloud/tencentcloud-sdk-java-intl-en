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

public class OriginAuthenticationRequestProperties extends AbstractModel {

    /**
    * Specifies the origin-pull authentication parameter type. valid values: <li>QueryString: indicates setting the origin-pull authentication parameter type to query string.</li><li>Header: indicates setting the origin-pull authentication parameter type to request Header.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Specifies the parameter name for the origin-pull authentication type.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Specifies the parameter value for the origin-pull authentication type.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Specifies the origin-pull authentication parameter type. valid values: <li>QueryString: indicates setting the origin-pull authentication parameter type to query string.</li><li>Header: indicates setting the origin-pull authentication parameter type to request Header.</li>. 
     * @return Type Specifies the origin-pull authentication parameter type. valid values: <li>QueryString: indicates setting the origin-pull authentication parameter type to query string.</li><li>Header: indicates setting the origin-pull authentication parameter type to request Header.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies the origin-pull authentication parameter type. valid values: <li>QueryString: indicates setting the origin-pull authentication parameter type to query string.</li><li>Header: indicates setting the origin-pull authentication parameter type to request Header.</li>.
     * @param Type Specifies the origin-pull authentication parameter type. valid values: <li>QueryString: indicates setting the origin-pull authentication parameter type to query string.</li><li>Header: indicates setting the origin-pull authentication parameter type to request Header.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Specifies the parameter name for the origin-pull authentication type. 
     * @return Name Specifies the parameter name for the origin-pull authentication type.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the parameter name for the origin-pull authentication type.
     * @param Name Specifies the parameter name for the origin-pull authentication type.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Specifies the parameter value for the origin-pull authentication type. 
     * @return Value Specifies the parameter value for the origin-pull authentication type.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Specifies the parameter value for the origin-pull authentication type.
     * @param Value Specifies the parameter value for the origin-pull authentication type.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public OriginAuthenticationRequestProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginAuthenticationRequestProperties(OriginAuthenticationRequestProperties source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

