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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRealServersRequest extends AbstractModel{

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
    * Origin server name
    */
    @SerializedName("RealServerName")
    @Expose
    private String RealServerName;

    /**
    * Tag list
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
     * Get Origin server name 
     * @return RealServerName Origin server name
     */
    public String getRealServerName() {
        return this.RealServerName;
    }

    /**
     * Set Origin server name
     * @param RealServerName Origin server name
     */
    public void setRealServerName(String RealServerName) {
        this.RealServerName = RealServerName;
    }

    /**
     * Get Tag list 
     * @return TagSet Tag list
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag list
     * @param TagSet Tag list
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
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

