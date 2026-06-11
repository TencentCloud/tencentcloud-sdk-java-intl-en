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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashboardSubscribeInfo extends AbstractModel {

    /**
    * Dashboard subscription ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Dashboard subscription name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Dashboard ID.
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * Dashboard subscription time.
    */
    @SerializedName("Cron")
    @Expose
    private String Cron;

    /**
    * Dashboard subscription data.
    */
    @SerializedName("SubscribeData")
    @Expose
    private DashboardSubscribeData SubscribeData;

    /**
    * Creation time of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Dashboard subscription record update time. Format: `YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Time sent successfully of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Cloud primary account ID.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-account ID under coud main account.
    */
    @SerializedName("SubUin")
    @Expose
    private Long SubUin;

    /**
    * Last sending status of the dashboard subscription records. success: all sent successfully; fail: not sent; partialSuccess: partially sent successfully.
    */
    @SerializedName("LastStatus")
    @Expose
    private String LastStatus;

    /**
     * Get Dashboard subscription ID 
     * @return Id Dashboard subscription ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Dashboard subscription ID
     * @param Id Dashboard subscription ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Dashboard subscription name. 
     * @return Name Dashboard subscription name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dashboard subscription name.
     * @param Name Dashboard subscription name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Dashboard ID. 
     * @return DashboardId Dashboard ID.
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard ID.
     * @param DashboardId Dashboard ID.
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get Dashboard subscription time. 
     * @return Cron Dashboard subscription time.
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set Dashboard subscription time.
     * @param Cron Dashboard subscription time.
     */
    public void setCron(String Cron) {
        this.Cron = Cron;
    }

    /**
     * Get Dashboard subscription data. 
     * @return SubscribeData Dashboard subscription data.
     */
    public DashboardSubscribeData getSubscribeData() {
        return this.SubscribeData;
    }

    /**
     * Set Dashboard subscription data.
     * @param SubscribeData Dashboard subscription data.
     */
    public void setSubscribeData(DashboardSubscribeData SubscribeData) {
        this.SubscribeData = SubscribeData;
    }

    /**
     * Get Creation time of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS` 
     * @return CreateTime Creation time of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     * @param CreateTime Creation time of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Dashboard subscription record update time. Format: `YYYY-MM-DD HH:MM:SS` 
     * @return UpdateTime Dashboard subscription record update time. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Dashboard subscription record update time. Format: `YYYY-MM-DD HH:MM:SS`
     * @param UpdateTime Dashboard subscription record update time. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Time sent successfully of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS` 
     * @return LastTime Time sent successfully of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Time sent successfully of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     * @param LastTime Time sent successfully of dashboard subscription record. Format: `YYYY-MM-DD HH:MM:SS`
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Cloud primary account ID. 
     * @return Uin Cloud primary account ID.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Cloud primary account ID.
     * @param Uin Cloud primary account ID.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-account ID under coud main account. 
     * @return SubUin Sub-account ID under coud main account.
     */
    public Long getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-account ID under coud main account.
     * @param SubUin Sub-account ID under coud main account.
     */
    public void setSubUin(Long SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Last sending status of the dashboard subscription records. success: all sent successfully; fail: not sent; partialSuccess: partially sent successfully. 
     * @return LastStatus Last sending status of the dashboard subscription records. success: all sent successfully; fail: not sent; partialSuccess: partially sent successfully.
     */
    public String getLastStatus() {
        return this.LastStatus;
    }

    /**
     * Set Last sending status of the dashboard subscription records. success: all sent successfully; fail: not sent; partialSuccess: partially sent successfully.
     * @param LastStatus Last sending status of the dashboard subscription records. success: all sent successfully; fail: not sent; partialSuccess: partially sent successfully.
     */
    public void setLastStatus(String LastStatus) {
        this.LastStatus = LastStatus;
    }

    public DashboardSubscribeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardSubscribeInfo(DashboardSubscribeInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.SubscribeData != null) {
            this.SubscribeData = new DashboardSubscribeData(source.SubscribeData);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new Long(source.SubUin);
        }
        if (source.LastStatus != null) {
            this.LastStatus = new String(source.LastStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "LastStatus", this.LastStatus);

    }
}

