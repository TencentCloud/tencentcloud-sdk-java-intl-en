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

public class DescribeCallStatsGraphRequest extends AbstractModel {

    /**
    * uin
    */
    @SerializedName("UinAccount")
    @Expose
    private String [] UinAccount;

    /**
    * Log in to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Log in to user's root sub-account (required in integrator mode).
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
    * Application ID list.
    */
    @SerializedName("AppBizIds")
    @Expose
    private String [] AppBizIds;

    /**
    * Filter sub-scenarios (used in document parsing scenarios).
    */
    @SerializedName("SubScenes")
    @Expose
    private String [] SubScenes;

    /**
    * Application Type (knowledge_qa: Knowledge Q&A Application Management, shared_knowledge: Shared Knowledge Base)
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * Space ID, used to limit the query scope. If left blank, data of all spaces will be returned.
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Start time. Unix timestamp in seconds, empty by default.
    */
    @SerializedName("StatStartTime")
    @Expose
    private Long StatStartTime;

    /**
    * End time. Unix timestamp in seconds, empty by default.
    */
    @SerializedName("StatEndTime")
    @Expose
    private Long StatEndTime;

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
     * Get Log in to user's root account (required in integrator mode). 
     * @return LoginUin Log in to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Log in to user's root account (required in integrator mode).
     * @param LoginUin Log in to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Log in to user's root sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Log in to user's root sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Log in to user's root sub-account (required in integrator mode).
     * @param LoginSubAccountUin Log in to user's root sub-account (required in integrator mode).
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
     * @deprecated
     */
    @Deprecated
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp, in seconds.
     * @param StartTime Start timestamp, in seconds.
     * @deprecated
     */
    @Deprecated
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp, in seconds. 
     * @return EndTime End timestamp, in seconds.
     * @deprecated
     */
    @Deprecated
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp, in seconds.
     * @param EndTime End timestamp, in seconds.
     * @deprecated
     */
    @Deprecated
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get Filter sub-scenarios (used in document parsing scenarios). 
     * @return SubScenes Filter sub-scenarios (used in document parsing scenarios).
     */
    public String [] getSubScenes() {
        return this.SubScenes;
    }

    /**
     * Set Filter sub-scenarios (used in document parsing scenarios).
     * @param SubScenes Filter sub-scenarios (used in document parsing scenarios).
     */
    public void setSubScenes(String [] SubScenes) {
        this.SubScenes = SubScenes;
    }

    /**
     * Get Application Type (knowledge_qa: Knowledge Q&A Application Management, shared_knowledge: Shared Knowledge Base) 
     * @return AppType Application Type (knowledge_qa: Knowledge Q&A Application Management, shared_knowledge: Shared Knowledge Base)
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Application Type (knowledge_qa: Knowledge Q&A Application Management, shared_knowledge: Shared Knowledge Base)
     * @param AppType Application Type (knowledge_qa: Knowledge Q&A Application Management, shared_knowledge: Shared Knowledge Base)
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get Space ID, used to limit the query scope. If left blank, data of all spaces will be returned. 
     * @return SpaceId Space ID, used to limit the query scope. If left blank, data of all spaces will be returned.
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Space ID, used to limit the query scope. If left blank, data of all spaces will be returned.
     * @param SpaceId Space ID, used to limit the query scope. If left blank, data of all spaces will be returned.
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Start time. Unix timestamp in seconds, empty by default. 
     * @return StatStartTime Start time. Unix timestamp in seconds, empty by default.
     */
    public Long getStatStartTime() {
        return this.StatStartTime;
    }

    /**
     * Set Start time. Unix timestamp in seconds, empty by default.
     * @param StatStartTime Start time. Unix timestamp in seconds, empty by default.
     */
    public void setStatStartTime(Long StatStartTime) {
        this.StatStartTime = StatStartTime;
    }

    /**
     * Get End time. Unix timestamp in seconds, empty by default. 
     * @return StatEndTime End time. Unix timestamp in seconds, empty by default.
     */
    public Long getStatEndTime() {
        return this.StatEndTime;
    }

    /**
     * Set End time. Unix timestamp in seconds, empty by default.
     * @param StatEndTime End time. Unix timestamp in seconds, empty by default.
     */
    public void setStatEndTime(Long StatEndTime) {
        this.StatEndTime = StatEndTime;
    }

    public DescribeCallStatsGraphRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallStatsGraphRequest(DescribeCallStatsGraphRequest source) {
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
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AppBizIds != null) {
            this.AppBizIds = new String[source.AppBizIds.length];
            for (int i = 0; i < source.AppBizIds.length; i++) {
                this.AppBizIds[i] = new String(source.AppBizIds[i]);
            }
        }
        if (source.SubScenes != null) {
            this.SubScenes = new String[source.SubScenes.length];
            for (int i = 0; i < source.SubScenes.length; i++) {
                this.SubScenes[i] = new String(source.SubScenes[i]);
            }
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
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
        this.setParamArraySimple(map, prefix + "UinAccount.", this.UinAccount);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "SubBizType", this.SubBizType);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AppBizIds.", this.AppBizIds);
        this.setParamArraySimple(map, prefix + "SubScenes.", this.SubScenes);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "StatStartTime", this.StatStartTime);
        this.setParamSimple(map, prefix + "StatEndTime", this.StatEndTime);

    }
}

