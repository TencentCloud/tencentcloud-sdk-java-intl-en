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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogInstanceInfo extends AbstractModel {

    /**
    * <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Project ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>Instance Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * <p>Engine</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>Instance status</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>Whether audit is supported. 1 means support, 0 means not supported.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportAudit")
    @Expose
    private Long IsSupportAudit;

    /**
    * <p>Instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log type</p><p>Enumeration value:</p><ul><li>complex: Granular audit</li><li>simple: Fast Audit</li></ul>
    */
    @SerializedName("AuditType")
    @Expose
    private String AuditType;

    /**
     * Get <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName <p>Instance name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Project ID</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId <p>Project ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>Project ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId <p>Project ID</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>Instance Tag</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagList <p>Instance Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Instance Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagList <p>Instance Tag</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Engine</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Engine <p>Engine</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>Engine</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Engine <p>Engine</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineVersion <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineVersion <p>Engine version</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Instance status</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceStatus <p>Instance status</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceStatus <p>Instance status</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>Whether audit is supported. 1 means support, 0 means not supported.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportAudit <p>Whether audit is supported. 1 means support, 0 means not supported.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportAudit() {
        return this.IsSupportAudit;
    }

    /**
     * Set <p>Whether audit is supported. 1 means support, 0 means not supported.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportAudit <p>Whether audit is supported. 1 means support, 0 means not supported.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportAudit(Long IsSupportAudit) {
        this.IsSupportAudit = IsSupportAudit;
    }

    /**
     * Get <p>Instance ID</p> 
     * @return InstanceId <p>Instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID</p>
     * @param InstanceId <p>Instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log type</p><p>Enumeration value:</p><ul><li>complex: Granular audit</li><li>simple: Fast Audit</li></ul> 
     * @return AuditType <p>Log type</p><p>Enumeration value:</p><ul><li>complex: Granular audit</li><li>simple: Fast Audit</li></ul>
     */
    public String getAuditType() {
        return this.AuditType;
    }

    /**
     * Set <p>Log type</p><p>Enumeration value:</p><ul><li>complex: Granular audit</li><li>simple: Fast Audit</li></ul>
     * @param AuditType <p>Log type</p><p>Enumeration value:</p><ul><li>complex: Granular audit</li><li>simple: Fast Audit</li></ul>
     */
    public void setAuditType(String AuditType) {
        this.AuditType = AuditType;
    }

    public LogInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogInstanceInfo(LogInstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.IsSupportAudit != null) {
            this.IsSupportAudit = new Long(source.IsSupportAudit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AuditType != null) {
            this.AuditType = new String(source.AuditType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "IsSupportAudit", this.IsSupportAudit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);

    }
}

