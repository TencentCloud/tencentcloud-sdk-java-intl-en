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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckDataEngineImageCanBeRollbackResponse extends AbstractModel {

    /**
    * Log record ID after rolling back
    */
    @SerializedName("ToRecordId")
    @Expose
    private String ToRecordId;

    /**
    * Log record ID before rolling back
    */
    @SerializedName("FromRecordId")
    @Expose
    private String FromRecordId;

    /**
    * Whether it can be rolled back
    */
    @SerializedName("IsRollback")
    @Expose
    private Boolean IsRollback;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Log record ID after rolling back 
     * @return ToRecordId Log record ID after rolling back
     */
    public String getToRecordId() {
        return this.ToRecordId;
    }

    /**
     * Set Log record ID after rolling back
     * @param ToRecordId Log record ID after rolling back
     */
    public void setToRecordId(String ToRecordId) {
        this.ToRecordId = ToRecordId;
    }

    /**
     * Get Log record ID before rolling back 
     * @return FromRecordId Log record ID before rolling back
     */
    public String getFromRecordId() {
        return this.FromRecordId;
    }

    /**
     * Set Log record ID before rolling back
     * @param FromRecordId Log record ID before rolling back
     */
    public void setFromRecordId(String FromRecordId) {
        this.FromRecordId = FromRecordId;
    }

    /**
     * Get Whether it can be rolled back 
     * @return IsRollback Whether it can be rolled back
     */
    public Boolean getIsRollback() {
        return this.IsRollback;
    }

    /**
     * Set Whether it can be rolled back
     * @param IsRollback Whether it can be rolled back
     */
    public void setIsRollback(Boolean IsRollback) {
        this.IsRollback = IsRollback;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckDataEngineImageCanBeRollbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckDataEngineImageCanBeRollbackResponse(CheckDataEngineImageCanBeRollbackResponse source) {
        if (source.ToRecordId != null) {
            this.ToRecordId = new String(source.ToRecordId);
        }
        if (source.FromRecordId != null) {
            this.FromRecordId = new String(source.FromRecordId);
        }
        if (source.IsRollback != null) {
            this.IsRollback = new Boolean(source.IsRollback);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ToRecordId", this.ToRecordId);
        this.setParamSimple(map, prefix + "FromRecordId", this.FromRecordId);
        this.setParamSimple(map, prefix + "IsRollback", this.IsRollback);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

