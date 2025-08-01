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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveCertRequest extends AbstractModel {

    /**
    * Certificate ID obtained through the `DescribeLiveCerts` API.
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
     * Get Certificate ID obtained through the `DescribeLiveCerts` API. 
     * @return CertId Certificate ID obtained through the `DescribeLiveCerts` API.
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID obtained through the `DescribeLiveCerts` API.
     * @param CertId Certificate ID obtained through the `DescribeLiveCerts` API.
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    public DescribeLiveCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveCertRequest(DescribeLiveCertRequest source) {
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);

    }
}

