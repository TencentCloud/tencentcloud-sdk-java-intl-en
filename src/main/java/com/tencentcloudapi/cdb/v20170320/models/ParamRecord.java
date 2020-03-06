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

public class ParamRecord extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Parameter name
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Parameter value before modification
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * Parameter value after modification
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * Whether the parameter is modified successfully
    */
    @SerializedName("IsSucess")
    @Expose
    private Boolean IsSucess;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Parameter name 
     * @return ParamName Parameter name
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name
     * @param ParamName Parameter name
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Parameter value before modification 
     * @return OldValue Parameter value before modification
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Parameter value before modification
     * @param OldValue Parameter value before modification
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get Parameter value after modification 
     * @return NewValue Parameter value after modification
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set Parameter value after modification
     * @param NewValue Parameter value after modification
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get Whether the parameter is modified successfully 
     * @return IsSucess Whether the parameter is modified successfully
     */
    public Boolean getIsSucess() {
        return this.IsSucess;
    }

    /**
     * Set Whether the parameter is modified successfully
     * @param IsSucess Whether the parameter is modified successfully
     */
    public void setIsSucess(Boolean IsSucess) {
        this.IsSucess = IsSucess;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "IsSucess", this.IsSucess);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

