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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoteAuthenticationRule extends AbstractModel{

    /**
    * Remote authentication server
The server configured in `RemoteAutherntication` is used by default.
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * HTTP method used by the remote authentication server. Valid values: `get`, `post`, `head`, and `all`. 
`all`: the remote authentication server follows the client request method.
Default: `all`
    */
    @SerializedName("AuthMethod")
    @Expose
    private String AuthMethod;

    /**
    * Rule types:
`all`: apply to all files
`file`: apply to files with the specified suffixes
`directory`: apply to the specified directories
`path`: apply to the specified absolute paths
Default: `all`.
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
Default: `*`
    */
    @SerializedName("RulePaths")
    @Expose
    private String [] RulePaths;

    /**
    * Timeout period of the remote authentication server. Unit: ms.
Value range: [1, 30,000]
Default: 20000
    */
    @SerializedName("AuthTimeout")
    @Expose
    private Long AuthTimeout;

    /**
    * Whether to deny or allow the request when the remote authentication server is timed out:
`RETURN_200`: the request is allowed when the remote authentication server is timed out.
`RETURN_403`: the request is denied when the remote authentication server is timed out.
Default: `RETURN_200`
    */
    @SerializedName("AuthTimeoutAction")
    @Expose
    private String AuthTimeoutAction;

    /**
     * Get Remote authentication server
The server configured in `RemoteAutherntication` is used by default. 
     * @return Server Remote authentication server
The server configured in `RemoteAutherntication` is used by default.
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Remote authentication server
The server configured in `RemoteAutherntication` is used by default.
     * @param Server Remote authentication server
The server configured in `RemoteAutherntication` is used by default.
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get HTTP method used by the remote authentication server. Valid values: `get`, `post`, `head`, and `all`. 
`all`: the remote authentication server follows the client request method.
Default: `all` 
     * @return AuthMethod HTTP method used by the remote authentication server. Valid values: `get`, `post`, `head`, and `all`. 
`all`: the remote authentication server follows the client request method.
Default: `all`
     */
    public String getAuthMethod() {
        return this.AuthMethod;
    }

    /**
     * Set HTTP method used by the remote authentication server. Valid values: `get`, `post`, `head`, and `all`. 
`all`: the remote authentication server follows the client request method.
Default: `all`
     * @param AuthMethod HTTP method used by the remote authentication server. Valid values: `get`, `post`, `head`, and `all`. 
`all`: the remote authentication server follows the client request method.
Default: `all`
     */
    public void setAuthMethod(String AuthMethod) {
        this.AuthMethod = AuthMethod;
    }

    /**
     * Get Rule types:
`all`: apply to all files
`file`: apply to files with the specified suffixes
`directory`: apply to the specified directories
`path`: apply to the specified absolute paths
Default: `all`. 
     * @return RuleType Rule types:
`all`: apply to all files
`file`: apply to files with the specified suffixes
`directory`: apply to the specified directories
`path`: apply to the specified absolute paths
Default: `all`.
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set Rule types:
`all`: apply to all files
`file`: apply to files with the specified suffixes
`directory`: apply to the specified directories
`path`: apply to the specified absolute paths
Default: `all`.
     * @param RuleType Rule types:
`all`: apply to all files
`file`: apply to files with the specified suffixes
`directory`: apply to the specified directories
`path`: apply to the specified absolute paths
Default: `all`.
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
Default: `*` 
     * @return RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
Default: `*`
     */
    public String [] getRulePaths() {
        return this.RulePaths;
    }

    /**
     * Set Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
Default: `*`
     * @param RulePaths Content for each `RuleType`:
For `all`, enter a wildcard `*`.
For `file`, enter a suffix, e.g., `jpg` or `txt`.
For `directory`, enter a path, e.g., `/xxx/test/`.
For `path`, enter an absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
Default: `*`
     */
    public void setRulePaths(String [] RulePaths) {
        this.RulePaths = RulePaths;
    }

    /**
     * Get Timeout period of the remote authentication server. Unit: ms.
Value range: [1, 30,000]
Default: 20000 
     * @return AuthTimeout Timeout period of the remote authentication server. Unit: ms.
Value range: [1, 30,000]
Default: 20000
     */
    public Long getAuthTimeout() {
        return this.AuthTimeout;
    }

    /**
     * Set Timeout period of the remote authentication server. Unit: ms.
Value range: [1, 30,000]
Default: 20000
     * @param AuthTimeout Timeout period of the remote authentication server. Unit: ms.
Value range: [1, 30,000]
Default: 20000
     */
    public void setAuthTimeout(Long AuthTimeout) {
        this.AuthTimeout = AuthTimeout;
    }

    /**
     * Get Whether to deny or allow the request when the remote authentication server is timed out:
`RETURN_200`: the request is allowed when the remote authentication server is timed out.
`RETURN_403`: the request is denied when the remote authentication server is timed out.
Default: `RETURN_200` 
     * @return AuthTimeoutAction Whether to deny or allow the request when the remote authentication server is timed out:
`RETURN_200`: the request is allowed when the remote authentication server is timed out.
`RETURN_403`: the request is denied when the remote authentication server is timed out.
Default: `RETURN_200`
     */
    public String getAuthTimeoutAction() {
        return this.AuthTimeoutAction;
    }

    /**
     * Set Whether to deny or allow the request when the remote authentication server is timed out:
`RETURN_200`: the request is allowed when the remote authentication server is timed out.
`RETURN_403`: the request is denied when the remote authentication server is timed out.
Default: `RETURN_200`
     * @param AuthTimeoutAction Whether to deny or allow the request when the remote authentication server is timed out:
`RETURN_200`: the request is allowed when the remote authentication server is timed out.
`RETURN_403`: the request is denied when the remote authentication server is timed out.
Default: `RETURN_200`
     */
    public void setAuthTimeoutAction(String AuthTimeoutAction) {
        this.AuthTimeoutAction = AuthTimeoutAction;
    }

    public RemoteAuthenticationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteAuthenticationRule(RemoteAuthenticationRule source) {
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.AuthMethod != null) {
            this.AuthMethod = new String(source.AuthMethod);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RulePaths != null) {
            this.RulePaths = new String[source.RulePaths.length];
            for (int i = 0; i < source.RulePaths.length; i++) {
                this.RulePaths[i] = new String(source.RulePaths[i]);
            }
        }
        if (source.AuthTimeout != null) {
            this.AuthTimeout = new Long(source.AuthTimeout);
        }
        if (source.AuthTimeoutAction != null) {
            this.AuthTimeoutAction = new String(source.AuthTimeoutAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "AuthMethod", this.AuthMethod);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RulePaths.", this.RulePaths);
        this.setParamSimple(map, prefix + "AuthTimeout", this.AuthTimeout);
        this.setParamSimple(map, prefix + "AuthTimeoutAction", this.AuthTimeoutAction);

    }
}

