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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserApplicationVersion extends AbstractModel {

    /**
    * Application version ID.
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * Application version size.
    */
    @SerializedName("ApplicationVersionSize")
    @Expose
    private Long ApplicationVersionSize;

    /**
    * Application version status (Uploading: uploading; Creating: in creation; CreateFailed: creation failed; Deleting: deleting; Inuse: current version; Normal: to be released; Usable: available).
    */
    @SerializedName("ApplicationVersionStatus")
    @Expose
    private String ApplicationVersionStatus;

    /**
    * Application version name.
    */
    @SerializedName("ApplicationVersionName")
    @Expose
    private String ApplicationVersionName;

    /**
    * Application version creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Region for application version distribution (
Standard zone:
ap-chinese-mainland: Chinese mainland
na-north-america: North America
eu-frankfurt: Frankfurt
ap-mumbai: Mumbai
ap-tokyo: Tokyo
ap-seoul: Seoul
ap-singapore: Singapore
ap-bangkok: Bangkok
ap-hongkong: Hong Kong (China)
Integration zone:
me-middle-east-fusion: Middle East
na-north-america-fusion: North America
sa-south-america-fusion: South America
ap-tokyo-fusion: Tokyo
ap-seoul-fusion: Seoul
eu-frankfurt-fusion: Frankfurt
ap-singapore-fusion: Singapore
ap-hongkong-fusion: Hong Kong (China)
).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationVersionRegions")
    @Expose
    private String [] ApplicationVersionRegions;

    /**
    * Application version update method.
FULL: full update.
INCREMENT: incremental update.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationVersionUpdateMode")
    @Expose
    private String ApplicationVersionUpdateMode;

    /**
     * Get Application version ID. 
     * @return ApplicationVersionId Application version ID.
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set Application version ID.
     * @param ApplicationVersionId Application version ID.
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get Application version size. 
     * @return ApplicationVersionSize Application version size.
     */
    public Long getApplicationVersionSize() {
        return this.ApplicationVersionSize;
    }

    /**
     * Set Application version size.
     * @param ApplicationVersionSize Application version size.
     */
    public void setApplicationVersionSize(Long ApplicationVersionSize) {
        this.ApplicationVersionSize = ApplicationVersionSize;
    }

    /**
     * Get Application version status (Uploading: uploading; Creating: in creation; CreateFailed: creation failed; Deleting: deleting; Inuse: current version; Normal: to be released; Usable: available). 
     * @return ApplicationVersionStatus Application version status (Uploading: uploading; Creating: in creation; CreateFailed: creation failed; Deleting: deleting; Inuse: current version; Normal: to be released; Usable: available).
     */
    public String getApplicationVersionStatus() {
        return this.ApplicationVersionStatus;
    }

    /**
     * Set Application version status (Uploading: uploading; Creating: in creation; CreateFailed: creation failed; Deleting: deleting; Inuse: current version; Normal: to be released; Usable: available).
     * @param ApplicationVersionStatus Application version status (Uploading: uploading; Creating: in creation; CreateFailed: creation failed; Deleting: deleting; Inuse: current version; Normal: to be released; Usable: available).
     */
    public void setApplicationVersionStatus(String ApplicationVersionStatus) {
        this.ApplicationVersionStatus = ApplicationVersionStatus;
    }

    /**
     * Get Application version name. 
     * @return ApplicationVersionName Application version name.
     */
    public String getApplicationVersionName() {
        return this.ApplicationVersionName;
    }

    /**
     * Set Application version name.
     * @param ApplicationVersionName Application version name.
     */
    public void setApplicationVersionName(String ApplicationVersionName) {
        this.ApplicationVersionName = ApplicationVersionName;
    }

    /**
     * Get Application version creation time. 
     * @return CreateTime Application version creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Application version creation time.
     * @param CreateTime Application version creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Region for application version distribution (
Standard zone:
ap-chinese-mainland: Chinese mainland
na-north-america: North America
eu-frankfurt: Frankfurt
ap-mumbai: Mumbai
ap-tokyo: Tokyo
ap-seoul: Seoul
ap-singapore: Singapore
ap-bangkok: Bangkok
ap-hongkong: Hong Kong (China)
Integration zone:
me-middle-east-fusion: Middle East
na-north-america-fusion: North America
sa-south-america-fusion: South America
ap-tokyo-fusion: Tokyo
ap-seoul-fusion: Seoul
eu-frankfurt-fusion: Frankfurt
ap-singapore-fusion: Singapore
ap-hongkong-fusion: Hong Kong (China)
).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationVersionRegions Region for application version distribution (
Standard zone:
ap-chinese-mainland: Chinese mainland
na-north-america: North America
eu-frankfurt: Frankfurt
ap-mumbai: Mumbai
ap-tokyo: Tokyo
ap-seoul: Seoul
ap-singapore: Singapore
ap-bangkok: Bangkok
ap-hongkong: Hong Kong (China)
Integration zone:
me-middle-east-fusion: Middle East
na-north-america-fusion: North America
sa-south-america-fusion: South America
ap-tokyo-fusion: Tokyo
ap-seoul-fusion: Seoul
eu-frankfurt-fusion: Frankfurt
ap-singapore-fusion: Singapore
ap-hongkong-fusion: Hong Kong (China)
).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getApplicationVersionRegions() {
        return this.ApplicationVersionRegions;
    }

    /**
     * Set Region for application version distribution (
Standard zone:
ap-chinese-mainland: Chinese mainland
na-north-america: North America
eu-frankfurt: Frankfurt
ap-mumbai: Mumbai
ap-tokyo: Tokyo
ap-seoul: Seoul
ap-singapore: Singapore
ap-bangkok: Bangkok
ap-hongkong: Hong Kong (China)
Integration zone:
me-middle-east-fusion: Middle East
na-north-america-fusion: North America
sa-south-america-fusion: South America
ap-tokyo-fusion: Tokyo
ap-seoul-fusion: Seoul
eu-frankfurt-fusion: Frankfurt
ap-singapore-fusion: Singapore
ap-hongkong-fusion: Hong Kong (China)
).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationVersionRegions Region for application version distribution (
Standard zone:
ap-chinese-mainland: Chinese mainland
na-north-america: North America
eu-frankfurt: Frankfurt
ap-mumbai: Mumbai
ap-tokyo: Tokyo
ap-seoul: Seoul
ap-singapore: Singapore
ap-bangkok: Bangkok
ap-hongkong: Hong Kong (China)
Integration zone:
me-middle-east-fusion: Middle East
na-north-america-fusion: North America
sa-south-america-fusion: South America
ap-tokyo-fusion: Tokyo
ap-seoul-fusion: Seoul
eu-frankfurt-fusion: Frankfurt
ap-singapore-fusion: Singapore
ap-hongkong-fusion: Hong Kong (China)
).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationVersionRegions(String [] ApplicationVersionRegions) {
        this.ApplicationVersionRegions = ApplicationVersionRegions;
    }

    /**
     * Get Application version update method.
FULL: full update.
INCREMENT: incremental update.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationVersionUpdateMode Application version update method.
FULL: full update.
INCREMENT: incremental update.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationVersionUpdateMode() {
        return this.ApplicationVersionUpdateMode;
    }

    /**
     * Set Application version update method.
FULL: full update.
INCREMENT: incremental update.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationVersionUpdateMode Application version update method.
FULL: full update.
INCREMENT: incremental update.
Note: This field may return null, indicating that no valid values can be obtained.
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

