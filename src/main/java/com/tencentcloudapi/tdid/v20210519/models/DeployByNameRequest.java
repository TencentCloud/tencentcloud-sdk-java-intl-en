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

public class DeployByNameRequest extends AbstractModel {

    /**
    * The application name.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get The application name. 
     * @return ApplicationName The application name.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set The application name.
     * @param ApplicationName The application name.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
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

    public DeployByNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployByNameRequest(DeployByNameRequest source) {
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

