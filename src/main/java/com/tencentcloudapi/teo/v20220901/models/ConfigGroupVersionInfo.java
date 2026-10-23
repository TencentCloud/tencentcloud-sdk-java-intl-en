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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupVersionInfo extends AbstractModel {

    /**
    * <p>Configuration group version ID, a unique resource ID allocated by EdgeOne when creating a configuration group version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>Configuration group version number. This parameter only shows the version. Each time a new version of the configuration group is created, the version number increments by one. The initial version number is "0".</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private String VersionNumber;

    /**
    * <p>Version ID of the source version on which the configuration group version is based. When creating a configuration group version, designate the source version ID. The new version will be created as a derivative based on the configuration of that source version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>Value for reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * <p>Configuration group type to which the version belongs.</p><p>Enumeration value:</p><ul><li>l7_acceleration: Layer-7 acceleration configuration group</li><li>edge_functions: Edge function configuration group</li><li>web_security: Web protection configuration group</li></ul>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>Configuration group ID for version ownership.</p><p>Parameter format: cg-2kplomhisdcb</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Version description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Version effective status.</p><p>Enumeration value:</p><ul><li>creating: Version creation in progress</li><li>inactive: Version not in effect</li><li>active: Version in effect</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Version creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>Configuration group version ID, a unique resource ID allocated by EdgeOne when creating a configuration group version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return VersionId <p>Configuration group version ID, a unique resource ID allocated by EdgeOne when creating a configuration group version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>Configuration group version ID, a unique resource ID allocated by EdgeOne when creating a configuration group version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     * @param VersionId <p>Configuration group version ID, a unique resource ID allocated by EdgeOne when creating a configuration group version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>Configuration group version number. This parameter only shows the version. Each time a new version of the configuration group is created, the version number increments by one. The initial version number is "0".</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></p> 
     * @return VersionNumber <p>Configuration group version number. This parameter only shows the version. Each time a new version of the configuration group is created, the version number increments by one. The initial version number is "0".</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></p>
     */
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>Configuration group version number. This parameter only shows the version. Each time a new version of the configuration group is created, the version number increments by one. The initial version number is "0".</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></p>
     * @param VersionNumber <p>Configuration group version number. This parameter only shows the version. Each time a new version of the configuration group is created, the version number increments by one. The initial version number is "0".</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></p>
     */
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>Version ID of the source version on which the configuration group version is based. When creating a configuration group version, designate the source version ID. The new version will be created as a derivative based on the configuration of that source version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>Value for reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return SourceVersion <p>Version ID of the source version on which the configuration group version is based. When creating a configuration group version, designate the source version ID. The new version will be created as a derivative based on the configuration of that source version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>Value for reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>Version ID of the source version on which the configuration group version is based. When creating a configuration group version, designate the source version ID. The new version will be created as a derivative based on the configuration of that source version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>Value for reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     * @param SourceVersion <p>Version ID of the source version on which the configuration group version is based. When creating a configuration group version, designate the source version ID. The new version will be created as a derivative based on the configuration of that source version.</p><p>Parameter format: ver-2kplomhisdcb</p><p>Value for reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get <p>Configuration group type to which the version belongs.</p><p>Enumeration value:</p><ul><li>l7_acceleration: Layer-7 acceleration configuration group</li><li>edge_functions: Edge function configuration group</li><li>web_security: Web protection configuration group</li></ul> 
     * @return GroupType <p>Configuration group type to which the version belongs.</p><p>Enumeration value:</p><ul><li>l7_acceleration: Layer-7 acceleration configuration group</li><li>edge_functions: Edge function configuration group</li><li>web_security: Web protection configuration group</li></ul>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>Configuration group type to which the version belongs.</p><p>Enumeration value:</p><ul><li>l7_acceleration: Layer-7 acceleration configuration group</li><li>edge_functions: Edge function configuration group</li><li>web_security: Web protection configuration group</li></ul>
     * @param GroupType <p>Configuration group type to which the version belongs.</p><p>Enumeration value:</p><ul><li>l7_acceleration: Layer-7 acceleration configuration group</li><li>edge_functions: Edge function configuration group</li><li>web_security: Web protection configuration group</li></ul>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>Configuration group ID for version ownership.</p><p>Parameter format: cg-2kplomhisdcb</p> 
     * @return GroupId <p>Configuration group ID for version ownership.</p><p>Parameter format: cg-2kplomhisdcb</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>Configuration group ID for version ownership.</p><p>Parameter format: cg-2kplomhisdcb</p>
     * @param GroupId <p>Configuration group ID for version ownership.</p><p>Parameter format: cg-2kplomhisdcb</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Version description.</p> 
     * @return Description <p>Version description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Version description.</p>
     * @param Description <p>Version description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Version effective status.</p><p>Enumeration value:</p><ul><li>creating: Version creation in progress</li><li>inactive: Version not in effect</li><li>active: Version in effect</li></ul> 
     * @return Status <p>Version effective status.</p><p>Enumeration value:</p><ul><li>creating: Version creation in progress</li><li>inactive: Version not in effect</li><li>active: Version in effect</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Version effective status.</p><p>Enumeration value:</p><ul><li>creating: Version creation in progress</li><li>inactive: Version not in effect</li><li>active: Version in effect</li></ul>
     * @param Status <p>Version effective status.</p><p>Enumeration value:</p><ul><li>creating: Version creation in progress</li><li>inactive: Version not in effect</li><li>active: Version in effect</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Version creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p> 
     * @return CreateTime <p>Version creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Version creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     * @param CreateTime <p>Version creation time, which adopts Coordinated Universal Time (UTC) and follows the date and time format of the ISO 8601 standard.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ConfigGroupVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupVersionInfo(ConfigGroupVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new String(source.VersionNumber);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

