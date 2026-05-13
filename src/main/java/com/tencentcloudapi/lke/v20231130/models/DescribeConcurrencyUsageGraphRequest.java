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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConcurrencyUsageGraphRequest extends AbstractModel {

    /**
    * Model identifier.
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Start timestamp, in seconds.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End timestamp, in seconds.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * uin
    */
    @SerializedName("UinAccount")
    @Expose
    private String [] UinAccount;

    /**
    * Login to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * Sub-business type.
    */
    @SerializedName("SubBizType")
    @Expose
    private String SubBizType;

    /**
    * Application ID list.
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * Space ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Start timestamp, unit: seconds
    */
    @SerializedName("StatStartTime")
    @Expose
    private Long StatStartTime;

    /**
    * End timestamp, unit: seconds
    */
    @SerializedName("StatEndTime")
    @Expose
    private Long StatEndTime;

    /**
     * Get Model identifier. 
     * @return ModelName Model identifier.
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Model identifier.
     * @param ModelName Model identifier.
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Start timestamp, in seconds. 
     * @return StartTime Start timestamp, in seconds.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp, in seconds.
     * @param StartTime Start timestamp, in seconds.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp, in seconds. 
     * @return EndTime End timestamp, in seconds.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp, in seconds.
     * @param EndTime End timestamp, in seconds.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get uin 
     * @return UinAccount uin
     */
    public String [] getUinAccount() {
        return this.UinAccount;
    }

    /**
     * Set uin
     * @param UinAccount uin
     */
    public void setUinAccount(String [] UinAccount) {
        this.UinAccount = UinAccount;
    }

    /**
     * Get Login to user's root account (required in integrator mode). 
     * @return LoginUin Login to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Login to user's root account (required in integrator mode).
     * @param LoginUin Login to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get Sub-business type. 
     * @return SubBizType Sub-business type.
     */
    public String getSubBizType() {
        return this.SubBizType;
    }

    /**
     * Set Sub-business type.
     * @param SubBizType Sub-business type.
     */
    public void setSubBizType(String SubBizType) {
        this.SubBizType = SubBizType;
    }

    /**
     * Get Application ID list. 
     * @return AppBizIds Application ID list.
     */
    public String [] getAppBizIds() {
        return this.AppBizIds;
    }

    /**
     * Set Application ID list.
     * @param AppBizIds Application ID list.
     */
    public void setAppBizIds(String [] AppBizIds) {
        this.AppBizIds = AppBizIds;
    }

    /**
     * Get Space ID 
     * @return SpaceId Space ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID
     * @param SpaceId Space ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Start timestamp, unit: seconds 
     * @return StatStartTime Start timestamp, unit: seconds
     */
    public Long getStatStartTime() {
        return this.StatStartTime;
    }

    /**
     * Set Start timestamp, unit: seconds
     * @param StatStartTime Start timestamp, unit: seconds
     */
    public void setStatStartTime(Long StatStartTime) {
        this.StatStartTime = StatStartTime;
    }

    /**
     * Get End timestamp, unit: seconds 
     * @return StatEndTime End timestamp, unit: seconds
     */
    public Long getStatEndTime() {
        return this.StatEndTime;
    }

    /**
     * Set End timestamp, unit: seconds
     * @param StatEndTime End timestamp, unit: seconds
     */
    public void setStatEndTime(Long StatEndTime) {
        this.StatEndTime = StatEndTime;
    }

    public DescribeConcurrencyUsageGraphRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConcurrencyUsageGraphRequest(DescribeConcurrencyUsageGraphRequest source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.UinAccount != null) {
            this.UinAccount = new String[source.UinAccount.length];
            for (int i = 0; i < source.UinAccount.length; i++) {
                this.UinAccount[i] = new String(source.UinAccount[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.SubBizType != null) {
            this.SubBizType = new String(source.SubBizType);
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.StatStartTime != null) {
            this.StatStartTime = new Long(source.StatStartTime);
        }
        if (source.StatEndTime != null) {
            this.StatEndTime = new Long(source.StatEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "UinAccount.", this.UinAccount);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "SubBizType", this.SubBizType);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "StatStartTime", this.StatStartTime);
        this.setParamSimple(map, prefix + "StatEndTime", this.StatEndTime);

    }
}

