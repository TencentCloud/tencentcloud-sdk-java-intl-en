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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel {

    /**
    * The key of the tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-Format of `name`: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * The comparison operator between tag key values. Different business scenarios support different comparison operators. See the API business description for supported ones.
such as `in`, `notin`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * Tag value.
-Supports up to 63 characters.
-Format: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get The key of the tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-Format of `name`: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key The key of the tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-Format of `name`: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set The key of the tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-Format of `name`: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key The key of the tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-Format of `name`: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get The comparison operator between tag key values. Different business scenarios support different comparison operators. See the API business description for supported ones.
such as `in`, `notin`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operate The comparison operator between tag key values. Different business scenarios support different comparison operators. See the API business description for supported ones.
such as `in`, `notin`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set The comparison operator between tag key values. Different business scenarios support different comparison operators. See the API business description for supported ones.
such as `in`, `notin`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operate The comparison operator between tag key values. Different business scenarios support different comparison operators. See the API business description for supported ones.
such as `in`, `notin`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Tag value.
-Supports up to 63 characters.
-Format: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Values Tag value.
-Supports up to 63 characters.
-Format: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Tag value.
-Supports up to 63 characters.
-Format: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Values Tag value.
-Supports up to 63 characters.
-Format: `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
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
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

