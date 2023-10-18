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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainHTTPSConfig extends AbstractModel {

    /**
    * Time when the certificate expires
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
     * Get Time when the certificate expires
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li> 
     * @return CertExpireTime Time when the certificate expires
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set Time when the certificate expires
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     * @param CertExpireTime Time when the certificate expires
<li>The time is in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732).</li>
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    public DomainHTTPSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainHTTPSConfig(DomainHTTPSConfig source) {
        if (source.CertExpireTime != null) {
            this.CertExpireTime = new String(source.CertExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);

    }
}

