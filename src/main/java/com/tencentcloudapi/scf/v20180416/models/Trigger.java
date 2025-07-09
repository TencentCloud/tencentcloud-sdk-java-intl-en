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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Trigger extends AbstractModel {

    /**
    * Latest modification time of the trigger
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Trigger type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Detailed trigger configuration
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Trigger name
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Creation time of the trigger
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Enabling switch
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Custom parameter
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
    * Trigger status
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * Minimum resource ID of trigger
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Trigger-Function binding status
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * Trigger type. Two-way means that the trigger can be manipulated in both consoles, while one-way means that the trigger can be created only in the SCF Console
    */
    @SerializedName("TriggerAttribute")
    @Expose
    private String TriggerAttribute;

    /**
    * The alias or version bound with the trigger
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Trigger description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Latest modification time of the trigger 
     * @return ModTime Latest modification time of the trigger
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Latest modification time of the trigger
     * @param ModTime Latest modification time of the trigger
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Trigger type 
     * @return Type Trigger type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Trigger type
     * @param Type Trigger type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Detailed trigger configuration 
     * @return TriggerDesc Detailed trigger configuration
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set Detailed trigger configuration
     * @param TriggerDesc Detailed trigger configuration
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get Trigger name 
     * @return TriggerName Trigger name
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set Trigger name
     * @param TriggerName Trigger name
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get Creation time of the trigger 
     * @return AddTime Creation time of the trigger
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time of the trigger
     * @param AddTime Creation time of the trigger
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Enabling switch 
     * @return Enable Enabling switch
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Enabling switch
     * @param Enable Enabling switch
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Custom parameter 
     * @return CustomArgument Custom parameter
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set Custom parameter
     * @param CustomArgument Custom parameter
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Get Trigger status 
     * @return AvailableStatus Trigger status
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set Trigger status
     * @param AvailableStatus Trigger status
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get Minimum resource ID of trigger 
     * @return ResourceId Minimum resource ID of trigger
     * @deprecated
     */
    @Deprecated
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Minimum resource ID of trigger
     * @param ResourceId Minimum resource ID of trigger
     * @deprecated
     */
    @Deprecated
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Trigger-Function binding status 
     * @return BindStatus Trigger-Function binding status
     * @deprecated
     */
    @Deprecated
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set Trigger-Function binding status
     * @param BindStatus Trigger-Function binding status
     * @deprecated
     */
    @Deprecated
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get Trigger type. Two-way means that the trigger can be manipulated in both consoles, while one-way means that the trigger can be created only in the SCF Console 
     * @return TriggerAttribute Trigger type. Two-way means that the trigger can be manipulated in both consoles, while one-way means that the trigger can be created only in the SCF Console
     * @deprecated
     */
    @Deprecated
    public String getTriggerAttribute() {
        return this.TriggerAttribute;
    }

    /**
     * Set Trigger type. Two-way means that the trigger can be manipulated in both consoles, while one-way means that the trigger can be created only in the SCF Console
     * @param TriggerAttribute Trigger type. Two-way means that the trigger can be manipulated in both consoles, while one-way means that the trigger can be created only in the SCF Console
     * @deprecated
     */
    @Deprecated
    public void setTriggerAttribute(String TriggerAttribute) {
        this.TriggerAttribute = TriggerAttribute;
    }

    /**
     * Get The alias or version bound with the trigger 
     * @return Qualifier The alias or version bound with the trigger
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set The alias or version bound with the trigger
     * @param Qualifier The alias or version bound with the trigger
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Trigger description 
     * @return Description Trigger description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Trigger description
     * @param Description Trigger description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Trigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Trigger(Trigger source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CustomArgument != null) {
            this.CustomArgument = new String(source.CustomArgument);
        }
        if (source.AvailableStatus != null) {
            this.AvailableStatus = new String(source.AvailableStatus);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.TriggerAttribute != null) {
            this.TriggerAttribute = new String(source.TriggerAttribute);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "TriggerAttribute", this.TriggerAttribute);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

