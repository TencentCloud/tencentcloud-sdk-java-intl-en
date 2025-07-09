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

public class RumProject extends AbstractModel {

    /**
    * Project name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creator ID
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Project type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Project repository address
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * Project URL
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * Project sample rate
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * Unique project key (12 characters)
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Whether to enable URL aggregation
    */
    @SerializedName("EnableURLGroup")
    @Expose
    private Long EnableURLGroup;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Project ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance key
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Project description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Starred status. 1: yes; 0: no
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsStar")
    @Expose
    private Long IsStar;

    /**
    * Project status (`1`: Creating; `2`: Running; `3`: Abnormal; `4`: Restarting; `5`: Stopping; `6`: Stopped; `7`: Terminating; `8`: Terminated)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectStatus")
    @Expose
    private Long ProjectStatus;

    /**
    * Log access point, which can be ignored. 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessPoint")
    @Expose
    private String AccessPoint;

    /**
     * Get Project name 
     * @return Name Project name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name
     * @param Name Project name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creator ID 
     * @return Creator Creator ID
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator ID
     * @param Creator Creator ID
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Project type 
     * @return Type Project type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Project type
     * @param Type Project type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Project repository address
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Repo Project repository address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set Project repository address
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Repo Project repository address
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get Project URL
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return URL Project URL
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set Project URL
Note: this field may return null, indicating that no valid values can be obtained.
     * @param URL Project URL
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get Project sample rate 
     * @return Rate Project sample rate
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set Project sample rate
     * @param Rate Project sample rate
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Unique project key (12 characters) 
     * @return Key Unique project key (12 characters)
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Unique project key (12 characters)
     * @param Key Unique project key (12 characters)
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Whether to enable URL aggregation 
     * @return EnableURLGroup Whether to enable URL aggregation
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set Whether to enable URL aggregation
     * @param EnableURLGroup Whether to enable URL aggregation
     */
    public void setEnableURLGroup(Long EnableURLGroup) {
        this.EnableURLGroup = EnableURLGroup;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

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
     * Get Instance key 
     * @return InstanceKey Instance key
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance key
     * @param InstanceKey Instance key
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Project description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Desc Project description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Project description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Desc Project description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Starred status. 1: yes; 0: no
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IsStar Starred status. 1: yes; 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsStar() {
        return this.IsStar;
    }

    /**
     * Set Starred status. 1: yes; 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IsStar Starred status. 1: yes; 0: no
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIsStar(Long IsStar) {
        this.IsStar = IsStar;
    }

    /**
     * Get Project status (`1`: Creating; `2`: Running; `3`: Abnormal; `4`: Restarting; `5`: Stopping; `6`: Stopped; `7`: Terminating; `8`: Terminated)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ProjectStatus Project status (`1`: Creating; `2`: Running; `3`: Abnormal; `4`: Restarting; `5`: Stopping; `6`: Stopped; `7`: Terminating; `8`: Terminated)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getProjectStatus() {
        return this.ProjectStatus;
    }

    /**
     * Set Project status (`1`: Creating; `2`: Running; `3`: Abnormal; `4`: Restarting; `5`: Stopping; `6`: Stopped; `7`: Terminating; `8`: Terminated)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ProjectStatus Project status (`1`: Creating; `2`: Running; `3`: Abnormal; `4`: Restarting; `5`: Stopping; `6`: Stopped; `7`: Terminating; `8`: Terminated)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProjectStatus(Long ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }

    /**
     * Get Log access point, which can be ignored. 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return AccessPoint Log access point, which can be ignored. 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessPoint() {
        return this.AccessPoint;
    }

    /**
     * Set Log access point, which can be ignored. 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param AccessPoint Log access point, which can be ignored. 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessPoint(String AccessPoint) {
        this.AccessPoint = AccessPoint;
    }

    public RumProject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumProject(RumProject source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.EnableURLGroup != null) {
            this.EnableURLGroup = new Long(source.EnableURLGroup);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.IsStar != null) {
            this.IsStar = new Long(source.IsStar);
        }
        if (source.ProjectStatus != null) {
            this.ProjectStatus = new Long(source.ProjectStatus);
        }
        if (source.AccessPoint != null) {
            this.AccessPoint = new String(source.AccessPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "IsStar", this.IsStar);
        this.setParamSimple(map, prefix + "ProjectStatus", this.ProjectStatus);
        this.setParamSimple(map, prefix + "AccessPoint", this.AccessPoint);

    }
}

