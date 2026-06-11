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

public class SearchViewInfo extends AbstractModel {

    /**
    * <p>View ID</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * <p>View name</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>Logset id</p><p>Logset of the view</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>Region of the logset</p><p>Parameter format: ap-guangzhou</p>
    */
    @SerializedName("LogsetRegion")
    @Expose
    private String LogsetRegion;

    /**
    * <p>View log topic information</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>View description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Creation time</p><p>Unit: second-level timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Update time</p><p>Measurement unit: second-level timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>View ID</p> 
     * @return ViewId <p>View ID</p>
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set <p>View ID</p>
     * @param ViewId <p>View ID</p>
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    /**
     * Get <p>View name</p> 
     * @return ViewName <p>View name</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>View name</p>
     * @param ViewName <p>View name</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul> 
     * @return ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul>
     * @param ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>Logset id</p><p>Logset of the view</p> 
     * @return LogsetId <p>Logset id</p><p>Logset of the view</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>Logset id</p><p>Logset of the view</p>
     * @param LogsetId <p>Logset id</p><p>Logset of the view</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>Region of the logset</p><p>Parameter format: ap-guangzhou</p> 
     * @return LogsetRegion <p>Region of the logset</p><p>Parameter format: ap-guangzhou</p>
     */
    public String getLogsetRegion() {
        return this.LogsetRegion;
    }

    /**
     * Set <p>Region of the logset</p><p>Parameter format: ap-guangzhou</p>
     * @param LogsetRegion <p>Region of the logset</p><p>Parameter format: ap-guangzhou</p>
     */
    public void setLogsetRegion(String LogsetRegion) {
        this.LogsetRegion = LogsetRegion;
    }

    /**
     * Get <p>View log topic information</p> 
     * @return Topics <p>View log topic information</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>View log topic information</p>
     * @param Topics <p>View log topic information</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>View description</p> 
     * @return Description <p>View description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>View description</p>
     * @param Description <p>View description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Creation time</p><p>Unit: second-level timestamp</p> 
     * @return CreateTime <p>Creation time</p><p>Unit: second-level timestamp</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time</p><p>Unit: second-level timestamp</p>
     * @param CreateTime <p>Creation time</p><p>Unit: second-level timestamp</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time</p><p>Measurement unit: second-level timestamp</p> 
     * @return UpdateTime <p>Update time</p><p>Measurement unit: second-level timestamp</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p><p>Measurement unit: second-level timestamp</p>
     * @param UpdateTime <p>Update time</p><p>Measurement unit: second-level timestamp</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SearchViewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchViewInfo(SearchViewInfo source) {
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetRegion != null) {
            this.LogsetRegion = new String(source.LogsetRegion);
        }
        if (source.Topics != null) {
            this.Topics = new ViewSearchTopic[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new ViewSearchTopic(source.Topics[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetRegion", this.LogsetRegion);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

