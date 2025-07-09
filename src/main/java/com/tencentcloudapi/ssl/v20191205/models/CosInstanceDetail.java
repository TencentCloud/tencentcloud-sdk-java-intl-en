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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInstanceDetail extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Bound certificate id.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * ENABLED: domain name online status.
DISABLED: domain name offline status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * bucket region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Domain name. 
     * @return Domain Domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name.
     * @param Domain Domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Bound certificate id. 
     * @return CertId Bound certificate id.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Bound certificate id.
     * @param CertId Bound certificate id.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get ENABLED: domain name online status.
DISABLED: domain name offline status. 
     * @return Status ENABLED: domain name online status.
DISABLED: domain name offline status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ENABLED: domain name online status.
DISABLED: domain name offline status.
     * @param Status ENABLED: domain name online status.
DISABLED: domain name offline status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get bucket name. 
     * @return Bucket bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set bucket name.
     * @param Bucket bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get bucket region. 
     * @return Region bucket region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set bucket region.
     * @param Region bucket region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CosInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosInstanceDetail(CosInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

