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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrRepositoryInfo extends AbstractModel {

    /**
    * Repository name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Namespace name
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Creation time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Whether to make public
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * Detailed repository description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Brief description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BriefDescription")
    @Expose
    private String BriefDescription;

    /**
    * Update time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Repository name 
     * @return Name Repository name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Repository name
     * @param Name Repository name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Namespace name 
     * @return Namespace Namespace name
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace name
     * @param Namespace Namespace name
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Creation time, such as `2006-01-02 15:04:05.999999999 -0700 MST` 
     * @return CreationTime Creation time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     * @param CreationTime Creation time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Whether to make public 
     * @return Public Whether to make public
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set Whether to make public
     * @param Public Whether to make public
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get Detailed repository description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Detailed repository description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Detailed repository description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Detailed repository description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Brief description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BriefDescription Brief description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBriefDescription() {
        return this.BriefDescription;
    }

    /**
     * Set Brief description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BriefDescription Brief description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBriefDescription(String BriefDescription) {
        this.BriefDescription = BriefDescription;
    }

    /**
     * Get Update time, such as `2006-01-02 15:04:05.999999999 -0700 MST` 
     * @return UpdateTime Update time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     * @param UpdateTime Update time, such as `2006-01-02 15:04:05.999999999 -0700 MST`
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TcrRepositoryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrRepositoryInfo(TcrRepositoryInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Public != null) {
            this.Public = new Boolean(source.Public);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.BriefDescription != null) {
            this.BriefDescription = new String(source.BriefDescription);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "BriefDescription", this.BriefDescription);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

