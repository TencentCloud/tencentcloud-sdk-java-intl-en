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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvailableTKEEdgeVersionResponse extends AbstractModel{

    /**
    * Version list
    */
    @SerializedName("Versions")
    @Expose
    private String [] Versions;

    /**
    * Latest version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EdgeVersionLatest")
    @Expose
    private String EdgeVersionLatest;

    /**
    * Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EdgeVersionCurrent")
    @Expose
    private String EdgeVersionCurrent;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Version list 
     * @return Versions Version list
     */
    public String [] getVersions() {
        return this.Versions;
    }

    /**
     * Set Version list
     * @param Versions Version list
     */
    public void setVersions(String [] Versions) {
        this.Versions = Versions;
    }

    /**
     * Get Latest version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EdgeVersionLatest Latest version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEdgeVersionLatest() {
        return this.EdgeVersionLatest;
    }

    /**
     * Set Latest version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EdgeVersionLatest Latest version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEdgeVersionLatest(String EdgeVersionLatest) {
        this.EdgeVersionLatest = EdgeVersionLatest;
    }

    /**
     * Get Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EdgeVersionCurrent Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEdgeVersionCurrent() {
        return this.EdgeVersionCurrent;
    }

    /**
     * Set Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EdgeVersionCurrent Current version of the edge cluster
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEdgeVersionCurrent(String EdgeVersionCurrent) {
        this.EdgeVersionCurrent = EdgeVersionCurrent;
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

    public DescribeAvailableTKEEdgeVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableTKEEdgeVersionResponse(DescribeAvailableTKEEdgeVersionResponse source) {
        if (source.Versions != null) {
            this.Versions = new String[source.Versions.length];
            for (int i = 0; i < source.Versions.length; i++) {
                this.Versions[i] = new String(source.Versions[i]);
            }
        }
        if (source.EdgeVersionLatest != null) {
            this.EdgeVersionLatest = new String(source.EdgeVersionLatest);
        }
        if (source.EdgeVersionCurrent != null) {
            this.EdgeVersionCurrent = new String(source.EdgeVersionCurrent);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Versions.", this.Versions);
        this.setParamSimple(map, prefix + "EdgeVersionLatest", this.EdgeVersionLatest);
        this.setParamSimple(map, prefix + "EdgeVersionCurrent", this.EdgeVersionCurrent);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

