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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindLinearAssemblyCDNDomainWithChannelRequest extends AbstractModel {

    /**
    * Channel Id.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Cdn playback domain.
    */
    @SerializedName("CdnDomain")
    @Expose
    private String CdnDomain;

    /**
     * Get Channel Id. 
     * @return ChannelId Channel Id.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel Id.
     * @param ChannelId Channel Id.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Cdn playback domain. 
     * @return CdnDomain Cdn playback domain.
     */
    public String getCdnDomain() {
        return this.CdnDomain;
    }

    /**
     * Set Cdn playback domain.
     * @param CdnDomain Cdn playback domain.
     */
    public void setCdnDomain(String CdnDomain) {
        this.CdnDomain = CdnDomain;
    }

    public BindLinearAssemblyCDNDomainWithChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindLinearAssemblyCDNDomainWithChannelRequest(BindLinearAssemblyCDNDomainWithChannelRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.CdnDomain != null) {
            this.CdnDomain = new String(source.CdnDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "CdnDomain", this.CdnDomain);

    }
}

