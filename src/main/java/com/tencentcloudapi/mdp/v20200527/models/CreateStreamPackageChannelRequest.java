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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamPackageChannelRequest extends AbstractModel {

    /**
    * Channel name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Channel protocol. Valid values: HLS, DASH, CMAF.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Cache configuration.
    */
    @SerializedName("CacheInfo")
    @Expose
    private CacheInfo CacheInfo;

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
     * Get Channel protocol. Valid values: HLS, DASH, CMAF. 
     * @return Protocol Channel protocol. Valid values: HLS, DASH, CMAF.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Channel protocol. Valid values: HLS, DASH, CMAF.
     * @param Protocol Channel protocol. Valid values: HLS, DASH, CMAF.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Cache configuration. 
     * @return CacheInfo Cache configuration.
     */
    public CacheInfo getCacheInfo() {
        return this.CacheInfo;
    }

    /**
     * Set Cache configuration.
     * @param CacheInfo Cache configuration.
     */
    public void setCacheInfo(CacheInfo CacheInfo) {
        this.CacheInfo = CacheInfo;
    }

    public CreateStreamPackageChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageChannelRequest(CreateStreamPackageChannelRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CacheInfo != null) {
            this.CacheInfo = new CacheInfo(source.CacheInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "CacheInfo.", this.CacheInfo);

    }
}

