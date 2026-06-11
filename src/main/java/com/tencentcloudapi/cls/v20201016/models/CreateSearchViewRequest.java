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

public class CreateSearchViewRequest extends AbstractModel {

    /**
    * <p>log set id</p><p>Logset to which the query view belongs. It is only used to manage the query view. Topics contained in the query view can be irrelevant to this logset.</p>
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
    * <p>View name</p><p>Input parameter limit: Supports up to 255 characters. Cannot contain "|" character.</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic type in the field of Topics should match the ViewType.</p>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>The query view contains topics, with a maximum of 10 topics.</p><p>The topic information configured in the Topics field should match the ViewType.</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>Custom query view id prefix</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>ViewId format of successfully created query view is ${ViewIdPrefix}-view</p>
    */
    @SerializedName("ViewIdPrefix")
    @Expose
    private String ViewIdPrefix;

    /**
    * <p>Description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>log set id</p><p>Logset to which the query view belongs. It is only used to manage the query view. Topics contained in the query view can be irrelevant to this logset.</p> 
     * @return LogsetId <p>log set id</p><p>Logset to which the query view belongs. It is only used to manage the query view. Topics contained in the query view can be irrelevant to this logset.</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>log set id</p><p>Logset to which the query view belongs. It is only used to manage the query view. Topics contained in the query view can be irrelevant to this logset.</p>
     * @param LogsetId <p>log set id</p><p>Logset to which the query view belongs. It is only used to manage the query view. Topics contained in the query view can be irrelevant to this logset.</p>
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
     * Get <p>View name</p><p>Input parameter limit: Supports up to 255 characters. Cannot contain "|" character.</p> 
     * @return ViewName <p>View name</p><p>Input parameter limit: Supports up to 255 characters. Cannot contain "|" character.</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>View name</p><p>Input parameter limit: Supports up to 255 characters. Cannot contain "|" character.</p>
     * @param ViewName <p>View name</p><p>Input parameter limit: Supports up to 255 characters. Cannot contain "|" character.</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic type in the field of Topics should match the ViewType.</p> 
     * @return ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic type in the field of Topics should match the ViewType.</p>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic type in the field of Topics should match the ViewType.</p>
     * @param ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic type in the field of Topics should match the ViewType.</p>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>The query view contains topics, with a maximum of 10 topics.</p><p>The topic information configured in the Topics field should match the ViewType.</p> 
     * @return Topics <p>The query view contains topics, with a maximum of 10 topics.</p><p>The topic information configured in the Topics field should match the ViewType.</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>The query view contains topics, with a maximum of 10 topics.</p><p>The topic information configured in the Topics field should match the ViewType.</p>
     * @param Topics <p>The query view contains topics, with a maximum of 10 topics.</p><p>The topic information configured in the Topics field should match the ViewType.</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>Custom query view id prefix</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>ViewId format of successfully created query view is ${ViewIdPrefix}-view</p> 
     * @return ViewIdPrefix <p>Custom query view id prefix</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>ViewId format of successfully created query view is ${ViewIdPrefix}-view</p>
     */
    public String getViewIdPrefix() {
        return this.ViewIdPrefix;
    }

    /**
     * Set <p>Custom query view id prefix</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>ViewId format of successfully created query view is ${ViewIdPrefix}-view</p>
     * @param ViewIdPrefix <p>Custom query view id prefix</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>ViewId format of successfully created query view is ${ViewIdPrefix}-view</p>
     */
    public void setViewIdPrefix(String ViewIdPrefix) {
        this.ViewIdPrefix = ViewIdPrefix;
    }

    /**
     * Get <p>Description</p> 
     * @return Description <p>Description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description</p>
     * @param Description <p>Description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateSearchViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSearchViewRequest(CreateSearchViewRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetRegion != null) {
            this.LogsetRegion = new String(source.LogsetRegion);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.Topics != null) {
            this.Topics = new ViewSearchTopic[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new ViewSearchTopic(source.Topics[i]);
            }
        }
        if (source.ViewIdPrefix != null) {
            this.ViewIdPrefix = new String(source.ViewIdPrefix);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetRegion", this.LogsetRegion);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "ViewIdPrefix", this.ViewIdPrefix);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

