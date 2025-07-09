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

public class BatchModifyIntlDomainInfoRequest extends AbstractModel {

    /**
    * The domains whose information is to be modified.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * The profile ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Whether to enable the 60-day inter-registrar transfer lock.
    */
    @SerializedName("LockTransfer")
    @Expose
    private Boolean LockTransfer;

    /**
     * Get The domains whose information is to be modified. 
     * @return Domains The domains whose information is to be modified.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set The domains whose information is to be modified.
     * @param Domains The domains whose information is to be modified.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The profile ID. 
     * @return TemplateId The profile ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The profile ID.
     * @param TemplateId The profile ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether to enable the 60-day inter-registrar transfer lock. 
     * @return LockTransfer Whether to enable the 60-day inter-registrar transfer lock.
     */
    public Boolean getLockTransfer() {
        return this.LockTransfer;
    }

    /**
     * Set Whether to enable the 60-day inter-registrar transfer lock.
     * @param LockTransfer Whether to enable the 60-day inter-registrar transfer lock.
     */
    public void setLockTransfer(Boolean LockTransfer) {
        this.LockTransfer = LockTransfer;
    }

    public BatchModifyIntlDomainInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyIntlDomainInfoRequest(BatchModifyIntlDomainInfoRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.LockTransfer != null) {
            this.LockTransfer = new Boolean(source.LockTransfer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "LockTransfer", this.LockTransfer);

    }
}

