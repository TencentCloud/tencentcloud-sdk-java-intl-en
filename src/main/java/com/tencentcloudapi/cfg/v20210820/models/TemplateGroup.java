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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateGroup extends AbstractModel {

    /**
    * Template library action ID
    */
    @SerializedName("TemplateGroupId")
    @Expose
    private Long TemplateGroupId;

    /**
    * List of actions in the template library action group
    */
    @SerializedName("TemplateGroupActions")
    @Expose
    private TemplateGroupAction [] TemplateGroupActions;

    /**
    * Group name
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Group order
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * Execution mode. 1: sequential execution; 2: execution by stage.
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * Object type ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * Group creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Group update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Template library action ID 
     * @return TemplateGroupId Template library action ID
     */
    public Long getTemplateGroupId() {
        return this.TemplateGroupId;
    }

    /**
     * Set Template library action ID
     * @param TemplateGroupId Template library action ID
     */
    public void setTemplateGroupId(Long TemplateGroupId) {
        this.TemplateGroupId = TemplateGroupId;
    }

    /**
     * Get List of actions in the template library action group 
     * @return TemplateGroupActions List of actions in the template library action group
     */
    public TemplateGroupAction [] getTemplateGroupActions() {
        return this.TemplateGroupActions;
    }

    /**
     * Set List of actions in the template library action group
     * @param TemplateGroupActions List of actions in the template library action group
     */
    public void setTemplateGroupActions(TemplateGroupAction [] TemplateGroupActions) {
        this.TemplateGroupActions = TemplateGroupActions;
    }

    /**
     * Get Group name 
     * @return Title Group name
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Group name
     * @param Title Group name
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Group description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Group description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Group order 
     * @return Order Group order
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Group order
     * @param Order Group order
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get Execution mode. 1: sequential execution; 2: execution by stage. 
     * @return Mode Execution mode. 1: sequential execution; 2: execution by stage.
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Execution mode. 1: sequential execution; 2: execution by stage.
     * @param Mode Execution mode. 1: sequential execution; 2: execution by stage.
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Object type ID 
     * @return ObjectTypeId Object type ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set Object type ID
     * @param ObjectTypeId Object type ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get Group creation time 
     * @return CreateTime Group creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Group creation time
     * @param CreateTime Group creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Group update time 
     * @return UpdateTime Group update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Group update time
     * @param UpdateTime Group update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TemplateGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroup(TemplateGroup source) {
        if (source.TemplateGroupId != null) {
            this.TemplateGroupId = new Long(source.TemplateGroupId);
        }
        if (source.TemplateGroupActions != null) {
            this.TemplateGroupActions = new TemplateGroupAction[source.TemplateGroupActions.length];
            for (int i = 0; i < source.TemplateGroupActions.length; i++) {
                this.TemplateGroupActions[i] = new TemplateGroupAction(source.TemplateGroupActions[i]);
            }
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateGroupId", this.TemplateGroupId);
        this.setParamArrayObj(map, prefix + "TemplateGroupActions.", this.TemplateGroupActions);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

