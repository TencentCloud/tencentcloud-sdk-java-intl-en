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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViolationUrl extends AbstractModel {

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Origin access URL of the resource in violation
    */
    @SerializedName("RealUrl")
    @Expose
    private String RealUrl;

    /**
    * Snapshot path. This is used to display a snapshot of the content in violation on the console.
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * Current status of non-compliant resource
`forbid`: Blocked
`release`: Unblocked
`delay`: Processing delayed
`reject`: Appeal dismissed. It is still in `forbid` status.
`complain`: Appeal in process
    */
    @SerializedName("UrlStatus")
    @Expose
    private String UrlStatus;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Origin access URL of the resource in violation 
     * @return RealUrl Origin access URL of the resource in violation
     */
    public String getRealUrl() {
        return this.RealUrl;
    }

    /**
     * Set Origin access URL of the resource in violation
     * @param RealUrl Origin access URL of the resource in violation
     */
    public void setRealUrl(String RealUrl) {
        this.RealUrl = RealUrl;
    }

    /**
     * Get Snapshot path. This is used to display a snapshot of the content in violation on the console. 
     * @return DownloadUrl Snapshot path. This is used to display a snapshot of the content in violation on the console.
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Snapshot path. This is used to display a snapshot of the content in violation on the console.
     * @param DownloadUrl Snapshot path. This is used to display a snapshot of the content in violation on the console.
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Current status of non-compliant resource
`forbid`: Blocked
`release`: Unblocked
`delay`: Processing delayed
`reject`: Appeal dismissed. It is still in `forbid` status.
`complain`: Appeal in process 
     * @return UrlStatus Current status of non-compliant resource
`forbid`: Blocked
`release`: Unblocked
`delay`: Processing delayed
`reject`: Appeal dismissed. It is still in `forbid` status.
`complain`: Appeal in process
     */
    public String getUrlStatus() {
        return this.UrlStatus;
    }

    /**
     * Set Current status of non-compliant resource
`forbid`: Blocked
`release`: Unblocked
`delay`: Processing delayed
`reject`: Appeal dismissed. It is still in `forbid` status.
`complain`: Appeal in process
     * @param UrlStatus Current status of non-compliant resource
`forbid`: Blocked
`release`: Unblocked
`delay`: Processing delayed
`reject`: Appeal dismissed. It is still in `forbid` status.
`complain`: Appeal in process
     */
    public void setUrlStatus(String UrlStatus) {
        this.UrlStatus = UrlStatus;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ViolationUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViolationUrl(ViolationUrl source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RealUrl != null) {
            this.RealUrl = new String(source.RealUrl);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.UrlStatus != null) {
            this.UrlStatus = new String(source.UrlStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "RealUrl", this.RealUrl);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "UrlStatus", this.UrlStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

