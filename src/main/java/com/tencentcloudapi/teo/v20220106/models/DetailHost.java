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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailHost extends AbstractModel {

    /**
    * Tencent Cloud account ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Site ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration service status
`process`: Deploying
`online`: Enabled
`offline`: Disabled
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Domain name
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Tencent Cloud account ID 
     * @return AppId Tencent Cloud account ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tencent Cloud account ID
     * @param AppId Tencent Cloud account ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Site ID 
     * @return ZoneId Site ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID
     * @param ZoneId Site ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration service status
`process`: Deploying
`online`: Enabled
`offline`: Disabled 
     * @return Status Acceleration service status
`process`: Deploying
`online`: Enabled
`offline`: Disabled
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Acceleration service status
`process`: Deploying
`online`: Enabled
`offline`: Disabled
     * @param Status Acceleration service status
`process`: Deploying
`online`: Enabled
`offline`: Disabled
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Domain name 
     * @return Host Domain name
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Domain name
     * @param Host Domain name
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public DetailHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailHost(DetailHost source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

