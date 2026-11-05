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

public class CreatePluginRequest extends AbstractModel {

    /**
    * <p>Basic information of the plug-in.</p>
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
    * <p>Current workspace id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Tool list of the plug-in</p>
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
    * <p>User sub-account for login (required in integrator mode)</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get <p>Basic information of the plug-in.</p> 
     * @return Profile <p>Basic information of the plug-in.</p>
     */
    public PluginProfile getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>Basic information of the plug-in.</p>
     * @param Profile <p>Basic information of the plug-in.</p>
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
     * Get <p>Current workspace id</p> 
     * @return SpaceId <p>Current workspace id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Current workspace id</p>
     * @param SpaceId <p>Current workspace id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Tool list of the plug-in</p> 
     * @return ToolList <p>Tool list of the plug-in</p>
     */
    public Tool [] getToolList() {
        return this.ToolList;
    }

    /**
     * Set <p>Tool list of the plug-in</p>
     * @param ToolList <p>Tool list of the plug-in</p>
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
     * Get <p>User sub-account for login (required in integrator mode)</p> 
     * @return LoginSubAccountUin <p>User sub-account for login (required in integrator mode)</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>User sub-account for login (required in integrator mode)</p>
     * @param LoginSubAccountUin <p>User sub-account for login (required in integrator mode)</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public CreatePluginRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePluginRequest(CreatePluginRequest source) {
        if (source.Profile != null) {
            this.Profile = new PluginProfile(source.Profile);
        }
        if (source.Config != null) {
            this.Config = new PluginConfig(source.Config);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
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
        this.setParamObj(map, prefix + "Profile.", this.Profile);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "ToolList.", this.ToolList);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

