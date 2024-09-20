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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActionLibraryListResult extends AbstractModel {

    /**
    * Action name
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * Action description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Action type: ["platform" and "custom"]
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Action risk description
    */
    @SerializedName("RiskDesc")
    @Expose
    private String RiskDesc;

    /**
    * Action ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * Action attribute (1: fault; 2: recovery)
    */
    @SerializedName("AttributeId")
    @Expose
    private Long AttributeId;

    /**
    * ID of the associated action
    */
    @SerializedName("RelationActionId")
    @Expose
    private Long RelationActionId;

    /**
    * Operation command
    */
    @SerializedName("ActionCommand")
    @Expose
    private String ActionCommand;

    /**
    * Action type (0: tat; 1: cloud API)
    */
    @SerializedName("ActionCommandType")
    @Expose
    private Long ActionCommandType;

    /**
    * Parameters of the custom action, in JSON string format
    */
    @SerializedName("ActionContent")
    @Expose
    private String ActionContent;

    /**
    * Level-2 type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Action description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionDetail")
    @Expose
    private String ActionDetail;

    /**
    * Whether to allow usage by the current account
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAllowed")
    @Expose
    private Boolean IsAllowed;

    /**
    * Link to best practices
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionBestCase")
    @Expose
    private String ActionBestCase;

    /**
    * Object type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * Monitoring metric ID list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricIdList")
    @Expose
    private Long [] MetricIdList;

    /**
    * Whether the action is new
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsNewAction")
    @Expose
    private Boolean IsNewAction;

    /**
     * Get Action name 
     * @return ActionName Action name
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set Action name
     * @param ActionName Action name
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get Action description 
     * @return Desc Action description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Action description
     * @param Desc Action description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Action type: ["platform" and "custom"] 
     * @return ActionType Action type: ["platform" and "custom"]
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type: ["platform" and "custom"]
     * @param ActionType Action type: ["platform" and "custom"]
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Action risk description 
     * @return RiskDesc Action risk description
     */
    public String getRiskDesc() {
        return this.RiskDesc;
    }

    /**
     * Set Action risk description
     * @param RiskDesc Action risk description
     */
    public void setRiskDesc(String RiskDesc) {
        this.RiskDesc = RiskDesc;
    }

    /**
     * Get Action ID 
     * @return ActionId Action ID
     */
    public Long getActionId() {
        return this.ActionId;
    }

    /**
     * Set Action ID
     * @param ActionId Action ID
     */
    public void setActionId(Long ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get Action attribute (1: fault; 2: recovery) 
     * @return AttributeId Action attribute (1: fault; 2: recovery)
     */
    public Long getAttributeId() {
        return this.AttributeId;
    }

    /**
     * Set Action attribute (1: fault; 2: recovery)
     * @param AttributeId Action attribute (1: fault; 2: recovery)
     */
    public void setAttributeId(Long AttributeId) {
        this.AttributeId = AttributeId;
    }

    /**
     * Get ID of the associated action 
     * @return RelationActionId ID of the associated action
     */
    public Long getRelationActionId() {
        return this.RelationActionId;
    }

    /**
     * Set ID of the associated action
     * @param RelationActionId ID of the associated action
     */
    public void setRelationActionId(Long RelationActionId) {
        this.RelationActionId = RelationActionId;
    }

    /**
     * Get Operation command 
     * @return ActionCommand Operation command
     */
    public String getActionCommand() {
        return this.ActionCommand;
    }

    /**
     * Set Operation command
     * @param ActionCommand Operation command
     */
    public void setActionCommand(String ActionCommand) {
        this.ActionCommand = ActionCommand;
    }

    /**
     * Get Action type (0: tat; 1: cloud API) 
     * @return ActionCommandType Action type (0: tat; 1: cloud API)
     */
    public Long getActionCommandType() {
        return this.ActionCommandType;
    }

    /**
     * Set Action type (0: tat; 1: cloud API)
     * @param ActionCommandType Action type (0: tat; 1: cloud API)
     */
    public void setActionCommandType(Long ActionCommandType) {
        this.ActionCommandType = ActionCommandType;
    }

    /**
     * Get Parameters of the custom action, in JSON string format 
     * @return ActionContent Parameters of the custom action, in JSON string format
     */
    public String getActionContent() {
        return this.ActionContent;
    }

    /**
     * Set Parameters of the custom action, in JSON string format
     * @param ActionContent Parameters of the custom action, in JSON string format
     */
    public void setActionContent(String ActionContent) {
        this.ActionContent = ActionContent;
    }

    /**
     * Get Level-2 type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Level-2 type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Level-2 type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Level-2 type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Action description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionDetail Action description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionDetail() {
        return this.ActionDetail;
    }

    /**
     * Set Action description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionDetail Action description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionDetail(String ActionDetail) {
        this.ActionDetail = ActionDetail;
    }

    /**
     * Get Whether to allow usage by the current account
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAllowed Whether to allow usage by the current account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsAllowed() {
        return this.IsAllowed;
    }

    /**
     * Set Whether to allow usage by the current account
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAllowed Whether to allow usage by the current account
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAllowed(Boolean IsAllowed) {
        this.IsAllowed = IsAllowed;
    }

    /**
     * Get Link to best practices
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionBestCase Link to best practices
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionBestCase() {
        return this.ActionBestCase;
    }

    /**
     * Set Link to best practices
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionBestCase Link to best practices
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionBestCase(String ActionBestCase) {
        this.ActionBestCase = ActionBestCase;
    }

    /**
     * Get Object type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectType Object type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Object type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectType Object type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Monitoring metric ID list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricIdList Monitoring metric ID list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getMetricIdList() {
        return this.MetricIdList;
    }

    /**
     * Set Monitoring metric ID list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricIdList Monitoring metric ID list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricIdList(Long [] MetricIdList) {
        this.MetricIdList = MetricIdList;
    }

    /**
     * Get Whether the action is new
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsNewAction Whether the action is new
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsNewAction() {
        return this.IsNewAction;
    }

    /**
     * Set Whether the action is new
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsNewAction Whether the action is new
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsNewAction(Boolean IsNewAction) {
        this.IsNewAction = IsNewAction;
    }

    public ActionLibraryListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActionLibraryListResult(ActionLibraryListResult source) {
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RiskDesc != null) {
            this.RiskDesc = new String(source.RiskDesc);
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.AttributeId != null) {
            this.AttributeId = new Long(source.AttributeId);
        }
        if (source.RelationActionId != null) {
            this.RelationActionId = new Long(source.RelationActionId);
        }
        if (source.ActionCommand != null) {
            this.ActionCommand = new String(source.ActionCommand);
        }
        if (source.ActionCommandType != null) {
            this.ActionCommandType = new Long(source.ActionCommandType);
        }
        if (source.ActionContent != null) {
            this.ActionContent = new String(source.ActionContent);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ActionDetail != null) {
            this.ActionDetail = new String(source.ActionDetail);
        }
        if (source.IsAllowed != null) {
            this.IsAllowed = new Boolean(source.IsAllowed);
        }
        if (source.ActionBestCase != null) {
            this.ActionBestCase = new String(source.ActionBestCase);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.MetricIdList != null) {
            this.MetricIdList = new Long[source.MetricIdList.length];
            for (int i = 0; i < source.MetricIdList.length; i++) {
                this.MetricIdList[i] = new Long(source.MetricIdList[i]);
            }
        }
        if (source.IsNewAction != null) {
            this.IsNewAction = new Boolean(source.IsNewAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RiskDesc", this.RiskDesc);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "AttributeId", this.AttributeId);
        this.setParamSimple(map, prefix + "RelationActionId", this.RelationActionId);
        this.setParamSimple(map, prefix + "ActionCommand", this.ActionCommand);
        this.setParamSimple(map, prefix + "ActionCommandType", this.ActionCommandType);
        this.setParamSimple(map, prefix + "ActionContent", this.ActionContent);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ActionDetail", this.ActionDetail);
        this.setParamSimple(map, prefix + "IsAllowed", this.IsAllowed);
        this.setParamSimple(map, prefix + "ActionBestCase", this.ActionBestCase);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamArraySimple(map, prefix + "MetricIdList.", this.MetricIdList);
        this.setParamSimple(map, prefix + "IsNewAction", this.IsNewAction);

    }
}

