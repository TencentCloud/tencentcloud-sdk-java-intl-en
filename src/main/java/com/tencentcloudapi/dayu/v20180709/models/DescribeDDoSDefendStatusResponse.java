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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSDefendStatusResponse extends AbstractModel{

    /**
    * Protection status. 0: disabled, 1: enabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefendStatus")
    @Expose
    private Long DefendStatus;

    /**
    * Expiration time of temporary protection disablement. This field is empty if the protection is in enabled status;
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UndefendExpire")
    @Expose
    private String UndefendExpire;

    /**
    * Console feature display field. 1: displays console features, 0: hides console features
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShowFlag")
    @Expose
    private Long ShowFlag;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Protection status. 0: disabled, 1: enabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DefendStatus Protection status. 0: disabled, 1: enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set Protection status. 0: disabled, 1: enabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DefendStatus Protection status. 0: disabled, 1: enabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDefendStatus(Long DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get Expiration time of temporary protection disablement. This field is empty if the protection is in enabled status;
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UndefendExpire Expiration time of temporary protection disablement. This field is empty if the protection is in enabled status;
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getUndefendExpire() {
        return this.UndefendExpire;
    }

    /**
     * Set Expiration time of temporary protection disablement. This field is empty if the protection is in enabled status;
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UndefendExpire Expiration time of temporary protection disablement. This field is empty if the protection is in enabled status;
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUndefendExpire(String UndefendExpire) {
        this.UndefendExpire = UndefendExpire;
    }

    /**
     * Get Console feature display field. 1: displays console features, 0: hides console features
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ShowFlag Console feature display field. 1: displays console features, 0: hides console features
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getShowFlag() {
        return this.ShowFlag;
    }

    /**
     * Set Console feature display field. 1: displays console features, 0: hides console features
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ShowFlag Console feature display field. 1: displays console features, 0: hides console features
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setShowFlag(Long ShowFlag) {
        this.ShowFlag = ShowFlag;
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
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "UndefendExpire", this.UndefendExpire);
        this.setParamSimple(map, prefix + "ShowFlag", this.ShowFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

