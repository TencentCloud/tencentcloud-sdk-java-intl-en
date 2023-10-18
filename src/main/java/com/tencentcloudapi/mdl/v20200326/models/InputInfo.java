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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputInfo extends AbstractModel {

    /**
    * Input region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Input ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Input name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Input type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Array of security groups associated with input.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Array of channels associated with input.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttachedChannels")
    @Expose
    private String [] AttachedChannels;

    /**
    * Input configuration array.
    */
    @SerializedName("InputSettings")
    @Expose
    private InputSettingInfo [] InputSettings;

    /**
     * Get Input region. 
     * @return Region Input region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Input region.
     * @param Region Input region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Input ID. 
     * @return Id Input ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Input ID.
     * @param Id Input ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Input name. 
     * @return Name Input name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Input name.
     * @param Name Input name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Input type. 
     * @return Type Input type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Input type.
     * @param Type Input type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Array of security groups associated with input. 
     * @return SecurityGroupIds Array of security groups associated with input.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Array of security groups associated with input.
     * @param SecurityGroupIds Array of security groups associated with input.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Array of channels associated with input.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AttachedChannels Array of channels associated with input.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAttachedChannels() {
        return this.AttachedChannels;
    }

    /**
     * Set Array of channels associated with input.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AttachedChannels Array of channels associated with input.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAttachedChannels(String [] AttachedChannels) {
        this.AttachedChannels = AttachedChannels;
    }

    /**
     * Get Input configuration array. 
     * @return InputSettings Input configuration array.
     */
    public InputSettingInfo [] getInputSettings() {
        return this.InputSettings;
    }

    /**
     * Set Input configuration array.
     * @param InputSettings Input configuration array.
     */
    public void setInputSettings(InputSettingInfo [] InputSettings) {
        this.InputSettings = InputSettings;
    }

    public InputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputInfo(InputInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AttachedChannels != null) {
            this.AttachedChannels = new String[source.AttachedChannels.length];
            for (int i = 0; i < source.AttachedChannels.length; i++) {
                this.AttachedChannels[i] = new String(source.AttachedChannels[i]);
            }
        }
        if (source.InputSettings != null) {
            this.InputSettings = new InputSettingInfo[source.InputSettings.length];
            for (int i = 0; i < source.InputSettings.length; i++) {
                this.InputSettings[i] = new InputSettingInfo(source.InputSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AttachedChannels.", this.AttachedChannels);
        this.setParamArrayObj(map, prefix + "InputSettings.", this.InputSettings);

    }
}

