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

public class ModifyCertificatesExpiringNotificationSwitchRequest extends AbstractModel {

    /**
    * Certificate ID list. maximum of 50.
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * 0: do not ignore notifications. 1: ignore notifications.
    */
    @SerializedName("SwitchStatus")
    @Expose
    private Long SwitchStatus;

    /**
     * Get Certificate ID list. maximum of 50. 
     * @return CertificateIds Certificate ID list. maximum of 50.
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set Certificate ID list. maximum of 50.
     * @param CertificateIds Certificate ID list. maximum of 50.
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get 0: do not ignore notifications. 1: ignore notifications. 
     * @return SwitchStatus 0: do not ignore notifications. 1: ignore notifications.
     */
    public Long getSwitchStatus() {
        return this.SwitchStatus;
    }

    /**
     * Set 0: do not ignore notifications. 1: ignore notifications.
     * @param SwitchStatus 0: do not ignore notifications. 1: ignore notifications.
     */
    public void setSwitchStatus(Long SwitchStatus) {
        this.SwitchStatus = SwitchStatus;
    }

    public ModifyCertificatesExpiringNotificationSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCertificatesExpiringNotificationSwitchRequest(ModifyCertificatesExpiringNotificationSwitchRequest source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.SwitchStatus != null) {
            this.SwitchStatus = new Long(source.SwitchStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "SwitchStatus", this.SwitchStatus);

    }
}

