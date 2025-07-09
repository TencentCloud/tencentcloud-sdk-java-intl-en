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

public class TeoInstanceDetail extends AbstractModel {

    /**
    * The domain.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * The certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * The AZ ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Domain status.
`Deployed`: deployed;.
`Processing`: deploying;.
`Applying`: applying;.
`Failed`: application failed;.
`Issued`: binding failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get The domain. 
     * @return Host The domain.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set The domain.
     * @param Host The domain.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get The certificate ID. 
     * @return CertId The certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID.
     * @param CertId The certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get The AZ ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneId The AZ ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The AZ ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneId The AZ ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Domain status.
`Deployed`: deployed;.
`Processing`: deploying;.
`Applying`: applying;.
`Failed`: application failed;.
`Issued`: binding failed. 
     * @return Status Domain status.
`Deployed`: deployed;.
`Processing`: deploying;.
`Applying`: applying;.
`Failed`: application failed;.
`Issued`: binding failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain status.
`Deployed`: deployed;.
`Processing`: deploying;.
`Applying`: applying;.
`Failed`: application failed;.
`Issued`: binding failed.
     * @param Status Domain status.
`Deployed`: deployed;.
`Processing`: deploying;.
`Applying`: applying;.
`Failed`: application failed;.
`Issued`: binding failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public TeoInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TeoInstanceDetail(TeoInstanceDetail source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

