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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateOrgNodeRequest extends AbstractModel {

    /**
    * Organization node ID, which is globally unique.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * Organization node name, which can contain up to 64 characters.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Organization node description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * External ID of the organization node, which is optional and customizable. If this parameter is specified, its uniqueness will be verified.
    */
    @SerializedName("CustomizedOrgNodeId")
    @Expose
    private String CustomizedOrgNodeId;

    /**
     * Get Organization node ID, which is globally unique. 
     * @return OrgNodeId Organization node ID, which is globally unique.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Organization node ID, which is globally unique.
     * @param OrgNodeId Organization node ID, which is globally unique.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get Organization node name, which can contain up to 64 characters. 
     * @return DisplayName Organization node name, which can contain up to 64 characters.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Organization node name, which can contain up to 64 characters.
     * @param DisplayName Organization node name, which can contain up to 64 characters.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Organization node description. 
     * @return Description Organization node description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Organization node description.
     * @param Description Organization node description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get External ID of the organization node, which is optional and customizable. If this parameter is specified, its uniqueness will be verified. 
     * @return CustomizedOrgNodeId External ID of the organization node, which is optional and customizable. If this parameter is specified, its uniqueness will be verified.
     */
    public String getCustomizedOrgNodeId() {
        return this.CustomizedOrgNodeId;
    }

    /**
     * Set External ID of the organization node, which is optional and customizable. If this parameter is specified, its uniqueness will be verified.
     * @param CustomizedOrgNodeId External ID of the organization node, which is optional and customizable. If this parameter is specified, its uniqueness will be verified.
     */
    public void setCustomizedOrgNodeId(String CustomizedOrgNodeId) {
        this.CustomizedOrgNodeId = CustomizedOrgNodeId;
    }

    public UpdateOrgNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrgNodeRequest(UpdateOrgNodeRequest source) {
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CustomizedOrgNodeId != null) {
            this.CustomizedOrgNodeId = new String(source.CustomizedOrgNodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CustomizedOrgNodeId", this.CustomizedOrgNodeId);

    }
}

