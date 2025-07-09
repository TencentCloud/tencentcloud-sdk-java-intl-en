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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVersionByFunctionResponse extends AbstractModel {

    /**
    * Function version
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String [] FunctionVersion;

    /**
    * Function version list
Note: This field may return null, indicating that no valid values is found.
    */
    @SerializedName("Versions")
    @Expose
    private FunctionVersion [] Versions;

    /**
    * Total number of function versions
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Function version 
     * @return FunctionVersion Function version
     */
    public String [] getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set Function version
     * @param FunctionVersion Function version
     */
    public void setFunctionVersion(String [] FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get Function version list
Note: This field may return null, indicating that no valid values is found. 
     * @return Versions Function version list
Note: This field may return null, indicating that no valid values is found.
     */
    public FunctionVersion [] getVersions() {
        return this.Versions;
    }

    /**
     * Set Function version list
Note: This field may return null, indicating that no valid values is found.
     * @param Versions Function version list
Note: This field may return null, indicating that no valid values is found.
     */
    public void setVersions(FunctionVersion [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get Total number of function versions
Note: This field may return null, indicating that no valid value was found. 
     * @return TotalCount Total number of function versions
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of function versions
Note: This field may return null, indicating that no valid value was found.
     * @param TotalCount Total number of function versions
Note: This field may return null, indicating that no valid value was found.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public ListVersionByFunctionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVersionByFunctionResponse(ListVersionByFunctionResponse source) {
        if (source.FunctionVersion != null) {
            this.FunctionVersion = new String[source.FunctionVersion.length];
            for (int i = 0; i < source.FunctionVersion.length; i++) {
                this.FunctionVersion[i] = new String(source.FunctionVersion[i]);
            }
        }
        if (source.Versions != null) {
            this.Versions = new FunctionVersion[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new FunctionVersion(source.Versions[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FunctionVersion.", this.FunctionVersion);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

