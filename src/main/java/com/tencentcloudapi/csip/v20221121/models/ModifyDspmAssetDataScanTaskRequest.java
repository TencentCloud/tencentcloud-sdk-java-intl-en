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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDspmAssetDataScanTaskRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("AssetIds")
    @Expose
    private String [] AssetIds;

    /**
    * Whether it is a scheduled task
    */
    @SerializedName("IsScheduled")
    @Expose
    private Boolean IsScheduled;

    /**
    * Whether to grant one-click authorization.
    */
    @SerializedName("IsAgreeAuth")
    @Expose
    private Boolean IsAgreeAuth;

    /**
    * Whether to execute immediately
    */
    @SerializedName("IsRunAtOnce")
    @Expose
    private Boolean IsRunAtOnce;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Scheduling cycle configuration
    */
    @SerializedName("ScheduleConfig")
    @Expose
    private DspmScheduleConfig ScheduleConfig;

    /**
     * Get Instance ID. 
     * @return AssetIds Instance ID.
     */
    public String [] getAssetIds() {
        return this.AssetIds;
    }

    /**
     * Set Instance ID.
     * @param AssetIds Instance ID.
     */
    public void setAssetIds(String [] AssetIds) {
        this.AssetIds = AssetIds;
    }

    /**
     * Get Whether it is a scheduled task 
     * @return IsScheduled Whether it is a scheduled task
     */
    public Boolean getIsScheduled() {
        return this.IsScheduled;
    }

    /**
     * Set Whether it is a scheduled task
     * @param IsScheduled Whether it is a scheduled task
     */
    public void setIsScheduled(Boolean IsScheduled) {
        this.IsScheduled = IsScheduled;
    }

    /**
     * Get Whether to grant one-click authorization. 
     * @return IsAgreeAuth Whether to grant one-click authorization.
     */
    public Boolean getIsAgreeAuth() {
        return this.IsAgreeAuth;
    }

    /**
     * Set Whether to grant one-click authorization.
     * @param IsAgreeAuth Whether to grant one-click authorization.
     */
    public void setIsAgreeAuth(Boolean IsAgreeAuth) {
        this.IsAgreeAuth = IsAgreeAuth;
    }

    /**
     * Get Whether to execute immediately 
     * @return IsRunAtOnce Whether to execute immediately
     */
    public Boolean getIsRunAtOnce() {
        return this.IsRunAtOnce;
    }

    /**
     * Set Whether to execute immediately
     * @param IsRunAtOnce Whether to execute immediately
     */
    public void setIsRunAtOnce(Boolean IsRunAtOnce) {
        this.IsRunAtOnce = IsRunAtOnce;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Scheduling cycle configuration 
     * @return ScheduleConfig Scheduling cycle configuration
     */
    public DspmScheduleConfig getScheduleConfig() {
        return this.ScheduleConfig;
    }

    /**
     * Set Scheduling cycle configuration
     * @param ScheduleConfig Scheduling cycle configuration
     */
    public void setScheduleConfig(DspmScheduleConfig ScheduleConfig) {
        this.ScheduleConfig = ScheduleConfig;
    }

    public ModifyDspmAssetDataScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetDataScanTaskRequest(ModifyDspmAssetDataScanTaskRequest source) {
        if (source.AssetIds != null) {
            this.AssetIds = new String[source.AssetIds.length];
            for (int i = 0; i < source.AssetIds.length; i++) {
                this.AssetIds[i] = new String(source.AssetIds[i]);
            }
        }
        if (source.IsScheduled != null) {
            this.IsScheduled = new Boolean(source.IsScheduled);
        }
        if (source.IsAgreeAuth != null) {
            this.IsAgreeAuth = new Boolean(source.IsAgreeAuth);
        }
        if (source.IsRunAtOnce != null) {
            this.IsRunAtOnce = new Boolean(source.IsRunAtOnce);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ScheduleConfig != null) {
            this.ScheduleConfig = new DspmScheduleConfig(source.ScheduleConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetIds.", this.AssetIds);
        this.setParamSimple(map, prefix + "IsScheduled", this.IsScheduled);
        this.setParamSimple(map, prefix + "IsAgreeAuth", this.IsAgreeAuth);
        this.setParamSimple(map, prefix + "IsRunAtOnce", this.IsRunAtOnce);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "ScheduleConfig.", this.ScheduleConfig);

    }
}

