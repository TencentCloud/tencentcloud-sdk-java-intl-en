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

public class BatchModifyIntlDomainDNSRequest extends AbstractModel {

    /**
    * The target domains.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The domain DNS array.
    */
    @SerializedName("Dns")
    @Expose
    private String [] Dns;

    /**
    * Valid values: `batch_modify_domain_dns1`, `batch_modify_domain_dns2`, `batch_modify_domain_dns3`
    */
    @SerializedName("BatchAction")
    @Expose
    private String BatchAction;

    /**
     * Get The target domains. 
     * @return Domains The target domains.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The target domains.
     * @param Domains The target domains.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The domain DNS array. 
     * @return Dns The domain DNS array.
     */
    public String [] getDns() {
        return this.Dns;
    }

    /**
     * Set The domain DNS array.
     * @param Dns The domain DNS array.
     */
    public void setDns(String [] Dns) {
        this.Dns = Dns;
    }

    /**
     * Get Valid values: `batch_modify_domain_dns1`, `batch_modify_domain_dns2`, `batch_modify_domain_dns3` 
     * @return BatchAction Valid values: `batch_modify_domain_dns1`, `batch_modify_domain_dns2`, `batch_modify_domain_dns3`
     */
    public String getBatchAction() {
        return this.BatchAction;
    }

    /**
     * Set Valid values: `batch_modify_domain_dns1`, `batch_modify_domain_dns2`, `batch_modify_domain_dns3`
     * @param BatchAction Valid values: `batch_modify_domain_dns1`, `batch_modify_domain_dns2`, `batch_modify_domain_dns3`
     */
    public void setBatchAction(String BatchAction) {
        this.BatchAction = BatchAction;
    }

    public BatchModifyIntlDomainDNSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyIntlDomainDNSRequest(BatchModifyIntlDomainDNSRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Dns != null) {
            this.Dns = new String[source.Dns.length];
            for (int i = 0; i < source.Dns.length; i++) {
                this.Dns[i] = new String(source.Dns[i]);
            }
        }
        if (source.BatchAction != null) {
            this.BatchAction = new String(source.BatchAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "Dns.", this.Dns);
        this.setParamSimple(map, prefix + "BatchAction", this.BatchAction);

    }
}

