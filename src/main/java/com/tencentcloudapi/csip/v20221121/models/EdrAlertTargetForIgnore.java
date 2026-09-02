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

public class EdrAlertTargetForIgnore extends AbstractModel {

    /**
    * Alarm primary key ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Alarm Account ID (across different accounts, required for frontend)
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Alarm unique ID
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * Host UUID (optional)
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Instance ID (selectable, used for allowlist deletion)
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Alarm primary key ID 
     * @return Id Alarm primary key ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Alarm primary key ID
     * @param Id Alarm primary key ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Alarm Account ID (across different accounts, required for frontend) 
     * @return AppId Alarm Account ID (across different accounts, required for frontend)
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Alarm Account ID (across different accounts, required for frontend)
     * @param AppId Alarm Account ID (across different accounts, required for frontend)
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Alarm unique ID 
     * @return AlertId Alarm unique ID
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set Alarm unique ID
     * @param AlertId Alarm unique ID
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get Host UUID (optional) 
     * @return Quuid Host UUID (optional)
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host UUID (optional)
     * @param Quuid Host UUID (optional)
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Instance ID (selectable, used for allowlist deletion) 
     * @return InstanceId Instance ID (selectable, used for allowlist deletion)
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID (selectable, used for allowlist deletion)
     * @param InstanceId Instance ID (selectable, used for allowlist deletion)
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public EdrAlertTargetForIgnore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdrAlertTargetForIgnore(EdrAlertTargetForIgnore source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

