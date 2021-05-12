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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionMatch extends AbstractModel{

    /**
    * Function version name
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Matching rule key. When the API is called, pass in the `key` to route the request to the specified version based on the matching rule
Header method:
Enter "invoke.headers.User" for `key` and pass in `RoutingKey:{"User":"value"}` when invoking a function through `invoke` for invocation based on rule matching
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Match method. Valid values:
range: range match
exact: exact string match
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Rule requirements for range match:
It should be described in an open or closed range, i.e., `(a,b)` or `[a,b]`, where both a and b are integers
Rule requirements for exact match:
Exact string match
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
     * Get Function version name 
     * @return Version Function version name
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Function version name
     * @param Version Function version name
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Matching rule key. When the API is called, pass in the `key` to route the request to the specified version based on the matching rule
Header method:
Enter "invoke.headers.User" for `key` and pass in `RoutingKey:{"User":"value"}` when invoking a function through `invoke` for invocation based on rule matching 
     * @return Key Matching rule key. When the API is called, pass in the `key` to route the request to the specified version based on the matching rule
Header method:
Enter "invoke.headers.User" for `key` and pass in `RoutingKey:{"User":"value"}` when invoking a function through `invoke` for invocation based on rule matching
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Matching rule key. When the API is called, pass in the `key` to route the request to the specified version based on the matching rule
Header method:
Enter "invoke.headers.User" for `key` and pass in `RoutingKey:{"User":"value"}` when invoking a function through `invoke` for invocation based on rule matching
     * @param Key Matching rule key. When the API is called, pass in the `key` to route the request to the specified version based on the matching rule
Header method:
Enter "invoke.headers.User" for `key` and pass in `RoutingKey:{"User":"value"}` when invoking a function through `invoke` for invocation based on rule matching
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Match method. Valid values:
range: range match
exact: exact string match 
     * @return Method Match method. Valid values:
range: range match
exact: exact string match
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Match method. Valid values:
range: range match
exact: exact string match
     * @param Method Match method. Valid values:
range: range match
exact: exact string match
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Rule requirements for range match:
It should be described in an open or closed range, i.e., `(a,b)` or `[a,b]`, where both a and b are integers
Rule requirements for exact match:
Exact string match 
     * @return Expression Rule requirements for range match:
It should be described in an open or closed range, i.e., `(a,b)` or `[a,b]`, where both a and b are integers
Rule requirements for exact match:
Exact string match
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set Rule requirements for range match:
It should be described in an open or closed range, i.e., `(a,b)` or `[a,b]`, where both a and b are integers
Rule requirements for exact match:
Exact string match
     * @param Expression Rule requirements for range match:
It should be described in an open or closed range, i.e., `(a,b)` or `[a,b]`, where both a and b are integers
Rule requirements for exact match:
Exact string match
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    public VersionMatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionMatch(VersionMatch source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Expression", this.Expression);

    }
}

