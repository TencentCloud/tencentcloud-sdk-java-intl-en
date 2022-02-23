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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProjectRequest extends AbstractModel{

    /**
    * Project ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Project name (optional, not empty, and up to 200 characters)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project webpage URL (optional and up to 256 characters)
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Project repository address (optional and up to 256 characters)
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * ID of the instance to which to move the project (optional)
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Project sample rate (optional)
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * Whether to enable aggregation (optional)
    */
    @SerializedName("EnableURLGroup")
    @Expose
    private Long EnableURLGroup;

    /**
    * Project type (valid values: "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Project description (optional and up to 1,000 characters)
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Project ID 
     * @return ID Project ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Project ID
     * @param ID Project ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Project name (optional, not empty, and up to 200 characters) 
     * @return Name Project name (optional, not empty, and up to 200 characters)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name (optional, not empty, and up to 200 characters)
     * @param Name Project name (optional, not empty, and up to 200 characters)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project webpage URL (optional and up to 256 characters) 
     * @return URL Project webpage URL (optional and up to 256 characters)
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Project webpage URL (optional and up to 256 characters)
     * @param URL Project webpage URL (optional and up to 256 characters)
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Project repository address (optional and up to 256 characters) 
     * @return Repo Project repository address (optional and up to 256 characters)
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set Project repository address (optional and up to 256 characters)
     * @param Repo Project repository address (optional and up to 256 characters)
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get ID of the instance to which to move the project (optional) 
     * @return InstanceID ID of the instance to which to move the project (optional)
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set ID of the instance to which to move the project (optional)
     * @param InstanceID ID of the instance to which to move the project (optional)
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Project sample rate (optional) 
     * @return Rate Project sample rate (optional)
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set Project sample rate (optional)
     * @param Rate Project sample rate (optional)
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Whether to enable aggregation (optional) 
     * @return EnableURLGroup Whether to enable aggregation (optional)
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set Whether to enable aggregation (optional)
     * @param EnableURLGroup Whether to enable aggregation (optional)
     */
    public void setEnableURLGroup(Long EnableURLGroup) {
        this.EnableURLGroup = EnableURLGroup;
    }

    /**
     * Get Project type (valid values: "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn") 
     * @return Type Project type (valid values: "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Project type (valid values: "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     * @param Type Project type (valid values: "web", "mp", "android", "ios", "node", "hippy", "weex", "viola", "rn")
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Project description (optional and up to 1,000 characters) 
     * @return Desc Project description (optional and up to 1,000 characters)
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Project description (optional and up to 1,000 characters)
     * @param Desc Project description (optional and up to 1,000 characters)
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public ModifyProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProjectRequest(ModifyProjectRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.EnableURLGroup != null) {
            this.EnableURLGroup = new Long(source.EnableURLGroup);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

