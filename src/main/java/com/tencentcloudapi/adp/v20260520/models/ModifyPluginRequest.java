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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPluginRequest extends AbstractModel {

    /**
    * <p>Plugin_id</p>
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * <p>Plugin version number</p>
    */
    @SerializedName("PluginVersion")
    @Expose
    private Long PluginVersion;

    /**
    * <p>Plug-in basic information</p>
    */
    @SerializedName("Profile")
    @Expose
    private PluginProfile Profile;

    /**
    * <p>Plug-in type configuration</p>
    */
    @SerializedName("Config")
    @Expose
    private PluginConfig Config;

    /**
    * <p>Specify the fields to update to avoid full coverage</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>Tool list of the plug-in. This parameter is not required for mcp plug-ins.</p>
    */
    @SerializedName("ToolList")
    @Expose
    private Tool [] ToolList;

    /**
    * <p>User Main Account logged in (required in integrator mode)</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>User Sub-account logged in (required in integrator mode)</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get <p>Plugin_id</p> 
     * @return PluginId <p>Plugin_id</p>
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set <p>Plugin_id</p>
     * @param PluginId <p>Plugin_id</p>
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get <p>Plugin version number</p> 
     * @return PluginVersion <p>Plugin version number</p>
     */
    public Long getPluginVersion() {
        return this.PluginVersion;
    }

    /**
     * Set <p>Plugin version number</p>
     * @param PluginVersion <p>Plugin version number</p>
     */
    public void setPluginVersion(Long PluginVersion) {
        this.PluginVersion = PluginVersion;
    }

    /**
     * Get <p>Plug-in basic information</p> 
     * @return Profile <p>Plug-in basic information</p>
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Plug-in basic information</p>
     * @param Profile <p>Plug-in basic information</p>
     */
    public void setProfile(PluginProfile Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>Plug-in type configuration</p> 
     * @return Config <p>Plug-in type configuration</p>
     */
    public PluginConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>Plug-in type configuration</p>
     * @param Config <p>Plug-in type configuration</p>
     */
    public void setConfig(PluginConfig Config) {
        this.Config = Config;
    }

    /**
     * Get <p>Specify the fields to update to avoid full coverage</p> 
     * @return UpdateMask <p>Specify the fields to update to avoid full coverage</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>Specify the fields to update to avoid full coverage</p>
     * @param UpdateMask <p>Specify the fields to update to avoid full coverage</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>Tool list of the plug-in. This parameter is not required for mcp plug-ins.</p> 
     * @return ToolList <p>Tool list of the plug-in. This parameter is not required for mcp plug-ins.</p>
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>Tool list of the plug-in. This parameter is not required for mcp plug-ins.</p>
     * @param ToolList <p>Tool list of the plug-in. This parameter is not required for mcp plug-ins.</p>
     */
    public void setToolList(Tool [] ToolList) {
        this.ToolList = ToolList;
    }

    /**
     * Get <p>User Main Account logged in (required in integrator mode)</p> 
     * @return LoginUin <p>User Main Account logged in (required in integrator mode)</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>User Main Account logged in (required in integrator mode)</p>
     * @param LoginUin <p>User Main Account logged in (required in integrator mode)</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>User Sub-account logged in (required in integrator mode)</p> 
     * @return LoginSubAccountUin <p>User Sub-account logged in (required in integrator mode)</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>User Sub-account logged in (required in integrator mode)</p>
     * @param LoginSubAccountUin <p>User Sub-account logged in (required in integrator mode)</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public ModifyPluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPluginRequest(ModifyPluginRequest source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginVersion != null) {
            this.PluginVersion = new Long(source.PluginVersion);
        }
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.ToolList != null) {
            this.ToolList = new Tool[source.ToolList.length];
            for (int i = 0; i < source.ToolList.length; i++) {
                this.ToolList[i] = new Tool(source.ToolList[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginVersion", this.PluginVersion);
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

