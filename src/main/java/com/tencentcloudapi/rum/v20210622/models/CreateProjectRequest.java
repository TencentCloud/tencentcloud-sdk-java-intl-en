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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel {

    /**
    * Name of the created project (required and up to 200 characters)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Business system ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Project sampling rate (greater than or equal to 0)
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * Whether to enable aggregation
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
    * Repository address of the project (optional and up to 256 characters)
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * Webpage address of the project (optional and up to 256 characters)
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Description of the created project (optional and up to 1,000 characters)
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Name of the created project (required and up to 200 characters) 
     * @return Name Name of the created project (required and up to 200 characters)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the created project (required and up to 200 characters)
     * @param Name Name of the created project (required and up to 200 characters)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Business system ID 
     * @return InstanceID Business system ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Business system ID
     * @param InstanceID Business system ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Project sampling rate (greater than or equal to 0) 
     * @return Rate Project sampling rate (greater than or equal to 0)
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set Project sampling rate (greater than or equal to 0)
     * @param Rate Project sampling rate (greater than or equal to 0)
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Whether to enable aggregation 
     * @return EnableURLGroup Whether to enable aggregation
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set Whether to enable aggregation
     * @param EnableURLGroup Whether to enable aggregation
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
     * Get Repository address of the project (optional and up to 256 characters) 
     * @return Repo Repository address of the project (optional and up to 256 characters)
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set Repository address of the project (optional and up to 256 characters)
     * @param Repo Repository address of the project (optional and up to 256 characters)
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get Webpage address of the project (optional and up to 256 characters) 
     * @return URL Webpage address of the project (optional and up to 256 characters)
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Webpage address of the project (optional and up to 256 characters)
     * @param URL Webpage address of the project (optional and up to 256 characters)
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Description of the created project (optional and up to 1,000 characters) 
     * @return Desc Description of the created project (optional and up to 1,000 characters)
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description of the created project (optional and up to 1,000 characters)
     * @param Desc Description of the created project (optional and up to 1,000 characters)
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

