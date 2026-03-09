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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExploreFileResource extends AbstractModel {

    /**
    * Resource type, can only be two types: folder, script.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource ID: directory ID or script ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Full path id for recursive authentication.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIdForPath")
    @Expose
    private String ResourceIdForPath;

    /**
    * cfs path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceCFSPath")
    @Expose
    private String ResourceCFSPath;

    /**
     * Get Resource type, can only be two types: folder, script.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceType Resource type, can only be two types: folder, script.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type, can only be two types: folder, script.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceType Resource type, can only be two types: folder, script.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource ID: directory ID or script ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceId Resource ID: directory ID or script ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID: directory ID or script ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceId Resource ID: directory ID or script ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Full path id for recursive authentication.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceIdForPath Full path id for recursive authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceIdForPath() {
        return this.ResourceIdForPath;
    }

    /**
     * Set Full path id for recursive authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceIdForPath Full path id for recursive authentication.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceIdForPath(String ResourceIdForPath) {
        this.ResourceIdForPath = ResourceIdForPath;
    }

    /**
     * Get cfs path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceCFSPath cfs path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceCFSPath() {
        return this.ResourceCFSPath;
    }

    /**
     * Set cfs path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceCFSPath cfs path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceCFSPath(String ResourceCFSPath) {
        this.ResourceCFSPath = ResourceCFSPath;
    }

    public ExploreFileResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExploreFileResource(ExploreFileResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceIdForPath != null) {
            this.ResourceIdForPath = new String(source.ResourceIdForPath);
        }
        if (source.ResourceCFSPath != null) {
            this.ResourceCFSPath = new String(source.ResourceCFSPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceIdForPath", this.ResourceIdForPath);
        this.setParamSimple(map, prefix + "ResourceCFSPath", this.ResourceCFSPath);

    }
}

