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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerInfo extends AbstractModel{

    /**
    * Enablement switch
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Function version or alias
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Trigger name
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * Trigger type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Detailed configuration of trigger
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * Whether the trigger is available
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * Custom parameter
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
    * Trigger creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Trigger last modified time
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
     * Get Enablement switch 
     * @return Enable Enablement switch
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Enablement switch
     * @param Enable Enablement switch
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Function version or alias 
     * @return Qualifier Function version or alias
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version or alias
     * @param Qualifier Function version or alias
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
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
     * Get Detailed configuration of trigger 
     * @return TriggerDesc Detailed configuration of trigger
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set Detailed configuration of trigger
     * @param TriggerDesc Detailed configuration of trigger
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get Whether the trigger is available 
     * @return AvailableStatus Whether the trigger is available
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set Whether the trigger is available
     * @param AvailableStatus Whether the trigger is available
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get Custom parameter
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CustomArgument Custom parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set Custom parameter
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CustomArgument Custom parameter
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Get Trigger creation time 
     * @return AddTime Trigger creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Trigger creation time
     * @param AddTime Trigger creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Trigger last modified time 
     * @return ModTime Trigger last modified time
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Trigger last modified time
     * @param ModTime Trigger last modified time
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);

    }
}

