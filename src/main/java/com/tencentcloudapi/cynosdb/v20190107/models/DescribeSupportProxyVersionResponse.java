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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportProxyVersionResponse extends AbstractModel{

    /**
    * Collection of supported database proxy versions
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportProxyVersions")
    @Expose
    private String [] SupportProxyVersions;

    /**
    * The current proxy version
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentProxyVersion")
    @Expose
    private String CurrentProxyVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Collection of supported database proxy versions
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return SupportProxyVersions Collection of supported database proxy versions
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public String [] getSupportProxyVersions() {
        return this.SupportProxyVersions;
    }

    /**
     * Set Collection of supported database proxy versions
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param SupportProxyVersions Collection of supported database proxy versions
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setSupportProxyVersions(String [] SupportProxyVersions) {
        this.SupportProxyVersions = SupportProxyVersions;
    }

    /**
     * Get The current proxy version
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return CurrentProxyVersion The current proxy version
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public String getCurrentProxyVersion() {
        return this.CurrentProxyVersion;
    }

    /**
     * Set The current proxy version
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param CurrentProxyVersion The current proxy version
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setCurrentProxyVersion(String CurrentProxyVersion) {
        this.CurrentProxyVersion = CurrentProxyVersion;
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

    public DescribeSupportProxyVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportProxyVersionResponse(DescribeSupportProxyVersionResponse source) {
        if (source.SupportProxyVersions != null) {
            this.SupportProxyVersions = new String[source.SupportProxyVersions.length];
            for (int i = 0; i < source.SupportProxyVersions.length; i++) {
                this.SupportProxyVersions[i] = new String(source.SupportProxyVersions[i]);
            }
        }
        if (source.CurrentProxyVersion != null) {
            this.CurrentProxyVersion = new String(source.CurrentProxyVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SupportProxyVersions.", this.SupportProxyVersions);
        this.setParamSimple(map, prefix + "CurrentProxyVersion", this.CurrentProxyVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

