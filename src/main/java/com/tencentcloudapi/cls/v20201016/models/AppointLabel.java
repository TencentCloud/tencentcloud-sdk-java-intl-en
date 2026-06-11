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

public class AppointLabel extends AbstractModel {

    /**
    * Specify the tag type.

-0: ALL Pod labels, invalid field Keys
-Specify the Pod label. The Keys field cannot be empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The key of the metadata Pod tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix: `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-name format `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
     * Get Specify the tag type.

-0: ALL Pod labels, invalid field Keys
-Specify the Pod label. The Keys field cannot be empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Specify the tag type.

-0: ALL Pod labels, invalid field Keys
-Specify the Pod label. The Keys field cannot be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Specify the tag type.

-0: ALL Pod labels, invalid field Keys
-Specify the Pod label. The Keys field cannot be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Specify the tag type.

-0: ALL Pod labels, invalid field Keys
-Specify the Pod label. The Keys field cannot be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The key of the metadata Pod tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix: `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-name format `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keys The key of the metadata Pod tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix: `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-name format `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set The key of the metadata Pod tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix: `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-name format `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keys The key of the metadata Pod tag. A valid tag key has two parts: an optional prefix and a name, separated by a slash (/). The name part is necessary and must be no more than 63 characters, starting and ending with alphanumeric characters ([a-z0-9A-Z]), with hyphens (-), underscores (_), dots (.), and alphanumerics in the middle. The prefix is optional. If specified, the prefix must be a DNS subdomain: a series of DNS labels separated by dots (.), with a total length not exceeding 253 characters, followed by a slash (/).

-Format of prefix: `[a-z0-9]([-a-z0-9]*[a-z0-9])?(\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*`
-name format `([A-Za-z0-9][-A-Za-z0-9_.]*)?[A-Za-z0-9]`
-key must be unique
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    public AppointLabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppointLabel(AppointLabel source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);

    }
}

