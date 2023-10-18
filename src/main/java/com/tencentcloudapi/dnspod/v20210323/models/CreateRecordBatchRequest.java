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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordBatchRequest extends AbstractModel {

    /**
    * Domain ID. Separate multiple ones by comma.
    */
    @SerializedName("DomainIdList")
    @Expose
    private String [] DomainIdList;

    /**
    * Record array
    */
    @SerializedName("RecordList")
    @Expose
    private AddRecordBatch [] RecordList;

    /**
     * Get Domain ID. Separate multiple ones by comma. 
     * @return DomainIdList Domain ID. Separate multiple ones by comma.
     */
    public String [] getDomainIdList() {
        return this.DomainIdList;
    }

    /**
     * Set Domain ID. Separate multiple ones by comma.
     * @param DomainIdList Domain ID. Separate multiple ones by comma.
     */
    public void setDomainIdList(String [] DomainIdList) {
        this.DomainIdList = DomainIdList;
    }

    /**
     * Get Record array 
     * @return RecordList Record array
     */
    public AddRecordBatch [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set Record array
     * @param RecordList Record array
     */
    public void setRecordList(AddRecordBatch [] RecordList) {
        this.RecordList = RecordList;
    }

    public CreateRecordBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordBatchRequest(CreateRecordBatchRequest source) {
        if (source.DomainIdList != null) {
            this.DomainIdList = new String[source.DomainIdList.length];
            for (int i = 0; i < source.DomainIdList.length; i++) {
                this.DomainIdList[i] = new String(source.DomainIdList[i]);
            }
        }
        if (source.RecordList != null) {
            this.RecordList = new AddRecordBatch[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new AddRecordBatch(source.RecordList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainIdList.", this.DomainIdList);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);

    }
}

