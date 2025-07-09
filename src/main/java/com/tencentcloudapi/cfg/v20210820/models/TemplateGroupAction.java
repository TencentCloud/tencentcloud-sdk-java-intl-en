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

public class TemplateGroupAction extends AbstractModel {

    /**
    * Template library group action ID
    */
    @SerializedName("TemplateGroupActionId")
    @Expose
    private Long TemplateGroupActionId;

    /**
    * Action ID
    */
    @SerializedName("ActionId")
    @Expose
    private Long ActionId;

    /**
    * Order of actions in the group
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GeneralConfiguration")
    @Expose
    private String GeneralConfiguration;

    /**
    * Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomConfiguration")
    @Expose
    private String CustomConfiguration;

    /**
    * Action group creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Action group update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Action name
    */
    @SerializedName("ActionTitle")
    @Expose
    private String ActionTitle;

    /**
    * Random ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RandomId")
    @Expose
    private Long RandomId;

    /**
    * Recovery action ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecoverId")
    @Expose
    private Long RecoverId;

    /**
    * Executed action ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExecuteId")
    @Expose
    private Long ExecuteId;

    /**
    * Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionApiType")
    @Expose
    private Long ActionApiType;

    /**
    * 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionAttribute")
    @Expose
    private Long ActionAttribute;

    /**
    * Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * Action risk level. 1: low-risk; 2: medium-risk; 3: high-risk.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionRisk")
    @Expose
    private String ActionRisk;

    /**
     * Get Template library group action ID 
     * @return TemplateGroupActionId Template library group action ID
     */
    public Long getTemplateGroupActionId() {
        return this.TemplateGroupActionId;
    }

    /**
     * Set Template library group action ID
     * @param TemplateGroupActionId Template library group action ID
     */
    public void setTemplateGroupActionId(Long TemplateGroupActionId) {
        this.TemplateGroupActionId = TemplateGroupActionId;
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
     * Get Order of actions in the group 
     * @return Order Order of actions in the group
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Order of actions in the group
     * @param Order Order of actions in the group
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GeneralConfiguration General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGeneralConfiguration() {
        return this.GeneralConfiguration;
    }

    /**
     * Set General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GeneralConfiguration General configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGeneralConfiguration(String GeneralConfiguration) {
        this.GeneralConfiguration = GeneralConfiguration;
    }

    /**
     * Get Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomConfiguration Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomConfiguration() {
        return this.CustomConfiguration;
    }

    /**
     * Set Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomConfiguration Custom configurations of actions in the group
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomConfiguration(String CustomConfiguration) {
        this.CustomConfiguration = CustomConfiguration;
    }

    /**
     * Get Action group creation time 
     * @return CreateTime Action group creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Action group creation time
     * @param CreateTime Action group creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Action group update time 
     * @return UpdateTime Action group update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Action group update time
     * @param UpdateTime Action group update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Action name 
     * @return ActionTitle Action name
     */
    public String getActionTitle() {
        return this.ActionTitle;
    }

    /**
     * Set Action name
     * @param ActionTitle Action name
     */
    public void setActionTitle(String ActionTitle) {
        this.ActionTitle = ActionTitle;
    }

    /**
     * Get Random ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RandomId Random ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRandomId() {
        return this.RandomId;
    }

    /**
     * Set Random ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RandomId Random ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRandomId(Long RandomId) {
        this.RandomId = RandomId;
    }

    /**
     * Get Recovery action ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecoverId Recovery action ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRecoverId() {
        return this.RecoverId;
    }

    /**
     * Set Recovery action ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecoverId Recovery action ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecoverId(Long RecoverId) {
        this.RecoverId = RecoverId;
    }

    /**
     * Get Executed action ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExecuteId Executed action ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExecuteId() {
        return this.ExecuteId;
    }

    /**
     * Set Executed action ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExecuteId Executed action ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExecuteId(Long ExecuteId) {
        this.ExecuteId = ExecuteId;
    }

    /**
     * Get Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionApiType Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getActionApiType() {
        return this.ActionApiType;
    }

    /**
     * Set Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionApiType Called API type. 0: tat; 1: cloud API.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionApiType(Long ActionApiType) {
        this.ActionApiType = ActionApiType;
    }

    /**
     * Get 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionAttribute 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getActionAttribute() {
        return this.ActionAttribute;
    }

    /**
     * Set 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionAttribute 1: fault; 2: recovery.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionAttribute(Long ActionAttribute) {
        this.ActionAttribute = ActionAttribute;
    }

    /**
     * Get Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionType Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionType Action type: platform and custom
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get Action risk level. 1: low-risk; 2: medium-risk; 3: high-risk.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionRisk Action risk level. 1: low-risk; 2: medium-risk; 3: high-risk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActionRisk() {
        return this.ActionRisk;
    }

    /**
     * Set Action risk level. 1: low-risk; 2: medium-risk; 3: high-risk.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionRisk Action risk level. 1: low-risk; 2: medium-risk; 3: high-risk.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionRisk(String ActionRisk) {
        this.ActionRisk = ActionRisk;
    }

    public TemplateGroupAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateGroupAction(TemplateGroupAction source) {
        if (source.TemplateGroupActionId != null) {
            this.TemplateGroupActionId = new Long(source.TemplateGroupActionId);
        }
        if (source.ActionId != null) {
            this.ActionId = new Long(source.ActionId);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.GeneralConfiguration != null) {
            this.GeneralConfiguration = new String(source.GeneralConfiguration);
        }
        if (source.CustomConfiguration != null) {
            this.CustomConfiguration = new String(source.CustomConfiguration);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ActionTitle != null) {
            this.ActionTitle = new String(source.ActionTitle);
        }
        if (source.RandomId != null) {
            this.RandomId = new Long(source.RandomId);
        }
        if (source.RecoverId != null) {
            this.RecoverId = new Long(source.RecoverId);
        }
        if (source.ExecuteId != null) {
            this.ExecuteId = new Long(source.ExecuteId);
        }
        if (source.ActionApiType != null) {
            this.ActionApiType = new Long(source.ActionApiType);
        }
        if (source.ActionAttribute != null) {
            this.ActionAttribute = new Long(source.ActionAttribute);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionRisk != null) {
            this.ActionRisk = new String(source.ActionRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateGroupActionId", this.TemplateGroupActionId);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "GeneralConfiguration", this.GeneralConfiguration);
        this.setParamSimple(map, prefix + "CustomConfiguration", this.CustomConfiguration);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ActionTitle", this.ActionTitle);
        this.setParamSimple(map, prefix + "RandomId", this.RandomId);
        this.setParamSimple(map, prefix + "RecoverId", this.RecoverId);
        this.setParamSimple(map, prefix + "ExecuteId", this.ExecuteId);
        this.setParamSimple(map, prefix + "ActionApiType", this.ActionApiType);
        this.setParamSimple(map, prefix + "ActionAttribute", this.ActionAttribute);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionRisk", this.ActionRisk);

    }
}

