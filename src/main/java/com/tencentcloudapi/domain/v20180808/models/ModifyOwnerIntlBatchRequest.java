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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwnerIntlBatchRequest extends AbstractModel {

    /**
    * The domains.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The user ID.
    */
    @SerializedName("ToUin")
    @Expose
    private String ToUin;

    /**
    * Whether to transfer the DNS service.
    */
    @SerializedName("DnsTransfer")
    @Expose
    private Boolean DnsTransfer;

    /**
     * Get The domains. 
     * @return Domains The domains.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domains.
     * @param Domains The domains.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The user ID. 
     * @return ToUin The user ID.
     */
    public String getToUin() {
        return this.ToUin;
    }

    /**
     * Set The user ID.
     * @param ToUin The user ID.
     */
    public void setToUin(String ToUin) {
        this.ToUin = ToUin;
    }

    /**
     * Get Whether to transfer the DNS service. 
     * @return DnsTransfer Whether to transfer the DNS service.
     */
    public Boolean getDnsTransfer() {
        return this.DnsTransfer;
    }

    /**
     * Set Whether to transfer the DNS service.
     * @param DnsTransfer Whether to transfer the DNS service.
     */
    public void setDnsTransfer(Boolean DnsTransfer) {
        this.DnsTransfer = DnsTransfer;
    }

    public ModifyOwnerIntlBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwnerIntlBatchRequest(ModifyOwnerIntlBatchRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.ToUin != null) {
            this.ToUin = new String(source.ToUin);
        }
        if (source.DnsTransfer != null) {
            this.DnsTransfer = new Boolean(source.DnsTransfer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "ToUin", this.ToUin);
        this.setParamSimple(map, prefix + "DnsTransfer", this.DnsTransfer);

    }
}

