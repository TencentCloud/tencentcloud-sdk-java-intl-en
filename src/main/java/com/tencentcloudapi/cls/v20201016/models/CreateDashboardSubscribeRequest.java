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

public class CreateDashboardSubscribeRequest extends AbstractModel {

    /**
    * Dashboard subscription name.
Input limit:
-Cannot be empty
-Length cannot exceed 128 bytes
-Cannot contain character '|'
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Dashboard Id.
-Get the dashboard Id by [searching for the dashboard](https://www.tencentcloud.com/document/product/614/95636?from_cn_redirect=1).
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
-{seconds} Value ranges from 0 to 59. 
-{Minutes} Value ranges from 0 to 59. 
-Hour. Value ranges from 0 to 23. 
-{Date} value ranges from 1 to 31 AND (last day of month: L) 
-{Month} value ranges from 1 to 12. 
-Week value ranges from 0 to 6 [0:Sunday, 6:Saturday]
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
     * Get Dashboard subscription name.
Input limit:
-Cannot be empty
-Length cannot exceed 128 bytes
-Cannot contain character '|' 
     * @return Name Dashboard subscription name.
Input limit:
-Cannot be empty
-Length cannot exceed 128 bytes
-Cannot contain character '|'
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Dashboard subscription name.
Input limit:
-Cannot be empty
-Length cannot exceed 128 bytes
-Cannot contain character '|'
     * @param Name Dashboard subscription name.
Input limit:
-Cannot be empty
-Length cannot exceed 128 bytes
-Cannot contain character '|'
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Dashboard Id.
-Get the dashboard Id by [searching for the dashboard](https://www.tencentcloud.com/document/product/614/95636?from_cn_redirect=1). 
     * @return DashboardId Dashboard Id.
-Get the dashboard Id by [searching for the dashboard](https://www.tencentcloud.com/document/product/614/95636?from_cn_redirect=1).
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard Id.
-Get the dashboard Id by [searching for the dashboard](https://www.tencentcloud.com/document/product/614/95636?from_cn_redirect=1).
     * @param DashboardId Dashboard Id.
-Get the dashboard Id by [searching for the dashboard](https://www.tencentcloud.com/document/product/614/95636?from_cn_redirect=1).
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
-{seconds} Value ranges from 0 to 59. 
-{Minutes} Value ranges from 0 to 59. 
-Hour. Value ranges from 0 to 23. 
-{Date} value ranges from 1 to 31 AND (last day of month: L) 
-{Month} value ranges from 1 to 12. 
-Week value ranges from 0 to 6 [0:Sunday, 6:Saturday] 
     * @return Cron Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
-{seconds} Value ranges from 0 to 59. 
-{Minutes} Value ranges from 0 to 59. 
-Hour. Value ranges from 0 to 23. 
-{Date} value ranges from 1 to 31 AND (last day of month: L) 
-{Month} value ranges from 1 to 12. 
-Week value ranges from 0 to 6 [0:Sunday, 6:Saturday]
     */
    public String getCron() {
        return this.Cron;
    }

    /**
     * Set Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
-{seconds} Value ranges from 0 to 59. 
-{Minutes} Value ranges from 0 to 59. 
-Hour. Value ranges from 0 to 23. 
-{Date} value ranges from 1 to 31 AND (last day of month: L) 
-{Month} value ranges from 1 to 12. 
-Week value ranges from 0 to 6 [0:Sunday, 6:Saturday]
     * @param Cron Subscription time cron expression, in format {seconds} {minutes} {hours} {date} {month} {weekday}; (valid data: {minutes} {hours} {date} {month} {weekday})
-{seconds} Value ranges from 0 to 59. 
-{Minutes} Value ranges from 0 to 59. 
-Hour. Value ranges from 0 to 23. 
-{Date} value ranges from 1 to 31 AND (last day of month: L) 
-{Month} value ranges from 1 to 12. 
-Week value ranges from 0 to 6 [0:Sunday, 6:Saturday]
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

    public CreateDashboardSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDashboardSubscribeRequest(CreateDashboardSubscribeRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "Cron", this.Cron);
        this.setParamObj(map, prefix + "SubscribeData.", this.SubscribeData);

    }
}

