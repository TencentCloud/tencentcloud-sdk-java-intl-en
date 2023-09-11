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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBHostInstance extends AbstractModel{

    /**
    * The domain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The resolution status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DNSStatus")
    @Expose
    private String DNSStatus;

    /**
    * The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get The domain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The resolution status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DNSStatus The resolution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * Set The resolution status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DNSStatus The resolution status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDNSStatus(String DNSStatus) {
        this.DNSStatus = DNSStatus;
    }

    /**
     * Get The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OldCertificateId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OldCertificateId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public TCBHostInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBHostInstance(TCBHostInstance source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DNSStatus != null) {
            this.DNSStatus = new String(source.DNSStatus);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DNSStatus", this.DNSStatus);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

