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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainCertRequest extends AbstractModel{

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private Long CertId;

    /**
    * Status. 0: off, 1: on.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Certificate ID. 
     * @return CertId Certificate ID.
     */
    public Long getCertId() {
        return this.CertId;
    }

    /**
     * Set Certificate ID.
     * @param CertId Certificate ID.
     */
    public void setCertId(Long CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Status. 0: off, 1: on. 
     * @return Status Status. 0: off, 1: on.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: off, 1: on.
     * @param Status Status. 0: off, 1: on.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyLiveDomainCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainCertRequest(ModifyLiveDomainCertRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.CertId != null) {
            this.CertId = new Long(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

