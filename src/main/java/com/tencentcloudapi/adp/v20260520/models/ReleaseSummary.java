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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseSummary extends AbstractModel {

    /**
    * <p>Creation time (Unix timestamp, in seconds)</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Release description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Release ID</p>
    */
    @SerializedName("ReleaseId")
    @Expose
    private String ReleaseId;

    /**
    * <p>Released status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Callback processing for successful release, 9: Release suspension, 10: Appeal under review, 11: Appeal passed, 12: Appeal not approved</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Status description.</p>
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * <p>Application sharing access control</p>
    */
    @SerializedName("AppShareAccessControl")
    @Expose
    private AppShareAccessControl AppShareAccessControl;

    /**
    * <p>Release channel ID list</p>
    */
    @SerializedName("ChannelIdList")
    @Expose
    private String [] ChannelIdList;

    /**
    * <p>Business shared configuration</p>
    */
    @SerializedName("CorpShareConfig")
    @Expose
    private CorpShareConfig CorpShareConfig;

    /**
    * <p>portal configuration</p>
    */
    @SerializedName("PortalShareConfig")
    @Expose
    private PortalShareConfig PortalShareConfig;

    /**
     * Get <p>Creation time (Unix timestamp, in seconds)</p> 
     * @return CreateTime <p>Creation time (Unix timestamp, in seconds)</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time (Unix timestamp, in seconds)</p>
     * @param CreateTime <p>Creation time (Unix timestamp, in seconds)</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Release description.</p> 
     * @return Description <p>Release description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Release description.</p>
     * @param Description <p>Release description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Release ID</p> 
     * @return ReleaseId <p>Release ID</p>
     */
    public String getReleaseId() {
        return this.ReleaseId;
    }

    /**
     * Set <p>Release ID</p>
     * @param ReleaseId <p>Release ID</p>
     */
    public void setReleaseId(String ReleaseId) {
        this.ReleaseId = ReleaseId;
    }

    /**
     * Get <p>Released status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Callback processing for successful release, 9: Release suspension, 10: Appeal under review, 11: Appeal passed, 12: Appeal not approved</p> 
     * @return Status <p>Released status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Callback processing for successful release, 9: Release suspension, 10: Appeal under review, 11: Appeal passed, 12: Appeal not approved</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Released status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Callback processing for successful release, 9: Release suspension, 10: Appeal under review, 11: Appeal passed, 12: Appeal not approved</p>
     * @param Status <p>Released status. Enumeration values: 1: To be released, 2: Releasing, 3: Released successfully, 4: Release failure, 5: Under review, 6: Review successful, 7: Review failed, 8: Callback processing for successful release, 9: Release suspension, 10: Appeal under review, 11: Appeal passed, 12: Appeal not approved</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description.</p> 
     * @return StatusDescription <p>Status description.</p>
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set <p>Status description.</p>
     * @param StatusDescription <p>Status description.</p>
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get <p>Application sharing access control</p> 
     * @return AppShareAccessControl <p>Application sharing access control</p>
     */
    public AppShareAccessControl getAppShareAccessControl() {
        return this.AppShareAccessControl;
    }

    /**
     * Set <p>Application sharing access control</p>
     * @param AppShareAccessControl <p>Application sharing access control</p>
     */
    public void setAppShareAccessControl(AppShareAccessControl AppShareAccessControl) {
        this.AppShareAccessControl = AppShareAccessControl;
    }

    /**
     * Get <p>Release channel ID list</p> 
     * @return ChannelIdList <p>Release channel ID list</p>
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set <p>Release channel ID list</p>
     * @param ChannelIdList <p>Release channel ID list</p>
     */
    public void setChannelIdList(String [] ChannelIdList) {
        this.ChannelIdList = ChannelIdList;
    }

    /**
     * Get <p>Business shared configuration</p> 
     * @return CorpShareConfig <p>Business shared configuration</p>
     */
    public CorpShareConfig getCorpShareConfig() {
        return this.CorpShareConfig;
    }

    /**
     * Set <p>Business shared configuration</p>
     * @param CorpShareConfig <p>Business shared configuration</p>
     */
    public void setCorpShareConfig(CorpShareConfig CorpShareConfig) {
        this.CorpShareConfig = CorpShareConfig;
    }

    /**
     * Get <p>portal configuration</p> 
     * @return PortalShareConfig <p>portal configuration</p>
     */
    public PortalShareConfig getPortalShareConfig() {
        return this.PortalShareConfig;
    }

    /**
     * Set <p>portal configuration</p>
     * @param PortalShareConfig <p>portal configuration</p>
     */
    public void setPortalShareConfig(PortalShareConfig PortalShareConfig) {
        this.PortalShareConfig = PortalShareConfig;
    }

    public ReleaseSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseSummary(ReleaseSummary source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReleaseId != null) {
            this.ReleaseId = new String(source.ReleaseId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.AppShareAccessControl != null) {
            this.AppShareAccessControl = new AppShareAccessControl(source.AppShareAccessControl);
        }
        if (source.ChannelIdList != null) {
            this.ChannelIdList = new String[source.ChannelIdList.length];
            for (int i = 0; i < source.ChannelIdList.length; i++) {
                this.ChannelIdList[i] = new String(source.ChannelIdList[i]);
            }
        }
        if (source.CorpShareConfig != null) {
            this.CorpShareConfig = new CorpShareConfig(source.CorpShareConfig);
        }
        if (source.PortalShareConfig != null) {
            this.PortalShareConfig = new PortalShareConfig(source.PortalShareConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReleaseId", this.ReleaseId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamObj(map, prefix + "AppShareAccessControl.", this.AppShareAccessControl);
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);
        this.setParamObj(map, prefix + "PortalShareConfig.", this.PortalShareConfig);

    }
}

