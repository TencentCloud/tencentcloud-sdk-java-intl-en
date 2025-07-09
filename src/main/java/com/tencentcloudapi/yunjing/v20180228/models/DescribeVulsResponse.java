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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulsResponse extends AbstractModel {

    /**
    * Number of vulnerabilities.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Vulnerability list array.
    */
    @SerializedName("Vuls")
    @Expose
    private Vul [] Vuls;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of vulnerabilities. 
     * @return TotalCount Number of vulnerabilities.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of vulnerabilities.
     * @param TotalCount Number of vulnerabilities.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Vulnerability list array. 
     * @return Vuls Vulnerability list array.
     */
    public Vul [] getVuls() {
        return this.Vuls;
    }

    /**
     * Set Vulnerability list array.
     * @param Vuls Vulnerability list array.
     */
    public void setVuls(Vul [] Vuls) {
        this.Vuls = Vuls;
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

    public DescribeVulsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulsResponse(DescribeVulsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Vuls != null) {
            this.Vuls = new Vul[source.Vuls.length];
            for (int i = 0; i < source.Vuls.length; i++) {
                this.Vuls[i] = new Vul(source.Vuls[i]);
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
        this.setParamArrayObj(map, prefix + "Vuls.", this.Vuls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

