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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuPublishCdnParam extends AbstractModel{

    /**
    * The URLs of the CDNs to relay to.
    */
    @SerializedName("PublishCdnUrl")
    @Expose
    private String PublishCdnUrl;

    /**
    * Whether to relay to Tencent Cloud’s CDN. 0: Third-party CDN; 1 (default): Tencent Cloud’s CDN. Relaying to a third-party CDN will incur fees. To avoid unexpected charges, we recommend you pass in a specific value. For details, see the API document.
    */
    @SerializedName("IsTencentCdn")
    @Expose
    private Long IsTencentCdn;

    /**
     * Get The URLs of the CDNs to relay to. 
     * @return PublishCdnUrl The URLs of the CDNs to relay to.
     */
    public String getPublishCdnUrl() {
        return this.PublishCdnUrl;
    }

    /**
     * Set The URLs of the CDNs to relay to.
     * @param PublishCdnUrl The URLs of the CDNs to relay to.
     */
    public void setPublishCdnUrl(String PublishCdnUrl) {
        this.PublishCdnUrl = PublishCdnUrl;
    }

    /**
     * Get Whether to relay to Tencent Cloud’s CDN. 0: Third-party CDN; 1 (default): Tencent Cloud’s CDN. Relaying to a third-party CDN will incur fees. To avoid unexpected charges, we recommend you pass in a specific value. For details, see the API document. 
     * @return IsTencentCdn Whether to relay to Tencent Cloud’s CDN. 0: Third-party CDN; 1 (default): Tencent Cloud’s CDN. Relaying to a third-party CDN will incur fees. To avoid unexpected charges, we recommend you pass in a specific value. For details, see the API document.
     */
    public Long getIsTencentCdn() {
        return this.IsTencentCdn;
    }

    /**
     * Set Whether to relay to Tencent Cloud’s CDN. 0: Third-party CDN; 1 (default): Tencent Cloud’s CDN. Relaying to a third-party CDN will incur fees. To avoid unexpected charges, we recommend you pass in a specific value. For details, see the API document.
     * @param IsTencentCdn Whether to relay to Tencent Cloud’s CDN. 0: Third-party CDN; 1 (default): Tencent Cloud’s CDN. Relaying to a third-party CDN will incur fees. To avoid unexpected charges, we recommend you pass in a specific value. For details, see the API document.
     */
    public void setIsTencentCdn(Long IsTencentCdn) {
        this.IsTencentCdn = IsTencentCdn;
    }

    public McuPublishCdnParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuPublishCdnParam(McuPublishCdnParam source) {
        if (source.PublishCdnUrl != null) {
            this.PublishCdnUrl = new String(source.PublishCdnUrl);
        }
        if (source.IsTencentCdn != null) {
            this.IsTencentCdn = new Long(source.IsTencentCdn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublishCdnUrl", this.PublishCdnUrl);
        this.setParamSimple(map, prefix + "IsTencentCdn", this.IsTencentCdn);

    }
}

