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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainBatchRequest extends AbstractModel {

    /**
    * Domain array
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * Add A records of @ and www for each domain with the record value of the IP. If this parameter is not passed in or is set to an empty string or null, only the domain but not the records will be added.
    */
    @SerializedName("RecordValue")
    @Expose
    private String RecordValue;

    /**
     * Get Domain array 
     * @return DomainList Domain array
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set Domain array
     * @param DomainList Domain array
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get Add A records of @ and www for each domain with the record value of the IP. If this parameter is not passed in or is set to an empty string or null, only the domain but not the records will be added. 
     * @return RecordValue Add A records of @ and www for each domain with the record value of the IP. If this parameter is not passed in or is set to an empty string or null, only the domain but not the records will be added.
     */
    public String getRecordValue() {
        return this.RecordValue;
    }

    /**
     * Set Add A records of @ and www for each domain with the record value of the IP. If this parameter is not passed in or is set to an empty string or null, only the domain but not the records will be added.
     * @param RecordValue Add A records of @ and www for each domain with the record value of the IP. If this parameter is not passed in or is set to an empty string or null, only the domain but not the records will be added.
     */
    public void setRecordValue(String RecordValue) {
        this.RecordValue = RecordValue;
    }

    public CreateDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainBatchRequest(CreateDomainBatchRequest source) {
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.RecordValue != null) {
            this.RecordValue = new String(source.RecordValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "RecordValue", this.RecordValue);

    }
}

