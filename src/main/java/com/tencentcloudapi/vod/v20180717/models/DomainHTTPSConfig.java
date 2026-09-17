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
    * 
    */
    @SerializedName("CertExpireTime")
    @Expose
    private String CertExpireTime;

    /**
    * 
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
     * Get  
     * @return CertExpireTime 
     */
    public String getCertExpireTime() {
        return this.CertExpireTime;
    }

    /**
     * Set 
     * @param CertExpireTime 
     */
    public void setCertExpireTime(String CertExpireTime) {
        this.CertExpireTime = CertExpireTime;
    }

    /**
     * Get  
     * @return CloudCertId 
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set 
     * @param CloudCertId 
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

