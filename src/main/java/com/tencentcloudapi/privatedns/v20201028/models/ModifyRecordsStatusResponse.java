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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordsStatusResponse extends AbstractModel {

    /**
    * The private domain ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The DNS record IDs.
    */
    @SerializedName("RecordIds")
    @Expose
    private Long [] RecordIds;

    /**
    * `enabled`: Enabled; `disabled`: Disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The private domain ID 
     * @return ZoneId The private domain ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The private domain ID
     * @param ZoneId The private domain ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The DNS record IDs. 
     * @return RecordIds The DNS record IDs.
     */
    public Long [] getRecordIds() {
        return this.RecordIds;
    }

    /**
     * Set The DNS record IDs.
     * @param RecordIds The DNS record IDs.
     */
    public void setRecordIds(Long [] RecordIds) {
        this.RecordIds = RecordIds;
    }

    /**
     * Get `enabled`: Enabled; `disabled`: Disabled. 
     * @return Status `enabled`: Enabled; `disabled`: Disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set `enabled`: Enabled; `disabled`: Disabled.
     * @param Status `enabled`: Enabled; `disabled`: Disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyRecordsStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordsStatusResponse(ModifyRecordsStatusResponse source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordIds != null) {
            this.RecordIds = new Long[source.RecordIds.length];
            for (int i = 0; i < source.RecordIds.length; i++) {
                this.RecordIds[i] = new Long(source.RecordIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RecordIds.", this.RecordIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

