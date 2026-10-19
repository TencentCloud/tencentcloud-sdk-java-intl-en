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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemConfigRule extends AbstractModel {

    /**
    * <p>Rule ID.</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>Rule name.</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule parameters</p>
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameterForManage [] InputParameter;

    /**
    * <p>Rule trigger condition</p>
    */
    @SerializedName("SourceCondition")
    @Expose
    private SourceConditionForManage [] SourceCondition;

    /**
    * <p>Supported resource types.</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String [] ResourceType;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Label")
    @Expose
    private String [] Label;

    /**
    * <p>Risk level, 1, 2, 3</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>Corresponding function</p>
    */
    @SerializedName("ServiceFunction")
    @Expose
    private String ServiceFunction;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Trigger type.</p>
    */
    @SerializedName("TriggerType")
    @Expose
    private String [] TriggerType;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Number of use</p>
    */
    @SerializedName("ReferenceCount")
    @Expose
    private Long ReferenceCount;

    /**
    * <p>Rule type.</p>
    */
    @SerializedName("IdentifierType")
    @Expose
    private String IdentifierType;

    /**
     * Get <p>Rule ID.</p> 
     * @return Identifier <p>Rule ID.</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>Rule ID.</p>
     * @param Identifier <p>Rule ID.</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>Rule name.</p> 
     * @return RuleName <p>Rule name.</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Rule name.</p>
     * @param RuleName <p>Rule name.</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Rule parameters</p> 
     * @return InputParameter <p>Rule parameters</p>
     */
    public InputParameterForManage [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set <p>Rule parameters</p>
     * @param InputParameter <p>Rule parameters</p>
     */
    public void setInputParameter(InputParameterForManage [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get <p>Rule trigger condition</p> 
     * @return SourceCondition <p>Rule trigger condition</p>
     */
    public SourceConditionForManage [] getSourceCondition() {
        return this.SourceCondition;
    }

    /**
     * Set <p>Rule trigger condition</p>
     * @param SourceCondition <p>Rule trigger condition</p>
     */
    public void setSourceCondition(SourceConditionForManage [] SourceCondition) {
        this.SourceCondition = SourceCondition;
    }

    /**
     * Get <p>Supported resource types.</p> 
     * @return ResourceType <p>Supported resource types.</p>
     */
    public String [] getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Supported resource types.</p>
     * @param ResourceType <p>Supported resource types.</p>
     */
    public void setResourceType(String [] ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Label <p>Tag.</p>
     */
    public String [] getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Tag.</p>
     * @param Label <p>Tag.</p>
     */
    public void setLabel(String [] Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Risk level, 1, 2, 3</p> 
     * @return RiskLevel <p>Risk level, 1, 2, 3</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Risk level, 1, 2, 3</p>
     * @param RiskLevel <p>Risk level, 1, 2, 3</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>Corresponding function</p> 
     * @return ServiceFunction <p>Corresponding function</p>
     */
    public String getServiceFunction() {
        return this.ServiceFunction;
    }

    /**
     * Set <p>Corresponding function</p>
     * @param ServiceFunction <p>Corresponding function</p>
     */
    public void setServiceFunction(String ServiceFunction) {
        this.ServiceFunction = ServiceFunction;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Trigger type.</p> 
     * @return TriggerType <p>Trigger type.</p>
     */
    public String [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>Trigger type.</p>
     * @param TriggerType <p>Trigger type.</p>
     */
    public void setTriggerType(String [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Number of use</p> 
     * @return ReferenceCount <p>Number of use</p>
     */
    public Long getReferenceCount() {
        return this.ReferenceCount;
    }

    /**
     * Set <p>Number of use</p>
     * @param ReferenceCount <p>Number of use</p>
     */
    public void setReferenceCount(Long ReferenceCount) {
        this.ReferenceCount = ReferenceCount;
    }

    /**
     * Get <p>Rule type.</p> 
     * @return IdentifierType <p>Rule type.</p>
     */
    public String getIdentifierType() {
        return this.IdentifierType;
    }

    /**
     * Set <p>Rule type.</p>
     * @param IdentifierType <p>Rule type.</p>
     */
    public void setIdentifierType(String IdentifierType) {
        this.IdentifierType = IdentifierType;
    }

    public SystemConfigRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemConfigRule(SystemConfigRule source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameterForManage[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameterForManage(source.InputParameter[i]);
            }
        }
        if (source.SourceCondition != null) {
            this.SourceCondition = new SourceConditionForManage[source.SourceCondition.length];
            for (int i = 0; i < source.SourceCondition.length; i++) {
                this.SourceCondition[i] = new SourceConditionForManage(source.SourceCondition[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String[source.ResourceType.length];
            for (int i = 0; i < source.ResourceType.length; i++) {
                this.ResourceType[i] = new String(source.ResourceType[i]);
            }
        }
        if (source.Label != null) {
            this.Label = new String[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new String(source.Label[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ServiceFunction != null) {
            this.ServiceFunction = new String(source.ServiceFunction);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new String(source.TriggerType[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ReferenceCount != null) {
            this.ReferenceCount = new Long(source.ReferenceCount);
        }
        if (source.IdentifierType != null) {
            this.IdentifierType = new String(source.IdentifierType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamArrayObj(map, prefix + "SourceCondition.", this.SourceCondition);
        this.setParamArraySimple(map, prefix + "ResourceType.", this.ResourceType);
        this.setParamArraySimple(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ServiceFunction", this.ServiceFunction);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ReferenceCount", this.ReferenceCount);
        this.setParamSimple(map, prefix + "IdentifierType", this.IdentifierType);

    }
}

