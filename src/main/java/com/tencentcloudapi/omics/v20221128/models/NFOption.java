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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NFOption extends AbstractModel {

    /**
    * Config.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Profile.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Report.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Report")
    @Expose
    private Boolean Report;

    /**
    * Resume.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Resume")
    @Expose
    private Boolean Resume;

    /**
    * Nextflow engine version. Valid values:
- 22.10.4
- 22.10.8 
- 23.10.1
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NFVersion")
    @Expose
    private String NFVersion;

    /**
     * Get Config.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Config Config.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Config.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Config Config.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get Profile.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Profile Profile.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Profile.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Profile Profile.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Report.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Report Report.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getReport() {
        return this.Report;
    }

    /**
     * Set Report.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Report Report.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReport(Boolean Report) {
        this.Report = Report;
    }

    /**
     * Get Resume.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Resume Resume.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getResume() {
        return this.Resume;
    }

    /**
     * Set Resume.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Resume Resume.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResume(Boolean Resume) {
        this.Resume = Resume;
    }

    /**
     * Get Nextflow engine version. Valid values:
- 22.10.4
- 22.10.8 
- 23.10.1
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NFVersion Nextflow engine version. Valid values:
- 22.10.4
- 22.10.8 
- 23.10.1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNFVersion() {
        return this.NFVersion;
    }

    /**
     * Set Nextflow engine version. Valid values:
- 22.10.4
- 22.10.8 
- 23.10.1
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NFVersion Nextflow engine version. Valid values:
- 22.10.4
- 22.10.8 
- 23.10.1
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNFVersion(String NFVersion) {
        this.NFVersion = NFVersion;
    }

    public NFOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NFOption(NFOption source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Report != null) {
            this.Report = new Boolean(source.Report);
        }
        if (source.Resume != null) {
            this.Resume = new Boolean(source.Resume);
        }
        if (source.NFVersion != null) {
            this.NFVersion = new String(source.NFVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Report", this.Report);
        this.setParamSimple(map, prefix + "Resume", this.Resume);
        this.setParamSimple(map, prefix + "NFVersion", this.NFVersion);

    }
}

