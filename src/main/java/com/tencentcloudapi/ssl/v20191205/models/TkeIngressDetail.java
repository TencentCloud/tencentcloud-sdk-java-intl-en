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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TkeIngressDetail extends AbstractModel {

    /**
    * The Ingress name.
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * The list of TLS domains.
    */
    @SerializedName("TlsDomains")
    @Expose
    private String [] TlsDomains;

    /**
    * The list of Ingress domains.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get The Ingress name. 
     * @return IngressName The Ingress name.
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set The Ingress name.
     * @param IngressName The Ingress name.
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    /**
     * Get The list of TLS domains. 
     * @return TlsDomains The list of TLS domains.
     */
    public String [] getTlsDomains() {
        return this.TlsDomains;
    }

    /**
     * Set The list of TLS domains.
     * @param TlsDomains The list of TLS domains.
     */
    public void setTlsDomains(String [] TlsDomains) {
        this.TlsDomains = TlsDomains;
    }

    /**
     * Get The list of Ingress domains. 
     * @return Domains The list of Ingress domains.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The list of Ingress domains.
     * @param Domains The list of Ingress domains.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public TkeIngressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeIngressDetail(TkeIngressDetail source) {
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
        }
        if (source.TlsDomains != null) {
            this.TlsDomains = new String[source.TlsDomains.length];
            for (int i = 0; i < source.TlsDomains.length; i++) {
                this.TlsDomains[i] = new String(source.TlsDomains[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamArraySimple(map, prefix + "TlsDomains.", this.TlsDomains);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

