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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrivateZoneRecordRequest extends AbstractModel {

    /**
    * Private domain ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Record ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * Array of record IDs. `RecordId` takes precedence.
    */
    @SerializedName("RecordIdSet")
    @Expose
    private String [] RecordIdSet;

    /**
     * Get Private domain ID 
     * @return ZoneId Private domain ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Private domain ID
     * @param ZoneId Private domain ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Record ID 
     * @return RecordId Record ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID
     * @param RecordId Record ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Array of record IDs. `RecordId` takes precedence. 
     * @return RecordIdSet Array of record IDs. `RecordId` takes precedence.
     */
    public String [] getRecordIdSet() {
        return this.RecordIdSet;
    }

    /**
     * Set Array of record IDs. `RecordId` takes precedence.
     * @param RecordIdSet Array of record IDs. `RecordId` takes precedence.
     */
    public void setRecordIdSet(String [] RecordIdSet) {
        this.RecordIdSet = RecordIdSet;
    }

    public DeletePrivateZoneRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrivateZoneRecordRequest(DeletePrivateZoneRecordRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RecordIdSet != null) {
            this.RecordIdSet = new String[source.RecordIdSet.length];
            for (int i = 0; i < source.RecordIdSet.length; i++) {
                this.RecordIdSet[i] = new String(source.RecordIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamArraySimple(map, prefix + "RecordIdSet.", this.RecordIdSet);

    }
}

