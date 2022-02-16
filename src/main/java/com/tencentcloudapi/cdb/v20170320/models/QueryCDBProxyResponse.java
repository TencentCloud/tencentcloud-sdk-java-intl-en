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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCDBProxyResponse extends AbstractModel{

    /**
    * Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ProxyGroup")
    @Expose
    private ProxyGroups [] ProxyGroup;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Count Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Count Number of instances in the proxy group
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Proxy information
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return ProxyGroup Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public ProxyGroups [] getProxyGroup() {
        return this.ProxyGroup;
    }

    /**
     * Set Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     * @param ProxyGroup Proxy information
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setProxyGroup(ProxyGroups [] ProxyGroup) {
        this.ProxyGroup = ProxyGroup;
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

    public QueryCDBProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCDBProxyResponse(QueryCDBProxyResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ProxyGroup != null) {
            this.ProxyGroup = new ProxyGroups[source.ProxyGroup.length];
            for (int i = 0; i < source.ProxyGroup.length; i++) {
                this.ProxyGroup[i] = new ProxyGroups(source.ProxyGroup[i]);
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
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "ProxyGroup.", this.ProxyGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

