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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurchaseStateInfoResponse extends AbstractModel{

    /**
    * Valid values: `0` (available for trial and purchase); `1` (available for purchase only after failed trial review or trial expiration); `2` (trial effective); `3` (Pro Edition effective); `4` (Pro Edition expired).
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Total number of cores
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * Number of purchased cores
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizedCoresCnt")
    @Expose
    private Long AuthorizedCoresCnt;

    /**
    * Number of images
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * Number of licensed images
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthorizedImageCnt")
    @Expose
    private Long AuthorizedImageCnt;

    /**
    * Number of purchased image licenses
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PurchasedAuthorizedCnt")
    @Expose
    private Long PurchasedAuthorizedCnt;

    /**
    * Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * Valid values: `0` (initial status, which is the default value and not set by the user); `1` (auto-renewal); `2` (no auto-renewal, which is specified by the user).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutomaticRenewal")
    @Expose
    private Long AutomaticRenewal;

    /**
    * Number of free image licenses during the trial, which may expire.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GivenAuthorizedCnt")
    @Expose
    private Long GivenAuthorizedCnt;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Sub-status, the meaning of which is subject to the `State` field.
Valid values when `State` is `4`: `ISOLATE` (isolated); `DESTROED` (terminated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubState")
    @Expose
    private String SubState;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Valid values: `0` (available for trial and purchase); `1` (available for purchase only after failed trial review or trial expiration); `2` (trial effective); `3` (Pro Edition effective); `4` (Pro Edition expired). 
     * @return State Valid values: `0` (available for trial and purchase); `1` (available for purchase only after failed trial review or trial expiration); `2` (trial effective); `3` (Pro Edition effective); `4` (Pro Edition expired).
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Valid values: `0` (available for trial and purchase); `1` (available for purchase only after failed trial review or trial expiration); `2` (trial effective); `3` (Pro Edition effective); `4` (Pro Edition expired).
     * @param State Valid values: `0` (available for trial and purchase); `1` (available for purchase only after failed trial review or trial expiration); `2` (trial effective); `3` (Pro Edition effective); `4` (Pro Edition expired).
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Total number of cores
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoresCnt Total number of cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set Total number of cores
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoresCnt Total number of cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get Number of purchased cores
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizedCoresCnt Number of purchased cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuthorizedCoresCnt() {
        return this.AuthorizedCoresCnt;
    }

    /**
     * Set Number of purchased cores
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthorizedCoresCnt Number of purchased cores
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizedCoresCnt(Long AuthorizedCoresCnt) {
        this.AuthorizedCoresCnt = AuthorizedCoresCnt;
    }

    /**
     * Get Number of images
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ImageCnt Number of images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set Number of images
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ImageCnt Number of images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get Number of licensed images
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthorizedImageCnt Number of licensed images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAuthorizedImageCnt() {
        return this.AuthorizedImageCnt;
    }

    /**
     * Set Number of licensed images
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthorizedImageCnt Number of licensed images
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthorizedImageCnt(Long AuthorizedImageCnt) {
        this.AuthorizedImageCnt = AuthorizedImageCnt;
    }

    /**
     * Get Number of purchased image licenses
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PurchasedAuthorizedCnt Number of purchased image licenses
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPurchasedAuthorizedCnt() {
        return this.PurchasedAuthorizedCnt;
    }

    /**
     * Set Number of purchased image licenses
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PurchasedAuthorizedCnt Number of purchased image licenses
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPurchasedAuthorizedCnt(Long PurchasedAuthorizedCnt) {
        this.PurchasedAuthorizedCnt = PurchasedAuthorizedCnt;
    }

    /**
     * Get Expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationTime Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get Valid values: `0` (initial status, which is the default value and not set by the user); `1` (auto-renewal); `2` (no auto-renewal, which is specified by the user).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutomaticRenewal Valid values: `0` (initial status, which is the default value and not set by the user); `1` (auto-renewal); `2` (no auto-renewal, which is specified by the user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutomaticRenewal() {
        return this.AutomaticRenewal;
    }

    /**
     * Set Valid values: `0` (initial status, which is the default value and not set by the user); `1` (auto-renewal); `2` (no auto-renewal, which is specified by the user).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutomaticRenewal Valid values: `0` (initial status, which is the default value and not set by the user); `1` (auto-renewal); `2` (no auto-renewal, which is specified by the user).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutomaticRenewal(Long AutomaticRenewal) {
        this.AutomaticRenewal = AutomaticRenewal;
    }

    /**
     * Get Number of free image licenses during the trial, which may expire.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GivenAuthorizedCnt Number of free image licenses during the trial, which may expire.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGivenAuthorizedCnt() {
        return this.GivenAuthorizedCnt;
    }

    /**
     * Set Number of free image licenses during the trial, which may expire.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GivenAuthorizedCnt Number of free image licenses during the trial, which may expire.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGivenAuthorizedCnt(Long GivenAuthorizedCnt) {
        this.GivenAuthorizedCnt = GivenAuthorizedCnt;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BeginTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BeginTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Sub-status, the meaning of which is subject to the `State` field.
Valid values when `State` is `4`: `ISOLATE` (isolated); `DESTROED` (terminated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubState Sub-status, the meaning of which is subject to the `State` field.
Valid values when `State` is `4`: `ISOLATE` (isolated); `DESTROED` (terminated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubState() {
        return this.SubState;
    }

    /**
     * Set Sub-status, the meaning of which is subject to the `State` field.
Valid values when `State` is `4`: `ISOLATE` (isolated); `DESTROED` (terminated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubState Sub-status, the meaning of which is subject to the `State` field.
Valid values when `State` is `4`: `ISOLATE` (isolated); `DESTROED` (terminated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubState(String SubState) {
        this.SubState = SubState;
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

    public DescribePurchaseStateInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurchaseStateInfoResponse(DescribePurchaseStateInfoResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.AuthorizedCoresCnt != null) {
            this.AuthorizedCoresCnt = new Long(source.AuthorizedCoresCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.AuthorizedImageCnt != null) {
            this.AuthorizedImageCnt = new Long(source.AuthorizedImageCnt);
        }
        if (source.PurchasedAuthorizedCnt != null) {
            this.PurchasedAuthorizedCnt = new Long(source.PurchasedAuthorizedCnt);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.AutomaticRenewal != null) {
            this.AutomaticRenewal = new Long(source.AutomaticRenewal);
        }
        if (source.GivenAuthorizedCnt != null) {
            this.GivenAuthorizedCnt = new Long(source.GivenAuthorizedCnt);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.SubState != null) {
            this.SubState = new String(source.SubState);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "AuthorizedCoresCnt", this.AuthorizedCoresCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "AuthorizedImageCnt", this.AuthorizedImageCnt);
        this.setParamSimple(map, prefix + "PurchasedAuthorizedCnt", this.PurchasedAuthorizedCnt);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "AutomaticRenewal", this.AutomaticRenewal);
        this.setParamSimple(map, prefix + "GivenAuthorizedCnt", this.GivenAuthorizedCnt);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "SubState", this.SubState);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

