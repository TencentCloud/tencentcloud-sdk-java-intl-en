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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceParamRequest extends AbstractModel{

    /**
    * List of short instance IDs.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * List of parameters to be modified. Every element is a combination of `Name` (parameter name) and `CurrentValue` (new value).
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
    * Template ID. At least one of `ParamList` and `TemplateId` must be passed in.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * When to perform the parameter adjustment task. Default value: 0. Valid values: 0 - execute immediately, 1 - execute during window. When its value is 1, only one instance ID can be passed in (i.e., only one `InstanceIds` can be passed in).
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * Whether to sync the parameters to read-only instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
    */
    @SerializedName("NotSyncRo")
    @Expose
    private Boolean NotSyncRo;

    /**
    * Whether to sync the parameters to disaster recovery instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
    */
    @SerializedName("NotSyncDr")
    @Expose
    private Boolean NotSyncDr;

    /**
     * Get List of short instance IDs. 
     * @return InstanceIds List of short instance IDs.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of short instance IDs.
     * @param InstanceIds List of short instance IDs.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get List of parameters to be modified. Every element is a combination of `Name` (parameter name) and `CurrentValue` (new value). 
     * @return ParamList List of parameters to be modified. Every element is a combination of `Name` (parameter name) and `CurrentValue` (new value).
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set List of parameters to be modified. Every element is a combination of `Name` (parameter name) and `CurrentValue` (new value).
     * @param ParamList List of parameters to be modified. Every element is a combination of `Name` (parameter name) and `CurrentValue` (new value).
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get Template ID. At least one of `ParamList` and `TemplateId` must be passed in. 
     * @return TemplateId Template ID. At least one of `ParamList` and `TemplateId` must be passed in.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID. At least one of `ParamList` and `TemplateId` must be passed in.
     * @param TemplateId Template ID. At least one of `ParamList` and `TemplateId` must be passed in.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get When to perform the parameter adjustment task. Default value: 0. Valid values: 0 - execute immediately, 1 - execute during window. When its value is 1, only one instance ID can be passed in (i.e., only one `InstanceIds` can be passed in). 
     * @return WaitSwitch When to perform the parameter adjustment task. Default value: 0. Valid values: 0 - execute immediately, 1 - execute during window. When its value is 1, only one instance ID can be passed in (i.e., only one `InstanceIds` can be passed in).
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set When to perform the parameter adjustment task. Default value: 0. Valid values: 0 - execute immediately, 1 - execute during window. When its value is 1, only one instance ID can be passed in (i.e., only one `InstanceIds` can be passed in).
     * @param WaitSwitch When to perform the parameter adjustment task. Default value: 0. Valid values: 0 - execute immediately, 1 - execute during window. When its value is 1, only one instance ID can be passed in (i.e., only one `InstanceIds` can be passed in).
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get Whether to sync the parameters to read-only instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`. 
     * @return NotSyncRo Whether to sync the parameters to read-only instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     */
    public Boolean getNotSyncRo() {
        return this.NotSyncRo;
    }

    /**
     * Set Whether to sync the parameters to read-only instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     * @param NotSyncRo Whether to sync the parameters to read-only instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     */
    public void setNotSyncRo(Boolean NotSyncRo) {
        this.NotSyncRo = NotSyncRo;
    }

    /**
     * Get Whether to sync the parameters to disaster recovery instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`. 
     * @return NotSyncDr Whether to sync the parameters to disaster recovery instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     */
    public Boolean getNotSyncDr() {
        return this.NotSyncDr;
    }

    /**
     * Set Whether to sync the parameters to disaster recovery instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     * @param NotSyncDr Whether to sync the parameters to disaster recovery instance of the source instance. Valid values: `true` (not sync), `false` (sync). Default value: `false`.
     */
    public void setNotSyncDr(Boolean NotSyncDr) {
        this.NotSyncDr = NotSyncDr;
    }

    public ModifyInstanceParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceParamRequest(ModifyInstanceParamRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ParamList != null) {
            this.ParamList = new Parameter[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new Parameter(source.ParamList[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.NotSyncRo != null) {
            this.NotSyncRo = new Boolean(source.NotSyncRo);
        }
        if (source.NotSyncDr != null) {
            this.NotSyncDr = new Boolean(source.NotSyncDr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "NotSyncRo", this.NotSyncRo);
        this.setParamSimple(map, prefix + "NotSyncDr", this.NotSyncDr);

    }
}

