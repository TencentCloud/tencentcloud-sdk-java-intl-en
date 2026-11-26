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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserApplicationVersion extends AbstractModel {

    /**
    * <p>Application version Id</p>
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * <p>Application version size</p>
    */
    @SerializedName("ApplicationVersionSize")
    @Expose
    private Long ApplicationVersionSize;

    /**
    * <p>Application version status (Uploading: Creating, Creating: Creating, CreateFailed: Failed to create, Deleting: Deleting, Inuse: Current version, Normal: To be released, Usable: Available)</p>
    */
    @SerializedName("ApplicationVersionStatus")
    @Expose
    private String ApplicationVersionStatus;

    /**
    * <p>Application version name</p>
    */
    @SerializedName("ApplicationVersionName")
    @Expose
    private String ApplicationVersionName;

    /**
    * <p>Application version creation time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Application version distribution regions (<br>Standard regions:<br>ap-chinese-mainland: Chinese mainland,<br>na-north-america: North America,<br>eu-frankfurt: Frankfurt,<br>ap-mumbai: Mumbai,<br>ap-tokyo: Tokyo,<br>ap-seoul: Seoul,<br>ap-singapore: Singapore,<br>ap-bangkok: Bangkok,<br>ap-hongkong: Hong Kong (China),<br>Fusion regions:<br>me-middle-east-fusion: Middle East<br>na-north-america-fusion: North America<br>sa-south-america-fusion: South America<br>ap-tokyo-fusion: Tokyo<br>ap-seoul-fusion: Seoul<br>eu-frankfurt-fusion: Frankfurt<br>ap-singapore-fusion: Singapore<br>ap-hongkong-fusion: Hong Kong (China)<br>)</p>
    */
    @SerializedName("ApplicationVersionRegions")
    @Expose
    private String [] ApplicationVersionRegions;

    /**
    * <p>Application version update mode: <br>FULL: Full update, <br>INCREMENT: Incremental update</p>
    */
    @SerializedName("ApplicationVersionUpdateMode")
    @Expose
    private String ApplicationVersionUpdateMode;

    /**
     * Get <p>Application version Id</p> 
     * @return ApplicationVersionId <p>Application version Id</p>
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set <p>Application version Id</p>
     * @param ApplicationVersionId <p>Application version Id</p>
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get <p>Application version size</p> 
     * @return ApplicationVersionSize <p>Application version size</p>
     */
    public Long getApplicationVersionSize() {
        return this.ApplicationVersionSize;
    }

    /**
     * Set <p>Application version size</p>
     * @param ApplicationVersionSize <p>Application version size</p>
     */
    public void setApplicationVersionSize(Long ApplicationVersionSize) {
        this.ApplicationVersionSize = ApplicationVersionSize;
    }

    /**
     * Get <p>Application version status (Uploading: Creating, Creating: Creating, CreateFailed: Failed to create, Deleting: Deleting, Inuse: Current version, Normal: To be released, Usable: Available)</p> 
     * @return ApplicationVersionStatus <p>Application version status (Uploading: Creating, Creating: Creating, CreateFailed: Failed to create, Deleting: Deleting, Inuse: Current version, Normal: To be released, Usable: Available)</p>
     */
    public String getApplicationVersionStatus() {
        return this.ApplicationVersionStatus;
    }

    /**
     * Set <p>Application version status (Uploading: Creating, Creating: Creating, CreateFailed: Failed to create, Deleting: Deleting, Inuse: Current version, Normal: To be released, Usable: Available)</p>
     * @param ApplicationVersionStatus <p>Application version status (Uploading: Creating, Creating: Creating, CreateFailed: Failed to create, Deleting: Deleting, Inuse: Current version, Normal: To be released, Usable: Available)</p>
     */
    public void setApplicationVersionStatus(String ApplicationVersionStatus) {
        this.ApplicationVersionStatus = ApplicationVersionStatus;
    }

    /**
     * Get <p>Application version name</p> 
     * @return ApplicationVersionName <p>Application version name</p>
     */
    public String getApplicationVersionName() {
        return this.ApplicationVersionName;
    }

    /**
     * Set <p>Application version name</p>
     * @param ApplicationVersionName <p>Application version name</p>
     */
    public void setApplicationVersionName(String ApplicationVersionName) {
        this.ApplicationVersionName = ApplicationVersionName;
    }

    /**
     * Get <p>Application version creation time</p> 
     * @return CreateTime <p>Application version creation time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Application version creation time</p>
     * @param CreateTime <p>Application version creation time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Application version distribution regions (<br>Standard regions:<br>ap-chinese-mainland: Chinese mainland,<br>na-north-america: North America,<br>eu-frankfurt: Frankfurt,<br>ap-mumbai: Mumbai,<br>ap-tokyo: Tokyo,<br>ap-seoul: Seoul,<br>ap-singapore: Singapore,<br>ap-bangkok: Bangkok,<br>ap-hongkong: Hong Kong (China),<br>Fusion regions:<br>me-middle-east-fusion: Middle East<br>na-north-america-fusion: North America<br>sa-south-america-fusion: South America<br>ap-tokyo-fusion: Tokyo<br>ap-seoul-fusion: Seoul<br>eu-frankfurt-fusion: Frankfurt<br>ap-singapore-fusion: Singapore<br>ap-hongkong-fusion: Hong Kong (China)<br>)</p> 
     * @return ApplicationVersionRegions <p>Application version distribution regions (<br>Standard regions:<br>ap-chinese-mainland: Chinese mainland,<br>na-north-america: North America,<br>eu-frankfurt: Frankfurt,<br>ap-mumbai: Mumbai,<br>ap-tokyo: Tokyo,<br>ap-seoul: Seoul,<br>ap-singapore: Singapore,<br>ap-bangkok: Bangkok,<br>ap-hongkong: Hong Kong (China),<br>Fusion regions:<br>me-middle-east-fusion: Middle East<br>na-north-america-fusion: North America<br>sa-south-america-fusion: South America<br>ap-tokyo-fusion: Tokyo<br>ap-seoul-fusion: Seoul<br>eu-frankfurt-fusion: Frankfurt<br>ap-singapore-fusion: Singapore<br>ap-hongkong-fusion: Hong Kong (China)<br>)</p>
     */
    public String [] getApplicationVersionRegions() {
        return this.ApplicationVersionRegions;
    }

    /**
     * Set <p>Application version distribution regions (<br>Standard regions:<br>ap-chinese-mainland: Chinese mainland,<br>na-north-america: North America,<br>eu-frankfurt: Frankfurt,<br>ap-mumbai: Mumbai,<br>ap-tokyo: Tokyo,<br>ap-seoul: Seoul,<br>ap-singapore: Singapore,<br>ap-bangkok: Bangkok,<br>ap-hongkong: Hong Kong (China),<br>Fusion regions:<br>me-middle-east-fusion: Middle East<br>na-north-america-fusion: North America<br>sa-south-america-fusion: South America<br>ap-tokyo-fusion: Tokyo<br>ap-seoul-fusion: Seoul<br>eu-frankfurt-fusion: Frankfurt<br>ap-singapore-fusion: Singapore<br>ap-hongkong-fusion: Hong Kong (China)<br>)</p>
     * @param ApplicationVersionRegions <p>Application version distribution regions (<br>Standard regions:<br>ap-chinese-mainland: Chinese mainland,<br>na-north-america: North America,<br>eu-frankfurt: Frankfurt,<br>ap-mumbai: Mumbai,<br>ap-tokyo: Tokyo,<br>ap-seoul: Seoul,<br>ap-singapore: Singapore,<br>ap-bangkok: Bangkok,<br>ap-hongkong: Hong Kong (China),<br>Fusion regions:<br>me-middle-east-fusion: Middle East<br>na-north-america-fusion: North America<br>sa-south-america-fusion: South America<br>ap-tokyo-fusion: Tokyo<br>ap-seoul-fusion: Seoul<br>eu-frankfurt-fusion: Frankfurt<br>ap-singapore-fusion: Singapore<br>ap-hongkong-fusion: Hong Kong (China)<br>)</p>
     */
    public void setApplicationVersionRegions(String [] ApplicationVersionRegions) {
        this.ApplicationVersionRegions = ApplicationVersionRegions;
    }

    /**
     * Get <p>Application version update mode: <br>FULL: Full update, <br>INCREMENT: Incremental update</p> 
     * @return ApplicationVersionUpdateMode <p>Application version update mode: <br>FULL: Full update, <br>INCREMENT: Incremental update</p>
     */
    public String getApplicationVersionUpdateMode() {
        return this.ApplicationVersionUpdateMode;
    }

    /**
     * Set <p>Application version update mode: <br>FULL: Full update, <br>INCREMENT: Incremental update</p>
     * @param ApplicationVersionUpdateMode <p>Application version update mode: <br>FULL: Full update, <br>INCREMENT: Incremental update</p>
     */
    public void setApplicationVersionUpdateMode(String ApplicationVersionUpdateMode) {
        this.ApplicationVersionUpdateMode = ApplicationVersionUpdateMode;
    }

    public UserApplicationVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserApplicationVersion(UserApplicationVersion source) {
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
        if (source.ApplicationVersionSize != null) {
            this.ApplicationVersionSize = new Long(source.ApplicationVersionSize);
        }
        if (source.ApplicationVersionStatus != null) {
            this.ApplicationVersionStatus = new String(source.ApplicationVersionStatus);
        }
        if (source.ApplicationVersionName != null) {
            this.ApplicationVersionName = new String(source.ApplicationVersionName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ApplicationVersionRegions != null) {
            this.ApplicationVersionRegions = new String[source.ApplicationVersionRegions.length];
            for (int i = 0; i < source.ApplicationVersionRegions.length; i++) {
                this.ApplicationVersionRegions[i] = new String(source.ApplicationVersionRegions[i]);
            }
        }
        if (source.ApplicationVersionUpdateMode != null) {
            this.ApplicationVersionUpdateMode = new String(source.ApplicationVersionUpdateMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);
        this.setParamSimple(map, prefix + "ApplicationVersionSize", this.ApplicationVersionSize);
        this.setParamSimple(map, prefix + "ApplicationVersionStatus", this.ApplicationVersionStatus);
        this.setParamSimple(map, prefix + "ApplicationVersionName", this.ApplicationVersionName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "ApplicationVersionRegions.", this.ApplicationVersionRegions);
        this.setParamSimple(map, prefix + "ApplicationVersionUpdateMode", this.ApplicationVersionUpdateMode);

    }
}

