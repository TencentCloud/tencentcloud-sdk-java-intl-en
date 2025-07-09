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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyFleetResponse extends AbstractModel {

    /**
    * Server fleet attributes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FleetAttributes")
    @Expose
    private FleetAttributes [] FleetAttributes;

    /**
    * The number of server fleets
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
     * Get Server fleet attributes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FleetAttributes Server fleet attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public FleetAttributes [] getFleetAttributes() {
        return this.FleetAttributes;
    }

    /**
     * Set Server fleet attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FleetAttributes Server fleet attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFleetAttributes(FleetAttributes [] FleetAttributes) {
        this.FleetAttributes = FleetAttributes;
    }

    /**
     * Get The number of server fleets 
     * @return TotalCount The number of server fleets
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The number of server fleets
     * @param TotalCount The number of server fleets
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

    public CopyFleetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyFleetResponse(CopyFleetResponse source) {
        if (source.FleetAttributes != null) {
            this.FleetAttributes = new FleetAttributes[source.FleetAttributes.length];
            for (int i = 0; i < source.FleetAttributes.length; i++) {
                this.FleetAttributes[i] = new FleetAttributes(source.FleetAttributes[i]);
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
        this.setParamArrayObj(map, prefix + "FleetAttributes.", this.FleetAttributes);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

