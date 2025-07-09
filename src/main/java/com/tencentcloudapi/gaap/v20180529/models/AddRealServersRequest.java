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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRealServersRequest extends AbstractModel {

    /**
    * Project ID corresponding to origin server
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * IP or domain name corresponding to origin server
    */
    @SerializedName("RealServerIP")
    @Expose
    private String [] RealServerIP;

    /**
    * Name of the origin server
    */
    @SerializedName("RealServerName")
    @Expose
    private String RealServerName;

    /**
    * List of tags
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * Get Project ID corresponding to origin server 
     * @return ProjectId Project ID corresponding to origin server
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID corresponding to origin server
     * @param ProjectId Project ID corresponding to origin server
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get IP or domain name corresponding to origin server 
     * @return RealServerIP IP or domain name corresponding to origin server
     */
    public String [] getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set IP or domain name corresponding to origin server
     * @param RealServerIP IP or domain name corresponding to origin server
     */
    public void setRealServerIP(String [] RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * Get Name of the origin server 
     * @return RealServerName Name of the origin server
     */
    public String getRealServerName() {
        return this.RealServerName;
    }

    /**
     * Set Name of the origin server
     * @param RealServerName Name of the origin server
     */
    public void setRealServerName(String RealServerName) {
        this.RealServerName = RealServerName;
    }

    /**
     * Get List of tags 
     * @return TagSet List of tags
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set List of tags
     * @param TagSet List of tags
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    public AddRealServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRealServersRequest(AddRealServersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String[source.RealServerIP.length];
            for (int i = 0; i < source.RealServerIP.length; i++) {
                this.RealServerIP[i] = new String(source.RealServerIP[i]);
            }
        }
        if (source.RealServerName != null) {
            this.RealServerName = new String(source.RealServerName);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RealServerIP.", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerName", this.RealServerName);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

