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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBEngineInfo extends AbstractModel {

    /**
    * <p>Engine type</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Engine version</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>Engine name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Engine description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Whether it is the latest version</p>
    */
    @SerializedName("New")
    @Expose
    private Boolean New;

    /**
    * <p>Supported compatible modes, separated by commas</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String [] SQLMode;

    /**
    * <p>Whether parameter template is supported</p>
    */
    @SerializedName("IsSupportParamTemplate")
    @Expose
    private Boolean IsSupportParamTemplate;

    /**
    * <p>Whether Serverless mode is supported</p>
    */
    @SerializedName("IsSupportServerless")
    @Expose
    private Boolean IsSupportServerless;

    /**
     * Get <p>Engine type</p> 
     * @return Type <p>Engine type</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Engine type</p>
     * @param Type <p>Engine type</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Engine version</p> 
     * @return Version <p>Engine version</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Engine version</p>
     * @param Version <p>Engine version</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Engine name</p> 
     * @return Name <p>Engine name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Engine name</p>
     * @param Name <p>Engine name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Engine description</p> 
     * @return Description <p>Engine description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Engine description</p>
     * @param Description <p>Engine description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Whether it is the latest version</p> 
     * @return New <p>Whether it is the latest version</p>
     */
    public Boolean getNew() {
        return this.New;
    }

    /**
     * Set <p>Whether it is the latest version</p>
     * @param New <p>Whether it is the latest version</p>
     */
    public void setNew(Boolean New) {
        this.New = New;
    }

    /**
     * Get <p>Supported compatible modes, separated by commas</p> 
     * @return SQLMode <p>Supported compatible modes, separated by commas</p>
     */
    public String [] getSQLMode() {
        return this.SQLMode;
    }

    /**
     * Set <p>Supported compatible modes, separated by commas</p>
     * @param SQLMode <p>Supported compatible modes, separated by commas</p>
     */
    public void setSQLMode(String [] SQLMode) {
        this.SQLMode = SQLMode;
    }

    /**
     * Get <p>Whether parameter template is supported</p> 
     * @return IsSupportParamTemplate <p>Whether parameter template is supported</p>
     */
    public Boolean getIsSupportParamTemplate() {
        return this.IsSupportParamTemplate;
    }

    /**
     * Set <p>Whether parameter template is supported</p>
     * @param IsSupportParamTemplate <p>Whether parameter template is supported</p>
     */
    public void setIsSupportParamTemplate(Boolean IsSupportParamTemplate) {
        this.IsSupportParamTemplate = IsSupportParamTemplate;
    }

    /**
     * Get <p>Whether Serverless mode is supported</p> 
     * @return IsSupportServerless <p>Whether Serverless mode is supported</p>
     */
    public Boolean getIsSupportServerless() {
        return this.IsSupportServerless;
    }

    /**
     * Set <p>Whether Serverless mode is supported</p>
     * @param IsSupportServerless <p>Whether Serverless mode is supported</p>
     */
    public void setIsSupportServerless(Boolean IsSupportServerless) {
        this.IsSupportServerless = IsSupportServerless;
    }

    public DBEngineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBEngineInfo(DBEngineInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.New != null) {
            this.New = new Boolean(source.New);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String[source.SQLMode.length];
            for (int i = 0; i < source.SQLMode.length; i++) {
                this.SQLMode[i] = new String(source.SQLMode[i]);
            }
        }
        if (source.IsSupportParamTemplate != null) {
            this.IsSupportParamTemplate = new Boolean(source.IsSupportParamTemplate);
        }
        if (source.IsSupportServerless != null) {
            this.IsSupportServerless = new Boolean(source.IsSupportServerless);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "New", this.New);
        this.setParamArraySimple(map, prefix + "SQLMode.", this.SQLMode);
        this.setParamSimple(map, prefix + "IsSupportParamTemplate", this.IsSupportParamTemplate);
        this.setParamSimple(map, prefix + "IsSupportServerless", this.IsSupportServerless);

    }
}

