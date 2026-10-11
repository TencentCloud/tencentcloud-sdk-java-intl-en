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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalAccess extends AbstractModel {

    /**
    * External access type. Currently, only CLB fields are supported.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * CLB configuration information.
    */
    @SerializedName("CLBServer")
    @Expose
    private CLBSetting CLBServer;

    /**
     * Get External access type. Currently, only CLB fields are supported. 
     * @return Type External access type. Currently, only CLB fields are supported.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set External access type. Currently, only CLB fields are supported.
     * @param Type External access type. Currently, only CLB fields are supported.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get CLB configuration information. 
     * @return CLBServer CLB configuration information.
     */
    public CLBSetting getCLBServer() {
        return this.CLBServer;
    }

    /**
     * Set CLB configuration information.
     * @param CLBServer CLB configuration information.
     */
    public void setCLBServer(CLBSetting CLBServer) {
        this.CLBServer = CLBServer;
    }

    public ExternalAccess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalAccess(ExternalAccess source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CLBServer != null) {
            this.CLBServer = new CLBSetting(source.CLBServer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CLBServer.", this.CLBServer);

    }
}

