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

public class HostHeaderParameters extends AbstractModel {

    /**
    * Action to be executed. values:.
<Li>FollowOrigin: follow origin server domain name;</li>.
<Li>`Custom`: custom</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Host header rewrite requires a complete domain name.<br>note: this field is required when switch is on; when switch is off, this field is not required and any value will be ignored.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
     * Get Action to be executed. values:.
<Li>FollowOrigin: follow origin server domain name;</li>.
<Li>`Custom`: custom</li>. 
     * @return Action Action to be executed. values:.
<Li>FollowOrigin: follow origin server domain name;</li>.
<Li>`Custom`: custom</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to be executed. values:.
<Li>FollowOrigin: follow origin server domain name;</li>.
<Li>`Custom`: custom</li>.
     * @param Action Action to be executed. values:.
<Li>FollowOrigin: follow origin server domain name;</li>.
<Li>`Custom`: custom</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Host header rewrite requires a complete domain name.<br>note: this field is required when switch is on; when switch is off, this field is not required and any value will be ignored. 
     * @return ServerName Host header rewrite requires a complete domain name.<br>note: this field is required when switch is on; when switch is off, this field is not required and any value will be ignored.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Host header rewrite requires a complete domain name.<br>note: this field is required when switch is on; when switch is off, this field is not required and any value will be ignored.
     * @param ServerName Host header rewrite requires a complete domain name.<br>note: this field is required when switch is on; when switch is off, this field is not required and any value will be ignored.
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    public HostHeaderParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostHeaderParameters(HostHeaderParameters source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);

    }
}

