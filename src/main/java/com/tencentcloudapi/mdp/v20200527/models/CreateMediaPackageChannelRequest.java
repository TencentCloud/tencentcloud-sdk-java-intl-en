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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMediaPackageChannelRequest extends AbstractModel{

    /**
    * Channel name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Channel protocol. Valid values: HLS, DASH.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get Channel name. 
     * @return Name Channel name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name.
     * @param Name Channel name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Channel protocol. Valid values: HLS, DASH. 
     * @return Protocol Channel protocol. Valid values: HLS, DASH.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Channel protocol. Valid values: HLS, DASH.
     * @param Protocol Channel protocol. Valid values: HLS, DASH.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

