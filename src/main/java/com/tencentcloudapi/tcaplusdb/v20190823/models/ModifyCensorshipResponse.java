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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCensorshipResponse extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Approver UIN list
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("Uins")
    @Expose
    private String [] Uins;

    /**
    * Whether the operation approval feature is enabled for this cluster. Valid values: `0` (disabled), `1` (enabled)
    */
    @SerializedName("Censorship")
    @Expose
    private Long Censorship;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Approver UIN list
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return Uins Approver UIN list
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String [] getUins() {
        return this.Uins;
    }

    /**
     * Set Approver UIN list
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param Uins Approver UIN list
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setUins(String [] Uins) {
        this.Uins = Uins;
    }

    /**
     * Get Whether the operation approval feature is enabled for this cluster. Valid values: `0` (disabled), `1` (enabled) 
     * @return Censorship Whether the operation approval feature is enabled for this cluster. Valid values: `0` (disabled), `1` (enabled)
     */
    public Long getCensorship() {
        return this.Censorship;
    }

    /**
     * Set Whether the operation approval feature is enabled for this cluster. Valid values: `0` (disabled), `1` (enabled)
     * @param Censorship Whether the operation approval feature is enabled for this cluster. Valid values: `0` (disabled), `1` (enabled)
     */
    public void setCensorship(Long Censorship) {
        this.Censorship = Censorship;
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

    public ModifyCensorshipResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCensorshipResponse(ModifyCensorshipResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Uins != null) {
            this.Uins = new String[source.Uins.length];
            for (int i = 0; i < source.Uins.length; i++) {
                this.Uins[i] = new String(source.Uins[i]);
            }
        }
        if (source.Censorship != null) {
            this.Censorship = new Long(source.Censorship);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "Uins.", this.Uins);
        this.setParamSimple(map, prefix + "Censorship", this.Censorship);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

