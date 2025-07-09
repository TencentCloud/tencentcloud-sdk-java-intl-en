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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesRequest extends AbstractModel {

    /**
    * Certificate type. Where:
0: basic authentication configuration;
1: client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
-1: all types.
The default value is -1.
    */
    @SerializedName("CertificateType")
    @Expose
    private Long CertificateType;

    /**
    * Offset. The default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Quantity limit. The default value is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Certificate type. Where:
0: basic authentication configuration;
1: client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
-1: all types.
The default value is -1. 
     * @return CertificateType Certificate type. Where:
0: basic authentication configuration;
1: client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
-1: all types.
The default value is -1.
     */
    public Long getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. Where:
0: basic authentication configuration;
1: client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
-1: all types.
The default value is -1.
     * @param CertificateType Certificate type. Where:
0: basic authentication configuration;
1: client CA certificate;
2: server SSL certificate;
3: origin server CA certificate;
4: connection SSL certificate.
-1: all types.
The default value is -1.
     */
    public void setCertificateType(Long CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Offset. The default value is 0. 
     * @return Offset Offset. The default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. The default value is 0.
     * @param Offset Offset. The default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Quantity limit. The default value is 20. 
     * @return Limit Quantity limit. The default value is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quantity limit. The default value is 20.
     * @param Limit Quantity limit. The default value is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificatesRequest(DescribeCertificatesRequest source) {
        if (source.CertificateType != null) {
            this.CertificateType = new Long(source.CertificateType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

