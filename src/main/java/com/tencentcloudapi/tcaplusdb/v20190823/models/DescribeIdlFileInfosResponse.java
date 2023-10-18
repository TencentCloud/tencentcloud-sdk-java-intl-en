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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdlFileInfosResponse extends AbstractModel {

    /**
    * Number of files
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of file details
    */
    @SerializedName("IdlFileInfos")
    @Expose
    private IdlFileInfo [] IdlFileInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of files 
     * @return TotalCount Number of files
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of files
     * @param TotalCount Number of files
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of file details 
     * @return IdlFileInfos List of file details
     */
    public IdlFileInfo [] getIdlFileInfos() {
        return this.IdlFileInfos;
    }

    /**
     * Set List of file details
     * @param IdlFileInfos List of file details
     */
    public void setIdlFileInfos(IdlFileInfo [] IdlFileInfos) {
        this.IdlFileInfos = IdlFileInfos;
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

    public DescribeIdlFileInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdlFileInfosResponse(DescribeIdlFileInfosResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.IdlFileInfos != null) {
            this.IdlFileInfos = new IdlFileInfo[source.IdlFileInfos.length];
            for (int i = 0; i < source.IdlFileInfos.length; i++) {
                this.IdlFileInfos[i] = new IdlFileInfo(source.IdlFileInfos[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "IdlFileInfos.", this.IdlFileInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

