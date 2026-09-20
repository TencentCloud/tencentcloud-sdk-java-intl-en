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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSVerifyInfo extends AbstractModel {

    /**
    * Sub-parsing.
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * Parse the value.
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * Parsing type.
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
     * Get Sub-parsing. 
     * @return SubDomain Sub-parsing.
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set Sub-parsing.
     * @param SubDomain Sub-parsing.
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get Parse the value. 
     * @return Record Parse the value.
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set Parse the value.
     * @param Record Parse the value.
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get Parsing type. 
     * @return RecordType Parsing type.
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set Parsing type.
     * @param RecordType Parsing type.
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    public DNSVerifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSVerifyInfo(DNSVerifyInfo source) {
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);

    }
}

