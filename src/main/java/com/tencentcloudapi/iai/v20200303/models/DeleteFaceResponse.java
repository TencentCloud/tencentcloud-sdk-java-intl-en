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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFaceResponse extends AbstractModel {

    /**
    * Number of successfully deleted faces
    */
    @SerializedName("SucDeletedNum")
    @Expose
    private Long SucDeletedNum;

    /**
    * List of IDs of successfully deleted faces
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of successfully deleted faces 
     * @return SucDeletedNum Number of successfully deleted faces
     */
    public Long getSucDeletedNum() {
        return this.SucDeletedNum;
    }

    /**
     * Set Number of successfully deleted faces
     * @param SucDeletedNum Number of successfully deleted faces
     */
    public void setSucDeletedNum(Long SucDeletedNum) {
        this.SucDeletedNum = SucDeletedNum;
    }

    /**
     * Get List of IDs of successfully deleted faces 
     * @return SucFaceIds List of IDs of successfully deleted faces
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set List of IDs of successfully deleted faces
     * @param SucFaceIds List of IDs of successfully deleted faces
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
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

    public DeleteFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFaceResponse(DeleteFaceResponse source) {
        if (source.SucDeletedNum != null) {
            this.SucDeletedNum = new Long(source.SucDeletedNum);
        }
        if (source.SucFaceIds != null) {
            this.SucFaceIds = new String[source.SucFaceIds.length];
            for (int i = 0; i < source.SucFaceIds.length; i++) {
                this.SucFaceIds[i] = new String(source.SucFaceIds[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SucDeletedNum", this.SucDeletedNum);
        this.setParamArraySimple(map, prefix + "SucFaceIds.", this.SucFaceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

