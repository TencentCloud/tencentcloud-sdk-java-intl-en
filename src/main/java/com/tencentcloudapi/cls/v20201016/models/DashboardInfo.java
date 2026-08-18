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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashboardInfo extends AbstractModel {

    /**
    * Dashboard ID
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
    * Dashboard name
    */
    @SerializedName("DashboardName")
    @Expose
    private String DashboardName;

    /**
    * Dashboard data
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * Time when the dashboard was created. Format: YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * If AssumerUin is not empty, it indicates the UIN of the service party that created the log topic.
    */
    @SerializedName("AssumerUin")
    @Expose
    private Long AssumerUin;

    /**
    * If RoleName is not empty, it indicates the role of the service provider creating the log set.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * If AssumerName is not empty, it indicates the name of the service provider creating the log topic.
    */
    @SerializedName("AssumerName")
    @Expose
    private String AssumerName;

    /**
    * Information of tag bound to log topic
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Dashboard region: For compatibility with old regions.
    */
    @SerializedName("DashboardRegion")
    @Expose
    private String DashboardRegion;

    /**
    * Modify dashboard time. Format: YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Topic-related information corresponding to the dashboard
    */
    @SerializedName("DashboardTopicInfos")
    @Expose
    private DashboardTopicInfo [] DashboardTopicInfos;

    /**
     * Get Dashboard ID 
     * @return DashboardId Dashboard ID
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard ID
     * @param DashboardId Dashboard ID
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Get Dashboard name 
     * @return DashboardName Dashboard name
     */
    public String getDashboardName() {
        return this.DashboardName;
    }

    /**
     * Set Dashboard name
     * @param DashboardName Dashboard name
     */
    public void setDashboardName(String DashboardName) {
        this.DashboardName = DashboardName;
    }

    /**
     * Get Dashboard data 
     * @return Data Dashboard data
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Dashboard data
     * @param Data Dashboard data
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get Time when the dashboard was created. Format: YYYY-MM-DD HH:MM:SS 
     * @return CreateTime Time when the dashboard was created. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time when the dashboard was created. Format: YYYY-MM-DD HH:MM:SS
     * @param CreateTime Time when the dashboard was created. Format: YYYY-MM-DD HH:MM:SS
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get If AssumerUin is not empty, it indicates the UIN of the service party that created the log topic. 
     * @return AssumerUin If AssumerUin is not empty, it indicates the UIN of the service party that created the log topic.
     */
    public Long getAssumerUin() {
        return this.AssumerUin;
    }

    /**
     * Set If AssumerUin is not empty, it indicates the UIN of the service party that created the log topic.
     * @param AssumerUin If AssumerUin is not empty, it indicates the UIN of the service party that created the log topic.
     */
    public void setAssumerUin(Long AssumerUin) {
        this.AssumerUin = AssumerUin;
    }

    /**
     * Get If RoleName is not empty, it indicates the role of the service provider creating the log set. 
     * @return RoleName If RoleName is not empty, it indicates the role of the service provider creating the log set.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set If RoleName is not empty, it indicates the role of the service provider creating the log set.
     * @param RoleName If RoleName is not empty, it indicates the role of the service provider creating the log set.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get If AssumerName is not empty, it indicates the name of the service provider creating the log topic. 
     * @return AssumerName If AssumerName is not empty, it indicates the name of the service provider creating the log topic.
     */
    public String getAssumerName() {
        return this.AssumerName;
    }

    /**
     * Set If AssumerName is not empty, it indicates the name of the service provider creating the log topic.
     * @param AssumerName If AssumerName is not empty, it indicates the name of the service provider creating the log topic.
     */
    public void setAssumerName(String AssumerName) {
        this.AssumerName = AssumerName;
    }

    /**
     * Get Information of tag bound to log topic 
     * @return Tags Information of tag bound to log topic
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Information of tag bound to log topic
     * @param Tags Information of tag bound to log topic
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Dashboard region: For compatibility with old regions. 
     * @return DashboardRegion Dashboard region: For compatibility with old regions.
     */
    public String getDashboardRegion() {
        return this.DashboardRegion;
    }

    /**
     * Set Dashboard region: For compatibility with old regions.
     * @param DashboardRegion Dashboard region: For compatibility with old regions.
     */
    public void setDashboardRegion(String DashboardRegion) {
        this.DashboardRegion = DashboardRegion;
    }

    /**
     * Get Modify dashboard time. Format: YYYY-MM-DD HH:MM:SS 
     * @return UpdateTime Modify dashboard time. Format: YYYY-MM-DD HH:MM:SS
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modify dashboard time. Format: YYYY-MM-DD HH:MM:SS
     * @param UpdateTime Modify dashboard time. Format: YYYY-MM-DD HH:MM:SS
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Topic-related information corresponding to the dashboard 
     * @return DashboardTopicInfos Topic-related information corresponding to the dashboard
     */
    public DashboardTopicInfo [] getDashboardTopicInfos() {
        return this.DashboardTopicInfos;
    }

    /**
     * Set Topic-related information corresponding to the dashboard
     * @param DashboardTopicInfos Topic-related information corresponding to the dashboard
     */
    public void setDashboardTopicInfos(DashboardTopicInfo [] DashboardTopicInfos) {
        this.DashboardTopicInfos = DashboardTopicInfos;
    }

    public DashboardInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardInfo(DashboardInfo source) {
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
        if (source.DashboardName != null) {
            this.DashboardName = new String(source.DashboardName);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AssumerUin != null) {
            this.AssumerUin = new Long(source.AssumerUin);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.AssumerName != null) {
            this.AssumerName = new String(source.AssumerName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DashboardRegion != null) {
            this.DashboardRegion = new String(source.DashboardRegion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DashboardTopicInfos != null) {
            this.DashboardTopicInfos = new DashboardTopicInfo[source.DashboardTopicInfos.length];
            for (int i = 0; i < source.DashboardTopicInfos.length; i++) {
                this.DashboardTopicInfos[i] = new DashboardTopicInfo(source.DashboardTopicInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);
        this.setParamSimple(map, prefix + "DashboardName", this.DashboardName);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AssumerUin", this.AssumerUin);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "AssumerName", this.AssumerName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DashboardRegion", this.DashboardRegion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "DashboardTopicInfos.", this.DashboardTopicInfos);

    }
}

