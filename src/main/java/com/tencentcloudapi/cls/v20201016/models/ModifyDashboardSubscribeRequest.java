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

public class ModifyDashboardSubscribeRequest extends AbstractModel {

    /**
    * Dashboard subscription id. Obtain the id through the [Get Dashboard Subscription List](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1) api.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) api.
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * Dashboard subscription name. Supports a maximum of 128 characters and does not support the '|' character.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
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
     * Get Dashboard subscription id. Obtain the id through the [Get Dashboard Subscription List](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1) api. 
     * @return Id Dashboard subscription id. Obtain the id through the [Get Dashboard Subscription List](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1) api.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Dashboard subscription id. Obtain the id through the [Get Dashboard Subscription List](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1) api.
     * @param Id Dashboard subscription id. Obtain the id through the [Get Dashboard Subscription List](https://www.tencentcloud.com/document/api/614/105779?from_cn_redirect=1) api.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) api. 
     * @return DashboardId Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) api.
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) api.
     * @param DashboardId Dashboard id. Obtain the DashboardId through the [Get Dashboard](https://www.tencentcloud.com/document/api/614/95636?from_cn_redirect=1) api.
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get Dashboard subscription name. Supports a maximum of 128 characters and does not support the '|' character. 
     * @return Name Dashboard subscription name. Supports a maximum of 128 characters and does not support the '|' character.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dashboard subscription name. Supports a maximum of 128 characters and does not support the '|' character.
     * @param Name Dashboard subscription name. Supports a maximum of 128 characters and does not support the '|' character.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday}) 
     * @return Cron Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
     * @param Cron Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
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

    public ModifyDashboardSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDashboardSubscribeRequest(ModifyDashboardSubscribeRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Cron != null) {
            this.Cron = new String(source.Cron);
        }
        if (source.SubscribeData != null) {
            this.SubscribeData = new DashboardSubscribeData(source.SubscribeData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);

    }
}

