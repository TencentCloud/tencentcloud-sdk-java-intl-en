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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetAppProcessInfo extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Process status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Process version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * User
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Startup time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Process status 
     * @return Status Process status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Process status
     * @param Status Process status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Process version 
     * @return Version Process version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Process version
     * @param Version Process version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Path 
     * @return Path Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
     * @param Path Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get User 
     * @return User User
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User
     * @param User User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Startup time 
     * @return StartTime Startup time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Startup time
     * @param StartTime Startup time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public AssetAppProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetAppProcessInfo(AssetAppProcessInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

