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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDidServiceRequest extends AbstractModel {

    /**
    * The consortium name.
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * The consortium ID.
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The organization name.
    */
    @SerializedName("AgencyName")
    @Expose
    private String AgencyName;

    /**
    * The application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get The consortium name. 
     * @return ConsortiumName The consortium name.
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set The consortium name.
     * @param ConsortiumName The consortium name.
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
    }

    /**
     * Get The consortium ID. 
     * @return ConsortiumId The consortium ID.
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set The consortium ID.
     * @param ConsortiumId The consortium ID.
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The organization name. 
     * @return AgencyName The organization name.
     */
    public String getAgencyName() {
        return this.AgencyName;
    }

    /**
     * Set The organization name.
     * @param AgencyName The organization name.
     */
    public void setAgencyName(String AgencyName) {
        this.AgencyName = AgencyName;
    }

    /**
     * Get The application name. 
     * @return AppName The application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The application name.
     * @param AppName The application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The group name. 
     * @return GroupName The group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The group name.
     * @param GroupName The group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public CreateDidServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDidServiceRequest(CreateDidServiceRequest source) {
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.AgencyName != null) {
            this.AgencyName = new String(source.AgencyName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "AgencyName", this.AgencyName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

