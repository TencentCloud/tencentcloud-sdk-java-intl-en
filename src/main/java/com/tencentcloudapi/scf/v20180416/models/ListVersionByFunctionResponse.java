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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVersionByFunctionResponse extends AbstractModel{

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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FunctionVersion.", this.FunctionVersion);
        this.setParamArrayObj(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

