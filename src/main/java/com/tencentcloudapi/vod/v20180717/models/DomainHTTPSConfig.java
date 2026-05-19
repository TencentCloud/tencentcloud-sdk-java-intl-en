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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainHTTPSConfig extends AbstractModel {

    /**
    * <p>Certificate expiration time.<li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li></p><p>Parameter format: YYYY-MM-DDThh:mm:ss+08:00</p>
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * <p>Certificate ID in Tencent Cloud SSL product.</p>
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get <p>Certificate expiration time.<li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li></p><p>Parameter format: YYYY-MM-DDThh:mm:ss+08:00</p> 
     * @return CertExpireTime <p>Certificate expiration time.<li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li></p><p>Parameter format: YYYY-MM-DDThh:mm:ss+08:00</p>
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set <p>Certificate expiration time.<li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li></p><p>Parameter format: YYYY-MM-DDThh:mm:ss+08:00</p>
     * @param CertExpireTime <p>Certificate expiration time.<li>Format according to ISO 8601 standard. For details, see <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format description</a>.</li></p><p>Parameter format: YYYY-MM-DDThh:mm:ss+08:00</p>
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get <p>Certificate ID in Tencent Cloud SSL product.</p> 
     * @return CloudCertId <p>Certificate ID in Tencent Cloud SSL product.</p>
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set <p>Certificate ID in Tencent Cloud SSL product.</p>
     * @param CloudCertId <p>Certificate ID in Tencent Cloud SSL product.</p>
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
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
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertExpireTime", this.CertExpireTime);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);

    }
}

