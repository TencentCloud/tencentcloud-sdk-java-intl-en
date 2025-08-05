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
    * Type of the custom log field, which indicates extracting data from specified positions in HTTP requests and responses. valid values:.
<li>ReqHeader: extract the value of a specified field from an HTTP request header;</li>.
<li>RspHeader: extracts the value of a specified field from an HTTP response header.</li>.
<Li>Cookie: extract the specified field value from a cookie;</li>.
<li>ReqBody: extract specified content from an HTTP request body using a Google RE2 regular expression.</li>.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Enter the field value definition based on the field type (Name). this parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the parameter name for value extraction, such as Accept-Language. you can enter 1-100 characters. the name must start with a letter, contain letters, digits, or hyphens (-) in the middle, and end with a letter or digit.</li>.
<li>When the field type is ReqBody, enter the Google RE2 regular expression. the maximum length of the regular expression is 4 KB.</li>.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Whether to deliver this field. leave blank to skip delivery.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get Type of the custom log field, which indicates extracting data from specified positions in HTTP requests and responses. valid values:.
<li>ReqHeader: extract the value of a specified field from an HTTP request header;</li>.
<li>RspHeader: extracts the value of a specified field from an HTTP response header.</li>.
<Li>Cookie: extract the specified field value from a cookie;</li>.
<li>ReqBody: extract specified content from an HTTP request body using a Google RE2 regular expression.</li>. 
     * @return Name Type of the custom log field, which indicates extracting data from specified positions in HTTP requests and responses. valid values:.
<li>ReqHeader: extract the value of a specified field from an HTTP request header;</li>.
<li>RspHeader: extracts the value of a specified field from an HTTP response header.</li>.
<Li>Cookie: extract the specified field value from a cookie;</li>.
<li>ReqBody: extract specified content from an HTTP request body using a Google RE2 regular expression.</li>.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Type of the custom log field, which indicates extracting data from specified positions in HTTP requests and responses. valid values:.
<li>ReqHeader: extract the value of a specified field from an HTTP request header;</li>.
<li>RspHeader: extracts the value of a specified field from an HTTP response header.</li>.
<Li>Cookie: extract the specified field value from a cookie;</li>.
<li>ReqBody: extract specified content from an HTTP request body using a Google RE2 regular expression.</li>.
     * @param Name Type of the custom log field, which indicates extracting data from specified positions in HTTP requests and responses. valid values:.
<li>ReqHeader: extract the value of a specified field from an HTTP request header;</li>.
<li>RspHeader: extracts the value of a specified field from an HTTP response header.</li>.
<Li>Cookie: extract the specified field value from a cookie;</li>.
<li>ReqBody: extract specified content from an HTTP request body using a Google RE2 regular expression.</li>.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Enter the field value definition based on the field type (Name). this parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the parameter name for value extraction, such as Accept-Language. you can enter 1-100 characters. the name must start with a letter, contain letters, digits, or hyphens (-) in the middle, and end with a letter or digit.</li>.
<li>When the field type is ReqBody, enter the Google RE2 regular expression. the maximum length of the regular expression is 4 KB.</li>. 
     * @return Value Enter the field value definition based on the field type (Name). this parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the parameter name for value extraction, such as Accept-Language. you can enter 1-100 characters. the name must start with a letter, contain letters, digits, or hyphens (-) in the middle, and end with a letter or digit.</li>.
<li>When the field type is ReqBody, enter the Google RE2 regular expression. the maximum length of the regular expression is 4 KB.</li>.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Enter the field value definition based on the field type (Name). this parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the parameter name for value extraction, such as Accept-Language. you can enter 1-100 characters. the name must start with a letter, contain letters, digits, or hyphens (-) in the middle, and end with a letter or digit.</li>.
<li>When the field type is ReqBody, enter the Google RE2 regular expression. the maximum length of the regular expression is 4 KB.</li>.
     * @param Value Enter the field value definition based on the field type (Name). this parameter is case-sensitive.
<li>When the field type is ReqHeader, RspHeader, or Cookie, enter the parameter name for value extraction, such as Accept-Language. you can enter 1-100 characters. the name must start with a letter, contain letters, digits, or hyphens (-) in the middle, and end with a letter or digit.</li>.
<li>When the field type is ReqBody, enter the Google RE2 regular expression. the maximum length of the regular expression is 4 KB.</li>.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Whether to deliver this field. leave blank to skip delivery. 
     * @return Enabled Whether to deliver this field. leave blank to skip delivery.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to deliver this field. leave blank to skip delivery.
     * @param Enabled Whether to deliver this field. leave blank to skip delivery.
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

