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

public class CreateReleaseRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>App sharing access control configuration</p>
    */
    @SerializedName("AppShareAccessControl")
    @Expose
    private AppShareAccessControl AppShareAccessControl;

    /**
    * <p>Channel ID list</p>
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
    * <p>Release description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Batch change the debug-only knowledge in the default knowledge base to "effective in both debug and release"</p>
    */
    @SerializedName("IsDevToRelease")
    @Expose
    private Boolean IsDevToRelease;

    /**
    * <p>Whether to synchronize publishing as an application template</p>
    */
    @SerializedName("IsPublishAsTemplate")
    @Expose
    private Boolean IsPublishAsTemplate;

    /**
    * <p>portal configuration</p>
    */
    @SerializedName("PortalShareConfig")
    @Expose
    private PortalShareConfig PortalShareConfig;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>App sharing access control configuration</p> 
     * @return AppShareAccessControl <p>App sharing access control configuration</p>
     */
    public AppShareAccessControl getAppShareAccessControl() {
        return this.AppShareAccessControl;
    }

    /**
     * Set <p>App sharing access control configuration</p>
     * @param AppShareAccessControl <p>App sharing access control configuration</p>
     */
    public void setAppShareAccessControl(AppShareAccessControl AppShareAccessControl) {
        this.AppShareAccessControl = AppShareAccessControl;
    }

    /**
     * Get <p>Channel ID list</p> 
     * @return ChannelIdList <p>Channel ID list</p>
     */
    public String [] getChannelIdList() {
        return this.ChannelIdList;
    }

    /**
     * Set <p>Channel ID list</p>
     * @param ChannelIdList <p>Channel ID list</p>
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
     * Get <p>Batch change the debug-only knowledge in the default knowledge base to "effective in both debug and release"</p> 
     * @return IsDevToRelease <p>Batch change the debug-only knowledge in the default knowledge base to "effective in both debug and release"</p>
     */
    public Boolean getIsDevToRelease() {
        return this.IsDevToRelease;
    }

    /**
     * Set <p>Batch change the debug-only knowledge in the default knowledge base to "effective in both debug and release"</p>
     * @param IsDevToRelease <p>Batch change the debug-only knowledge in the default knowledge base to "effective in both debug and release"</p>
     */
    public void setIsDevToRelease(Boolean IsDevToRelease) {
        this.IsDevToRelease = IsDevToRelease;
    }

    /**
     * Get <p>Whether to synchronize publishing as an application template</p> 
     * @return IsPublishAsTemplate <p>Whether to synchronize publishing as an application template</p>
     */
    public Boolean getIsPublishAsTemplate() {
        return this.IsPublishAsTemplate;
    }

    /**
     * Set <p>Whether to synchronize publishing as an application template</p>
     * @param IsPublishAsTemplate <p>Whether to synchronize publishing as an application template</p>
     */
    public void setIsPublishAsTemplate(Boolean IsPublishAsTemplate) {
        this.IsPublishAsTemplate = IsPublishAsTemplate;
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

    public CreateReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReleaseRequest(CreateReleaseRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsDevToRelease != null) {
            this.IsDevToRelease = new Boolean(source.IsDevToRelease);
        }
        if (source.IsPublishAsTemplate != null) {
            this.IsPublishAsTemplate = new Boolean(source.IsPublishAsTemplate);
        }
        if (source.PortalShareConfig != null) {
            this.PortalShareConfig = new PortalShareConfig(source.PortalShareConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "AppShareAccessControl.", this.AppShareAccessControl);
        this.setParamArraySimple(map, prefix + "ChannelIdList.", this.ChannelIdList);
        this.setParamObj(map, prefix + "CorpShareConfig.", this.CorpShareConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsDevToRelease", this.IsDevToRelease);
        this.setParamSimple(map, prefix + "IsPublishAsTemplate", this.IsPublishAsTemplate);
        this.setParamObj(map, prefix + "PortalShareConfig.", this.PortalShareConfig);

    }
}

