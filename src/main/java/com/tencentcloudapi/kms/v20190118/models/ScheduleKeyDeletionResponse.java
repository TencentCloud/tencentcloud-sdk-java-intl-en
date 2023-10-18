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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleKeyDeletionResponse extends AbstractModel {

    /**
    * Schedule deletion execution time
    */
    @SerializedName("DeletionDate")
    @Expose
    private Long DeletionDate;

    /**
    * Unique ID of the CMK scheduled for deletion
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Schedule deletion execution time 
     * @return DeletionDate Schedule deletion execution time
     */
    public Long getDeletionDate() {
        return this.DeletionDate;
    }

    /**
     * Set Schedule deletion execution time
     * @param DeletionDate Schedule deletion execution time
     */
    public void setDeletionDate(Long DeletionDate) {
        this.DeletionDate = DeletionDate;
    }

    /**
     * Get Unique ID of the CMK scheduled for deletion 
     * @return KeyId Unique ID of the CMK scheduled for deletion
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of the CMK scheduled for deletion
     * @param KeyId Unique ID of the CMK scheduled for deletion
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
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

    public ScheduleKeyDeletionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleKeyDeletionResponse(ScheduleKeyDeletionResponse source) {
        if (source.DeletionDate != null) {
            this.DeletionDate = new Long(source.DeletionDate);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeletionDate", this.DeletionDate);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

