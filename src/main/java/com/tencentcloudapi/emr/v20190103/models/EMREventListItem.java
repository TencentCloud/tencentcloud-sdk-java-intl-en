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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EMREventListItem extends AbstractModel {

    /**
    * IP address of the affected event.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Service role of the affected event.
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * Event name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event alarm details.
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * Event occurrence time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get IP address of the affected event. 
     * @return Host IP address of the affected event.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP address of the affected event.
     * @param Host IP address of the affected event.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Service role of the affected event. 
     * @return Role Service role of the affected event.
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Service role of the affected event.
     * @param Role Service role of the affected event.
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get Event name. 
     * @return Name Event name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event name.
     * @param Name Event name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event alarm details. 
     * @return Detail Event alarm details.
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set Event alarm details.
     * @param Detail Event alarm details.
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get Event occurrence time. 
     * @return CreateTime Event occurrence time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Event occurrence time.
     * @param CreateTime Event occurrence time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public EMREventListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EMREventListItem(EMREventListItem source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

