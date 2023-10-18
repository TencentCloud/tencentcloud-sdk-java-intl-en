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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContentQuotaResponse extends AbstractModel {

    /**
    * Purging quotas.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PurgeQuota")
    @Expose
    private Quota [] PurgeQuota;

    /**
    * Pre-warming quotas.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrefetchQuota")
    @Expose
    private Quota [] PrefetchQuota;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Purging quotas.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PurgeQuota Purging quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Quota [] getPurgeQuota() {
        return this.PurgeQuota;
    }

    /**
     * Set Purging quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PurgeQuota Purging quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPurgeQuota(Quota [] PurgeQuota) {
        this.PurgeQuota = PurgeQuota;
    }

    /**
     * Get Pre-warming quotas.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrefetchQuota Pre-warming quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Quota [] getPrefetchQuota() {
        return this.PrefetchQuota;
    }

    /**
     * Set Pre-warming quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrefetchQuota Pre-warming quotas.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrefetchQuota(Quota [] PrefetchQuota) {
        this.PrefetchQuota = PrefetchQuota;
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

    public DescribeContentQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContentQuotaResponse(DescribeContentQuotaResponse source) {
        if (source.PurgeQuota != null) {
            this.PurgeQuota = new Quota[source.PurgeQuota.length];
            for (int i = 0; i < source.PurgeQuota.length; i++) {
                this.PurgeQuota[i] = new Quota(source.PurgeQuota[i]);
            }
        }
        if (source.PrefetchQuota != null) {
            this.PrefetchQuota = new Quota[source.PrefetchQuota.length];
            for (int i = 0; i < source.PrefetchQuota.length; i++) {
                this.PrefetchQuota[i] = new Quota(source.PrefetchQuota[i]);
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
        this.setParamArrayObj(map, prefix + "PurgeQuota.", this.PurgeQuota);
        this.setParamArrayObj(map, prefix + "PrefetchQuota.", this.PrefetchQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

