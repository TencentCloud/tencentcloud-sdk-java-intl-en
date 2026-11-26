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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsVerification extends AbstractModel {

    /**
    * Host record.
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * Record type.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * Record value.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
     * Get Host record. 
     * @return Subdomain Host record.
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set Host record.
     * @param Subdomain Host record.
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get Record type. 
     * @return RecordType Record type.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Record type.
     * @param RecordType Record type.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get Record value. 
     * @return RecordValue Record value.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Record value.
     * @param RecordValue Record value.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    public DnsVerification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsVerification(DnsVerification source) {
        if (source.Subdomain != null) {
            this.Subdomain = new String(source.Subdomain);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Subdomain", this.Subdomain);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);

    }
}

