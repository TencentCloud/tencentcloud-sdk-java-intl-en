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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListReceiversRequest extends AbstractModel {

    /**
    * Offset, starting from 0. The value is an integer.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of records to query. The value is an integer not exceeding 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Group status (`1`: to be uploaded; `2` uploading; `3` uploaded). To query groups in all states, do not pass in this parameter.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Group name keyword for fuzzy query
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get Offset, starting from 0. The value is an integer. 
     * @return Offset Offset, starting from 0. The value is an integer.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, starting from 0. The value is an integer.
     * @param Offset Offset, starting from 0. The value is an integer.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of records to query. The value is an integer not exceeding 100. 
     * @return Limit Number of records to query. The value is an integer not exceeding 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records to query. The value is an integer not exceeding 100.
     * @param Limit Number of records to query. The value is an integer not exceeding 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Group status (`1`: to be uploaded; `2` uploading; `3` uploaded). To query groups in all states, do not pass in this parameter. 
     * @return Status Group status (`1`: to be uploaded; `2` uploading; `3` uploaded). To query groups in all states, do not pass in this parameter.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Group status (`1`: to be uploaded; `2` uploading; `3` uploaded). To query groups in all states, do not pass in this parameter.
     * @param Status Group status (`1`: to be uploaded; `2` uploading; `3` uploaded). To query groups in all states, do not pass in this parameter.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Group name keyword for fuzzy query 
     * @return KeyWord Group name keyword for fuzzy query
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set Group name keyword for fuzzy query
     * @param KeyWord Group name keyword for fuzzy query
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public ListReceiversRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListReceiversRequest(ListReceiversRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

