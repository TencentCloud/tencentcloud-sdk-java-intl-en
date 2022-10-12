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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAccelerateServiceResponse extends AbstractModel{

    /**
    * Image acceleration status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * CFS VIP
    */
    @SerializedName("CFSVIP")
    @Expose
    private String CFSVIP;

    /**
    * Whether to enable
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Image acceleration status 
     * @return Status Image acceleration status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Image acceleration status
     * @param Status Image acceleration status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get CFS VIP 
     * @return CFSVIP CFS VIP
     */
    public String getCFSVIP() {
        return this.CFSVIP;
    }

    /**
     * Set CFS VIP
     * @param CFSVIP CFS VIP
     */
    public void setCFSVIP(String CFSVIP) {
        this.CFSVIP = CFSVIP;
    }

    /**
     * Get Whether to enable 
     * @return IsEnable Whether to enable
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set Whether to enable
     * @param IsEnable Whether to enable
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
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

    public DescribeImageAccelerateServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAccelerateServiceResponse(DescribeImageAccelerateServiceResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CFSVIP != null) {
            this.CFSVIP = new String(source.CFSVIP);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CFSVIP", this.CFSVIP);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

