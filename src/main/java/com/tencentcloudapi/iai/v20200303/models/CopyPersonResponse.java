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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyPersonResponse extends AbstractModel {

    /**
    * Number of groups successfully added to.
    */
    @SerializedName("SucGroupNum")
    @Expose
    private Long SucGroupNum;

    /**
    * List of groups successfully added to.
    */
    @SerializedName("SucGroupIds")
    @Expose
    private String [] SucGroupIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of groups successfully added to. 
     * @return SucGroupNum Number of groups successfully added to.
     */
    public Long getSucGroupNum() {
        return this.SucGroupNum;
    }

    /**
     * Set Number of groups successfully added to.
     * @param SucGroupNum Number of groups successfully added to.
     */
    public void setSucGroupNum(Long SucGroupNum) {
        this.SucGroupNum = SucGroupNum;
    }

    /**
     * Get List of groups successfully added to. 
     * @return SucGroupIds List of groups successfully added to.
     */
    public String [] getSucGroupIds() {
        return this.SucGroupIds;
    }

    /**
     * Set List of groups successfully added to.
     * @param SucGroupIds List of groups successfully added to.
     */
    public void setSucGroupIds(String [] SucGroupIds) {
        this.SucGroupIds = SucGroupIds;
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

    public CopyPersonResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyPersonResponse(CopyPersonResponse source) {
        if (source.SucGroupNum != null) {
            this.SucGroupNum = new Long(source.SucGroupNum);
        }
        if (source.SucGroupIds != null) {
            this.SucGroupIds = new String[source.SucGroupIds.length];
            for (int i = 0; i < source.SucGroupIds.length; i++) {
                this.SucGroupIds[i] = new String(source.SucGroupIds[i]);
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
        this.setParamSimple(map, prefix + "SucGroupNum", this.SucGroupNum);
        this.setParamArraySimple(map, prefix + "SucGroupIds.", this.SucGroupIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

