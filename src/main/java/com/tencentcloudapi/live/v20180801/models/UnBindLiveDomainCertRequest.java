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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnBindLiveDomainCertRequest extends AbstractModel{

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Valid values:
`gray`: unbind the canary certificate
`formal` (default): unbind the formal certificate

`formal` will be used if no value is passed in
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Valid values:
`gray`: unbind the canary certificate
`formal` (default): unbind the formal certificate

`formal` will be used if no value is passed in 
     * @return Type Valid values:
`gray`: unbind the canary certificate
`formal` (default): unbind the formal certificate

`formal` will be used if no value is passed in
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Valid values:
`gray`: unbind the canary certificate
`formal` (default): unbind the formal certificate

`formal` will be used if no value is passed in
     * @param Type Valid values:
`gray`: unbind the canary certificate
`formal` (default): unbind the formal certificate

`formal` will be used if no value is passed in
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public UnBindLiveDomainCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindLiveDomainCertRequest(UnBindLiveDomainCertRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

