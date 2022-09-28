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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDnsRecordsRequest extends AbstractModel{

    /**
    * The site ID of the DNS record to be deleted.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The ID of the DNS record to be deleted.
    */
    @SerializedName("DnsRecordIds")
    @Expose
    private String [] DnsRecordIds;

    /**
     * Get The site ID of the DNS record to be deleted. 
     * @return ZoneId The site ID of the DNS record to be deleted.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID of the DNS record to be deleted.
     * @param ZoneId The site ID of the DNS record to be deleted.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The ID of the DNS record to be deleted. 
     * @return DnsRecordIds The ID of the DNS record to be deleted.
     */
    public String [] getDnsRecordIds() {
        return this.DnsRecordIds;
    }

    /**
     * Set The ID of the DNS record to be deleted.
     * @param DnsRecordIds The ID of the DNS record to be deleted.
     */
    public void setDnsRecordIds(String [] DnsRecordIds) {
        this.DnsRecordIds = DnsRecordIds;
    }

    public DeleteDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDnsRecordsRequest(DeleteDnsRecordsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DnsRecordIds != null) {
            this.DnsRecordIds = new String[source.DnsRecordIds.length];
            for (int i = 0; i < source.DnsRecordIds.length; i++) {
                this.DnsRecordIds[i] = new String(source.DnsRecordIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "DnsRecordIds.", this.DnsRecordIds);

    }
}

