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

public class CustomField extends AbstractModel {

    /**
    * Type of the custom log filed, which indicates extracting data from a specified position in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract the value of a specified field from an HTTP request header;</li>
<li>RspHeader: Extract the value of a specified field from an HTTP response header;</li>
<li>Cookie: Extract the value of a specified field from a cookie;</li>
<li>ReqBody: Extract specified content from an HTTP request body using a Google RE2 regular expression.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Enter the definition of the field value based on the field type (Name). This parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the name of the parameter for which you need to extract the value, such as Accept-Language. You can enter 1-100 characters. The name should start with a letter, contain letters, digits, and hyphens (-) in the middle, and end with a letter or digit.</li>
<li>When the field type is ReqBody, enter the Google RE2 regular expression. The maximum length of the regular expression is 4 KB.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
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
     * Get Type of the custom log filed, which indicates extracting data from a specified position in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract the value of a specified field from an HTTP request header;</li>
<li>RspHeader: Extract the value of a specified field from an HTTP response header;</li>
<li>Cookie: Extract the value of a specified field from a cookie;</li>
<li>ReqBody: Extract specified content from an HTTP request body using a Google RE2 regular expression.</li>
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Name Type of the custom log filed, which indicates extracting data from a specified position in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract the value of a specified field from an HTTP request header;</li>
<li>RspHeader: Extract the value of a specified field from an HTTP response header;</li>
<li>Cookie: Extract the value of a specified field from a cookie;</li>
<li>ReqBody: Extract specified content from an HTTP request body using a Google RE2 regular expression.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Type of the custom log filed, which indicates extracting data from a specified position in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract the value of a specified field from an HTTP request header;</li>
<li>RspHeader: Extract the value of a specified field from an HTTP response header;</li>
<li>Cookie: Extract the value of a specified field from a cookie;</li>
<li>ReqBody: Extract specified content from an HTTP request body using a Google RE2 regular expression.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Name Type of the custom log filed, which indicates extracting data from a specified position in HTTP requests and responses. Valid values:
<li>ReqHeader: Extract the value of a specified field from an HTTP request header;</li>
<li>RspHeader: Extract the value of a specified field from an HTTP response header;</li>
<li>Cookie: Extract the value of a specified field from a cookie;</li>
<li>ReqBody: Extract specified content from an HTTP request body using a Google RE2 regular expression.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Enter the definition of the field value based on the field type (Name). This parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the name of the parameter for which you need to extract the value, such as Accept-Language. You can enter 1-100 characters. The name should start with a letter, contain letters, digits, and hyphens (-) in the middle, and end with a letter or digit.</li>
<li>When the field type is ReqBody, enter the Google RE2 regular expression. The maximum length of the regular expression is 4 KB.</li>
Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Value Enter the definition of the field value based on the field type (Name). This parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the name of the parameter for which you need to extract the value, such as Accept-Language. You can enter 1-100 characters. The name should start with a letter, contain letters, digits, and hyphens (-) in the middle, and end with a letter or digit.</li>
<li>When the field type is ReqBody, enter the Google RE2 regular expression. The maximum length of the regular expression is 4 KB.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Enter the definition of the field value based on the field type (Name). This parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the name of the parameter for which you need to extract the value, such as Accept-Language. You can enter 1-100 characters. The name should start with a letter, contain letters, digits, and hyphens (-) in the middle, and end with a letter or digit.</li>
<li>When the field type is ReqBody, enter the Google RE2 regular expression. The maximum length of the regular expression is 4 KB.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Value Enter the definition of the field value based on the field type (Name). This parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the name of the parameter for which you need to extract the value, such as Accept-Language. You can enter 1-100 characters. The name should start with a letter, contain letters, digits, and hyphens (-) in the middle, and end with a letter or digit.</li>
<li>When the field type is ReqBody, enter the Google RE2 regular expression. The maximum length of the regular expression is 4 KB.</li>
Note: This field may return null, which indicates a failure to obtain a valid value.
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

