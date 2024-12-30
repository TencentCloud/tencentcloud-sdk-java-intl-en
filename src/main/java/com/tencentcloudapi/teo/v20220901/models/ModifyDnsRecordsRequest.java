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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDnsRecordsRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of DNS record modification data, with a maximum of 100 modifications at a time.
    */
    @SerializedName("DnsRecords")
    @Expose
    private DnsRecord [] DnsRecords;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of DNS record modification data, with a maximum of 100 modifications at a time. 
     * @return DnsRecords List of DNS record modification data, with a maximum of 100 modifications at a time.
     */
    public DnsRecord [] getDnsRecords() {
        return this.DnsRecords;
    }

    /**
     * Set List of DNS record modification data, with a maximum of 100 modifications at a time.
     * @param DnsRecords List of DNS record modification data, with a maximum of 100 modifications at a time.
     */
    public void setDnsRecords(DnsRecord [] DnsRecords) {
        this.DnsRecords = DnsRecords;
    }

    public ModifyDnsRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDnsRecordsRequest(ModifyDnsRecordsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DnsRecords != null) {
            this.DnsRecords = new DnsRecord[source.DnsRecords.length];
            for (int i = 0; i < source.DnsRecords.length; i++) {
                this.DnsRecords[i] = new DnsRecord(source.DnsRecords[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "DnsRecords.", this.DnsRecords);

    }
}

