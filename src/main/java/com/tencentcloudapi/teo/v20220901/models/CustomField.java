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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomField extends AbstractModel {

    /**
    * Extracts data from specified positions in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract a specified field value from an HTTP request header;</li>
<li>RspHeader: Extract a specified field value from an HTTP response header;</li>
<li>cookie: Extract a specified field value from a cookie.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Indicates the name of the parameter from which a value needs to be extracted, such as Accept-Language.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Indicates whether to deliver this field. If not filled in, this field will not be delivered.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get Extracts data from specified positions in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract a specified field value from an HTTP request header;</li>
<li>RspHeader: Extract a specified field value from an HTTP response header;</li>
<li>cookie: Extract a specified field value from a cookie.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Extracts data from specified positions in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract a specified field value from an HTTP request header;</li>
<li>RspHeader: Extract a specified field value from an HTTP response header;</li>
<li>cookie: Extract a specified field value from a cookie.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Extracts data from specified positions in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract a specified field value from an HTTP request header;</li>
<li>RspHeader: Extract a specified field value from an HTTP response header;</li>
<li>cookie: Extract a specified field value from a cookie.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Extracts data from specified positions in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract a specified field value from an HTTP request header;</li>
<li>RspHeader: Extract a specified field value from an HTTP response header;</li>
<li>cookie: Extract a specified field value from a cookie.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Indicates the name of the parameter from which a value needs to be extracted, such as Accept-Language.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Indicates the name of the parameter from which a value needs to be extracted, such as Accept-Language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Indicates the name of the parameter from which a value needs to be extracted, such as Accept-Language.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Indicates the name of the parameter from which a value needs to be extracted, such as Accept-Language.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Indicates whether to deliver this field. If not filled in, this field will not be delivered.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enabled Indicates whether to deliver this field. If not filled in, this field will not be delivered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Indicates whether to deliver this field. If not filled in, this field will not be delivered.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enabled Indicates whether to deliver this field. If not filled in, this field will not be delivered.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CustomField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomField(CustomField source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

