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

public class RemoteAuthentication extends AbstractModel{

    /**
    * Remote authentication switch
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Remote authentication rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RemoteAuthenticationRules")
    @Expose
    private RemoteAuthenticationRule [] RemoteAuthenticationRules;

    /**
    * Remote authentication server
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
     * Get Remote authentication switch
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Switch Remote authentication switch
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Remote authentication switch
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Switch Remote authentication switch
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Remote authentication rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return RemoteAuthenticationRules Remote authentication rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RemoteAuthenticationRule [] getRemoteAuthenticationRules() {
        return this.RemoteAuthenticationRules;
    }

    /**
     * Set Remote authentication rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param RemoteAuthenticationRules Remote authentication rule configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRemoteAuthenticationRules(RemoteAuthenticationRule [] RemoteAuthenticationRules) {
        this.RemoteAuthenticationRules = RemoteAuthenticationRules;
    }

    /**
     * Get Remote authentication server
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Server Remote authentication server
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Remote authentication server
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Server Remote authentication server
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    public RemoteAuthentication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoteAuthentication(RemoteAuthentication source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RemoteAuthenticationRules != null) {
            this.RemoteAuthenticationRules = new RemoteAuthenticationRule[source.RemoteAuthenticationRules.length];
            for (int i = 0; i < source.RemoteAuthenticationRules.length; i++) {
                this.RemoteAuthenticationRules[i] = new RemoteAuthenticationRule(source.RemoteAuthenticationRules[i]);
            }
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "RemoteAuthenticationRules.", this.RemoteAuthenticationRules);
        this.setParamSimple(map, prefix + "Server", this.Server);

    }
}

