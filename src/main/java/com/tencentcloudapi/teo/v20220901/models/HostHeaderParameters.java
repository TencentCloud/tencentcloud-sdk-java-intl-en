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
    * Execution action. Valid values:
<li>`followOrigin`: Follow source site domain;</li>
<li>custom: Custom.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Host Header rewrite requires a complete domain name.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field, and if specified, it does not take effect.
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
     * Get Execution action. Valid values:
<li>`followOrigin`: Follow source site domain;</li>
<li>custom: Custom.</li> 
     * @return Action Execution action. Valid values:
<li>`followOrigin`: Follow source site domain;</li>
<li>custom: Custom.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Execution action. Valid values:
<li>`followOrigin`: Follow source site domain;</li>
<li>custom: Custom.</li>
     * @param Action Execution action. Valid values:
<li>`followOrigin`: Follow source site domain;</li>
<li>custom: Custom.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Host Header rewrite requires a complete domain name.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field, and if specified, it does not take effect. 
     * @return ServerName Host Header rewrite requires a complete domain name.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field, and if specified, it does not take effect.
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set Host Header rewrite requires a complete domain name.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field, and if specified, it does not take effect.
     * @param ServerName Host Header rewrite requires a complete domain name.<br>Note: When Switch is on, this field is required. When Switch is off, no need to specify this field, and if specified, it does not take effect.
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

