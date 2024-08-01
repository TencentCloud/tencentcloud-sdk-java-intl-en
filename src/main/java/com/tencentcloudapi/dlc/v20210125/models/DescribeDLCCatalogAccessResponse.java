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

public class DescribeDLCCatalogAccessResponse extends AbstractModel {

    /**
    * Total
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of the permissions granted by DLCCatalog
    */
    @SerializedName("Rows")
    @Expose
    private DLCCatalogAccess [] Rows;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total 
     * @return TotalCount Total
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total
     * @param TotalCount Total
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of the permissions granted by DLCCatalog 
     * @return Rows List of the permissions granted by DLCCatalog
     */
    public DLCCatalogAccess [] getRows() {
        return this.Rows;
    }

    /**
     * Set List of the permissions granted by DLCCatalog
     * @param Rows List of the permissions granted by DLCCatalog
     */
    public void setRows(DLCCatalogAccess [] Rows) {
        this.Rows = Rows;
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

    public DescribeDLCCatalogAccessResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLCCatalogAccessResponse(DescribeDLCCatalogAccessResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Rows != null) {
            this.Rows = new DLCCatalogAccess[source.Rows.length];
            for (int i = 0; i < source.Rows.length; i++) {
                this.Rows[i] = new DLCCatalogAccess(source.Rows[i]);
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
        this.setParamArrayObj(map, prefix + "Rows.", this.Rows);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

