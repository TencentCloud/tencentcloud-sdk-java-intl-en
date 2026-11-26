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

public class CreateConfigGroupVersionRequest extends AbstractModel {

    /**
    * <p>Zone ID.</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>ID of the configuration group for which to create a new version. You can obtain the complete environment information through the environment information interface (DescribeEnvironments). The environment information contains the configuration group ID of each configuration group type.</p><p>For parameter values, see the return value <code>EnvInfos</code> of <a href="https://www.tencentcloud.com/document/api/1552/101862?from_cn_redirect=1">DescribeEnvironments</a>.</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>Configuration content to be imported, which is required to be in the JSON format and encoded in the UTF-8 mode. For the configuration file content, refer to the example below and the <a href="https://www.tencentcloud.com/document/product/1552/125342?from_cn_redirect=1">configuration group syntax explanation</a>.</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>Version description. You can enter up to 50 characters. This field can be used to fill in the usage scenario of this version.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>The source version ID on which the new version is based. The new version will be derived from the configuration of this source version. This field is optional. If not specified, it defaults to the version currently in effect in the current production environment as the source version.</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
     * Get <p>Zone ID.</p> 
     * @return ZoneId <p>Zone ID.</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>Zone ID.</p>
     * @param ZoneId <p>Zone ID.</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>ID of the configuration group for which to create a new version. You can obtain the complete environment information through the environment information interface (DescribeEnvironments). The environment information contains the configuration group ID of each configuration group type.</p><p>For parameter values, see the return value <code>EnvInfos</code> of <a href="https://www.tencentcloud.com/document/api/1552/101862?from_cn_redirect=1">DescribeEnvironments</a>.</p> 
     * @return GroupId <p>ID of the configuration group for which to create a new version. You can obtain the complete environment information through the environment information interface (DescribeEnvironments). The environment information contains the configuration group ID of each configuration group type.</p><p>For parameter values, see the return value <code>EnvInfos</code> of <a href="https://www.tencentcloud.com/document/api/1552/101862?from_cn_redirect=1">DescribeEnvironments</a>.</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>ID of the configuration group for which to create a new version. You can obtain the complete environment information through the environment information interface (DescribeEnvironments). The environment information contains the configuration group ID of each configuration group type.</p><p>For parameter values, see the return value <code>EnvInfos</code> of <a href="https://www.tencentcloud.com/document/api/1552/101862?from_cn_redirect=1">DescribeEnvironments</a>.</p>
     * @param GroupId <p>ID of the configuration group for which to create a new version. You can obtain the complete environment information through the environment information interface (DescribeEnvironments). The environment information contains the configuration group ID of each configuration group type.</p><p>For parameter values, see the return value <code>EnvInfos</code> of <a href="https://www.tencentcloud.com/document/api/1552/101862?from_cn_redirect=1">DescribeEnvironments</a>.</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>Configuration content to be imported, which is required to be in the JSON format and encoded in the UTF-8 mode. For the configuration file content, refer to the example below and the <a href="https://www.tencentcloud.com/document/product/1552/125342?from_cn_redirect=1">configuration group syntax explanation</a>.</p> 
     * @return Content <p>Configuration content to be imported, which is required to be in the JSON format and encoded in the UTF-8 mode. For the configuration file content, refer to the example below and the <a href="https://www.tencentcloud.com/document/product/1552/125342?from_cn_redirect=1">configuration group syntax explanation</a>.</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>Configuration content to be imported, which is required to be in the JSON format and encoded in the UTF-8 mode. For the configuration file content, refer to the example below and the <a href="https://www.tencentcloud.com/document/product/1552/125342?from_cn_redirect=1">configuration group syntax explanation</a>.</p>
     * @param Content <p>Configuration content to be imported, which is required to be in the JSON format and encoded in the UTF-8 mode. For the configuration file content, refer to the example below and the <a href="https://www.tencentcloud.com/document/product/1552/125342?from_cn_redirect=1">configuration group syntax explanation</a>.</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>Version description. You can enter up to 50 characters. This field can be used to fill in the usage scenario of this version.</p> 
     * @return Description <p>Version description. You can enter up to 50 characters. This field can be used to fill in the usage scenario of this version.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Version description. You can enter up to 50 characters. This field can be used to fill in the usage scenario of this version.</p>
     * @param Description <p>Version description. You can enter up to 50 characters. This field can be used to fill in the usage scenario of this version.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>The source version ID on which the new version is based. The new version will be derived from the configuration of this source version. This field is optional. If not specified, it defaults to the version currently in effect in the current production environment as the source version.</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul> 
     * @return SourceVersion <p>The source version ID on which the new version is based. The new version will be derived from the configuration of this source version. This field is optional. If not specified, it defaults to the version currently in effect in the current production environment as the source version.</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>The source version ID on which the new version is based. The new version will be derived from the configuration of this source version. This field is optional. If not specified, it defaults to the version currently in effect in the current production environment as the source version.</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     * @param SourceVersion <p>The source version ID on which the new version is based. The new version will be derived from the configuration of this source version. This field is optional. If not specified, it defaults to the version currently in effect in the current production environment as the source version.</p><p>For reference:</p><ul><li><a href="https://www.tencentcloud.com/document/api/1552/101867?from_cn_redirect=1">CreateConfigGroupVersion</a> return value <code>VersionId</code></li><li><a href="https://www.tencentcloud.com/document/api/1552/101864?from_cn_redirect=1">DescribeConfigGroupVersions</a> return value <code>ConfigGroupVersionInfos</code></li></ul>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    public CreateConfigGroupVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateConfigGroupVersionRequest(CreateConfigGroupVersionRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);

    }
}

