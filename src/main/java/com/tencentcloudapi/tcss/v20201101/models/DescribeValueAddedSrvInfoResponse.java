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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeValueAddedSrvInfoResponse extends AbstractModel {

    /**
    * Number of unlicensed repository images
    */
    @SerializedName("RegistryImageCnt")
    @Expose
    private Long RegistryImageCnt;

    /**
    * Number of unlicensed local images
    */
    @SerializedName("LocalImageCnt")
    @Expose
    private Long LocalImageCnt;

    /**
    * Number of unused image security scan licenses
    */
    @SerializedName("UnusedAuthorizedCnt")
    @Expose
    private Long UnusedAuthorizedCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of unlicensed repository images 
     * @return RegistryImageCnt Number of unlicensed repository images
     */
    public Long getRegistryImageCnt() {
        return this.RegistryImageCnt;
    }

    /**
     * Set Number of unlicensed repository images
     * @param RegistryImageCnt Number of unlicensed repository images
     */
    public void setRegistryImageCnt(Long RegistryImageCnt) {
        this.RegistryImageCnt = RegistryImageCnt;
    }

    /**
     * Get Number of unlicensed local images 
     * @return LocalImageCnt Number of unlicensed local images
     */
    public Long getLocalImageCnt() {
        return this.LocalImageCnt;
    }

    /**
     * Set Number of unlicensed local images
     * @param LocalImageCnt Number of unlicensed local images
     */
    public void setLocalImageCnt(Long LocalImageCnt) {
        this.LocalImageCnt = LocalImageCnt;
    }

    /**
     * Get Number of unused image security scan licenses 
     * @return UnusedAuthorizedCnt Number of unused image security scan licenses
     */
    public Long getUnusedAuthorizedCnt() {
        return this.UnusedAuthorizedCnt;
    }

    /**
     * Set Number of unused image security scan licenses
     * @param UnusedAuthorizedCnt Number of unused image security scan licenses
     */
    public void setUnusedAuthorizedCnt(Long UnusedAuthorizedCnt) {
        this.UnusedAuthorizedCnt = UnusedAuthorizedCnt;
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

    public DescribeValueAddedSrvInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeValueAddedSrvInfoResponse(DescribeValueAddedSrvInfoResponse source) {
        if (source.RegistryImageCnt != null) {
            this.RegistryImageCnt = new Long(source.RegistryImageCnt);
        }
        if (source.LocalImageCnt != null) {
            this.LocalImageCnt = new Long(source.LocalImageCnt);
        }
        if (source.UnusedAuthorizedCnt != null) {
            this.UnusedAuthorizedCnt = new Long(source.UnusedAuthorizedCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryImageCnt", this.RegistryImageCnt);
        this.setParamSimple(map, prefix + "LocalImageCnt", this.LocalImageCnt);
        this.setParamSimple(map, prefix + "UnusedAuthorizedCnt", this.UnusedAuthorizedCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

