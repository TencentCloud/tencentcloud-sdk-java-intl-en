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

public class ModifySearchViewRequest extends AbstractModel {

    /**
    * <p>View ID.</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * <p>View name</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic information configured in the Topics field should match the ViewType.</p>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>The query view contains topics, with a maximum of 10 topics.</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>Description information</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>View ID.</p> 
     * @return ViewId <p>View ID.</p>
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set <p>View ID.</p>
     * @param ViewId <p>View ID.</p>
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    /**
     * Get <p>View name</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p> 
     * @return ViewName <p>View name</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>View name</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
     * @param ViewName <p>View name</p><p>Parameter format: <code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic information configured in the Topics field should match the ViewType.</p> 
     * @return ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic information configured in the Topics field should match the ViewType.</p>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic information configured in the Topics field should match the ViewType.</p>
     * @param ViewType <p>View type</p><p>Enumeration value:</p><ul><li>log: Log topic</li><li>metric: Metric topic</li></ul><p>The topic information configured in the Topics field should match the ViewType.</p>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>The query view contains topics, with a maximum of 10 topics.</p> 
     * @return Topics <p>The query view contains topics, with a maximum of 10 topics.</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>The query view contains topics, with a maximum of 10 topics.</p>
     * @param Topics <p>The query view contains topics, with a maximum of 10 topics.</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>Description information</p> 
     * @return Description <p>Description information</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description information</p>
     * @param Description <p>Description information</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifySearchViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySearchViewRequest(ModifySearchViewRequest source) {
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
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
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

