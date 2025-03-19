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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamCertInfo extends AbstractModel {

    /**
    * In the origin-pull mutual authentication scenario, this field represents the certificate (including the public and private keys) carried during EO node origin-pull, which is deployed in the EO node for the origin server to authenticate the EO node. When used as an input parameter, it is left blank to indicate retaining the original configuration.
    */
    @SerializedName("UpstreamMutualTLS")
    @Expose
    private MutualTLS UpstreamMutualTLS;

    /**
     * Get In the origin-pull mutual authentication scenario, this field represents the certificate (including the public and private keys) carried during EO node origin-pull, which is deployed in the EO node for the origin server to authenticate the EO node. When used as an input parameter, it is left blank to indicate retaining the original configuration. 
     * @return UpstreamMutualTLS In the origin-pull mutual authentication scenario, this field represents the certificate (including the public and private keys) carried during EO node origin-pull, which is deployed in the EO node for the origin server to authenticate the EO node. When used as an input parameter, it is left blank to indicate retaining the original configuration.
     */
    public MutualTLS getUpstreamMutualTLS() {
        return this.UpstreamMutualTLS;
    }

    /**
     * Set In the origin-pull mutual authentication scenario, this field represents the certificate (including the public and private keys) carried during EO node origin-pull, which is deployed in the EO node for the origin server to authenticate the EO node. When used as an input parameter, it is left blank to indicate retaining the original configuration.
     * @param UpstreamMutualTLS In the origin-pull mutual authentication scenario, this field represents the certificate (including the public and private keys) carried during EO node origin-pull, which is deployed in the EO node for the origin server to authenticate the EO node. When used as an input parameter, it is left blank to indicate retaining the original configuration.
     */
    public void setUpstreamMutualTLS(MutualTLS UpstreamMutualTLS) {
        this.UpstreamMutualTLS = UpstreamMutualTLS;
    }

    public UpstreamCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamCertInfo(UpstreamCertInfo source) {
        if (source.UpstreamMutualTLS != null) {
            this.UpstreamMutualTLS = new MutualTLS(source.UpstreamMutualTLS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UpstreamMutualTLS.", this.UpstreamMutualTLS);

    }
}

