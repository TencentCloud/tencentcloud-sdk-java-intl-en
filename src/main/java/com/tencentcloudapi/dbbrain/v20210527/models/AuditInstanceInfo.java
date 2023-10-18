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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditInstanceInfo extends AbstractModel {

    /**
    * appId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Audit status. Valid values: `0` (Not enabled), `1` (Enabled).
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * The region where the instance resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Resource tags
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTags")
    @Expose
    private String [] ResourceTags;

    /**
     * Get appId 
     * @return AppId appId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set appId
     * @param AppId appId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Audit status. Valid values: `0` (Not enabled), `1` (Enabled). 
     * @return AuditStatus Audit status. Valid values: `0` (Not enabled), `1` (Enabled).
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set Audit status. Valid values: `0` (Not enabled), `1` (Enabled).
     * @param AuditStatus Audit status. Valid values: `0` (Not enabled), `1` (Enabled).
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The region where the instance resides 
     * @return Region The region where the instance resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the instance resides
     * @param Region The region where the instance resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Resource tags
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained. 
     * @return ResourceTags Resource tags
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public String [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Resource tags
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     * @param ResourceTags Resource tags
Note: u200dThis field may returnu200d·nullu200d, indicating that no valid values can be obtained.
     */
    public void setResourceTags(String [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public AuditInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditInstanceInfo(AuditInstanceInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new String[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new String(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArraySimple(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

