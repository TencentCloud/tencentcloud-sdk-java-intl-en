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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLifecyclePoliciesRequest extends AbstractModel {

    /**
    * Lifecycle management policy name.
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * Number of lifecycle management policies per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number of the list.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * File system ID.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Lifecycle management policy ID.
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
     * Get Lifecycle management policy name. 
     * @return LifecyclePolicyName Lifecycle management policy name.
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set Lifecycle management policy name.
     * @param LifecyclePolicyName Lifecycle management policy name.
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get Number of lifecycle management policies per page. 
     * @return PageSize Number of lifecycle management policies per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of lifecycle management policies per page.
     * @param PageSize Number of lifecycle management policies per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number of the list. 
     * @return PageNumber Page number of the list.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number of the list.
     * @param PageNumber Page number of the list.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get File system ID. 
     * @return FileSystemId File system ID.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID.
     * @param FileSystemId File system ID.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Lifecycle management policy ID. 
     * @return LifecyclePolicyID Lifecycle management policy ID.
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set Lifecycle management policy ID.
     * @param LifecyclePolicyID Lifecycle management policy ID.
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    public DescribeLifecyclePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifecyclePoliciesRequest(DescribeLifecyclePoliciesRequest source) {
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);

    }
}

