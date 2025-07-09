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

public class AscriptionInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Subdomain")
    @Expose
    private String Subdomain;

    /**
    * The record type.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * The record value.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
     * Get  
     * @return Subdomain 
     */
    public String getSubdomain() {
        return this.Subdomain;
    }

    /**
     * Set 
     * @param Subdomain 
     */
    public void setSubdomain(String Subdomain) {
        this.Subdomain = Subdomain;
    }

    /**
     * Get The record type. 
     * @return RecordType The record type.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set The record type.
     * @param RecordType The record type.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get The record value. 
     * @return RecordValue The record value.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set The record value.
     * @param RecordValue The record value.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    public AscriptionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AscriptionInfo(AscriptionInfo source) {
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

