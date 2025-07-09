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

public class TkeSecretDetail extends AbstractModel {

    /**
    * The secret name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * The Ingress list.
    */
    @SerializedName("IngressList")
    @Expose
    private TkeIngressDetail [] IngressList;

    /**
    * The list of domains that do not match the new certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get The secret name. 
     * @return Name The secret name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The secret name.
     * @param Name The secret name.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get The Ingress list. 
     * @return IngressList The Ingress list.
     */
    public TkeIngressDetail [] getIngressList() {
        return this.IngressList;
    }

    /**
     * Set The Ingress list.
     * @param IngressList The Ingress list.
     */
    public void setIngressList(TkeIngressDetail [] IngressList) {
        this.IngressList = IngressList;
    }

    /**
     * Get The list of domains that do not match the new certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoMatchDomains The list of domains that do not match the new certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set The list of domains that do not match the new certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoMatchDomains The list of domains that do not match the new certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public TkeSecretDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeSecretDetail(TkeSecretDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.IngressList != null) {
            this.IngressList = new TkeIngressDetail[source.IngressList.length];
            for (int i = 0; i < source.IngressList.length; i++) {
                this.IngressList[i] = new TkeIngressDetail(source.IngressList[i]);
            }
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArrayObj(map, prefix + "IngressList.", this.IngressList);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

