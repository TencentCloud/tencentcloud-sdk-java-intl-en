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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySupportParamResponse extends AbstractModel {

    /**
    * The supported maximum proxy version Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Whether to support the connection pool Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportPool")
    @Expose
    private Boolean SupportPool;

    /**
    * Minimum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PoolMin")
    @Expose
    private Long PoolMin;

    /**
    * Maximum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PoolMax")
    @Expose
    private Long PoolMax;

    /**
    * Whether to support transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportTransSplit")
    @Expose
    private Boolean SupportTransSplit;

    /**
    * Minimum proxy version supporting connection pool Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportPoolMinVersion")
    @Expose
    private String SupportPoolMinVersion;

    /**
    * Minimum proxy version supporting transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportTransSplitMinVersion")
    @Expose
    private String SupportTransSplitMinVersion;

    /**
    * Whether read-only mode is supported Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportReadOnly")
    @Expose
    private Boolean SupportReadOnly;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The supported maximum proxy version Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyVersion The supported maximum proxy version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set The supported maximum proxy version Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyVersion The supported maximum proxy version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Whether to support the connection pool Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportPool Whether to support the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportPool() {
        return this.SupportPool;
    }

    /**
     * Set Whether to support the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportPool Whether to support the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportPool(Boolean SupportPool) {
        this.SupportPool = SupportPool;
    }

    /**
     * Get Minimum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PoolMin Minimum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPoolMin() {
        return this.PoolMin;
    }

    /**
     * Set Minimum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     * @param PoolMin Minimum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPoolMin(Long PoolMin) {
        this.PoolMin = PoolMin;
    }

    /**
     * Get Maximum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PoolMax Maximum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPoolMax() {
        return this.PoolMax;
    }

    /**
     * Set Maximum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     * @param PoolMax Maximum connections in the connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPoolMax(Long PoolMax) {
        this.PoolMax = PoolMax;
    }

    /**
     * Get Whether to support transaction splitting Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportTransSplit Whether to support transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportTransSplit() {
        return this.SupportTransSplit;
    }

    /**
     * Set Whether to support transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportTransSplit Whether to support transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportTransSplit(Boolean SupportTransSplit) {
        this.SupportTransSplit = SupportTransSplit;
    }

    /**
     * Get Minimum proxy version supporting connection pool Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportPoolMinVersion Minimum proxy version supporting connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupportPoolMinVersion() {
        return this.SupportPoolMinVersion;
    }

    /**
     * Set Minimum proxy version supporting connection pool Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportPoolMinVersion Minimum proxy version supporting connection pool Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportPoolMinVersion(String SupportPoolMinVersion) {
        this.SupportPoolMinVersion = SupportPoolMinVersion;
    }

    /**
     * Get Minimum proxy version supporting transaction splitting Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportTransSplitMinVersion Minimum proxy version supporting transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupportTransSplitMinVersion() {
        return this.SupportTransSplitMinVersion;
    }

    /**
     * Set Minimum proxy version supporting transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportTransSplitMinVersion Minimum proxy version supporting transaction splitting Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportTransSplitMinVersion(String SupportTransSplitMinVersion) {
        this.SupportTransSplitMinVersion = SupportTransSplitMinVersion;
    }

    /**
     * Get Whether read-only mode is supported Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportReadOnly Whether read-only mode is supported Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportReadOnly() {
        return this.SupportReadOnly;
    }

    /**
     * Set Whether read-only mode is supported Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportReadOnly Whether read-only mode is supported Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportReadOnly(Boolean SupportReadOnly) {
        this.SupportReadOnly = SupportReadOnly;
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

    public DescribeProxySupportParamResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySupportParamResponse(DescribeProxySupportParamResponse source) {
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.SupportPool != null) {
            this.SupportPool = new Boolean(source.SupportPool);
        }
        if (source.PoolMin != null) {
            this.PoolMin = new Long(source.PoolMin);
        }
        if (source.PoolMax != null) {
            this.PoolMax = new Long(source.PoolMax);
        }
        if (source.SupportTransSplit != null) {
            this.SupportTransSplit = new Boolean(source.SupportTransSplit);
        }
        if (source.SupportPoolMinVersion != null) {
            this.SupportPoolMinVersion = new String(source.SupportPoolMinVersion);
        }
        if (source.SupportTransSplitMinVersion != null) {
            this.SupportTransSplitMinVersion = new String(source.SupportTransSplitMinVersion);
        }
        if (source.SupportReadOnly != null) {
            this.SupportReadOnly = new Boolean(source.SupportReadOnly);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "SupportPool", this.SupportPool);
        this.setParamSimple(map, prefix + "PoolMin", this.PoolMin);
        this.setParamSimple(map, prefix + "PoolMax", this.PoolMax);
        this.setParamSimple(map, prefix + "SupportTransSplit", this.SupportTransSplit);
        this.setParamSimple(map, prefix + "SupportPoolMinVersion", this.SupportPoolMinVersion);
        this.setParamSimple(map, prefix + "SupportTransSplitMinVersion", this.SupportTransSplitMinVersion);
        this.setParamSimple(map, prefix + "SupportReadOnly", this.SupportReadOnly);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

